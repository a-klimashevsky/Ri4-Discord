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

import tv.z85.esi.models.GetFwLeaderboardsCharactersActiveTotalActiveTotal1
import tv.z85.esi.models.GetFwLeaderboardsCharactersLastWeekLastWeek1
import tv.z85.esi.models.GetFwLeaderboardsCharactersYesterdayYesterday1

import com.squareup.moshi.Json
/**
 * Top 100 rankings of pilots by victory points from yesterday, last week and in total
 * @param activeTotal Top 100 ranking of pilots active in faction warfare by total victory points. A pilot is considered \"active\" if they have participated in faction warfare in the past 14 days
 * @param lastWeek Top 100 ranking of pilots by victory points in the past week
 * @param yesterday Top 100 ranking of pilots by victory points in the past day
 */

data class GetFwLeaderboardsCharactersVictoryPoints (
    /* Top 100 ranking of pilots active in faction warfare by total victory points. A pilot is considered \"active\" if they have participated in faction warfare in the past 14 days */
    @Json(name = "active_total")
    var activeTotal: kotlin.Array<GetFwLeaderboardsCharactersActiveTotalActiveTotal1>,
    /* Top 100 ranking of pilots by victory points in the past week */
    @Json(name = "last_week")
    var lastWeek: kotlin.Array<GetFwLeaderboardsCharactersLastWeekLastWeek1>,
    /* Top 100 ranking of pilots by victory points in the past day */
    @Json(name = "yesterday")
    var yesterday: kotlin.Array<GetFwLeaderboardsCharactersYesterdayYesterday1>
)

