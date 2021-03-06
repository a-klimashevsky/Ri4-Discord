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
 * item object
 * @param flag flag integer
 * @param itemTypeId item_type_id integer
 * @param quantityDestroyed quantity_destroyed integer
 * @param quantityDropped quantity_dropped integer
 * @param singleton singleton integer
 */

data class GetKillmailsKillmailIdKillmailHashItemsItem (
    /* flag integer */
    @Json(name = "flag")
    var flag: kotlin.Int,
    /* item_type_id integer */
    @Json(name = "item_type_id")
    var itemTypeId: kotlin.Int,
    /* quantity_destroyed integer */
    @Json(name = "quantity_destroyed")
    var quantityDestroyed: kotlin.Long? = null,
    /* quantity_dropped integer */
    @Json(name = "quantity_dropped")
    var quantityDropped: kotlin.Long? = null,
    /* singleton integer */
    @Json(name = "singleton")
    var singleton: kotlin.Int
)

