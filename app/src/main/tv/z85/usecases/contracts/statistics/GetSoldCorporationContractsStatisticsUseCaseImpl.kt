package tv.z85.usecases.contracts.statistics

import kotlinx.coroutines.flow.Flow
import tv.z85.domain.Contract
import tv.z85.domain.CorporationContractsRepository
import tv.z85.domain.GroupedContractStatistic
import tv.z85.usecases.GetLocationNameUseCase

class GetSoldCorporationContractsStatisticsUseCaseImpl(
    private val repo: CorporationContractsRepository,
    private val getLocationNameUseCase: GetLocationNameUseCase,
) : GetSoldCorporationContractsStatisticsUseCase {

    override fun invoke(
        corporationId: Int,
        periodInDays: Int
    ): Flow<GroupedContractStatistic> {

        val source = repo.find(
            corporationId = corporationId,
            status = Contract.Status.Finished,
            type = Contract.Type.ItemExchange,
            periodInDays = periodInDays
        )

        val aggregator = CorporationContractStatsAggregator(
            source = source,
            getLocationNameUseCase = getLocationNameUseCase
        )

        return aggregator.statistics()
    }
}