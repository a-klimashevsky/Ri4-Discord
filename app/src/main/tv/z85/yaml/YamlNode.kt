package tv.z85.yaml

@YamlTagMarker
interface YamlNode {
    fun dump(builder: StringBuilder, indent: String, skipFirstIndent: Boolean = false)
}