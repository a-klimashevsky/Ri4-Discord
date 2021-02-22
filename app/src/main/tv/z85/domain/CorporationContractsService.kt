package tv.z85.domain

import kotlinx.coroutines.flow.Flow


interface CorporationContractsService {
    fun getAll(corporationId: Int): Flow<List<Contract>>
}