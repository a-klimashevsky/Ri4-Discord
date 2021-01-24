package tv.z85.domain.sde.yaml

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.builtins.ListSerializer
import tv.z85.domain.sde.InventoryItem


class InvItemsFileReader(
    fileName: String,
) : BaseYamlFileReader<List<InventoryItem>>(fileName) {

    override fun serializer(): DeserializationStrategy<List<InventoryItem>> {
        return ListSerializer(buildSerializerFor(InventoryItem::class.java))
    }
}