package tv.z85.domain

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flatMapConcat
import java.time.OffsetDateTime


class CorporationContractsRepositoryImpl(
    private val service: CorporationContractsService
) : CorporationContractsRepository {

    override fun find(corporationId: Int): Flow<Contract> {
        return service.getAll(corporationId).flatMapConcat { it.asFlow() }
    }

    override fun find(corporationId: Int, status: Contract.Status, type: Contract.Type): Flow<Contract> {
        return find(corporationId)
            .filter { it.forCorporation }
            .filter { it.issuerCorporationId == corporationId }
            .filter { it.type == type }
            .filter { it.status == status }
            .filter { it.title?.isNotEmpty() ?: false }
    }

    override fun find(
        corporationId: Int,
        status: Contract.Status,
        type: Contract.Type,
        periodInDays: Int
    ): Flow<Contract> {
        val today = OffsetDateTime.now()
        val dateFrom = today.minusDays(periodInDays.toLong())
        return find(corporationId, status, type)
            .filter { it.dateCompleted?.isAfter(dateFrom) ?: false }

    }
}