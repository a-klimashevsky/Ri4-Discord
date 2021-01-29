package tv.z85.domain

import kotlinx.coroutines.flow.Flow


interface CorporationStructuresRepository {
    fun getById(id: Long): Flow<Structure>
}
