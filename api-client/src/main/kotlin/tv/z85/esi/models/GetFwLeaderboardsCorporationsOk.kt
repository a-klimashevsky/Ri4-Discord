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

import tv.z85.esi.models.GetFwLeaderboardsCorporationsKills
import tv.z85.esi.models.GetFwLeaderboardsCorporationsVictoryPoints

import com.squareup.moshi.Json
/**
 * 200 ok object
 * @param kills 
 * @param victoryPoints 
 */

data class GetFwLeaderboardsCorporationsOk (
    @Json(name = "kills")
    var kills: GetFwLeaderboardsCorporationsKills,
    @Json(name = "victory_points")
    var victoryPoints: GetFwLeaderboardsCorporationsVictoryPoints
)
