package tv.z85.domain

import com.squareup.moshi.Json

data class VerificationInfo (
    @Json(name = "CharacterID")
    val characterID: Int,
    @Json(name = "CharacterName")
    val characterName: String,
    @Json(name = "ExpiresOn")
    val expiresOn: String,
    @Json(name = "Scopes")
    val scopes: String,
    @Json(name = "TokenType")
    val tokenType: String,
    @Json(name = "CharacterOwnerHash")
    val characterOwnerHash: String,
    @Json(name = "IntellectualProperty")
    val intellectualProperty: String
)
