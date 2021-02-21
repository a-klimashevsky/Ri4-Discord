package tv.z85.domain

import org.koin.dsl.module

val domainModule = module {
    single<CorporationContractsRepository> {
        CorporationContractsRepositoryImpl(
            service = get()
        )
    }
}