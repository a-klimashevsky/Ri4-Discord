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

import tv.z85.esi.models.GetFwStatsKills
import tv.z85.esi.models.GetFwStatsVictoryPoints

import com.squareup.moshi.Json
/**
 * 200 ok object
 * @param factionId faction_id integer
 * @param kills 
 * @param pilots How many pilots fight for the given faction
 * @param systemsControlled The number of solar systems controlled by the given faction
 * @param victoryPoints 
 */

data class GetFwStats200Ok (
    /* faction_id integer */
    @Json(name = "faction_id")
    var factionId: kotlin.Int,
    @Json(name = "kills")
    var kills: GetFwStatsKills,
    /* How many pilots fight for the given faction */
    @Json(name = "pilots")
    var pilots: kotlin.Int,
    /* The number of solar systems controlled by the given faction */
    @Json(name = "systems_controlled")
    var systemsControlled: kotlin.Int,
    @Json(name = "victory_points")
    var victoryPoints: GetFwStatsVictoryPoints
)

