package tv.z85.app.controllers

import org.koin.core.qualifier.named
import org.koin.dsl.module
import tv.z85.app.controllers.contracts.expired.statistics.ExpiredContractsController
import tv.z85.app.controllers.contracts.expired.statistics.ExpiredContractsControllerImpl
import tv.z85.app.controllers.contracts.sold.statistics.ContractsController
import tv.z85.app.controllers.contracts.sold.statistics.ControllerImpl

val controllersModule = module {
    single<ContractsController> {
        ControllerImpl(
            corporationId = get(named("corporationId")),
            periodInDays = get(named("periodInDays")),
            getCorporationInfoUseCase = get(),
            getSoldCorporationContractsStatisticsUseCase = get(),
            getOutgoingCorpContractsStatisticsUseCase = get(),
        )
    }

    single<ExpiredContractsController> {
        ExpiredContractsControllerImpl(
            corporationId = get(named("corporationId")),
            getCorporationInfoUseCase = get(),
            getExpiredContractsStats = get()
        )
    }
}
