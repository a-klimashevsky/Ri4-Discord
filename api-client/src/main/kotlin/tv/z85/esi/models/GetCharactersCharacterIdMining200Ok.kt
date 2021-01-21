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
 * @param date date string
 * @param quantity quantity integer
 * @param solarSystemId solar_system_id integer
 * @param typeId type_id integer
 */

data class GetCharactersCharacterIdMining200Ok (
    /* date string */
    @Json(name = "date")
    var date: java.time.LocalDate,
    /* quantity integer */
    @Json(name = "quantity")
    var quantity: kotlin.Long,
    /* solar_system_id integer */
    @Json(name = "solar_system_id")
    var solarSystemId: kotlin.Int,
    /* type_id integer */
    @Json(name = "type_id")
    var typeId: kotlin.Int
)

