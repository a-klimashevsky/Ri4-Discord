package tv.z85.domain.sde.yaml

import com.charleskorn.kaml.Yaml
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.serialization.DeserializationStrategy
import tv.z85.domain.sde.readAllAsFlow
import java.io.FileInputStream


abstract class BaseYamlFileReader<T>(
    private val fileName: String,
) : YamlFileReader<T> {

    protected abstract fun serializer(): DeserializationStrategy<T>

    override fun read(): Flow<T> {
        return FileInputStream(this.fileName)
            .readAllAsFlow()
            .map { content ->
                Yaml.default.decodeFromString(serializer(), content)
            }
    }
}