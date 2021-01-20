package tv.z85.domain.sde

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.merge
import tv.z85.domain.sde.update.UpdateTask

class SdeUpdateTaskImpl(private val tasks: List<UpdateTask>): SdeUpdateTask {

    override fun update(): Flow<Unit> {
        return tasks.map { it.update() }.merge()
    }

}