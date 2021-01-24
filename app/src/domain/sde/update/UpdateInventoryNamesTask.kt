package tv.z85.domain.sde.update

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flatMapConcat
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import org.litote.kmongo.coroutine.CoroutineDatabase
import tv.z85.domain.sde.InventoryName
import tv.z85.domain.sde.yaml.InventoryNameYaml
import tv.z85.domain.sde.yaml.YamlFileReader


class UpdateInventoryNamesTask(
    private val fileReader: YamlFileReader<List<InventoryName>>,
    private val database: CoroutineDatabase
) : UpdateTask {
    override fun update(): Flow<Unit> {
        return fileReader.read()
            .flatMapConcat {
                flow {
                    emit(database.getCollection<InventoryName>().insertMany(it))
                }
            }
            .map { }
    }
}