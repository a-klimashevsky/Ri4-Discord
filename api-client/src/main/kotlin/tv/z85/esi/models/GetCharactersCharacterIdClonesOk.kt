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

import tv.z85.esi.models.GetCharactersCharacterIdClonesHomeLocation
import tv.z85.esi.models.GetCharactersCharacterIdClonesJumpClone

import com.squareup.moshi.Json
/**
 * 200 ok object
 * @param homeLocation 
 * @param jumpClones jump_clones array
 * @param lastCloneJumpDate last_clone_jump_date string
 * @param lastStationChangeDate last_station_change_date string
 */

data class GetCharactersCharacterIdClonesOk (
    @Json(name = "home_location")
    var homeLocation: GetCharactersCharacterIdClonesHomeLocation? = null,
    /* jump_clones array */
    @Json(name = "jump_clones")
    var jumpClones: kotlin.Array<GetCharactersCharacterIdClonesJumpClone>,
    /* last_clone_jump_date string */
    @Json(name = "last_clone_jump_date")
    var lastCloneJumpDate: java.time.OffsetDateTime? = null,
    /* last_station_change_date string */
    @Json(name = "last_station_change_date")
    var lastStationChangeDate: java.time.OffsetDateTime? = null
)

