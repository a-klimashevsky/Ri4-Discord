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
 * Error 520
 * @param error Error 520 message
 */

data class GetMarketsRegionIdHistoryError520 (
    /* Error 520 message */
    @Json(name = "error")
    var error: kotlin.String? = null
)

