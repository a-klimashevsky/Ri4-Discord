package tv.z85.esi.models


data class Paged<T>(
    val pageCount: Int,
    val data: T
)