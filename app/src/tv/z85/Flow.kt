package tv.z85

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.isActive
import java.util.*
import kotlin.concurrent.scheduleAtFixedRate

fun <T> Flow<T>.toList(): Flow<List<T>> = flow {
    val list = this@toList.toList(mutableListOf())
    emit(list)
}

fun <K, T> Flow<T>.groupBy(keySelector: (T) -> K): Flow<GroupedFlow<T, K>> =  channelFlow {
    val storage = mutableMapOf<K, MutableList<T>>()

    this@groupBy
        .onCompletion {
            storage.forEach { (k, ts) -> send(GroupedFlow(k, ts.asFlow())) }
        }
        .collect {
            t -> storage.getOrPut(keySelector(t)) { mutableListOf() } += t
    }
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

fun <S, R : S, T> Flow<T>.mapReduce(mapper: suspend (T) -> R, reducer: suspend (accumulator: S, value: R) -> S) =
    flow {
        emit(this@mapReduce.map(mapper).reduce(reducer))
    }

@ExperimentalCoroutinesApi
fun schedule(
    time: Date,
    period: Long,
    timer: Timer = Timer()
): Flow<Unit> = callbackFlow {
    timer.scheduleAtFixedRate(
        time = time,
        period = period,
        action = {
            if (!isActive) {
                timer.cancel()
            } else {
                offer(Unit)
            }
        }
    )

    awaitClose { timer.cancel() }
}

fun <T> Flow<T>.startWith(value: T): Flow<T> = flowOf(value).onCompletion { emitAll(this@startWith) }

fun <T, R> zip(
    vararg flows: Flow<T>,
    transform: suspend (List<T>) -> R
): Flow<R> = when(flows.size) {
    0 -> error("No flows")
    1 -> flows[0].map{ transform(listOf(it)) }
    2 -> flows[0].zip(flows[1]) { a, b -> transform(listOf(a, b)) }
    else -> {
        var accFlow: Flow<List<T>> = flows[0].zip(flows[1]) { a, b -> listOf(a, b) }
        for (i in 2 until flows.size) {
            accFlow = accFlow.zip(flows[i]) { list, it ->
                list + it
            }
        }
        accFlow.map(transform)
    }
}

