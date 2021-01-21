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
 * @param bloodlineId The bloodline associated with this ancestry
 * @param description description string
 * @param iconId icon_id integer
 * @param id id integer
 * @param name name string
 * @param shortDescription short_description string
 */

data class GetUniverseAncestries200Ok (
    /* The bloodline associated with this ancestry */
    @Json(name = "bloodline_id")
    var bloodlineId: kotlin.Int,
    /* description string */
    @Json(name = "description")
    var description: kotlin.String,
    /* icon_id integer */
    @Json(name = "icon_id")
    var iconId: kotlin.Int? = null,
    /* id integer */
    @Json(name = "id")
    var id: kotlin.Int,
    /* name string */
    @Json(name = "name")
    var name: kotlin.String,
    /* short_description string */
    @Json(name = "short_description")
    var shortDescription: kotlin.String? = null
)

