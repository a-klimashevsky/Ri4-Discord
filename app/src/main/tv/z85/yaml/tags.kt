package tv.z85.yaml

@YamlTagMarker
inline fun yaml(crossinline block: YamlDocument.() -> Unit): YamlDocument = YamlDocument().apply(block)

@YamlTagMarker
inline fun YamlDocument.seq(style: Style = Style.Block, crossinline block: SequenceYamlNode.() -> Unit): SequenceYamlNode {
    val sec = SequenceYamlNode(style).apply(block)
    this.add(sec)
    return sec
}

inline fun SequenceYamlNode.map(crossinline  block: ContainerYamlNode.() -> Unit): ContainerYamlNode{
    val obj = ContainerYamlNode().apply(block)
    this.add(obj)
    return obj
}