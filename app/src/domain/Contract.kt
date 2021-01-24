package tv.z85.domain

import com.squareup.moshi.Json

data class Contract(
    val acceptorId: Int,
    val assigneeId: Int,
    val availability: Availability,
    val buyout: Double? = null,
    val collateral: Double? = null,
    val contractId: Int,
    val dateAccepted: java.time.OffsetDateTime? = null,
    val dateCompleted: java.time.OffsetDateTime? = null,
    val dateExpired: java.time.OffsetDateTime? = null,
    val dateIssued: java.time.OffsetDateTime,
    val daysToComplete: Int? = null,
    val endLocationId: Long? = null,
    val forCorporation: Boolean,
    val issuerCorporationId: Int,
    val issuerId: Int,
    val price: Double? = null,
    val reward: Double? = null,
    val startLocationId: Long? = null,
    val status: Status,
    val title: String? = null,
    val type: Type,
    val volume: Double? = null
) {

    enum class Availability(val value: String) {
        Public("public"),
        Personal("personal"),
        Corporation("corporation"),
        Alliance("alliance");
    }

    enum class Status(val value: String) {
        Outstanding("outstanding"),
        InProgress("in_progress"),
        FinishedIssuer("finished_issuer"),
        FinishedContractor("finished_contractor"),
        Finished("finished"),
        Cancelled("cancelled"),
        Rejected("rejected"),
        Failed("failed"),
        Deleted("deleted"),
        Reversed("reversed");
    }

    enum class Type(val value: String) {
        @Json(name = "unknown")
        Unknown("unknown"),
        @Json(name = "item_exchange")
        ItemExchange("item_exchange"),
        @Json(name = "auction")
        Auction("auction"),
        @Json(name = "courier")
        Courier("courier"),
        @Json(name = "loan")
        Loan("loan");
    }
}