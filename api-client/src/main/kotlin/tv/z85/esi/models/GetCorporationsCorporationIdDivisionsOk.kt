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

import tv.z85.esi.models.GetCorporationsCorporationIdDivisionsHangarHangar
import tv.z85.esi.models.GetCorporationsCorporationIdDivisionsWalletWallet

import com.squareup.moshi.Json
/**
 * 200 ok object
 * @param hangar hangar array
 * @param wallet wallet array
 */

data class GetCorporationsCorporationIdDivisionsOk (
    /* hangar array */
    @Json(name = "hangar")
    var hangar: kotlin.Array<GetCorporationsCorporationIdDivisionsHangarHangar>? = null,
    /* wallet array */
    @Json(name = "wallet")
    var wallet: kotlin.Array<GetCorporationsCorporationIdDivisionsWalletWallet>? = null
)
