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

import tv.z85.esi.models.GetUniverseStructuresStructureIdPosition

import com.squareup.moshi.Json
/**
 * 200 ok object
 * @param name The full name of the structure
 * @param ownerId The ID of the corporation who owns this particular structure
 * @param position 
 * @param solarSystemId solar_system_id integer
 * @param typeId type_id integer
 */

data class GetUniverseStructuresStructureIdOk (
    /* The full name of the structure */
    @Json(name = "name")
    var name: kotlin.String,
    /* The ID of the corporation who owns this particular structure */
    @Json(name = "owner_id")
    var ownerId: kotlin.Int,
    @Json(name = "position")
    var position: GetUniverseStructuresStructureIdPosition? = null,
    /* solar_system_id integer */
    @Json(name = "solar_system_id")
    var solarSystemId: kotlin.Int,
    /* type_id integer */
    @Json(name = "type_id")
    var typeId: kotlin.Int? = null
)

