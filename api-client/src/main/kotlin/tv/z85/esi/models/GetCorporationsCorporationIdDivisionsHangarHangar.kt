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
 * hangar object
 * @param division division integer
 * @param name name string
 */

data class GetCorporationsCorporationIdDivisionsHangarHangar (
    /* division integer */
    @Json(name = "division")
    var division: kotlin.Int? = null,
    /* name string */
    @Json(name = "name")
    var name: kotlin.String? = null
)

