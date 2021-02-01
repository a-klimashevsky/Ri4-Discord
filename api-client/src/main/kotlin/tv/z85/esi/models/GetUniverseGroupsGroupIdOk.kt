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
 * @param categoryId category_id integer
 * @param groupId group_id integer
 * @param name name string
 * @param published published boolean
 * @param types types array
 */

data class GetUniverseGroupsGroupIdOk (
    /* category_id integer */
    @Json(name = "category_id")
    var categoryId: kotlin.Int,
    /* group_id integer */
    @Json(name = "group_id")
    var groupId: kotlin.Int,
    /* name string */
    @Json(name = "name")
    var name: kotlin.String,
    /* published boolean */
    @Json(name = "published")
    var published: kotlin.Boolean,
    /* types array */
    @Json(name = "types")
    var types: kotlin.Array<kotlin.Int>
)
