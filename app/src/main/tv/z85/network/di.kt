package tv.z85.network

import io.ktor.client.*
import io.ktor.client.engine.apache.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import org.koin.core.qualifier.named
import org.koin.dsl.module
import tv.z85.app.ApplicationConfig
import tv.z85.app.Logger
import tv.z85.usecases.ReAuthUseCase
import tv.z85.web.Webhook

fun buildNetworkModule(config: ApplicationConfig) = module {

    single(named("my_hook")) {
        config.discordWebhookUrl
    }

    single<HttpClient> {
        HttpClient(Apache) {
            install(JsonFeature) {
                serializer = KotlinxSerializer()
            }
        }
    }

    single<Webhook> {
        Webhook(get(named("my_hook")), get())
    }

    single<AuthApi> {
        AuthApi()
    }

    single<ReAuthUseCase> {
        ReAuthUseCaseImpl(
            api = get(),
            repo = get(),
            clientId = config.clientId,
            clientSecret = config.clientSecret
        )
    }

    single<Logger> {
        val config: ApplicationConfig = get()
        AirbrakeLogger(config.airbrakeProjectId, config.airbrakeProjectKey, config.production)
    }
}
