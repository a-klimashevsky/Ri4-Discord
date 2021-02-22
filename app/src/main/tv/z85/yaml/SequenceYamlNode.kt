package tv.z85.yaml

open class SequenceYamlNode(
    private val style: Style
) : ContainerYamlNode() {

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