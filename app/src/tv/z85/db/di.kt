package tv.z85.db

import com.mongodb.ConnectionString
import com.mongodb.reactivestreams.client.MongoClient
import org.koin.dsl.module
import org.litote.kmongo.coroutine.CoroutineDatabase
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo
import tv.z85.domain.AuthorizationRepository
import tv.z85.usecases.GetAuthTokenUseCase

val dbModule = module {
    single { ConnectionString("mongodb://mongo") }
    single<MongoClient> {
        val connectionString: ConnectionString = get()
        KMongo.createClient(connectionString)
    }

    single<CoroutineDatabase> {
        val client: MongoClient = get()
        client.coroutine.getDatabase("ri4-discord")
    }

    single<GetAuthTokenUseCase> { GetAuthTokenUseCaseImpl(get()) }

    single<AuthorizationRepository> { AuthorizationRepositoryImpl(get()) }
}