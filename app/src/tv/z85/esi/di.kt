package tv.z85.esi

import org.koin.dsl.module
import tv.z85.domain.CorporationContractsRepository
import tv.z85.esi.apis.ContractsApi
import tv.z85.tv.z85.esi.CorporationContractsRepositoryImpl


val gatewaysModule = module {
    single<ContractsApi> { ContractsApi() }
    single<CorporationContractsRepository> { CorporationContractsRepositoryImpl(get(), get()) }
}
