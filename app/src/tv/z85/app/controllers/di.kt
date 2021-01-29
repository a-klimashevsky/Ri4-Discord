package tv.z85.app.controllers

import org.koin.core.qualifier.named
import org.koin.dsl.module
import tv.z85.app.controllers.contracts.sold.statistics.ContractsController
import tv.z85.app.controllers.contracts.sold.statistics.ControllerImpl
import java.util.*;

val controllersModule = module {
    single<ContractsController> {
        ControllerImpl(
            corporationId = get(named("corporationId")),
            periodInDays = get(named("periodInDays")),
            getCorporationInfoUseCase = get(),
            getSoldCorporationContractsStatisticsUseCase = get())
    }
}
