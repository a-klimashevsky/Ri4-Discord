package tv.z85.sde.update

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flatMapConcat
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import org.litote.kmongo.coroutine.CoroutineDatabase
import tv.z85.sde.InventoryItem
import tv.z85.sde.yaml.YamlFileReader

class UpdateInventoryItemsTask(
    private val fileReader: YamlFileReader<List<InventoryItem>>,
    private val database: CoroutineDatabase
) : UpdateTask {
    override fun update(): Flow<Unit> {
        return fileReader.read()
            .flatMapConcat { list ->
                flow{
                    database.getCollection<InventoryItem>().drop()
                    emit(database.getCollection<InventoryItem>().insertMany(list))

                }
            }
            .map {  }
    }
}