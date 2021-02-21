package tv.z85.domain

import kotlinx.coroutines.flow.Flow


interface CorporationContractsRepository {
    fun getAll(corporationId: Int): Flow<List<Contract>>
}