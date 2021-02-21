package tv.z85.usecases

import kotlinx.coroutines.flow.Flow
import tv.z85.domain.CorporationInfo
import tv.z85.domain.CorporationInfoRepository


interface GetCorporationInfoUseCase {
    fun invoke(id: Int): Flow<CorporationInfo>
}

class GetCorporationInfoUseCaseImpl(
    private val repo: CorporationInfoRepository
) : GetCorporationInfoUseCase {
    override fun invoke(id: Int): Flow<CorporationInfo> {
        return repo.getById(id)
    }

}