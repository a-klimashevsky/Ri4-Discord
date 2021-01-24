package tv.z85.domain.sde.yaml

import kotlinx.serialization.Serializable


@Serializable
class InventoryNameYaml(
    val itemID: Int,
    val itemName: String,
)