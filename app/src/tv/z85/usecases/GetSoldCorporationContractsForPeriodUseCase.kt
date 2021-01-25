package tv.z85.usecases

import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flatMapConcat
import tv.z85.domain.Contract
import tv.z85.domain.CorporationContractsRepository
import tv.z85.toList
import java.time.OffsetDateTime


interface GetSoldCorporationContractsForPeriodUseCase {

    fun invoke(corporationId: Int, periodInDays: Int): Flow<List<Contract>>
}

class GetSoldCorporationContractsForPeriodUseCaseImpl(
    private val repo: CorporationContractsRepository
) : GetSoldCorporationContractsForPeriodUseCase {

    @FlowPreview
    override fun invoke(corporationId: Int, periodInDays: Int): Flow<List<Contract>> {
        val today = OffsetDateTime.now()
        return repo.getAll(corporationId)
            .flatMapConcat { it.asFlow() }
            .filter { it.forCorporation }
            .filter { it.type == Contract.Type.ItemExchange }
            .filter { it.status == Contract.Status.Finished }
            .filter { it.title?.isNotEmpty() ?: false }
            .filter { it.dateCompleted?.isAfter(today.minusDays(periodInDays.toLong())) ?: false }
            .toList()
    }
}