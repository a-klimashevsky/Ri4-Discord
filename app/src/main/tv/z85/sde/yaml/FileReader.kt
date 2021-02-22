package tv.z85.sde.yaml

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.FileInputStream


fun FileInputStream.readAllAsFlow(): Flow<String> {
    val stream = this
    return flow {
        emit(stream.bufferedReader().use { it.readText() })
    }
}