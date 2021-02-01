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

import tv.z85.esi.models.GetFwLeaderboardsCorporationsActiveTotalActiveTotal1
import tv.z85.esi.models.GetFwLeaderboardsCorporationsLastWeekLastWeek1
import tv.z85.esi.models.GetFwLeaderboardsCorporationsYesterdayYesterday1

import com.squareup.moshi.Json
/**
 * Top 10 rankings of corporations by victory points from yesterday, last week and in total
 * @param activeTotal Top 10 ranking of corporations active in faction warfare by total victory points. A corporation is considered \"active\" if they have participated in faction warfare in the past 14 days
 * @param lastWeek Top 10 ranking of corporations by victory points in the past week
 * @param yesterday Top 10 ranking of corporations by victory points in the past day
 */

data class GetFwLeaderboardsCorporationsVictoryPoints (
    /* Top 10 ranking of corporations active in faction warfare by total victory points. A corporation is considered \"active\" if they have participated in faction warfare in the past 14 days */
    @Json(name = "active_total")
    var activeTotal: kotlin.Array<GetFwLeaderboardsCorporationsActiveTotalActiveTotal1>,
    /* Top 10 ranking of corporations by victory points in the past week */
    @Json(name = "last_week")
    var lastWeek: kotlin.Array<GetFwLeaderboardsCorporationsLastWeekLastWeek1>,
    /* Top 10 ranking of corporations by victory points in the past day */
    @Json(name = "yesterday")
    var yesterday: kotlin.Array<GetFwLeaderboardsCorporationsYesterdayYesterday1>
)
