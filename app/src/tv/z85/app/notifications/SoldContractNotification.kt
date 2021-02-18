package tv.z85.app.notifications

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flatMapConcat
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import org.slf4j.Logger
import tv.z85.app.renderers.discord.SoldContractsRenderer
import tv.z85.schedule
import tv.z85.startWith
import tv.z85.web.Webhook
import java.time.Duration
import java.util.*


class SoldContractNotification(
    private val renderer: SoldContractsRenderer,
    private val webhook: Webhook,
    private val log: Logger
) : DiscordNotification {

    override fun notify(): Flow<Unit> =
        schedule(
            Calendar.getInstance().apply {
                this.set(Calendar.HOUR_OF_DAY, 20)
                this.set(Calendar.MINUTE, 0)
            }.time,
            Duration.ofDays(1).toMillis()
        )
            .startWith(Unit)
            .flatMapConcat {
                log.debug("R4: start render sold contracts")
                renderer.render()
            }.onEach {
                log.debug("R4: send message to webhook")
                webhook.send(it)
            }.map { }
}