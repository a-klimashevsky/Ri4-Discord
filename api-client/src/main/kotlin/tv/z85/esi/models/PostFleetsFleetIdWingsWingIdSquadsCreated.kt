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
 * 201 created object
 * @param squadId The squad_id of the newly created squad
 */

data class PostFleetsFleetIdWingsWingIdSquadsCreated (
    /* The squad_id of the newly created squad */
    @Json(name = "squad_id")
    var squadId: kotlin.Long
)

