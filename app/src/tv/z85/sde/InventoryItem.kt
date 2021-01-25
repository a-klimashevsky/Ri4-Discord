package tv.z85.sde

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class InventoryItem(
    @SerialName("_id")
    val itemID: Int,
    val flagID: Int,
    val locationID: Int,
    val ownerID: Int,
    val quantity: Int,
    val typeID: Int,
)