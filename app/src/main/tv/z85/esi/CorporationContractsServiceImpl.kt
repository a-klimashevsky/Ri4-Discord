package tv.z85.esi

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import tv.z85.domain.Contract
import tv.z85.domain.CorporationContractsService
import tv.z85.esi.apis.ContractsApi
import tv.z85.tv.z85.esi.map
import tv.z85.usecases.GetAuthTokenUseCase
import tv.z85.usecases.ReAuthUseCase

class CorporationContractsServiceImpl(
    getAuthTokenUseCase: GetAuthTokenUseCase,
    reAuthUseCase: ReAuthUseCase,
    private val api: ContractsApi,
) : CorporationContractsService, BaseAuthorizedEsiRepository<List<Contract>>(getAuthTokenUseCase, reAuthUseCase) {

    override fun getAll(corporationId: Int): Flow<List<Contract>> =
        with504 {
            withAuth { token ->
                fetchContracts(token, corporationId)
            }
        }


    private fun fetchContracts(token: String, corporationId: Int): Flow<List<Contract>> {
        return flow {
            val result = mutableListOf<Contract>()

            val apiResponse = api.getCorporationsCorporationIdContracts(
                corporationId = corporationId,
                datasource = null,
                ifMinusNoneMinusMatch = null,
                page = 1,
                token = token
            )

            val pageCount = apiResponse.pageCount

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
    }
}
