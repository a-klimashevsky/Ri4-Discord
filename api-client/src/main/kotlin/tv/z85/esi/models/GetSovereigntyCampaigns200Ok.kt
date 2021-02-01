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

import tv.z85.esi.models.GetSovereigntyCampaignsParticipant

import com.squareup.moshi.Json
/**
 * 200 ok object
 * @param attackersScore Score for all attacking parties, only present in Defense Events. 
 * @param campaignId Unique ID for this campaign.
 * @param constellationId The constellation in which the campaign will take place. 
 * @param defenderId Defending alliance, only present in Defense Events 
 * @param defenderScore Score for the defending alliance, only present in Defense Events. 
 * @param eventType Type of event this campaign is for. tcu_defense, ihub_defense and station_defense are referred to as \"Defense Events\", station_freeport as \"Freeport Events\". 
 * @param participants Alliance participating and their respective scores, only present in Freeport Events. 
 * @param solarSystemId The solar system the structure is located in. 
 * @param startTime Time the event is scheduled to start. 
 * @param structureId The structure item ID that is related to this campaign. 
 */

data class GetSovereigntyCampaigns200Ok (
    /* Score for all attacking parties, only present in Defense Events.  */
    @Json(name = "attackers_score")
    var attackersScore: kotlin.Float? = null,
    /* Unique ID for this campaign. */
    @Json(name = "campaign_id")
    var campaignId: kotlin.Int,
    /* The constellation in which the campaign will take place.  */
    @Json(name = "constellation_id")
    var constellationId: kotlin.Int,
    /* Defending alliance, only present in Defense Events  */
    @Json(name = "defender_id")
    var defenderId: kotlin.Int? = null,
    /* Score for the defending alliance, only present in Defense Events.  */
    @Json(name = "defender_score")
    var defenderScore: kotlin.Float? = null,
    /* Type of event this campaign is for. tcu_defense, ihub_defense and station_defense are referred to as \"Defense Events\", station_freeport as \"Freeport Events\".  */
    @Json(name = "event_type")
    var eventType: GetSovereigntyCampaigns200Ok.EventType,
    /* Alliance participating and their respective scores, only present in Freeport Events.  */
    @Json(name = "participants")
    var participants: kotlin.Array<GetSovereigntyCampaignsParticipant>? = null,
    /* The solar system the structure is located in.  */
    @Json(name = "solar_system_id")
    var solarSystemId: kotlin.Int,
    /* Time the event is scheduled to start.  */
    @Json(name = "start_time")
    var startTime: java.time.OffsetDateTime,
    /* The structure item ID that is related to this campaign.  */
    @Json(name = "structure_id")
    var structureId: kotlin.Long
) {

    /**
    * Type of event this campaign is for. tcu_defense, ihub_defense and station_defense are referred to as \"Defense Events\", station_freeport as \"Freeport Events\". 
    * Values: tcuDefense,ihubDefense,stationDefense,stationFreeport
    */
    
    enum class EventType(val value: kotlin.String){
        @Json(name = "tcu_defense") tcuDefense("tcu_defense"),
        @Json(name = "ihub_defense") ihubDefense("ihub_defense"),
        @Json(name = "station_defense") stationDefense("station_defense"),
        @Json(name = "station_freeport") stationFreeport("station_freeport");
    }
}
