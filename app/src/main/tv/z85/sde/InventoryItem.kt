package tv.z85.sde

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class InventoryItem(
    val flagID: Int,
    @SerialName("_id")
    val itemID: Int,
    val locationID: Int,
    val ownerID: Int,
    val quantity: Int,
    val typeID: Int,
)

/*
* flagID: 0
    itemID: 5
    locationID: 1
    ownerID: 1
    quantity: -1
    typeID: 0
    * */