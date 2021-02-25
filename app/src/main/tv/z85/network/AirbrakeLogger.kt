package tv.z85.network

import io.airbrake.javabrake.Notice
import io.airbrake.javabrake.Notifier
import tv.z85.app.Logger


class AirbrakeLogger(
    projectId: Int,
    projectKey: String,
    production: Boolean,
) : Logger {

    private val notifier: Notifier = Notifier(projectId, projectKey).apply {
        this.addFilter { notice: Notice ->
            val env = if (production) "production" else "development"
            notice.setContext("environment", env)
            notice
        }
        Thread.setDefaultUncaughtExceptionHandler { _, e ->
            this.report(e)
        }
    }

    override fun report(e: Throwable) {
        notifier.report(e)
    }
}
