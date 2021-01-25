package tv.z85

import kotlinx.coroutines.flow.*
import java.util.*;

fun <T> Flow<T>.toList(): Flow<List<T>> = flow {
    val list = this@toList.toList(mutableListOf())
    emit(list)
}