package tv.z85.app

import io.ktor.application.*

data class ApplicationConfig(
    val corporationId: Int,
    val periodInDays: Int,
    val discordWebhookUrl: String,
    val clientId: String,
    val clientSecret: String,
) {

}

fun Application.config(): ApplicationConfig {
    val corporationId = Config.requireProperty("app.corporationId").toInt()
    val periodInDays = Config.requireProperty("app.periodInDays").toInt()
    val discordWebhookUrl = Config.requireProperty("app.discordWebhookUrl")
    val clientId = Config.requireProperty("app.clientId")
    val clientSecret = Config.requireProperty("app.clientSecret")
    return ApplicationConfig(corporationId, periodInDays, discordWebhookUrl, clientId, clientSecret)
}