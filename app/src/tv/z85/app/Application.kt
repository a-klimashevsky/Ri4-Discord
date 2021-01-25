package tv.z85.app

import io.ktor.application.*
import io.ktor.auth.*
import io.ktor.client.*
import io.ktor.client.engine.apache.*
import io.ktor.features.*
import io.ktor.html.*
import io.ktor.http.*
import io.ktor.locations.*
import io.ktor.request.*
import io.ktor.routing.*
import io.ktor.serialization.*
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlinx.html.*
import org.koin.ktor.ext.Koin
import org.koin.ktor.ext.inject
import org.litote.kmongo.coroutine.CoroutineDatabase
import org.slf4j.event.Level
import tv.z85.domain.AuthApi
import tv.z85.domain.Authorization
import tv.z85.domain.VerificationInfo
import tv.z85.db.dbModule
import tv.z85.domain.CorporationContractsRepository
import tv.z85.sde.SdeUpdateTask
import tv.z85.domain.sde.sdeModule
import tv.z85.esi.gatewaysModule
import tv.z85.network.networkModule
import tv.z85.usecases.GetSoldCorporationContractsForPeriodUseCase
import tv.z85.usecases.useCaseModule
import kotlin.time.ExperimentalTime

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Location("/")
class index()

@Location("/login/{type?}")
class login(val type: String = "")

val loginProviders = listOf(
    OAuthServerSettings.OAuth2ServerSettings(
        name = "eve",
        authorizeUrl = "https://login.eveonline.com/oauth/authorize",
        accessTokenUrl = "https://login.eveonline.com/oauth/token",
        clientId = "54271cc976e94c988935b1d76e8819c0",
        clientSecret = "ce5GnvreahMANH9LFb1okxKTwDlaVishJiGxlml3",
        defaultScopes = defaultScopes,
        requestMethod = HttpMethod.Post
    ),
).associateBy { it.name }

@ExperimentalTime
@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {

    val authOauthForLogin = "authOauthForLogin"

    install(ContentNegotiation) {
        json()
    }

    install(Compression) {
        gzip {
            priority = 1.0
        }
        deflate {
            priority = 10.0
            minimumSize(1024) // condition
        }
    }

    install(CallLogging) {
        level = Level.INFO
        filter { call -> call.request.path().startsWith("/") }
    }

    install(Locations)

    install(CORS) {
        method(HttpMethod.Options)
        method(HttpMethod.Put)
        method(HttpMethod.Delete)
        method(HttpMethod.Patch)
        header(HttpHeaders.Authorization)
        header("X-R-Initiative-4")
        allowCredentials = true
        anyHost() // @TODO: Don't do this in production if possible. Try to limit it.
    }

    val config = config()

    install(Koin) {
        modules(buildApplicationModule(config))
        modules(sdeModule)
        modules(dbModule)
        modules(gatewaysModule)
        modules(networkModule)
        modules(useCaseModule)
    }

    val updateTask: SdeUpdateTask by inject()

    val database: CoroutineDatabase by inject()

    val contractsRepo: CorporationContractsRepository by inject()

    val useCase: GetSoldCorporationContractsForPeriodUseCase by inject()

    launch {

        useCase.invoke(config.corporationId, config.peridoInDays).collect {
            val c = it.count()
        }
        //updateTask.update().collect {  }
//        contractsRepo.getAll(config.corporationId).collect {
//            val c = it.count()
//        }
    }

    val authClient = HttpClient(Apache).apply {
        environment.monitor.subscribe(ApplicationStopping) {
            close()
        }
    }

    install(Authentication) {
        oauth(authOauthForLogin) {
            client = authClient
            providerLookup = {
                loginProviders[application.locations.resolve<login>(login::class, this).type]
            }
            urlProvider = { p -> redirectUrl(login(p.name), false) }
        }
    }

    install(Routing) {
        get<index> {
            call.respondHtml {
                head {
                    title { +"index page" }
                }
                body {
                    h1 {
                        +"Try to login"
                    }
                    p {
                        a(href = locations.href(login())) {
                            +"Login"
                        }
                    }
                }
            }
        }

        authenticate(authOauthForLogin) {
            location<login>() {
                param("error") {
                    handle {
                        call.loginFailedPage(call.parameters.getAll("error").orEmpty())
                    }
                }

                handle {
                    val principal = call.authentication.principal<OAuthAccessTokenResponse.OAuth2>()
                    if (principal != null) {
                        val api = AuthApi()
                        val user = api.verify(principal.accessToken)
                        val auth = Authorization(
                            userId = user.characterID,
                            accessToken = principal.accessToken,
                            tokenType = principal.tokenType,
                            expiresIn = principal.expiresIn,
                            refreshToken = principal.refreshToken
                        )

                        database.getCollection<Authorization>()
                            .insertOne(auth)

                        call.loggedInSuccessResponse(user)
                    } else {
                        call.loginPage()
                    }
                }
            }
        }
    }
}

private suspend fun ApplicationCall.loginPage() {
    respondHtml {
        head {
            title { +"Login with" }
        }
        body {
            h1 {
                +"Login with:"
            }

            for (p in loginProviders) {
                p {
                    a(href = application.locations.href(login(p.key))) {
                        +p.key
                    }
                }
            }
        }
    }
}

private suspend fun ApplicationCall.loginFailedPage(errors: List<String>) {
    respondHtml {
        head {
            title { +"Login with" }
        }
        body {
            h1 {
                +"Login error"
            }

            for (e in errors) {
                p {
                    +e
                }
            }
        }
    }
}

private suspend fun ApplicationCall.loggedInSuccessResponse(callback: VerificationInfo) {
    respondHtml {
        head {
            title { +"Logged in" }
        }
        body {
            h1 {
                +"You are logged in"
            }
            p {
                +"Your token is $callback"
            }
        }
    }
}

private fun <T : Any> ApplicationCall.redirectUrl(t: T, secure: Boolean = true): String {
    val hostPort = request.host()!! + request.port().let { port -> if (port == 80) "" else ":$port" }
    val protocol = when {
        secure -> "https"
        else -> "http"
    }
    return "$protocol://$hostPort${application.locations.href(t)}"
}


