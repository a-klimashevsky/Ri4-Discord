package tv.z85.yaml

open class ScalarYamlNode(private val value: String) : YamlNode {

    override fun dump(builder: StringBuilder, indent: String, skipFirstIndent: Boolean) {
        builder.appendLine("$value")
    }
}