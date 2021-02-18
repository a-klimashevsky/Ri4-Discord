package tv.z85.db

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import org.litote.kmongo.coroutine.CoroutineDatabase
import org.slf4j.Logger
import tv.z85.domain.Authorization
import tv.z85.usecases.AuthToken
import tv.z85.usecases.GetAuthTokenUseCase

class GetAuthTokenUseCaseImpl(
    private val database: CoroutineDatabase,
    private val log:Logger
) : GetAuthTokenUseCase {
    override fun invoke(): Flow<AuthToken> {
        return flow {
            emit(
                database.getCollection<Authorization>()
                    .findOne()
            )
        }
            .map {
                log.debug("R4: got auth token $it")
                AuthToken(it!!.accessToken, it!!.refreshToken)
            }
    }
}