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

import tv.z85.esi.models.GetInsurancePricesLevel

import com.squareup.moshi.Json
/**
 * 200 ok object
 * @param levels A list of a available insurance levels for this ship type
 * @param typeId type_id integer
 */

data class GetInsurancePrices200Ok (
    /* A list of a available insurance levels for this ship type */
    @Json(name = "levels")
    var levels: kotlin.Array<GetInsurancePricesLevel>,
    /* type_id integer */
    @Json(name = "type_id")
    var typeId: kotlin.Int
)

