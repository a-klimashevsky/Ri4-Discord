package tv.z85.app

import org.koin.core.module.Module
import org.koin.core.qualifier.named
import org.koin.dsl.module
import org.slf4j.Logger

fun buildApplicationModule(config: ApplicationConfig, log: Logger): Module {
    return module {
        single(named("corporationId")) { config.corporationId }
        single(named("periodInDays")) { config.periodInDays }
        single { log }
    }
}