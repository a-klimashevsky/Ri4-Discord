package tv.z85.app.controllers.contracts.sold.statistics

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tv.z85.usecases.ContractStatistic


@Serializable
data class ViewModel(
    @SerialName("corporation")
    val corporationName: String,
    @SerialName("for period")
    val forPeriod: Int,
    @SerialName("Contracts")
    val statistics: Map<String, List<String>>
)