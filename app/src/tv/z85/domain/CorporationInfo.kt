package tv.z85.domain

import java.time.OffsetDateTime


data class CorporationInfo(
    val allianceId: Int?,
    val ceoId: Int,
    val creatorId: Int,
    val dateFounded: OffsetDateTime?,
    val description: String,
    val homeStationId: Int?,
    val memberCount: Int,
    val name: String,
    val shares: Long?,
    val taxRate: Float,
    val ticker: String,
    val url: String?,
    val warEligible: Boolean,
    val factionId: Int? = null
)
