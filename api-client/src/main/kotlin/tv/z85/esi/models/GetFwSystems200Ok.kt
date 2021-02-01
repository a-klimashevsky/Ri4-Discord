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
 * @param contested contested string
 * @param occupierFactionId occupier_faction_id integer
 * @param ownerFactionId owner_faction_id integer
 * @param solarSystemId solar_system_id integer
 * @param victoryPoints victory_points integer
 * @param victoryPointsThreshold victory_points_threshold integer
 */

data class GetFwSystems200Ok (
    /* contested string */
    @Json(name = "contested")
    var contested: GetFwSystems200Ok.Contested,
    /* occupier_faction_id integer */
    @Json(name = "occupier_faction_id")
    var occupierFactionId: kotlin.Int,
    /* owner_faction_id integer */
    @Json(name = "owner_faction_id")
    var ownerFactionId: kotlin.Int,
    /* solar_system_id integer */
    @Json(name = "solar_system_id")
    var solarSystemId: kotlin.Int,
    /* victory_points integer */
    @Json(name = "victory_points")
    var victoryPoints: kotlin.Int,
    /* victory_points_threshold integer */
    @Json(name = "victory_points_threshold")
    var victoryPointsThreshold: kotlin.Int
) {

    /**
    * contested string
    * Values: captured,contested,uncontested,vulnerable
    */
    
    enum class Contested(val value: kotlin.String){
        @Json(name = "captured") captured("captured"),
        @Json(name = "contested") contested("contested"),
        @Json(name = "uncontested") uncontested("uncontested"),
        @Json(name = "vulnerable") vulnerable("vulnerable");
    }
}
