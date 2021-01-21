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

import tv.z85.esi.models.PostCharactersCharacterIdMailRecipient

import com.squareup.moshi.Json
/**
 * mail object
 * @param approvedCost approved_cost integer
 * @param body body string
 * @param recipients recipients array
 * @param subject subject string
 */

data class PostCharactersCharacterIdMailMail (
    /* approved_cost integer */
    @Json(name = "approved_cost")
    var approvedCost: kotlin.Long? = null,
    /* body string */
    @Json(name = "body")
    var body: kotlin.String,
    /* recipients array */
    @Json(name = "recipients")
    var recipients: kotlin.Array<PostCharactersCharacterIdMailRecipient>,
    /* subject string */
    @Json(name = "subject")
    var subject: kotlin.String
)

