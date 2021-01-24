package tv.z85.domain.sde.yaml

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.builtins.ListSerializer
import tv.z85.domain.sde.InventoryName


class InvNamesFileReader(
    fileName: String,
) : BaseYamlFileReader<List<InventoryName>>(fileName) {

    override fun serializer(): DeserializationStrategy<List<InventoryName>> {
        return ListSerializer(buildSerializerFor(InventoryName::class.java))
    }
}