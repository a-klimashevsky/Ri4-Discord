package tv.z85.domain.sde.yaml

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.builtins.ListSerializer


class InvNamesFileReader(
    fileName: String,
) : BaseYamlFileReader<List<InventoryNameYaml>>(fileName) {

    override fun serializer(): DeserializationStrategy<List<InventoryNameYaml>> {
        return ListSerializer(InventoryNameYaml.serializer())
    }
}