package tv.z85.sde.update

import com.mongodb.client.result.InsertManyResult
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flatMapConcat
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import org.litote.kmongo.coroutine.CoroutineDatabase
import tv.z85.sde.InventoryName
import tv.z85.sde.yaml.YamlFileReader


class UpdateInventoryNamesTask(
    private val fileReader: YamlFileReader<List<InventoryName>>,
    private val database: CoroutineDatabase,
) : UpdateTask {
    override fun update(): Flow<Unit> {
        return fileReader.read()
            .flatMapConcat { list ->
                flow<InsertManyResult> {
                    database.getCollection<InventoryName>().drop()
                    emit(database.getCollection<InventoryName>().insertMany(list))
                }
            }.map {  }
    }
}