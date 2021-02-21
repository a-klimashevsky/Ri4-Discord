package tv.z85.usecases

import kotlinx.coroutines.flow.Flow
import tv.z85.domain.Contract

interface GetCorporationContractsForPeriodUseCase {
    fun invoke(corporationId: Int, periodInDays: Int): Flow<Contract>
}