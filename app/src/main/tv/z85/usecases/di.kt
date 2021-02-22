package tv.z85.usecases

import org.koin.dsl.module

import tv.z85.usecases.contracts.statistics.GetOutgoingCorporationContractsStatisticsUseCase
import tv.z85.usecases.contracts.statistics.GetOutgoingCorporationContractsStatisticsUseCaseImpl
import tv.z85.usecases.contracts.statistics.GetSoldCorporationContractsStatisticsUseCase
import tv.z85.usecases.contracts.statistics.GetSoldCorporationContractsStatisticsUseCaseImpl

val useCaseModule = module {

    single<GetSoldCorporationContractsStatisticsUseCase> {
        GetSoldCorporationContractsStatisticsUseCaseImpl(get(), get())
    }

    single<GetLocationNameUseCase> {
        GetLocationNameUseCaseImpl(get())
    }

    single<GetCorporationInfoUseCase> {
        GetCorporationInfoUseCaseImpl(get())
    }

    single<GetOutgoingCorporationContractsStatisticsUseCase> {
        GetOutgoingCorporationContractsStatisticsUseCaseImpl(get(),get())
    }
}