package tv.z85.app.notifications

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flatMapConcat
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import tv.z85.app.renderers.discord.SoldContractsRenderer
import tv.z85.schedule
import tv.z85.web.Webhook
import java.time.Duration
import java.util.*


class SoldContractNotification(
    private val renderer: SoldContractsRenderer,
    private val webhook: Webhook
) : DiscordNotification {

    override fun notify(): Flow<Unit> =
        schedule(
            Calendar.getInstance().apply {
                this.set(Calendar.HOUR_OF_DAY, 20)
                this.set(Calendar.MINUTE,0)
            }.time,
            Duration.ofDays(1).toMillis()
        ).flatMapConcat {
            renderer.render()
        }.onEach {
            webhook.send(it)
        }.map { }
}