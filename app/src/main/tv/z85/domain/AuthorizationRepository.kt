package tv.z85.domain

import kotlinx.coroutines.flow.Flow


interface AuthorizationRepository {
    fun save(auth: Authorization): Flow<Unit>
}