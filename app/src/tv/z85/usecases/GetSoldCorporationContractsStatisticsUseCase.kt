package tv.z85.usecases

import kotlinx.coroutines.flow.*
import kotlinx.serialization.Serializable
import tv.z85.*
import tv.z85.domain.Contract

interface GetSoldCorporationContractsStatisticsUseCase {
    fun invoke(corporationId: Int, periodInDays: Int): Flow<Map<String, List<Pair<String, ContractStatistic>>>>
}

@Serializable
data class ContractStatistic(
    val count: Int = 1,
    val total: Double = 0.0
) {
    operator fun plus(other: ContractStatistic): ContractStatistic {
        return ContractStatistic(
            count = this.count + other.count,
            total = this.total + other.total
        )
    }
}

class GetSoldCorporationContractsStatisticsUseCaseImpl(
    private val getSoldCorporationContractsUseCase: GetSoldCorporationContractsForPeriodUseCase,
    private val getLocationNameUseCase: GetLocationNameUseCase,
) : GetSoldCorporationContractsStatisticsUseCase {
    override fun invoke(
        corporationId: Int,
        periodInDays: Int
    ): Flow<Map<String, List<Pair<String, ContractStatistic>>>> {
        return getSoldCorporationContractsUseCase.invoke(corporationId, periodInDays)
            .groupBy { it.startLocationId }
            .flatMapConcat { contractsByPlace ->
                groupByLocation(contractsByPlace)
                    .zip(getLocationName(contractsByPlace.key ?: 0L)){
                        a,b ->a.mapKeys { b }
                    }
            }

    }

    private fun getLocationName(id: Long): Flow<String>{
        return getLocationNameUseCase.invoke(id)
    }

    private fun groupByLocation(contractsByPlace: GroupedFlow<Contract, Long?>) =
        groupByTitle(contractsByPlace)
            .mapReduce({ mapOf(contractsByPlace.key to it) },
                { acc, contracts -> acc.mergeWith(contracts) }
            )

    private fun groupByTitle(contractsByPlace: GroupedFlow<Contract, Long?>) =
        contractsByPlace.groupBy {
            it.title
        }.flatMapConcat { contractsByTitle ->
            contractsByTitle.mapReduce(
                { ContractStatistic(total = it.price ?: 0.0) },
                { acc, value -> acc + value }
            ).map { contractsByTitle.key!! to it }
        }
            .toList()
}