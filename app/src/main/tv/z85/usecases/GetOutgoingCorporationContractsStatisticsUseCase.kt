package tv.z85.usecases

import kotlinx.coroutines.flow.Flow
import tv.z85.domain.GroupedContractStatistic

/**
 * Created by alexk on 2/19/21.
 */
interface GetOutgoingCorporationContractsStatisticsUseCase {
    fun invoke(corporationId: Int, periodInDays: Int): Flow<GroupedContractStatistic>
}

class GetOutgoingCorporationContractsStatisticsUseCaseImpl(
    getSoldCorporationContractsUseCase: GetOutgoingCorporationContractsForPeriodUseCase,
    getLocationNameUseCase: GetLocationNameUseCase,
) : GetOutgoingCorporationContractsStatisticsUseCase {
    private val aggregator =
        CorporationContractsLocationTypeAggregator(getSoldCorporationContractsUseCase, getLocationNameUseCase)

    override fun invoke(
        corporationId: Int,
        periodInDays: Int
    ): Flow<GroupedContractStatistic> = aggregator.statistics(corporationId, periodInDays)
}