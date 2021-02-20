package tv.z85.usecases

import tv.z85.domain.Contract
import tv.z85.domain.CorporationContractsRepository


interface GetSoldCorporationContractsForPeriodUseCase : GetCorporationContractsForPeriodUseCase

class GetSoldCorporationContractsForPeriodUseCaseImpl(
    repo: CorporationContractsRepository,
) : GetExchangeCorporationContractsForPeriodUseCaseImpl(repo, Contract.Status.Finished),
    GetSoldCorporationContractsForPeriodUseCase