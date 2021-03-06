/**
* EVE Swagger Interface
* An OpenAPI for EVE Online
*
* The version of the OpenAPI document: 1.7.2
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package tv.z85.esi.models


import com.squareup.moshi.Json
/**
 * 200 ok object
 * @param creatorCorporationId ID of the corporation that created the alliance
 * @param creatorId ID of the character that created the alliance
 * @param dateFounded date_founded string
 * @param executorCorporationId the executor corporation ID, if this alliance is not closed
 * @param factionId Faction ID this alliance is fighting for, if this alliance is enlisted in factional warfare
 * @param name the full name of the alliance
 * @param ticker the short name of the alliance
 */

data class GetAlliancesAllianceIdOk (
    /* ID of the corporation that created the alliance */
    @Json(name = "creator_corporation_id")
    var creatorCorporationId: kotlin.Int,
    /* ID of the character that created the alliance */
    @Json(name = "creator_id")
    var creatorId: kotlin.Int,
    /* date_founded string */
    @Json(name = "date_founded")
    var dateFounded: java.time.OffsetDateTime,
    /* the executor corporation ID, if this alliance is not closed */
    @Json(name = "executor_corporation_id")
    var executorCorporationId: kotlin.Int? = null,
    /* Faction ID this alliance is fighting for, if this alliance is enlisted in factional warfare */
    @Json(name = "faction_id")
    var factionId: kotlin.Int? = null,
    /* the full name of the alliance */
    @Json(name = "name")
    var name: kotlin.String,
    /* the short name of the alliance */
    @Json(name = "ticker")
    var ticker: kotlin.String
)

