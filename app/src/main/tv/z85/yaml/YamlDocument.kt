package tv.z85.yaml

@YamlTagMarker
class YamlDocument {

    private val document = mutableListOf<YamlNode>()

    fun add(node: YamlNode) {
        document.add(node)
    }

    fun dump(): String {
        val builder = StringBuilder()
        document.forEach { it.dump(builder, "") }
        return builder.toString().trimIndent()
    }

    operator fun Pair<String, String>.unaryPlus() {
        add(MappingYamlNode(this.first, this.second))
    }

    infix fun String.to(value: String) {
        add(MappingYamlNode(this, value))
    }

    infix fun String.to(value: Int) {
        add(MappingYamlNode(this, value.toString()))
    }

    @YamlTagMarker
    inline infix fun String.to_seq(crossinline block: SequenceYamlNode.() -> Unit) {
        add(MappingYamlNode(this, SequenceYamlNode(Style.Block).apply(block)))
    }

    infix fun <T : YamlNode> String.to(block: () -> T) {

        add(MappingYamlNode(this, block()))
    }

    override fun toString() = dump()
}