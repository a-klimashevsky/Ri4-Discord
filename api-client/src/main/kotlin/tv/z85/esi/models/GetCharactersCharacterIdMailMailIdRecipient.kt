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
 * recipient object
 * @param recipientId recipient_id integer
 * @param recipientType recipient_type string
 */

data class GetCharactersCharacterIdMailMailIdRecipient (
    /* recipient_id integer */
    @Json(name = "recipient_id")
    var recipientId: kotlin.Int,
    /* recipient_type string */
    @Json(name = "recipient_type")
    var recipientType: GetCharactersCharacterIdMailMailIdRecipient.RecipientType
) {

    /**
    * recipient_type string
    * Values: alliance,character,corporation,mailingList
    */
    
    enum class RecipientType(val value: kotlin.String){
        @Json(name = "alliance") alliance("alliance"),
        @Json(name = "character") character("character"),
        @Json(name = "corporation") corporation("corporation"),
        @Json(name = "mailing_list") mailingList("mailing_list");
    }
}

