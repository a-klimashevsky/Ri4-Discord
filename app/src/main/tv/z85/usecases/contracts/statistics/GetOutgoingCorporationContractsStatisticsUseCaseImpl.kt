package tv.z85.usecases.contracts.statistics

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.filter
import tv.z85.domain.Contract
import tv.z85.domain.CorporationContractsRepository
import tv.z85.domain.GroupedContractStatistic
import tv.z85.usecases.GetLocationNameUseCase
import java.time.OffsetDateTime

class GetOutgoingCorporationContractsStatisticsUseCaseImpl(
    private val repo: CorporationContractsRepository,
    private val getLocationNameUseCase: GetLocationNameUseCase,
) : GetOutgoingCorporationContractsStatisticsUseCase {

    override fun invoke(
        corporationId: Int,
    ): Flow<GroupedContractStatistic> {

        val now = OffsetDateTime.now()

        val source = repo.find(
            corporationId = corporationId,
            status = Contract.Status.Outstanding,
            type = Contract.Type.ItemExchange,
        ).filter { it.dateExpired?.isAfter(now) ?: true }

        val aggregator = CorporationContractStatsAggregator(
            source = source,
            getLocationNameUseCase = getLocationNameUseCase
        )

        return aggregator.statistics()
    }
}
