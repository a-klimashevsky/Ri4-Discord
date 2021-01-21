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
 * @param moonId The moon this starbase (POS) is anchored on, unanchored POSes do not have this information
 * @param onlinedSince When the POS onlined, for starbases (POSes) in online state
 * @param reinforcedUntil When the POS will be out of reinforcement, for starbases (POSes) in reinforced state
 * @param starbaseId Unique ID for this starbase (POS)
 * @param state state string
 * @param systemId The solar system this starbase (POS) is in, unanchored POSes have this information
 * @param typeId Starbase (POS) type
 * @param unanchorAt When the POS started unanchoring, for starbases (POSes) in unanchoring state
 */

data class GetCorporationsCorporationIdStarbases200Ok (
    /* The moon this starbase (POS) is anchored on, unanchored POSes do not have this information */
    @Json(name = "moon_id")
    var moonId: kotlin.Int? = null,
    /* When the POS onlined, for starbases (POSes) in online state */
    @Json(name = "onlined_since")
    var onlinedSince: java.time.OffsetDateTime? = null,
    /* When the POS will be out of reinforcement, for starbases (POSes) in reinforced state */
    @Json(name = "reinforced_until")
    var reinforcedUntil: java.time.OffsetDateTime? = null,
    /* Unique ID for this starbase (POS) */
    @Json(name = "starbase_id")
    var starbaseId: kotlin.Long,
    /* state string */
    @Json(name = "state")
    var state: GetCorporationsCorporationIdStarbases200Ok.State? = null,
    /* The solar system this starbase (POS) is in, unanchored POSes have this information */
    @Json(name = "system_id")
    var systemId: kotlin.Int,
    /* Starbase (POS) type */
    @Json(name = "type_id")
    var typeId: kotlin.Int,
    /* When the POS started unanchoring, for starbases (POSes) in unanchoring state */
    @Json(name = "unanchor_at")
    var unanchorAt: java.time.OffsetDateTime? = null
) {

    /**
    * state string
    * Values: offline,online,onlining,reinforced,unanchoring
    */
    
    enum class State(val value: kotlin.String){
        @Json(name = "offline") offline("offline"),
        @Json(name = "online") online("online"),
        @Json(name = "onlining") onlining("onlining"),
        @Json(name = "reinforced") reinforced("reinforced"),
        @Json(name = "unanchoring") unanchoring("unanchoring");
    }
}

