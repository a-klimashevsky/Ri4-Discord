package tv.z85.usecases

import kotlinx.coroutines.flow.*
import tv.z85.Log
import tv.z85.domain.Contract
import tv.z85.domain.CorporationContractsRepository
import java.time.OffsetDateTime


open class GetExchangeCorporationContractsForPeriodUseCaseImpl(
    private val repo: CorporationContractsRepository,
    private val status: Contract.Status
) : GetCorporationContractsForPeriodUseCase {
    override fun invoke(corporationId: Int, periodInDays: Int): Flow<Contract> {
        val today = OffsetDateTime.now()
        return repo.getAll(corporationId)
            .onEach {
                Log.debug("R4: contacts ${it.size}, look for status $status")
            }
            .flatMapConcat { it.asFlow() }
            .filter { it.forCorporation }
            .filter { it.issuerCorporationId == corporationId}
            .filter { it.type == Contract.Type.ItemExchange }
            .filter { it.status == status }
            .filter { it.title?.isNotEmpty() ?: false }
            .filter { it.dateCompleted?.isAfter(today.minusDays(periodInDays.toLong())) ?: true }
    }
}