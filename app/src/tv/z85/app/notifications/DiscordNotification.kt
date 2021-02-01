package tv.z85.app.notifications

import kotlinx.coroutines.flow.Flow


interface DiscordNotification {
    fun notify(): Flow<Unit>
}