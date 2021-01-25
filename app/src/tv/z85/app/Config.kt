package tv.z85.app

import com.typesafe.config.ConfigFactory
import io.ktor.config.*
import io.ktor.util.*


object Config {
    @KtorExperimentalAPI
    val config = HoconApplicationConfig(ConfigFactory.load())


    @KtorExperimentalAPI
    fun getProperty(key: String): String? = config.propertyOrNull(key)?.getString()


    @KtorExperimentalAPI
    fun requireProperty(key: String): String = getProperty(key)
        ?: throw IllegalStateException("Missing property $key")
}