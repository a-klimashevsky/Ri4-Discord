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
 * @param allianceId The character's alliance ID, if their corporation is in an alliance
 * @param characterId The character's ID
 * @param corporationId The character's corporation ID
 * @param factionId The character's faction ID, if their corporation is in a faction
 */

data class PostCharactersAffiliation200Ok (
    /* The character's alliance ID, if their corporation is in an alliance */
    @Json(name = "alliance_id")
    var allianceId: kotlin.Int? = null,
    /* The character's ID */
    @Json(name = "character_id")
    var characterId: kotlin.Int,
    /* The character's corporation ID */
    @Json(name = "corporation_id")
    var corporationId: kotlin.Int,
    /* The character's faction ID, if their corporation is in a faction */
    @Json(name = "faction_id")
    var factionId: kotlin.Int? = null
)

