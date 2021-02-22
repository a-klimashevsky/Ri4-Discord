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

/**
corporation: R Initiative 4
for period: 2
Sold Contracts:
W6V-VM - Delta After Dark - RIP Remdick:
- [RI4] Sabre : 2 for 0.14kkk ISK
Ashab - Tranquility Trade & Prod Center:
- orca+fit+rigs: 1 for 1.27kkk ISK
P4-3TJ - Goontown:
- [RI4] Machariel CTA: 2 for 1.38kkk ISK
- Cerb CTA Heavy: 3 for 0.93kkk ISK
- [RI4] Scimitar CTA: 1 for 0.30kkk ISK
- RI4 Scimitar CTA: 1 for 0.30kkk ISK
Outgoing Contracts:
W6V-VM - Delta After Dark - RIP Remdick:
- [RI4] Machariel CTA: 3 for 2.06kkk ISK
- [RI4] Sabre : 1 for 0.07kkk ISK
BX-VEX - Two Titans. Every Hangar.:
- TEST CONTRACT. PLEASE IGNORE: 1 for 1.00kkk ISK
        **/