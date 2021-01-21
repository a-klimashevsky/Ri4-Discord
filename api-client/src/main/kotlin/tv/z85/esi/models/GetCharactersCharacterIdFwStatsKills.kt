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
 * Summary of kills done by the given character against enemy factions
 * @param lastWeek Last week's total number of kills by a given character against enemy factions
 * @param total Total number of kills by a given character against enemy factions since the character enlisted
 * @param yesterday Yesterday's total number of kills by a given character against enemy factions
 */

data class GetCharactersCharacterIdFwStatsKills (
    /* Last week's total number of kills by a given character against enemy factions */
    @Json(name = "last_week")
    var lastWeek: kotlin.Int,
    /* Total number of kills by a given character against enemy factions since the character enlisted */
    @Json(name = "total")
    var total: kotlin.Int,
    /* Yesterday's total number of kills by a given character against enemy factions */
    @Json(name = "yesterday")
    var yesterday: kotlin.Int
)

