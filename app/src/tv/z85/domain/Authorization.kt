package tv.z85.domain

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Authorization(
    @SerialName("_id")
    val userId: Int,
    val accessToken: String,
    val tokenType: String,
    val expiresIn: Long,
    val refreshToken: String,
)