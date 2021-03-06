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

import tv.z85.esi.models.GetCharactersCharacterIdFwStatsKills
import tv.z85.esi.models.GetCharactersCharacterIdFwStatsVictoryPoints

import com.squareup.moshi.Json
/**
 * 200 ok object
 * @param currentRank The given character's current faction rank
 * @param enlistedOn The enlistment date of the given character into faction warfare. Will not be included if character is not enlisted in faction warfare
 * @param factionId The faction the given character is enlisted to fight for. Will not be included if character is not enlisted in faction warfare
 * @param highestRank The given character's highest faction rank achieved
 * @param kills 
 * @param victoryPoints 
 */

data class GetCharactersCharacterIdFwStatsOk (
    /* The given character's current faction rank */
    @Json(name = "current_rank")
    var currentRank: kotlin.Int? = null,
    /* The enlistment date of the given character into faction warfare. Will not be included if character is not enlisted in faction warfare */
    @Json(name = "enlisted_on")
    var enlistedOn: java.time.OffsetDateTime? = null,
    /* The faction the given character is enlisted to fight for. Will not be included if character is not enlisted in faction warfare */
    @Json(name = "faction_id")
    var factionId: kotlin.Int? = null,
    /* The given character's highest faction rank achieved */
    @Json(name = "highest_rank")
    var highestRank: kotlin.Int? = null,
    @Json(name = "kills")
    var kills: GetCharactersCharacterIdFwStatsKills,
    @Json(name = "victory_points")
    var victoryPoints: GetCharactersCharacterIdFwStatsVictoryPoints
)

