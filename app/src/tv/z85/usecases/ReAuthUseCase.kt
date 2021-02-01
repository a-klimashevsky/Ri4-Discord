package tv.z85.usecases

import kotlinx.coroutines.flow.Flow

interface ReAuthUseCase {
    fun invoke(refreshToken: String): Flow<AuthToken>
}