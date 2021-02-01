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
 * Summary of victory points gained for the given faction
 * @param lastWeek Last week's victory points gained
 * @param total Total victory points gained since faction warfare began
 * @param yesterday Yesterday's victory points gained
 */

data class GetFwStatsVictoryPoints (
    /* Last week's victory points gained */
    @Json(name = "last_week")
    var lastWeek: kotlin.Int,
    /* Total victory points gained since faction warfare began */
    @Json(name = "total")
    var total: kotlin.Int,
    /* Yesterday's victory points gained */
    @Json(name = "yesterday")
    var yesterday: kotlin.Int
)
