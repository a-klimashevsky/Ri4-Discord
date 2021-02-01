package tv.z85.app.notifications

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.merge


interface NotificationCollector {
    fun start(): Flow<Unit>
}

class NotificationCollectorImpl(
    private val renderers: List<DiscordNotification>
) : NotificationCollector {
    override fun start(): Flow<Unit> = renderers.map { it.notify() }.merge()

}