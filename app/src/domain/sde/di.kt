package tv.z85.domain.sde

import org.koin.core.qualifier.named
import org.koin.dsl.module
import tv.z85.domain.sde.update.UpdateInventoryItemsTask
import tv.z85.domain.sde.update.UpdateInventoryNamesTask
import tv.z85.domain.sde.yaml.*


val sdeModule = module {

    single<YamlFileReader<List<InventoryItemYaml>>>(named("InvItemsFileReader")) { InvItemsFileReader("./.sde_cache/bsd/invItems.yaml") }

    single<YamlFileReader<List<InventoryNameYaml>>>(named("InvNamesFileReader")) { InvNamesFileReader("./.sde_cache/bsd/invNames.yaml") }

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