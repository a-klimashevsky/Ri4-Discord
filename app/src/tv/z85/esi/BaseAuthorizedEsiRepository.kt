package tv.z85.esi

import kotlinx.coroutines.flow.*
import org.slf4j.Logger
import tv.z85.esi.infrastructure.ClientException
import tv.z85.usecases.GetAuthTokenUseCase
import tv.z85.usecases.ReAuthUseCase


abstract class BaseAuthorizedEsiRepository<T>(
    private val getAuthTokenUseCase: GetAuthTokenUseCase,
    private val reAuthUseCase: ReAuthUseCase,
    private val log: Logger
) {

    fun withAuth(block: (String) -> Flow<T>): Flow<T> =
        getAuthTokenUseCase.invoke()
            .flatMapConcat { token ->
                block(token.token)
                    .catch { e ->
                        if(e is ClientException && e.statusCode == 403){
                            log.debug("R4: catch 403, reauth")
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