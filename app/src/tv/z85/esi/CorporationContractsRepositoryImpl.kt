package tv.z85.tv.z85.esi

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flatMapConcat
import kotlinx.coroutines.flow.flow
import tv.z85.domain.Contract
import tv.z85.domain.CorporationContractsRepository
import tv.z85.esi.apis.ContractsApi
import tv.z85.usecases.AuthToken
import tv.z85.usecases.GetAuthTokenUseCase

class CorporationContractsRepositoryImpl(
    private val getAuthTokenUseCase: GetAuthTokenUseCase,
    private val api: ContractsApi,
) : CorporationContractsRepository {
    override fun getAll(corporationId: Int): Flow<List<Contract>> {
        return getAuthTokenUseCase.invoke()
            .flatMapConcat { token ->
                fetchContract(token, corporationId)
            }
    }

    private fun fetchContract(token: AuthToken, corporationId: Int): Flow<List<Contract>> {
        return flow {
            val result = mutableListOf<Contract>()

            val apiResponse = api.getCorporationsCorporationIdContracts(
                corporationId = corporationId,
                datasource = null,
                ifMinusNoneMinusMatch = null,
                page = 1,
                token = token.token
            )

            val pageCount = apiResponse.pageCount

            result.addAll(apiResponse.data.map { it.map() })

            for (i in (2..pageCount)) {
                val apiResponse = api.getCorporationsCorporationIdContracts(
                    corporationId = corporationId,
                    datasource = null,
                    ifMinusNoneMinusMatch = null,
                    page = i,
                    token = token.token
                )

                result.addAll(apiResponse.data.map { it.map() })
            }

            emit(result)
        }
    }
}