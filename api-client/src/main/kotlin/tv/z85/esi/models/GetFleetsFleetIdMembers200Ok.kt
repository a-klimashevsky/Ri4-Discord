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
 * @param characterId character_id integer
 * @param joinTime join_time string
 * @param role Member’s role in fleet
 * @param roleName Localized role names
 * @param shipTypeId ship_type_id integer
 * @param solarSystemId Solar system the member is located in
 * @param squadId ID of the squad the member is in. If not applicable, will be set to -1
 * @param stationId Station in which the member is docked in, if applicable
 * @param takesFleetWarp Whether the member take fleet warps
 * @param wingId ID of the wing the member is in. If not applicable, will be set to -1
 */

data class GetFleetsFleetIdMembers200Ok (
    /* character_id integer */
    @Json(name = "character_id")
    var characterId: kotlin.Int,
    /* join_time string */
    @Json(name = "join_time")
    var joinTime: java.time.OffsetDateTime,
    /* Member’s role in fleet */
    @Json(name = "role")
    var role: GetFleetsFleetIdMembers200Ok.Role,
    /* Localized role names */
    @Json(name = "role_name")
    var roleName: kotlin.String,
    /* ship_type_id integer */
    @Json(name = "ship_type_id")
    var shipTypeId: kotlin.Int,
    /* Solar system the member is located in */
    @Json(name = "solar_system_id")
    var solarSystemId: kotlin.Int,
    /* ID of the squad the member is in. If not applicable, will be set to -1 */
    @Json(name = "squad_id")
    var squadId: kotlin.Long,
    /* Station in which the member is docked in, if applicable */
    @Json(name = "station_id")
    var stationId: kotlin.Long? = null,
    /* Whether the member take fleet warps */
    @Json(name = "takes_fleet_warp")
    var takesFleetWarp: kotlin.Boolean,
    /* ID of the wing the member is in. If not applicable, will be set to -1 */
    @Json(name = "wing_id")
    var wingId: kotlin.Long
) {

    /**
    * Member’s role in fleet
    * Values: fleetCommander,wingCommander,squadCommander,squadMember
    */
    
    enum class Role(val value: kotlin.String){
        @Json(name = "fleet_commander") fleetCommander("fleet_commander"),
        @Json(name = "wing_commander") wingCommander("wing_commander"),
        @Json(name = "squad_commander") squadCommander("squad_commander"),
        @Json(name = "squad_member") squadMember("squad_member");
    }
}
