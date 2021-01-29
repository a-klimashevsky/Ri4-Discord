package tv.z85.esi

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import tv.z85.domain.CorporationStructuresRepository
import tv.z85.domain.Structure
import tv.z85.esi.apis.UniverseApi
import tv.z85.usecases.GetAuthTokenUseCase


class CorporationStructuresRepositoryImpl(
    getAuthTokenUseCase: GetAuthTokenUseCase,
    private val api: UniverseApi
) : CorporationStructuresRepository, BaseAuthorizedEsiRepository<Structure>(getAuthTokenUseCase) {

    override fun getById(id: Long): Flow<Structure> =
        withAuth { token ->
            flow {

                val apiResult = api.getUniverseStructuresStructureId(
                    structureId = id,
                    token = token,
                    datasource = null,
                    ifMinusNoneMinusMatch = null
                )

                val structure = Structure(
                    name = apiResult.name,
                    ownerId = apiResult.ownerId,
                    typeId = apiResult.typeId ?: 0,
                    solarSystemId = apiResult.solarSystemId
                )

                emit(structure)
            }
        }
}