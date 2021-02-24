package tv.z85.app.renderers.discord

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import tv.z85.app.controllers.contracts.expired.statistics.ExpiredContractsController
import tv.z85.yaml.Style
import tv.z85.yaml.yaml


interface ExpiredContractRenderer: DiscordMessageRenderer

class ExpiredContractRendererImpl(
    private val controller: ExpiredContractsController
    ): ExpiredContractRenderer {
    override fun render(): Flow<String> {
        return controller.viewModel().map { vm ->

            val yaml = yaml {
                "Corporation" to vm.corporationName
                "Expired Contracts" to_seq {
                    style = Style.Compact
                    vm.contracts.forEach{
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
