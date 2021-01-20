package tv.z85.domain.sde.yaml

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.bson.codecs.pojo.annotations.BsonId


@Serializable
data class InventoryItemYaml(
    val flagID: Int,
    val itemID: Int,
    val locationID: Int,
    val ownerID: Int,
    val quantity: Int,
    val typeID: Int,
)