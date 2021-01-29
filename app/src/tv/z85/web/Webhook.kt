package tv.z85.web

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.serialization.Serializable
import java.util.*


class Webhook(
    private val url: String,
    private val httpClient: HttpClient
) {

    suspend fun send(content: String) {
        val message = Message(content = content)
        send(message)
    }

    suspend fun send(embeds: List<EmbedObject>) {
        require(embeds.isNotEmpty()) { "Set content or add at least one EmbedObject" }
        val message = Message(embeds = embeds)
        send(message)
    }

    suspend fun send(message: Message) {
        val resp = httpClient.post<Any>(
            url
        ) {
            contentType(ContentType.Application.Json)
            userAgent("Ri4-Discord-Integration")
            body = message
        }

    }

    @Serializable
    data class EmbedObject(
        val title: String?,
        val description: String?,
        val url: String? = null,
        val color: Color?,
        val footer: Footer? = null,
        val thumbnail: Thumbnail?,
        val image: Image?,
        val author: Author?,
        val fields: MutableList<Field> = mutableListOf()
    ) {

        @Serializable
        data class Footer(
            val text: String,
            val iconUrl: String
        )

        @Serializable
        data class Thumbnail(val url: String)

        @Serializable
        data class Image(val url: String)

        @Serializable
        data class Author(
            val name: String,
            val url: String,
            val iconUrl: String
        )

        @Serializable
        data class Field(
            val name: String,
            val value: String,
            val isInline: Boolean
        )

        @Serializable
        data class Color(val rgb: String)
    }

    @Serializable
    data class Message(
        private val content: String? = null,
        private val username: String? = null,
        private val avatarUrl: String? = null,
        private val tts: Boolean = false,
        private val embeds: List<EmbedObject> = ArrayList<EmbedObject>()
    )
}