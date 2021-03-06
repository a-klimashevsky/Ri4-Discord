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

import tv.z85.esi.models.GetCorporationsCorporationIdStarbasesStarbaseIdFuel

import com.squareup.moshi.Json
/**
 * 200 ok object
 * @param allowAllianceMembers allow_alliance_members boolean
 * @param allowCorporationMembers allow_corporation_members boolean
 * @param anchor Who can anchor starbase (POS) and its structures
 * @param attackIfAtWar attack_if_at_war boolean
 * @param attackIfOtherSecurityStatusDropping attack_if_other_security_status_dropping boolean
 * @param attackSecurityStatusThreshold Starbase (POS) will attack if target's security standing is lower than this value
 * @param attackStandingThreshold Starbase (POS) will attack if target's standing is lower than this value
 * @param fuelBayTake Who can take fuel blocks out of the starbase (POS)'s fuel bay
 * @param fuelBayView Who can view the starbase (POS)'s fule bay. Characters either need to have required role or belong to the starbase (POS) owner's corporation or alliance, as described by the enum, all other access settings follows the same scheme
 * @param fuels Fuel blocks and other things that will be consumed when operating a starbase (POS)
 * @param offline Who can offline starbase (POS) and its structures
 * @param online Who can online starbase (POS) and its structures
 * @param unanchor Who can unanchor starbase (POS) and its structures
 * @param useAllianceStandings True if the starbase (POS) is using alliance standings, otherwise using corporation's
 */

data class GetCorporationsCorporationIdStarbasesStarbaseIdOk (
    /* allow_alliance_members boolean */
    @Json(name = "allow_alliance_members")
    var allowAllianceMembers: kotlin.Boolean,
    /* allow_corporation_members boolean */
    @Json(name = "allow_corporation_members")
    var allowCorporationMembers: kotlin.Boolean,
    /* Who can anchor starbase (POS) and its structures */
    @Json(name = "anchor")
    var anchor: GetCorporationsCorporationIdStarbasesStarbaseIdOk.Anchor,
    /* attack_if_at_war boolean */
    @Json(name = "attack_if_at_war")
    var attackIfAtWar: kotlin.Boolean,
    /* attack_if_other_security_status_dropping boolean */
    @Json(name = "attack_if_other_security_status_dropping")
    var attackIfOtherSecurityStatusDropping: kotlin.Boolean,
    /* Starbase (POS) will attack if target's security standing is lower than this value */
    @Json(name = "attack_security_status_threshold")
    var attackSecurityStatusThreshold: kotlin.Float? = null,
    /* Starbase (POS) will attack if target's standing is lower than this value */
    @Json(name = "attack_standing_threshold")
    var attackStandingThreshold: kotlin.Float? = null,
    /* Who can take fuel blocks out of the starbase (POS)'s fuel bay */
    @Json(name = "fuel_bay_take")
    var fuelBayTake: GetCorporationsCorporationIdStarbasesStarbaseIdOk.FuelBayTake,
    /* Who can view the starbase (POS)'s fule bay. Characters either need to have required role or belong to the starbase (POS) owner's corporation or alliance, as described by the enum, all other access settings follows the same scheme */
    @Json(name = "fuel_bay_view")
    var fuelBayView: GetCorporationsCorporationIdStarbasesStarbaseIdOk.FuelBayView,
    /* Fuel blocks and other things that will be consumed when operating a starbase (POS) */
    @Json(name = "fuels")
    var fuels: kotlin.Array<GetCorporationsCorporationIdStarbasesStarbaseIdFuel>? = null,
    /* Who can offline starbase (POS) and its structures */
    @Json(name = "offline")
    var offline: GetCorporationsCorporationIdStarbasesStarbaseIdOk.Offline,
    /* Who can online starbase (POS) and its structures */
    @Json(name = "online")
    var online: GetCorporationsCorporationIdStarbasesStarbaseIdOk.Online,
    /* Who can unanchor starbase (POS) and its structures */
    @Json(name = "unanchor")
    var unanchor: GetCorporationsCorporationIdStarbasesStarbaseIdOk.Unanchor,
    /* True if the starbase (POS) is using alliance standings, otherwise using corporation's */
    @Json(name = "use_alliance_standings")
    var useAllianceStandings: kotlin.Boolean
) {

    /**
    * Who can anchor starbase (POS) and its structures
    * Values: allianceMember,configStarbaseEquipmentRole,corporationMember,starbaseFuelTechnicianRole
    */
    
    enum class Anchor(val value: kotlin.String){
        @Json(name = "alliance_member") allianceMember("alliance_member"),
        @Json(name = "config_starbase_equipment_role") configStarbaseEquipmentRole("config_starbase_equipment_role"),
        @Json(name = "corporation_member") corporationMember("corporation_member"),
        @Json(name = "starbase_fuel_technician_role") starbaseFuelTechnicianRole("starbase_fuel_technician_role");
    }
    /**
    * Who can take fuel blocks out of the starbase (POS)'s fuel bay
    * Values: allianceMember,configStarbaseEquipmentRole,corporationMember,starbaseFuelTechnicianRole
    */
    
    enum class FuelBayTake(val value: kotlin.String){
        @Json(name = "alliance_member") allianceMember("alliance_member"),
        @Json(name = "config_starbase_equipment_role") configStarbaseEquipmentRole("config_starbase_equipment_role"),
        @Json(name = "corporation_member") corporationMember("corporation_member"),
        @Json(name = "starbase_fuel_technician_role") starbaseFuelTechnicianRole("starbase_fuel_technician_role");
    }
    /**
    * Who can view the starbase (POS)'s fule bay. Characters either need to have required role or belong to the starbase (POS) owner's corporation or alliance, as described by the enum, all other access settings follows the same scheme
    * Values: allianceMember,configStarbaseEquipmentRole,corporationMember,starbaseFuelTechnicianRole
    */
    
    enum class FuelBayView(val value: kotlin.String){
        @Json(name = "alliance_member") allianceMember("alliance_member"),
        @Json(name = "config_starbase_equipment_role") configStarbaseEquipmentRole("config_starbase_equipment_role"),
        @Json(name = "corporation_member") corporationMember("corporation_member"),
        @Json(name = "starbase_fuel_technician_role") starbaseFuelTechnicianRole("starbase_fuel_technician_role");
    }
    /**
    * Who can offline starbase (POS) and its structures
    * Values: allianceMember,configStarbaseEquipmentRole,corporationMember,starbaseFuelTechnicianRole
    */
    
    enum class Offline(val value: kotlin.String){
        @Json(name = "alliance_member") allianceMember("alliance_member"),
        @Json(name = "config_starbase_equipment_role") configStarbaseEquipmentRole("config_starbase_equipment_role"),
        @Json(name = "corporation_member") corporationMember("corporation_member"),
        @Json(name = "starbase_fuel_technician_role") starbaseFuelTechnicianRole("starbase_fuel_technician_role");
    }
    /**
    * Who can online starbase (POS) and its structures
    * Values: allianceMember,configStarbaseEquipmentRole,corporationMember,starbaseFuelTechnicianRole
    */
    
    enum class Online(val value: kotlin.String){
        @Json(name = "alliance_member") allianceMember("alliance_member"),
        @Json(name = "config_starbase_equipment_role") configStarbaseEquipmentRole("config_starbase_equipment_role"),
        @Json(name = "corporation_member") corporationMember("corporation_member"),
        @Json(name = "starbase_fuel_technician_role") starbaseFuelTechnicianRole("starbase_fuel_technician_role");
    }
    /**
    * Who can unanchor starbase (POS) and its structures
    * Values: allianceMember,configStarbaseEquipmentRole,corporationMember,starbaseFuelTechnicianRole
    */
    
    enum class Unanchor(val value: kotlin.String){
        @Json(name = "alliance_member") allianceMember("alliance_member"),
        @Json(name = "config_starbase_equipment_role") configStarbaseEquipmentRole("config_starbase_equipment_role"),
        @Json(name = "corporation_member") corporationMember("corporation_member"),
        @Json(name = "starbase_fuel_technician_role") starbaseFuelTechnicianRole("starbase_fuel_technician_role");
    }
}

