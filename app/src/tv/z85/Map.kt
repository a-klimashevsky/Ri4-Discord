package tv.z85

fun <K, V> Map<K, V>.mergeWith(other: Map<K, V>): Map<K, V> {
    val result = this.toMutableMap()
    result.putAll(other)
    return result
}