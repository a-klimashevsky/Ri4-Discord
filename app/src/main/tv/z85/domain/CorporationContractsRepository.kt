package tv.z85.domain

import kotlinx.coroutines.flow.Flow


interface CorporationContractsRepository {
    fun find(corporationId: Int): Flow<Contract>

    fun find(
        corporationId: Int,
        status: Contract.Status,
        type: Contract.Type
    ): Flow<Contract>

    fun find(
        corporationId: Int,
        status: Contract.Status,
        type: Contract.Type,
        periodInDays: Int
    ): Flow<Contract>
}