package tv.z85.domain.sde

import kotlinx.coroutines.flow.Flow


interface SdeUpdateTask {
    fun update(): Flow<Unit>
}

