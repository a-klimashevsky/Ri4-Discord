package tv.z85.domain.sde

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.util.*;

@Serializable
data class InventoryName(
    @SerialName("_id")
    val itemID: Int,
    val itemName: String,
)