package tv.z85.app.controllers.contracts.expired.statistics

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class ViewModel(
    @SerialName("corporation")
    val corporationName: String,

    @SerialName("Contracts")
    val contracts: Map<String, List<String>>,
)
