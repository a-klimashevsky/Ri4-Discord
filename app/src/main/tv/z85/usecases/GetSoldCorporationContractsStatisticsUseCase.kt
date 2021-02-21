package tv.z85.usecases

import kotlinx.coroutines.flow.Flow
import tv.z85.domain.GroupedContractStatistic

interface GetSoldCorporationContractsStatisticsUseCase {
    fun invoke(corporationId: Int, periodInDays: Int): Flow<GroupedContractStatistic>
}

class GetSoldCorporationContractsStatisticsUseCaseImpl(
    getSoldCorporationContractsUseCase: GetSoldCorporationContractsForPeriodUseCase,
    getLocationNameUseCase: GetLocationNameUseCase,
) : GetSoldCorporationContractsStatisticsUseCase {

    private val aggregator =
        CorporationContractsLocationTypeAggregator(getSoldCorporationContractsUseCase, getLocationNameUseCase)

    override fun invoke(
        corporationId: Int,
        periodInDays: Int
    ): Flow<GroupedContractStatistic> = aggregator.statistics(corporationId, periodInDays)

}