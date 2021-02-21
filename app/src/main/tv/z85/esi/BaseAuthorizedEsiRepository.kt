package tv.z85.esi

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.flatMapConcat
import tv.z85.Log
import tv.z85.esi.infrastructure.ClientException
import tv.z85.usecases.GetAuthTokenUseCase
import tv.z85.usecases.ReAuthUseCase


abstract class BaseAuthorizedEsiRepository<T>(
    private val getAuthTokenUseCase: GetAuthTokenUseCase,
    private val reAuthUseCase: ReAuthUseCase,
) {

    fun withAuth(block: (String) -> Flow<T>): Flow<T> =
        getAuthTokenUseCase.invoke()
            .flatMapConcat { token ->
                block(token.token)
                    .catch { e ->
                        if(e is ClientException && e.statusCode == 403){
                            Log.debug("R4: catch 403, reauth")
                            emitAll(
                                reAuthUseCase.invoke(token.refreshToken)
                                    .flatMapConcat {
                                            newToken -> block(newToken.token)
                                    }
                            )
                        } else {
                            throw e
                        }
                    }
            }
}