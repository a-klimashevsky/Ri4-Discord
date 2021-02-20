package tv.z85.usecases

import tv.z85.domain.Contract
import tv.z85.domain.CorporationContractsRepository

interface GetOutgoingCorporationContractsForPeriodUseCase : GetCorporationContractsForPeriodUseCase

class GetOutgoingCorporationContractsForPeriodUseCaseImpl(
    repo: CorporationContractsRepository
) : GetExchangeCorporationContractsForPeriodUseCaseImpl(
    repo, Contract.Status.Outstanding
), GetOutgoingCorporationContractsForPeriodUseCase