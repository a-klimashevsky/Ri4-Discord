package tv.z85.app.notifications

import org.koin.core.qualifier.named
import org.koin.dsl.module

val notificationModule = module {
    single<DiscordNotification>(named("Sold")) {
        SoldContractNotification(get(),get())
    }

    single<DiscordNotification>(named("Expired")) {
        ExpiredContractNotification(get(),get())
    }

    single<NotificationCollector> {
        NotificationCollectorImpl(
            renderers = listOf(
                get<DiscordNotification>(named("Sold")),
                get<DiscordNotification>(named("Expired"))
            )
        )
    }
}
