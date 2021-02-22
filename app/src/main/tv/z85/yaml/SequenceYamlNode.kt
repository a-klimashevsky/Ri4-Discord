package tv.z85.yaml

open class SequenceYamlNode(
    var style: Style
) : ContainerYamlNode() {

    @YamlTagMarker
    inline infix fun String.to_seq(crossinline block: SequenceYamlNode.() -> Unit) {
        add(MappingYamlNode(this, SequenceYamlNode(Style.Block).apply(block)))
    }

    override fun dump(builder: StringBuilder, indent: String, skipFirstIndent: Boolean) {
        for (item in items) {

            if(item is ScalarYamlNode) {
                builder.append("$indent- ")
                item.dump(builder, "$indent  ")
            } else if(style == Style.Block){
                builder.append("$indent-\n")
                item.dump(builder, "$indent")
            } else if (style == Style.Compact) {
                builder.append("$indent- ")
                item.dump(builder, "$indent", true)
            }
        }
    }
}