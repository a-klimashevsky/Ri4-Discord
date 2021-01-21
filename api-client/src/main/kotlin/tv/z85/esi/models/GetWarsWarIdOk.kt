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

import tv.z85.esi.models.GetWarsWarIdAggressor
import tv.z85.esi.models.GetWarsWarIdAlly
import tv.z85.esi.models.GetWarsWarIdDefender

import com.squareup.moshi.Json
/**
 * 200 ok object
 * @param aggressor 
 * @param allies allied corporations or alliances, each object contains either corporation_id or alliance_id
 * @param declared Time that the war was declared
 * @param defender 
 * @param finished Time the war ended and shooting was no longer allowed
 * @param id ID of the specified war
 * @param mutual Was the war declared mutual by both parties
 * @param openForAllies Is the war currently open for allies or not
 * @param retracted Time the war was retracted but both sides could still shoot each other
 * @param started Time when the war started and both sides could shoot each other
 */

data class GetWarsWarIdOk (
    @Json(name = "aggressor")
    var aggressor: GetWarsWarIdAggressor,
    /* allied corporations or alliances, each object contains either corporation_id or alliance_id */
    @Json(name = "allies")
    var allies: kotlin.Array<GetWarsWarIdAlly>? = null,
    /* Time that the war was declared */
    @Json(name = "declared")
    var declared: java.time.OffsetDateTime,
    @Json(name = "defender")
    var defender: GetWarsWarIdDefender,
    /* Time the war ended and shooting was no longer allowed */
    @Json(name = "finished")
    var finished: java.time.OffsetDateTime? = null,
    /* ID of the specified war */
    @Json(name = "id")
    var id: kotlin.Int,
    /* Was the war declared mutual by both parties */
    @Json(name = "mutual")
    var mutual: kotlin.Boolean,
    /* Is the war currently open for allies or not */
    @Json(name = "open_for_allies")
    var openForAllies: kotlin.Boolean,
    /* Time the war was retracted but both sides could still shoot each other */
    @Json(name = "retracted")
    var retracted: java.time.OffsetDateTime? = null,
    /* Time when the war started and both sides could shoot each other */
    @Json(name = "started")
    var started: java.time.OffsetDateTime? = null
)

