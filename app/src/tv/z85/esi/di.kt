package tv.z85.esi

import org.koin.dsl.module
import tv.z85.domain.CorporationContractsRepository
import tv.z85.domain.CorporationStructuresRepository
import tv.z85.domain.CorporationInfoRepository
import tv.z85.esi.apis.ContractsApi
import tv.z85.esi.apis.CorporationApi
import tv.z85.esi.apis.UniverseApi
import tv.z85.tv.z85.esi.CorporationContractsRepositoryImpl


val gatewaysModule = module {
    single<ContractsApi> { ContractsApi() }
    single<UniverseApi> { UniverseApi() }
    single<CorporationApi> { CorporationApi() }

    single<CorporationContractsRepository> { CorporationContractsRepositoryImpl(get(), get()) }
    single<CorporationStructuresRepository> { CorporationStructuresRepositoryImpl(get(),get()) }
    single<CorporationInfoRepository> { GetCorporationInfoRepositoryImpl(get()) }
}
