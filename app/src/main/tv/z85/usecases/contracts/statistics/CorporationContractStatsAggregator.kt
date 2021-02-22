package tv.z85.usecases.contracts.statistics

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flatMapConcat
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.zip
import tv.z85.*
import tv.z85.domain.Contract
import tv.z85.domain.ContractStatistic
import tv.z85.domain.GroupedContractStatistic
import tv.z85.usecases.GetLocationNameUseCase


class CorporationContractStatsAggregator(
    private val source: Flow<Contract>,
    private val getLocationNameUseCase: GetLocationNameUseCase,
) {
    fun statistics(): Flow<GroupedContractStatistic> =
        source
            .groupBy { it.startLocationId }
            .flatMapConcat { contractsByPlace ->
                groupByLocation(contractsByPlace)
                    .zip(getLocationName(contractsByPlace.key ?: 0L)) { a, b ->
                        a.mapKeys { b }
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