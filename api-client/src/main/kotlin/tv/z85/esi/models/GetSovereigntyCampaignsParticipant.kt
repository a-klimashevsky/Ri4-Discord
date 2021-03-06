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
 * participant object
 * @param allianceId alliance_id integer
 * @param score score number
 */

data class GetSovereigntyCampaignsParticipant (
    /* alliance_id integer */
    @Json(name = "alliance_id")
    var allianceId: kotlin.Int,
    /* score number */
    @Json(name = "score")
    var score: kotlin.Float
)

