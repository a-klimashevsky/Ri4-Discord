package tv.z85.sde

import kotlinx.coroutines.flow.*
import tv.z85.sde.update.UpdateTask
import tv.z85.zip

class SdeUpdateTaskImpl(private val tasks: List<UpdateTask>) : SdeUpdateTask {

    override fun update(): Flow<Unit> {
        return zip(*tasks.map { it.update() }.toTypedArray()) {

        }
    }
}