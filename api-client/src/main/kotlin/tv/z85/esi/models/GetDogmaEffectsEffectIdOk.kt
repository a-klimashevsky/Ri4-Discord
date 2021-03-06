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

import tv.z85.esi.models.GetDogmaEffectsEffectIdModifier

import com.squareup.moshi.Json
/**
 * 200 ok object
 * @param description description string
 * @param disallowAutoRepeat disallow_auto_repeat boolean
 * @param dischargeAttributeId discharge_attribute_id integer
 * @param displayName display_name string
 * @param durationAttributeId duration_attribute_id integer
 * @param effectCategory effect_category integer
 * @param effectId effect_id integer
 * @param electronicChance electronic_chance boolean
 * @param falloffAttributeId falloff_attribute_id integer
 * @param iconId icon_id integer
 * @param isAssistance is_assistance boolean
 * @param isOffensive is_offensive boolean
 * @param isWarpSafe is_warp_safe boolean
 * @param modifiers modifiers array
 * @param name name string
 * @param postExpression post_expression integer
 * @param preExpression pre_expression integer
 * @param published published boolean
 * @param rangeAttributeId range_attribute_id integer
 * @param rangeChance range_chance boolean
 * @param trackingSpeedAttributeId tracking_speed_attribute_id integer
 */

data class GetDogmaEffectsEffectIdOk (
    /* description string */
    @Json(name = "description")
    var description: kotlin.String? = null,
    /* disallow_auto_repeat boolean */
    @Json(name = "disallow_auto_repeat")
    var disallowAutoRepeat: kotlin.Boolean? = null,
    /* discharge_attribute_id integer */
    @Json(name = "discharge_attribute_id")
    var dischargeAttributeId: kotlin.Int? = null,
    /* display_name string */
    @Json(name = "display_name")
    var displayName: kotlin.String? = null,
    /* duration_attribute_id integer */
    @Json(name = "duration_attribute_id")
    var durationAttributeId: kotlin.Int? = null,
    /* effect_category integer */
    @Json(name = "effect_category")
    var effectCategory: kotlin.Int? = null,
    /* effect_id integer */
    @Json(name = "effect_id")
    var effectId: kotlin.Int,
    /* electronic_chance boolean */
    @Json(name = "electronic_chance")
    var electronicChance: kotlin.Boolean? = null,
    /* falloff_attribute_id integer */
    @Json(name = "falloff_attribute_id")
    var falloffAttributeId: kotlin.Int? = null,
    /* icon_id integer */
    @Json(name = "icon_id")
    var iconId: kotlin.Int? = null,
    /* is_assistance boolean */
    @Json(name = "is_assistance")
    var isAssistance: kotlin.Boolean? = null,
    /* is_offensive boolean */
    @Json(name = "is_offensive")
    var isOffensive: kotlin.Boolean? = null,
    /* is_warp_safe boolean */
    @Json(name = "is_warp_safe")
    var isWarpSafe: kotlin.Boolean? = null,
    /* modifiers array */
    @Json(name = "modifiers")
    var modifiers: kotlin.Array<GetDogmaEffectsEffectIdModifier>? = null,
    /* name string */
    @Json(name = "name")
    var name: kotlin.String? = null,
    /* post_expression integer */
    @Json(name = "post_expression")
    var postExpression: kotlin.Int? = null,
    /* pre_expression integer */
    @Json(name = "pre_expression")
    var preExpression: kotlin.Int? = null,
    /* published boolean */
    @Json(name = "published")
    var published: kotlin.Boolean? = null,
    /* range_attribute_id integer */
    @Json(name = "range_attribute_id")
    var rangeAttributeId: kotlin.Int? = null,
    /* range_chance boolean */
    @Json(name = "range_chance")
    var rangeChance: kotlin.Boolean? = null,
    /* tracking_speed_attribute_id integer */
    @Json(name = "tracking_speed_attribute_id")
    var trackingSpeedAttributeId: kotlin.Int? = null
)

