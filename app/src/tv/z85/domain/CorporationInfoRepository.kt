package tv.z85.domain

import kotlinx.coroutines.flow.Flow
import java.util.*;


interface CorporationInfoRepository {
    fun getById(id: Int): Flow<CorporationInfo>
}