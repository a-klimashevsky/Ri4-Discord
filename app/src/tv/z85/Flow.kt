package tv.z85

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.isActive
import java.util.*;
import kotlin.concurrent.fixedRateTimer
import kotlin.concurrent.schedule
import kotlin.concurrent.scheduleAtFixedRate

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
             if(!isActive){
                 timer.cancel()
             } else {
                 offer(Unit)
             }
         }
     )

     awaitClose { timer.cancel() }
}