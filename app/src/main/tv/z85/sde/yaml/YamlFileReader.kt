package tv.z85.sde.yaml

import kotlinx.coroutines.flow.Flow


/**
 * Created by alexk on 1/20/21.
 */
interface YamlFileReader<T> {
    fun read(): Flow<T>
}