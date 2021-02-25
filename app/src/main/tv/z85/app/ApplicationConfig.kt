package tv.z85.app

import io.ktor.application.*

data class ApplicationConfig(
    val corporationId: Int,
    val periodInDays: Int,
    val discordWebhookUrl: String,
    val clientId: String,
    val clientSecret: String,
    val cacheFolder: String,
    val dbConnectionString: String,
    val databaseName: String,
    val airbrakeProjectId: Int,
    val airbrakeProjectKey: String,
    val production : Boolean
)

fun Application.config(): ApplicationConfig {
    val corporationId = Config.requireProperty("app.corporationId").toInt()
    val periodInDays = Config.requireProperty("app.periodInDays").toInt()
    val discordWebhookUrl = Config.requireProperty("app.discordWebhookUrl")
    val clientId = Config.requireProperty("app.clientId")
    val clientSecret = Config.requireProperty("app.clientSecret")
    val cacheFolder = Config.requireProperty("app.cacheFolder")
    val dbConnectionString = Config.requireProperty("app.dbConnectionString")
    val databaseName = Config.requireProperty("app.databaseName")
    val airbrakeProjectId = Config.requireProperty("app.airbrake.projectId").toInt()
    val airbrakeProjectKey = Config.requireProperty("app.airbrake.projectKey")
    return ApplicationConfig(
        corporationId,
        periodInDays,
        discordWebhookUrl,
        clientId,
        clientSecret,
        cacheFolder,
        dbConnectionString,
        databaseName,
        airbrakeProjectId,
        airbrakeProjectKey,
        production = !this.environment.developmentMode
    )
}
