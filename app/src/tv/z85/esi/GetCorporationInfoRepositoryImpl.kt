package tv.z85.esi

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import tv.z85.domain.CorporationInfo
import tv.z85.domain.CorporationInfoRepository
import tv.z85.esi.apis.CorporationApi
import tv.z85.esi.models.GetCorporationsCorporationIdOk


class GetCorporationInfoRepositoryImpl(
    private val api: CorporationApi
) : CorporationInfoRepository {
    override fun getById(id: Int): Flow<CorporationInfo> = flow {
        val response = api.getCorporationsCorporationId(
            corporationId = id,
            datasource = null,
            ifMinusNoneMinusMatch = null
        )

        val info = response.map()

        emit(info)
    }
}

private fun GetCorporationsCorporationIdOk.map(): CorporationInfo =
    CorporationInfo(
        allianceId = this.allianceId,
        ceoId = this.ceoId,
        creatorId = this.creatorId,
        dateFounded = this.dateFounded,
        description = this.description ?: "",
        homeStationId = this.homeStationId,
        memberCount = this.memberCount,
        name = this.name,
        shares = this.shares,
        taxRate = this.taxRate,
        ticker = this.ticker,
        url = this.url,
        warEligible = this.warEligible ?: false,
        factionId = this.factionId
    )