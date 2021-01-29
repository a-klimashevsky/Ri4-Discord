package tv.z85.esi

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flatMapConcat
import tv.z85.usecases.GetAuthTokenUseCase


abstract class BaseAuthorizedEsiRepository<T>(
    private val getAuthTokenUseCase: GetAuthTokenUseCase
) {

    fun withAuth(block: (String) -> Flow<T>): Flow<T> =
        getAuthTokenUseCase.invoke()
            .flatMapConcat { token ->
                block(token.token)
            }
}