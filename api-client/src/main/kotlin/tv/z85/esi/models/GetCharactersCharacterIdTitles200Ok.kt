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
 * @param name name string
 * @param titleId title_id integer
 */

data class GetCharactersCharacterIdTitles200Ok (
    /* name string */
    @Json(name = "name")
    var name: kotlin.String? = null,
    /* title_id integer */
    @Json(name = "title_id")
    var titleId: kotlin.Int? = null
)

