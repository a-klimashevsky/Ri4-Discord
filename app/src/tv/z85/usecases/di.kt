package tv.z85.usecases

import org.koin.dsl.module

val useCaseModule = module {

    single<GetSoldCorporationContractsForPeriodUseCase> {
        GetSoldCorporationContractsForPeriodUseCaseImpl(get())
    }

    single<GetSoldCorporationContractsStatisticsUseCase> {
        GetSoldCorporationContractsStatisticsUseCaseImpl(get(),get())
    }

    single<GetLocationNameUseCase> {
        GetLocationNameUseCaseImpl(get())
    }

    single<GetCorporationInfoUseCase> {
        GetCorporationInfoUseCaseImpl(get())
    }
}