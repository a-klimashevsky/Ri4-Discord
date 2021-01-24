package tv.z85.usecases

import kotlinx.coroutines.flow.Flow


interface GetAuthTokenUseCase {
    fun invoke(): Flow<AuthToken>
}