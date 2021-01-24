package tv.z85.network

import io.ktor.client.*
import io.ktor.client.engine.jetty.*
import org.koin.dsl.module
import java.util.*;

val networkModule = module {
    single<HttpClient> { HttpClient(Jetty) }
}