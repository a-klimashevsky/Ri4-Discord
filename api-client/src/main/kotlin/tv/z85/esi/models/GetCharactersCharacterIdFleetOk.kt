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
 * 200 ok object
 * @param fleetId The character's current fleet ID
 * @param role Member’s role in fleet
 * @param squadId ID of the squad the member is in. If not applicable, will be set to -1
 * @param wingId ID of the wing the member is in. If not applicable, will be set to -1
 */

data class GetCharactersCharacterIdFleetOk (
    /* The character's current fleet ID */
    @Json(name = "fleet_id")
    var fleetId: kotlin.Long,
    /* Member’s role in fleet */
    @Json(name = "role")
    var role: GetCharactersCharacterIdFleetOk.Role,
    /* ID of the squad the member is in. If not applicable, will be set to -1 */
    @Json(name = "squad_id")
    var squadId: kotlin.Long,
    /* ID of the wing the member is in. If not applicable, will be set to -1 */
    @Json(name = "wing_id")
    var wingId: kotlin.Long
) {

    /**
    * Member’s role in fleet
    * Values: fleetCommander,squadCommander,squadMember,wingCommander
    */
    
    enum class Role(val value: kotlin.String){
        @Json(name = "fleet_commander") fleetCommander("fleet_commander"),
        @Json(name = "squad_commander") squadCommander("squad_commander"),
        @Json(name = "squad_member") squadMember("squad_member"),
        @Json(name = "wing_commander") wingCommander("wing_commander");
    }
}

