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
 * Internal server error model
 * @param error Internal server error message
 */

data class InternalServerError (
    /* Internal server error message */
    @Json(name = "error")
    var error: kotlin.String
)

