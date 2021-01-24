package tv.z85.tv.z85.gateways

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.litote.kmongo.coroutine.CoroutineDatabase
import org.litote.kmongo.eq
import tv.z85.domain.Authorization
import java.util.*;


interface AuthorizationManager {
    fun provideAuthToken(): Flow<String>
}

class AuthorizationManagerImpl(
    private val database: CoroutineDatabase
): AuthorizationManager {
    override fun provideAuthToken(): Flow<String> {
        return flow {
            emit(database.getCollection<Authorization>()
                .findOne(Authorization::accessToken eq "abc")!!.accessToken)
        }
    }
}