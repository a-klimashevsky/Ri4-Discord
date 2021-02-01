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
 * @param solarSystemId solar_system_id integer
 * @param stationId station_id integer
 * @param structureId structure_id integer
 */

data class GetCharactersCharacterIdLocationOk (
    /* solar_system_id integer */
    @Json(name = "solar_system_id")
    var solarSystemId: kotlin.Int,
    /* station_id integer */
    @Json(name = "station_id")
    var stationId: kotlin.Int? = null,
    /* structure_id integer */
    @Json(name = "structure_id")
    var structureId: kotlin.Long? = null
)
