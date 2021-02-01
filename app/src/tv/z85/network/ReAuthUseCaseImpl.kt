package tv.z85.network

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import tv.z85.domain.Authorization
import tv.z85.domain.AuthorizationRepository
import tv.z85.usecases.AuthToken
import tv.z85.usecases.ReAuthUseCase
import java.util.*;


class ReAuthUseCaseImpl(
    private val api: AuthApi,
    private val repo: AuthorizationRepository,
    private val clientId: String,
    private val clientSecret: String
): ReAuthUseCase {
    override fun invoke(refreshToken: String): Flow<AuthToken> {
        return flow {

            val apiAuth = api.updateAuthToken(
                refreshToken = refreshToken,
                clientId = clientId,
                clientSecret = clientSecret
            )

            val user = api.verify(apiAuth.accessToken)

            val auth = Authorization(
                userId = user.characterID,
                accessToken = apiAuth.accessToken,
                tokenType = apiAuth.tokenType,
                expiresIn = apiAuth.expiresIn,
                refreshToken = apiAuth.refreshToken!!
            )

            repo.save(auth).collect {
                emit(AuthToken(
                    token = auth.accessToken,
                    refreshToken = auth.refreshToken
                ))
            }
        }
    }
}