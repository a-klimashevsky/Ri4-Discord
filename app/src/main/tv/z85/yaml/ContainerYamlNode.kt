package tv.z85.yaml


open class ContainerYamlNode : YamlNode {
    protected val items = mutableListOf<YamlNode>()

    operator fun String.unaryPlus() {
        items += ScalarYamlNode(this)
    }

    infix fun String.to(value: String) {
        add(MappingYamlNode(this,value))
    }

    fun add(item: YamlNode) = items.add(item)


    override fun dump(builder: StringBuilder, indent: String, skipFirstIndent: Boolean) {
        items.forEachIndexed { index, node ->
            val ind = when{
                index == 0 && skipFirstIndent -> ""
                else -> "$indent  "
            }
            node.dump(builder, ind)
        }
    }
}