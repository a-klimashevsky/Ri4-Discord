package tv.z85.esi

import org.koin.dsl.module
import tv.z85.domain.CorporationContractsService
import tv.z85.domain.CorporationInfoRepository
import tv.z85.domain.CorporationStructuresRepository
import tv.z85.esi.apis.ContractsApi
import tv.z85.esi.apis.CorporationApi
import tv.z85.esi.apis.UniverseApi


val gatewaysModule = module {
    single<ContractsApi> { ContractsApi() }
    single<UniverseApi> { UniverseApi() }
    single<CorporationApi> { CorporationApi() }

    single<CorporationContractsService> { CorporationContractsServiceImpl(get(), get(), get()) }
    single<CorporationStructuresRepository> { CorporationStructuresRepositoryImpl(get(),get(),get()) }
    single<CorporationInfoRepository> { GetCorporationInfoRepositoryImpl(get()) }
}
