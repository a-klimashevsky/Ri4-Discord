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
 * @param description description string
 * @param marketGroupId market_group_id integer
 * @param name name string
 * @param parentGroupId parent_group_id integer
 * @param types types array
 */

data class GetMarketsGroupsMarketGroupIdOk (
    /* description string */
    @Json(name = "description")
    var description: kotlin.String,
    /* market_group_id integer */
    @Json(name = "market_group_id")
    var marketGroupId: kotlin.Int,
    /* name string */
    @Json(name = "name")
    var name: kotlin.String,
    /* parent_group_id integer */
    @Json(name = "parent_group_id")
    var parentGroupId: kotlin.Int? = null,
    /* types array */
    @Json(name = "types")
    var types: kotlin.Array<kotlin.Int>
)

