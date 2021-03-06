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
 * position object
 * @param x x number
 * @param y y number
 * @param z z number
 */

data class GetUniverseConstellationsConstellationIdPosition (
    /* x number */
    @Json(name = "x")
    var x: kotlin.Double,
    /* y number */
    @Json(name = "y")
    var y: kotlin.Double,
    /* z number */
    @Json(name = "z")
    var z: kotlin.Double
)

