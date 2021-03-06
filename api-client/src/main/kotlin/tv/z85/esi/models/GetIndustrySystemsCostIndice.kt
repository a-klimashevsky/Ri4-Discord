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
 * cost_indice object
 * @param activity activity string
 * @param costIndex cost_index number
 */

data class GetIndustrySystemsCostIndice (
    /* activity string */
    @Json(name = "activity")
    var activity: GetIndustrySystemsCostIndice.Activity,
    /* cost_index number */
    @Json(name = "cost_index")
    var costIndex: kotlin.Float
) {

    /**
    * activity string
    * Values: copying,duplicating,invention,manufacturing,none,reaction,researchingMaterialEfficiency,researchingTechnology,researchingTimeEfficiency,reverseEngineering
    */
    
    enum class Activity(val value: kotlin.String){
        @Json(name = "copying") copying("copying"),
        @Json(name = "duplicating") duplicating("duplicating"),
        @Json(name = "invention") invention("invention"),
        @Json(name = "manufacturing") manufacturing("manufacturing"),
        @Json(name = "none") none("none"),
        @Json(name = "reaction") reaction("reaction"),
        @Json(name = "researching_material_efficiency") researchingMaterialEfficiency("researching_material_efficiency"),
        @Json(name = "researching_technology") researchingTechnology("researching_technology"),
        @Json(name = "researching_time_efficiency") researchingTimeEfficiency("researching_time_efficiency"),
        @Json(name = "reverse_engineering") reverseEngineering("reverse_engineering");
    }
}

