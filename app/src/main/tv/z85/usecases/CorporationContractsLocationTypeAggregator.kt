package tv.z85.usecases

import kotlinx.coroutines.flow.*
import tv.z85.*
import tv.z85.domain.Contract
import tv.z85.domain.ContractStatistic
import tv.z85.domain.GroupedContractStatistic


class CorporationContractsLocationTypeAggregator(
    private val source: GetCorporationContractsForPeriodUseCase,
    private val getLocationNameUseCase: GetLocationNameUseCase,
) {
    fun statistics(corporationId: Int, periodInDays: Int): Flow<GroupedContractStatistic> =
        source.invoke(corporationId, periodInDays)
            .groupBy { it.startLocationId }
            .flatMapConcat { contractsByPlace ->
                groupByLocation(contractsByPlace)
                    .zip(getLocationName(contractsByPlace.key ?: 0L)) { a, b ->
                        a.mapKeys { b }
                    }
                    .onEach {
                        Log.debug("R4: one station contracts is $it")
                    }
            }.mapReduce({ it }, { a, b -> a.mergeWith(b) })

    private fun getLocationName(id: Long): Flow<String> {
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