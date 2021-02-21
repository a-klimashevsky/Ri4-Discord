package tv.z85.app.renderers.discord

import kotlinx.coroutines.flow.Flow

interface DiscordMessageRenderer {
    fun render(): Flow<String>
}