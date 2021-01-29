package tv.z85

import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.flow.*
import java.util.*;

fun <T> Flow<T>.toList(): Flow<List<T>> = flow {
    val list = this@toList.toList(mutableListOf())
    emit(list)
}

fun <K ,T> Flow<T>.groupBy(keySelector: (T) -> K): Flow<GroupedFlow<T, K>> = flow {
    val storage = mutableMapOf<K, MutableList<T>>()
    collect { t -> storage.getOrPut(keySelector(t)) { mutableListOf() } += t }
    storage.forEach { (k, ts) -> emit(GroupedFlow(k, ts.asFlow())) }
}

class GroupedFlow<T, K>(
    val key: K,
    private val flow: Flow<T>
) : Flow<T> {
    @InternalCoroutinesApi
    override suspend fun collect(collector: FlowCollector<T>) {
        this.flow.collect(collector)
    }

}

fun <S, R:S,T> Flow<T>.mapReduce(mapper: suspend (T)-> R, reducer: suspend (accumulator: S, value: R) -> S ) =
    flow{
        emit(this@mapReduce.map(mapper).reduce(reducer))
    }
