package tv.z85.app.renderers

import org.koin.dsl.module
import tv.z85.app.renderers.discord.SoldContractsRenderer
import tv.z85.app.renderers.discord.SoldContractsRendererImpl
import java.util.*;

val renderersModule = module {
    single<SoldContractsRenderer> {
        SoldContractsRendererImpl(get())
    }
}