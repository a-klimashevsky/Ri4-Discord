package tv.z85.app.controllers.contracts.expired.statistics

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.zip
import tv.z85.app.controllers.Controller
import tv.z85.usecases.GetCorporationInfoUseCase
import tv.z85.usecases.contracts.statistics.GetExpiredCorporationContractsStatisticsUseCase


interface ExpiredContractsController : Controller<ViewModel>

class ExpiredContractsControllerImpl(
    private val corporationId: Int,
    private val getCorporationInfoUseCase: GetCorporationInfoUseCase,
    private val getExpiredContractsStats: GetExpiredCorporationContractsStatisticsUseCase,
) : ExpiredContractsController {
    override fun viewModel(): Flow<ViewModel> {
        return getExpiredContractsStats.invoke(corporationId)
            .zip(getCorporationInfoUseCase.invoke(corporationId)) { stats, corpInfo ->
                val viewSoldStatistics = stats.mapValues { entry ->
                    entry.value.map {
                        val totalInBill = it.second.total / 1000_000_000
                        "${it.first}: ${it.second.count} for ${totalInBill.format(2)}kkk ISK"
                    }
                }

                ViewModel(
                    corporationName = corpInfo.name,
                    contracts = viewSoldStatistics,
                )
            }
    }

}

fun Double.format(digits: Int) = "%.${digits}f".format(this)
