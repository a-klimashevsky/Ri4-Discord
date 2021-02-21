package tv.z85.app.controllers.contracts.sold.statistics

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class ViewModel(
    @SerialName("corporation")
    val corporationName: String,
    @SerialName("for period")
    val forPeriod: Int,
    @SerialName("Sold Contracts")
    val soldContracts: Map<String, List<String>>,
    @SerialName("Outgoing Contracts")
    val outgoingContrats: Map<String, List<String>>
)