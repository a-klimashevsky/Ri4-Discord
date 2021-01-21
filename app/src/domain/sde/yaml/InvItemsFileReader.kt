package tv.z85.domain.sde.yaml

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.builtins.ListSerializer


class InvItemsFileReader(
    fileName: String,
) : BaseYamlFileReader<List<InventoryItemYaml>>(fileName) {

    override fun serializer(): DeserializationStrategy<List<InventoryItemYaml>> {
        return ListSerializer(InventoryItemYaml.serializer())
    }
}