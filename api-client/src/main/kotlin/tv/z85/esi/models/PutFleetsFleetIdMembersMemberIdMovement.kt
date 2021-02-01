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
 * movement object
 * @param role If a character is moved to the `fleet_commander` role, neither `wing_id` or `squad_id` should be specified. If a character is moved to the `wing_commander` role, only `wing_id` should be specified. If a character is moved to the `squad_commander` role, both `wing_id` and `squad_id` should be specified. If a character is moved to the `squad_member` role, both `wing_id` and `squad_id` should be specified.
 * @param squadId squad_id integer
 * @param wingId wing_id integer
 */

data class PutFleetsFleetIdMembersMemberIdMovement (
    /* If a character is moved to the `fleet_commander` role, neither `wing_id` or `squad_id` should be specified. If a character is moved to the `wing_commander` role, only `wing_id` should be specified. If a character is moved to the `squad_commander` role, both `wing_id` and `squad_id` should be specified. If a character is moved to the `squad_member` role, both `wing_id` and `squad_id` should be specified. */
    @Json(name = "role")
    var role: PutFleetsFleetIdMembersMemberIdMovement.Role,
    /* squad_id integer */
    @Json(name = "squad_id")
    var squadId: kotlin.Long? = null,
    /* wing_id integer */
    @Json(name = "wing_id")
    var wingId: kotlin.Long? = null
) {

    /**
    * If a character is moved to the `fleet_commander` role, neither `wing_id` or `squad_id` should be specified. If a character is moved to the `wing_commander` role, only `wing_id` should be specified. If a character is moved to the `squad_commander` role, both `wing_id` and `squad_id` should be specified. If a character is moved to the `squad_member` role, both `wing_id` and `squad_id` should be specified.
    * Values: fleetCommander,wingCommander,squadCommander,squadMember
    */
    
    enum class Role(val value: kotlin.String){
        @Json(name = "fleet_commander") fleetCommander("fleet_commander"),
        @Json(name = "wing_commander") wingCommander("wing_commander"),
        @Json(name = "squad_commander") squadCommander("squad_commander"),
        @Json(name = "squad_member") squadMember("squad_member");
    }
}
