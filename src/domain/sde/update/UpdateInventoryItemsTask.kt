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
    private val fileReader: YamlFileReader<List<InventoryItemYaml>>,
    private val database: CoroutineDatabase
) : UpdateTask {
    override fun update(): Flow<Unit> {
        return fileReader.read()
            .map {
                it.map {
                    InventoryItem(
                        flagID = it.flagID,
                        itemID = it.itemID,
                        locationID = it.locationID,
                        ownerID = it.ownerID,
                        quantity = it.quantity,
                        typeID = it.typeID
                    )
                }
            }
            .flatMapConcat {
                flow{
                    emit(database.getCollection<InventoryItem>().insertMany(it))
                }
            }
            .map {  }
    }
}