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
 * @param contactId contact_id integer
 * @param contactType contact_type string
 * @param isBlocked Whether this contact is in the blocked list. Note a missing value denotes unknown, not true or false
 * @param isWatched Whether this contact is being watched
 * @param labelIds label_ids array
 * @param standing Standing of the contact
 */

data class GetCharactersCharacterIdContacts200Ok (
    /* contact_id integer */
    @Json(name = "contact_id")
    var contactId: kotlin.Int,
    /* contact_type string */
    @Json(name = "contact_type")
    var contactType: GetCharactersCharacterIdContacts200Ok.ContactType,
    /* Whether this contact is in the blocked list. Note a missing value denotes unknown, not true or false */
    @Json(name = "is_blocked")
    var isBlocked: kotlin.Boolean? = null,
    /* Whether this contact is being watched */
    @Json(name = "is_watched")
    var isWatched: kotlin.Boolean? = null,
    /* label_ids array */
    @Json(name = "label_ids")
    var labelIds: kotlin.Array<kotlin.Long>? = null,
    /* Standing of the contact */
    @Json(name = "standing")
    var standing: kotlin.Float
) {

    /**
    * contact_type string
    * Values: character,corporation,alliance,faction
    */
    
    enum class ContactType(val value: kotlin.String){
        @Json(name = "character") character("character"),
        @Json(name = "corporation") corporation("corporation"),
        @Json(name = "alliance") alliance("alliance"),
        @Json(name = "faction") faction("faction");
    }
}

