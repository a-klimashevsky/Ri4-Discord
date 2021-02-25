package tv.z85.app.renderers

import org.koin.dsl.module
import tv.z85.app.renderers.discord.ExpiredContractRenderer
import tv.z85.app.renderers.discord.ExpiredContractRendererImpl
import tv.z85.app.renderers.discord.SoldContractsRenderer
import tv.z85.app.renderers.discord.SoldContractsRendererImpl

val renderersModule = module {
    single<SoldContractsRenderer> {
        SoldContractsRendererImpl(get())
    }

    single<ExpiredContractRenderer> {
        ExpiredContractRendererImpl(get())
    }
}
