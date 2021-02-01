package tv.z85.db

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.litote.kmongo.coroutine.CoroutineDatabase
import org.litote.kmongo.eq
import tv.z85.domain.Authorization
import tv.z85.domain.AuthorizationRepository


class AuthorizationRepositoryImpl(
    private val database: CoroutineDatabase
) : AuthorizationRepository {
    override fun save(auth: Authorization): Flow<Unit> {
        return flow {
            emit(database.getCollection<Authorization>()
                .updateOne(
                    filter = Authorization::userId eq auth.userId,
                    target = auth
                ).let { }
            )
        }
    }
}