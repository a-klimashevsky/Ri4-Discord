package tv.z85.db

import com.mongodb.ConnectionString
import com.mongodb.reactivestreams.client.MongoClient
import org.koin.dsl.module
import org.litote.kmongo.coroutine.CoroutineDatabase
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo
import tv.z85.app.ApplicationConfig
import tv.z85.domain.AuthorizationRepository
import tv.z85.usecases.GetAuthTokenUseCase

fun buildDbModule(config: ApplicationConfig) = module {
    single { ConnectionString(config.dbConnectionString) }
    single<MongoClient> {
        val connectionString: ConnectionString = get()
        KMongo.createClient(connectionString)
    }

    single<CoroutineDatabase> {
        val client: MongoClient = get()
        client.coroutine.getDatabase(config.databaseName)
    }

    single<GetAuthTokenUseCase> { GetAuthTokenUseCaseImpl(get()) }

    single<AuthorizationRepository> { AuthorizationRepositoryImpl(get()) }
}