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

import tv.z85.esi.models.GetUniverseStargatesStargateIdDestination
import tv.z85.esi.models.GetUniverseStargatesStargateIdPosition

import com.squareup.moshi.Json
/**
 * 200 ok object
 * @param destination 
 * @param name name string
 * @param position 
 * @param stargateId stargate_id integer
 * @param systemId The solar system this stargate is in
 * @param typeId type_id integer
 */

data class GetUniverseStargatesStargateIdOk (
    @Json(name = "destination")
    var destination: GetUniverseStargatesStargateIdDestination,
    /* name string */
    @Json(name = "name")
    var name: kotlin.String,
    @Json(name = "position")
    var position: GetUniverseStargatesStargateIdPosition,
    /* stargate_id integer */
    @Json(name = "stargate_id")
    var stargateId: kotlin.Int,
    /* The solar system this stargate is in */
    @Json(name = "system_id")
    var systemId: kotlin.Int,
    /* type_id integer */
    @Json(name = "type_id")
    var typeId: kotlin.Int
)
