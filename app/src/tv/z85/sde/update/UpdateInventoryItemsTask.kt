package tv.z85.domain.sde.update

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flatMapConcat
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import org.litote.kmongo.coroutine.CoroutineDatabase
import tv.z85.domain.sde.InventoryItem
import tv.z85.domain.sde.yaml.InventoryItemYaml
import tv.z85.domain.sde.yaml.YamlFileReader

class UpdateInventoryItemsTask(
    private val fileReader: YamlFileReader<List<InventoryItem>>,
    private val database: CoroutineDatabase
) : UpdateTask {
    override fun update(): Flow<Unit> {
        return fileReader.read()
            .flatMapConcat {
                flow{
                    emit(database.getCollection<InventoryItem>().insertMany(it))
                }
            }
            .map {  }
    }
}