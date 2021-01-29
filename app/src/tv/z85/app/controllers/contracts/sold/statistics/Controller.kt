package tv.z85.app.controllers.contracts.sold.statistics

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.zip
import tv.z85.app.controllers.Controller
import tv.z85.usecases.GetCorporationInfoUseCase
import tv.z85.usecases.GetSoldCorporationContractsStatisticsUseCase


interface ContractsController : Controller<ViewModel> {

}

class ControllerImpl(
    private val corporationId: Int,
    private val periodInDays: Int,
    private val getCorporationInfoUseCase: GetCorporationInfoUseCase,
    private val getSoldCorporationContractsStatisticsUseCase: GetSoldCorporationContractsStatisticsUseCase
) : ContractsController {
    override fun viewModel(): Flow<ViewModel> {
        return getCorporationInfoUseCase.invoke(corporationId).zip(
            getSoldCorporationContractsStatisticsUseCase.invoke(corporationId, periodInDays)
        ) { corporationInfo, statistics ->
            val viewStatistics = statistics.mapValues { entry ->
                entry.value.map {
                    val totalInBill = it.second.total / 1000_000_000
                    "${it.first}: ${it.second.count} for ${totalInBill.format(2)}kkk ISK"
                }
            }
            ViewModel(
                corporationName = corporationInfo.name,
                statistics = viewStatistics,
                forPeriod = periodInDays
            )
        }
    }

}

fun Double.format(digits: Int) = "%.${digits}f".format(this)