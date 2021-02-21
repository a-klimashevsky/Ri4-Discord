package tv.z85.sde

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class InventoryName(
    @SerialName("_id")
    val itemID: Int,
    val itemName: String,
)