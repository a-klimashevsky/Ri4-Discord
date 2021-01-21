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
 * active_total object
 * @param amount Amount of kills
 * @param characterId character_id integer
 */

data class GetFwLeaderboardsCharactersActiveTotalActiveTotal (
    /* Amount of kills */
    @Json(name = "amount")
    var amount: kotlin.Int? = null,
    /* character_id integer */
    @Json(name = "character_id")
    var characterId: kotlin.Int? = null
)

