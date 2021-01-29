package tv.z85.app

import io.ktor.application.*
import tv.z85.web.Webhook

data class ApplicationConfig(
    val corporationId: Int,
    val periodInDays: Int,
    val discordWebhookUrl: String
)

fun Application.config(): ApplicationConfig {
    val corporationId = Config.requireProperty("app.corporationId").toInt()
    val periodInDays = Config.requireProperty("app.periodInDays").toInt()
    val discordWebhookUrl = Config.requireProperty("app.discordWebhookUrl")
    return ApplicationConfig(corporationId, periodInDays,discordWebhookUrl)
}