package tv.z85.domain.sde

import org.koin.core.qualifier.named
import org.koin.dsl.module
import tv.z85.sde.update.UpdateInventoryItemsTask
import tv.z85.sde.update.UpdateInventoryNamesTask
import tv.z85.sde.InventoryItem
import tv.z85.sde.InventoryName
import tv.z85.sde.SdeUpdateTask
import tv.z85.sde.yaml.InvItemsFileReader
import tv.z85.sde.yaml.InvNamesFileReader
import tv.z85.sde.yaml.YamlFileReader


fun buildSdeModule(cacheFolder: String) = module {

    single<YamlFileReader<List<InventoryItem>>>(named("InvItemsFileReader")) { InvItemsFileReader("${cacheFolder}/bsd/invItems.yaml") }

    single<YamlFileReader<List<InventoryName>>>(named("InvNamesFileReader")) { InvNamesFileReader("${cacheFolder}/bsd/invNames.yaml") }

    single {
        UpdateInventoryItemsTask(get(named("InvItemsFileReader")), get())
    }

    single {
        UpdateInventoryNamesTask(get(named("InvNamesFileReader")), get())
    }

    single<SdeUpdateTask> {
        SdeUpdateTaskImpl(
            listOf(
                get<UpdateInventoryItemsTask>(),
                get<UpdateInventoryNamesTask>(),
            )
        )
    }
}