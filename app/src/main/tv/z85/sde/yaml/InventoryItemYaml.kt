package tv.z85.sde.yaml

import kotlinx.serialization.Serializable


@Serializable
data class InventoryItemYaml(
    val flagID: Int,
    val itemID: Int,
    val locationID: Int,
    val ownerID: Int,
    val quantity: Int,
    val typeID: Int,
)