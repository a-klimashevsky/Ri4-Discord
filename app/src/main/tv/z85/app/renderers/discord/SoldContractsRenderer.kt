package tv.z85.app.renderers.discord

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import tv.z85.app.controllers.contracts.sold.statistics.ContractsController
import tv.z85.yaml.Style
import tv.z85.yaml.yaml


interface SoldContractsRenderer : DiscordMessageRenderer {
    //fun render(): Flow<String>
}

class SoldContractsRendererImpl(
    private val controller: ContractsController
) : SoldContractsRenderer {

    override fun render(): Flow<String> {

        return controller.viewModel().map { vm ->

            val yaml = yaml {
                "Corporation" to vm.corporationName
                "For Period" to vm.forPeriod
                "Sold Contracts" to_seq {
                    style = Style.Compact
                    vm.soldContracts.forEach{
                        (station, contracts) ->
                        station to_seq{
                            contracts.forEach { contract ->
                                + contract
                            }
                        }
                    }
                }
                "Outgoing Contracts" to_seq {
                    style = Style.Compact
                    vm.outgoingContrats.forEach{
                            (station, contracts) ->
                        station to_seq{
                            contracts.forEach { contract ->
                                + contract
                            }
                        }
                    }
                }
            }

            """
@here
```yaml
$yaml
```
"""
        }
    }
}
