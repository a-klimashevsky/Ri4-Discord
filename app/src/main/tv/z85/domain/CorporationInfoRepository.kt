package tv.z85.domain

import kotlinx.coroutines.flow.Flow


interface CorporationInfoRepository {
    fun getById(id: Int): Flow<CorporationInfo>
}