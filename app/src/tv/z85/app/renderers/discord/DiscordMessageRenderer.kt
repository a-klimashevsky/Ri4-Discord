package tv.z85.app.renderers.discord

import kotlinx.coroutines.flow.Flow
import java.util.*;

interface DiscordMessageRenderer {
    fun render(): Flow<String>
}