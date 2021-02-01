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
 * @param balance balance number
 * @param division division integer
 */

data class GetCorporationsCorporationIdWallets200Ok (
    /* balance number */
    @Json(name = "balance")
    var balance: kotlin.Double,
    /* division integer */
    @Json(name = "division")
    var division: kotlin.Int
)
