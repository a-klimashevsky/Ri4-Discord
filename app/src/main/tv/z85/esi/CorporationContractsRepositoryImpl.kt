package tv.z85.esi

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import tv.z85.Log
import tv.z85.domain.Contract
import tv.z85.domain.CorporationContractsRepository
import tv.z85.esi.apis.ContractsApi
import tv.z85.tv.z85.esi.map
import tv.z85.usecases.GetAuthTokenUseCase
import tv.z85.usecases.ReAuthUseCase

class CorporationContractsRepositoryImpl(
    getAuthTokenUseCase: GetAuthTokenUseCase,
    reAuthUseCase: ReAuthUseCase,
    private val api: ContractsApi,
) : CorporationContractsRepository, BaseAuthorizedEsiRepository<List<Contract>>(getAuthTokenUseCase, reAuthUseCase) {

    override fun getAll(corporationId: Int): Flow<List<Contract>> =
        withAuth { token ->
            fetchContracts(token, corporationId)
        }

    private fun fetchContracts(token: String, corporationId: Int): Flow<List<Contract>> {
        return flow {

            Log.debug("R4: start fetch contracts for $corporationId")

            val result = mutableListOf<Contract>()

            val apiResponse = api.getCorporationsCorporationIdContracts(
                corporationId = corporationId,
                datasource = null,
                ifMinusNoneMinusMatch = null,
                page = 1,
                token = token
            )

            val pageCount = apiResponse.pageCount

            Log.debug("R4: contracts pages $pageCount")

            result.addAll(apiResponse.data.map { it.map() })

            for (i in (2..pageCount)) {
                val apiResponse = api.getCorporationsCorporationIdContracts(
                    corporationId = corporationId,
                    datasource = null,
                    ifMinusNoneMinusMatch = null,
                    page = i,
                    token = token
                )

                result.addAll(apiResponse.data.map { it.map() })
            }

            emit(result)
        }
            .catch { e ->
                Log.error("R4:", e)
                throw e
            }
    }
}