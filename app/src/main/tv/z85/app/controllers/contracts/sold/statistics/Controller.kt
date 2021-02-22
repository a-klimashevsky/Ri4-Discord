package tv.z85.app.controllers.contracts.sold.statistics

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.zip
import tv.z85.app.controllers.Controller
import tv.z85.usecases.GetCorporationInfoUseCase
import tv.z85.usecases.GetOutgoingCorporationContractsStatisticsUseCase
import tv.z85.usecases.GetSoldCorporationContractsStatisticsUseCase
import tv.z85.zip


interface ContractsController : Controller<ViewModel>

class ControllerImpl(
    private val corporationId: Int,
    private val periodInDays: Int,
    private val getCorporationInfoUseCase: GetCorporationInfoUseCase,
    private val getSoldCorporationContractsStatisticsUseCase: GetSoldCorporationContractsStatisticsUseCase,
    private val getOutgoingCorpContractsStatisticsUseCase: GetOutgoingCorporationContractsStatisticsUseCase
) : ContractsController {
    override fun viewModel(): Flow<ViewModel> {
        return zip(
            getSoldCorporationContractsStatisticsUseCase.invoke(corporationId, periodInDays),
            getOutgoingCorpContractsStatisticsUseCase.invoke(corporationId, periodInDays),
        ) { list ->
            Pair(list[0], list[1])
        }.zip(getCorporationInfoUseCase.invoke(corporationId)) { (sold, outgoing), corpInfo ->
            val viewSoldStatistics = sold.mapValues { entry ->
                entry.value.map {
                    val totalInBill = it.second.total / 1000_000_000
                    "${it.first}: ${it.second.count} for ${totalInBill.format(2)}kkk ISK"
                }
            }

            val viewOutgoingStatistics = outgoing.mapValues { entry ->
                entry.value.map {
                    val totalInBill = it.second.total / 1000_000_000
                    "${it.first}: ${it.second.count} for ${totalInBill.format(2)}kkk ISK"
                }
            }

            ViewModel(
                corporationName = corpInfo.name,
                soldContracts = viewSoldStatistics,
                outgoingContrats = viewOutgoingStatistics,
                forPeriod = periodInDays
            )
        }
    }

}

fun Double.format(digits: Int) = "%.${digits}f".format(this)