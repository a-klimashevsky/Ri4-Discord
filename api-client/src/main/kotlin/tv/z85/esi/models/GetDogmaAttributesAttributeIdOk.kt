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
 * @param attributeId attribute_id integer
 * @param defaultValue default_value number
 * @param description description string
 * @param displayName display_name string
 * @param highIsGood high_is_good boolean
 * @param iconId icon_id integer
 * @param name name string
 * @param published published boolean
 * @param stackable stackable boolean
 * @param unitId unit_id integer
 */

data class GetDogmaAttributesAttributeIdOk (
    /* attribute_id integer */
    @Json(name = "attribute_id")
    var attributeId: kotlin.Int,
    /* default_value number */
    @Json(name = "default_value")
    var defaultValue: kotlin.Float? = null,
    /* description string */
    @Json(name = "description")
    var description: kotlin.String? = null,
    /* display_name string */
    @Json(name = "display_name")
    var displayName: kotlin.String? = null,
    /* high_is_good boolean */
    @Json(name = "high_is_good")
    var highIsGood: kotlin.Boolean? = null,
    /* icon_id integer */
    @Json(name = "icon_id")
    var iconId: kotlin.Int? = null,
    /* name string */
    @Json(name = "name")
    var name: kotlin.String? = null,
    /* published boolean */
    @Json(name = "published")
    var published: kotlin.Boolean? = null,
    /* stackable boolean */
    @Json(name = "stackable")
    var stackable: kotlin.Boolean? = null,
    /* unit_id integer */
    @Json(name = "unit_id")
    var unitId: kotlin.Int? = null
)

