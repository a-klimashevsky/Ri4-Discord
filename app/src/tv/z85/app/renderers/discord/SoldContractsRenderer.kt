package tv.z85.app.renderers.discord

import com.charleskorn.kaml.Yaml
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import tv.z85.app.controllers.contracts.sold.statistics.ContractsController
import tv.z85.app.controllers.contracts.sold.statistics.ViewModel


interface SoldContractsRenderer {
    fun render(): Flow<String>
}

class SoldContractsRendererImpl(
    private val controller: ContractsController
) : SoldContractsRenderer {

    override fun render(): Flow<String> {

        return controller.viewModel().map {
            val content = Yaml.default.encodeToString(ViewModel.serializer(), it)
            """
@here
```yaml
$content
```
"""
        }
    }
}