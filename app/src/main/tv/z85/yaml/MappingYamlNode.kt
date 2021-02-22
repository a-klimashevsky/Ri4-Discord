package tv.z85.yaml

open class MappingYamlNode(private val pair: Pair<String, YamlNode>) : YamlNode {

    constructor(key: String, value: YamlNode) : this(key to value)

    constructor(key: String, value: String) : this(key to ScalarYamlNode(value))

    override fun dump(builder: StringBuilder, indent: String, skipFirstIndent: Boolean) {
        builder.append("$indent${pair.first}:")
        if(pair.second !is ScalarYamlNode){
            builder.append("\n")
        } else {
            builder.append(" ")
        }
        pair.second.dump(builder, "$indent  ")
    }
}