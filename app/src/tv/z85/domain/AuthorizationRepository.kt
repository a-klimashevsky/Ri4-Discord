package tv.z85.domain

import kotlinx.coroutines.flow.Flow
import java.util.*;


interface AuthorizationRepository {
    fun save(auth: Authorization): Flow<Unit>
}