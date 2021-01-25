package tv.z85.app

import io.ktor.application.*

data class ApplicationConfig(
    val corporationId: Int,
    val peridoInDays: Int
)

fun Application.config(): ApplicationConfig {
    val corporationId = Config.requireProperty("app.corporationId").toInt()
    val periodInDays = Config.requireProperty("app.periodInDays").toInt()
    return ApplicationConfig(corporationId, periodInDays)
}