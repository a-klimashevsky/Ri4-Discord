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

import tv.z85.esi.models.GetCharactersCharacterIdBookmarksCoordinates
import tv.z85.esi.models.GetCharactersCharacterIdBookmarksItem

import com.squareup.moshi.Json
/**
 * 200 ok object
 * @param bookmarkId bookmark_id integer
 * @param coordinates 
 * @param created created string
 * @param creatorId creator_id integer
 * @param folderId folder_id integer
 * @param item 
 * @param label label string
 * @param locationId location_id integer
 * @param notes notes string
 */

data class GetCharactersCharacterIdBookmarks200Ok (
    /* bookmark_id integer */
    @Json(name = "bookmark_id")
    var bookmarkId: kotlin.Int,
    @Json(name = "coordinates")
    var coordinates: GetCharactersCharacterIdBookmarksCoordinates? = null,
    /* created string */
    @Json(name = "created")
    var created: java.time.OffsetDateTime,
    /* creator_id integer */
    @Json(name = "creator_id")
    var creatorId: kotlin.Int,
    /* folder_id integer */
    @Json(name = "folder_id")
    var folderId: kotlin.Int? = null,
    @Json(name = "item")
    var item: GetCharactersCharacterIdBookmarksItem? = null,
    /* label string */
    @Json(name = "label")
    var label: kotlin.String,
    /* location_id integer */
    @Json(name = "location_id")
    var locationId: kotlin.Int,
    /* notes string */
    @Json(name = "notes")
    var notes: kotlin.String
)
