package tv.z85.esi

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.onStart
import tv.z85.esi.infrastructure.ServerException

fun <T> with504(
    repeat: Int = 5,
    delay: Long = 5000,
    block: () -> Flow<T>
): Flow<T> = block().catch { e ->
    when {
        e is ServerException && e.statusCode == 504 && repeat > 0 ->
            this.emitAll(with504(repeat - 1, delay, block).onStart {
                delay(delay)
            })
        else -> throw e
    }
}


