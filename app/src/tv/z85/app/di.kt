package tv.z85.app

import org.koin.core.module.Module
import org.koin.core.qualifier.named
import org.koin.dsl.module
import java.util.*;

fun buildApplicationModule(config: ApplicationConfig): Module {
    return module {
        single(named("corporationId")) { config.corporationId }
    }
}