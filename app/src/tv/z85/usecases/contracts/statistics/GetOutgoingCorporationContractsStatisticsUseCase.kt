package tv.z85.usecases.contracts.statistics

import kotlinx.coroutines.flow.Flow
import tv.z85.domain.GroupedContractStatistic

interface GetOutgoingCorporationContractsStatisticsUseCase {
    fun invoke(corporationId: Int, periodInDays: Int): Flow<GroupedContractStatistic>
}

