package tv.z85.usecases

import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.*
import tv.z85.domain.Contract
import tv.z85.domain.CorporationContractsRepository
import java.time.OffsetDateTime


interface GetSoldCorporationContractsForPeriodUseCase {

    fun invoke(corporationId: Int, periodInDays: Int): Flow<Contract>
}

class GetSoldCorporationContractsForPeriodUseCaseImpl(
    private val repo: CorporationContractsRepository
) : GetSoldCorporationContractsForPeriodUseCase {

    @FlowPreview
    override fun invoke(corporationId: Int, periodInDays: Int): Flow<Contract> {
        val today = OffsetDateTime.now()
        return repo.getAll(corporationId)
            .flatMapConcat { it.asFlow() }
            .filter { it.forCorporation }
            .filter { it.type == Contract.Type.ItemExchange }
            .filter { it.status == Contract.Status.Finished }
            .filter { it.title?.isNotEmpty() ?: false }
            .filter { it.dateCompleted?.isAfter(today.minusDays(periodInDays.toLong())) ?: false }
            .onEach {
                val a = it.price
            }
    }
}