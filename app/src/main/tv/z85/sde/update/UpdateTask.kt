package tv.z85.sde.update

import kotlinx.coroutines.flow.Flow

/**
 * Created by alexk on 1/20/21.
 */
interface UpdateTask {
    fun update(): Flow<Unit>
}