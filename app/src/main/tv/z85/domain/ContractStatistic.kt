package tv.z85.domain

import kotlinx.serialization.Serializable

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

typealias GroupedContractStatistic = Map<String, List<Pair<String, ContractStatistic>>>