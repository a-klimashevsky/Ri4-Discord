package tv.z85.sde

import kotlinx.coroutines.flow.Flow


interface SdeUpdateTask {
    fun update(): Flow<Unit>
}

