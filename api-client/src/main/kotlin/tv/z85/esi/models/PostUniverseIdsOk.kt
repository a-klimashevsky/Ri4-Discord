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

import tv.z85.esi.models.PostUniverseIdsAgent
import tv.z85.esi.models.PostUniverseIdsAlliance
import tv.z85.esi.models.PostUniverseIdsCharacter
import tv.z85.esi.models.PostUniverseIdsConstellation
import tv.z85.esi.models.PostUniverseIdsCorporation
import tv.z85.esi.models.PostUniverseIdsFaction
import tv.z85.esi.models.PostUniverseIdsInventoryType
import tv.z85.esi.models.PostUniverseIdsRegion
import tv.z85.esi.models.PostUniverseIdsStation
import tv.z85.esi.models.PostUniverseIdsSystem

import com.squareup.moshi.Json
/**
 * 200 ok object
 * @param agents agents array
 * @param alliances alliances array
 * @param characters characters array
 * @param constellations constellations array
 * @param corporations corporations array
 * @param factions factions array
 * @param inventoryTypes inventory_types array
 * @param regions regions array
 * @param stations stations array
 * @param systems systems array
 */

data class PostUniverseIdsOk (
    /* agents array */
    @Json(name = "agents")
    var agents: kotlin.Array<PostUniverseIdsAgent>? = null,
    /* alliances array */
    @Json(name = "alliances")
    var alliances: kotlin.Array<PostUniverseIdsAlliance>? = null,
    /* characters array */
    @Json(name = "characters")
    var characters: kotlin.Array<PostUniverseIdsCharacter>? = null,
    /* constellations array */
    @Json(name = "constellations")
    var constellations: kotlin.Array<PostUniverseIdsConstellation>? = null,
    /* corporations array */
    @Json(name = "corporations")
    var corporations: kotlin.Array<PostUniverseIdsCorporation>? = null,
    /* factions array */
    @Json(name = "factions")
    var factions: kotlin.Array<PostUniverseIdsFaction>? = null,
    /* inventory_types array */
    @Json(name = "inventory_types")
    var inventoryTypes: kotlin.Array<PostUniverseIdsInventoryType>? = null,
    /* regions array */
    @Json(name = "regions")
    var regions: kotlin.Array<PostUniverseIdsRegion>? = null,
    /* stations array */
    @Json(name = "stations")
    var stations: kotlin.Array<PostUniverseIdsStation>? = null,
    /* systems array */
    @Json(name = "systems")
    var systems: kotlin.Array<PostUniverseIdsSystem>? = null
)
