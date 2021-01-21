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
 * @param allianceId alliance_id integer
 * @param corporationId corporation_id integer
 * @param factionId faction_id integer
 * @param systemId system_id integer
 */

data class GetSovereigntyMap200Ok (
    /* alliance_id integer */
    @Json(name = "alliance_id")
    var allianceId: kotlin.Int? = null,
    /* corporation_id integer */
    @Json(name = "corporation_id")
    var corporationId: kotlin.Int? = null,
    /* faction_id integer */
    @Json(name = "faction_id")
    var factionId: kotlin.Int? = null,
    /* system_id integer */
    @Json(name = "system_id")
    var systemId: kotlin.Int
)

