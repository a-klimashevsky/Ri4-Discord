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
 * @param itemId Unique ID for this item.
 * @param locationFlag Type of the location_id
 * @param locationId References a station, a ship or an item_id if this blueprint is located within a container.
 * @param materialEfficiency Material Efficiency Level of the blueprint.
 * @param quantity A range of numbers with a minimum of -2 and no maximum value where -1 is an original and -2 is a copy. It can be a positive integer if it is a stack of blueprint originals fresh from the market (e.g. no activities performed on them yet).
 * @param runs Number of runs remaining if the blueprint is a copy, -1 if it is an original.
 * @param timeEfficiency Time Efficiency Level of the blueprint.
 * @param typeId type_id integer
 */

data class GetCorporationsCorporationIdBlueprints200Ok (
    /* Unique ID for this item. */
    @Json(name = "item_id")
    var itemId: kotlin.Long,
    /* Type of the location_id */
    @Json(name = "location_flag")
    var locationFlag: GetCorporationsCorporationIdBlueprints200Ok.LocationFlag,
    /* References a station, a ship or an item_id if this blueprint is located within a container. */
    @Json(name = "location_id")
    var locationId: kotlin.Long,
    /* Material Efficiency Level of the blueprint. */
    @Json(name = "material_efficiency")
    var materialEfficiency: kotlin.Int,
    /* A range of numbers with a minimum of -2 and no maximum value where -1 is an original and -2 is a copy. It can be a positive integer if it is a stack of blueprint originals fresh from the market (e.g. no activities performed on them yet). */
    @Json(name = "quantity")
    var quantity: kotlin.Int,
    /* Number of runs remaining if the blueprint is a copy, -1 if it is an original. */
    @Json(name = "runs")
    var runs: kotlin.Int,
    /* Time Efficiency Level of the blueprint. */
    @Json(name = "time_efficiency")
    var timeEfficiency: kotlin.Int,
    /* type_id integer */
    @Json(name = "type_id")
    var typeId: kotlin.Int
) {

    /**
    * Type of the location_id
    * Values: assetSafety,autoFit,bonus,booster,boosterBay,capsule,cargo,corpDeliveries,corpSAG1,corpSAG2,corpSAG3,corpSAG4,corpSAG5,corpSAG6,corpSAG7,crateLoot,deliveries,droneBay,dustBattle,dustDatabank,fighterBay,fighterTube0,fighterTube1,fighterTube2,fighterTube3,fighterTube4,fleetHangar,frigateEscapeBay,hangar,hangarAll,hiSlot0,hiSlot1,hiSlot2,hiSlot3,hiSlot4,hiSlot5,hiSlot6,hiSlot7,hiddenModifiers,implant,impounded,junkyardReprocessed,junkyardTrashed,loSlot0,loSlot1,loSlot2,loSlot3,loSlot4,loSlot5,loSlot6,loSlot7,locked,medSlot0,medSlot1,medSlot2,medSlot3,medSlot4,medSlot5,medSlot6,medSlot7,officeFolder,pilot,planetSurface,quafeBay,reward,rigSlot0,rigSlot1,rigSlot2,rigSlot3,rigSlot4,rigSlot5,rigSlot6,rigSlot7,secondaryStorage,serviceSlot0,serviceSlot1,serviceSlot2,serviceSlot3,serviceSlot4,serviceSlot5,serviceSlot6,serviceSlot7,shipHangar,shipOffline,skill,skillInTraining,specializedAmmoHold,specializedCommandCenterHold,specializedFuelBay,specializedGasHold,specializedIndustrialShipHold,specializedLargeShipHold,specializedMaterialBay,specializedMediumShipHold,specializedMineralHold,specializedOreHold,specializedPlanetaryCommoditiesHold,specializedSalvageHold,specializedShipHold,specializedSmallShipHold,structureActive,structureFuel,structureInactive,structureOffline,subSystemBay,subSystemSlot0,subSystemSlot1,subSystemSlot2,subSystemSlot3,subSystemSlot4,subSystemSlot5,subSystemSlot6,subSystemSlot7,unlocked,wallet,wardrobe
    */
    
    enum class LocationFlag(val value: kotlin.String){
        @Json(name = "AssetSafety") assetSafety("AssetSafety"),
        @Json(name = "AutoFit") autoFit("AutoFit"),
        @Json(name = "Bonus") bonus("Bonus"),
        @Json(name = "Booster") booster("Booster"),
        @Json(name = "BoosterBay") boosterBay("BoosterBay"),
        @Json(name = "Capsule") capsule("Capsule"),
        @Json(name = "Cargo") cargo("Cargo"),
        @Json(name = "CorpDeliveries") corpDeliveries("CorpDeliveries"),
        @Json(name = "CorpSAG1") corpSAG1("CorpSAG1"),
        @Json(name = "CorpSAG2") corpSAG2("CorpSAG2"),
        @Json(name = "CorpSAG3") corpSAG3("CorpSAG3"),
        @Json(name = "CorpSAG4") corpSAG4("CorpSAG4"),
        @Json(name = "CorpSAG5") corpSAG5("CorpSAG5"),
        @Json(name = "CorpSAG6") corpSAG6("CorpSAG6"),
        @Json(name = "CorpSAG7") corpSAG7("CorpSAG7"),
        @Json(name = "CrateLoot") crateLoot("CrateLoot"),
        @Json(name = "Deliveries") deliveries("Deliveries"),
        @Json(name = "DroneBay") droneBay("DroneBay"),
        @Json(name = "DustBattle") dustBattle("DustBattle"),
        @Json(name = "DustDatabank") dustDatabank("DustDatabank"),
        @Json(name = "FighterBay") fighterBay("FighterBay"),
        @Json(name = "FighterTube0") fighterTube0("FighterTube0"),
        @Json(name = "FighterTube1") fighterTube1("FighterTube1"),
        @Json(name = "FighterTube2") fighterTube2("FighterTube2"),
        @Json(name = "FighterTube3") fighterTube3("FighterTube3"),
        @Json(name = "FighterTube4") fighterTube4("FighterTube4"),
        @Json(name = "FleetHangar") fleetHangar("FleetHangar"),
        @Json(name = "FrigateEscapeBay") frigateEscapeBay("FrigateEscapeBay"),
        @Json(name = "Hangar") hangar("Hangar"),
        @Json(name = "HangarAll") hangarAll("HangarAll"),
        @Json(name = "HiSlot0") hiSlot0("HiSlot0"),
        @Json(name = "HiSlot1") hiSlot1("HiSlot1"),
        @Json(name = "HiSlot2") hiSlot2("HiSlot2"),
        @Json(name = "HiSlot3") hiSlot3("HiSlot3"),
        @Json(name = "HiSlot4") hiSlot4("HiSlot4"),
        @Json(name = "HiSlot5") hiSlot5("HiSlot5"),
        @Json(name = "HiSlot6") hiSlot6("HiSlot6"),
        @Json(name = "HiSlot7") hiSlot7("HiSlot7"),
        @Json(name = "HiddenModifiers") hiddenModifiers("HiddenModifiers"),
        @Json(name = "Implant") implant("Implant"),
        @Json(name = "Impounded") impounded("Impounded"),
        @Json(name = "JunkyardReprocessed") junkyardReprocessed("JunkyardReprocessed"),
        @Json(name = "JunkyardTrashed") junkyardTrashed("JunkyardTrashed"),
        @Json(name = "LoSlot0") loSlot0("LoSlot0"),
        @Json(name = "LoSlot1") loSlot1("LoSlot1"),
        @Json(name = "LoSlot2") loSlot2("LoSlot2"),
        @Json(name = "LoSlot3") loSlot3("LoSlot3"),
        @Json(name = "LoSlot4") loSlot4("LoSlot4"),
        @Json(name = "LoSlot5") loSlot5("LoSlot5"),
        @Json(name = "LoSlot6") loSlot6("LoSlot6"),
        @Json(name = "LoSlot7") loSlot7("LoSlot7"),
        @Json(name = "Locked") locked("Locked"),
        @Json(name = "MedSlot0") medSlot0("MedSlot0"),
        @Json(name = "MedSlot1") medSlot1("MedSlot1"),
        @Json(name = "MedSlot2") medSlot2("MedSlot2"),
        @Json(name = "MedSlot3") medSlot3("MedSlot3"),
        @Json(name = "MedSlot4") medSlot4("MedSlot4"),
        @Json(name = "MedSlot5") medSlot5("MedSlot5"),
        @Json(name = "MedSlot6") medSlot6("MedSlot6"),
        @Json(name = "MedSlot7") medSlot7("MedSlot7"),
        @Json(name = "OfficeFolder") officeFolder("OfficeFolder"),
        @Json(name = "Pilot") pilot("Pilot"),
        @Json(name = "PlanetSurface") planetSurface("PlanetSurface"),
        @Json(name = "QuafeBay") quafeBay("QuafeBay"),
        @Json(name = "Reward") reward("Reward"),
        @Json(name = "RigSlot0") rigSlot0("RigSlot0"),
        @Json(name = "RigSlot1") rigSlot1("RigSlot1"),
        @Json(name = "RigSlot2") rigSlot2("RigSlot2"),
        @Json(name = "RigSlot3") rigSlot3("RigSlot3"),
        @Json(name = "RigSlot4") rigSlot4("RigSlot4"),
        @Json(name = "RigSlot5") rigSlot5("RigSlot5"),
        @Json(name = "RigSlot6") rigSlot6("RigSlot6"),
        @Json(name = "RigSlot7") rigSlot7("RigSlot7"),
        @Json(name = "SecondaryStorage") secondaryStorage("SecondaryStorage"),
        @Json(name = "ServiceSlot0") serviceSlot0("ServiceSlot0"),
        @Json(name = "ServiceSlot1") serviceSlot1("ServiceSlot1"),
        @Json(name = "ServiceSlot2") serviceSlot2("ServiceSlot2"),
        @Json(name = "ServiceSlot3") serviceSlot3("ServiceSlot3"),
        @Json(name = "ServiceSlot4") serviceSlot4("ServiceSlot4"),
        @Json(name = "ServiceSlot5") serviceSlot5("ServiceSlot5"),
        @Json(name = "ServiceSlot6") serviceSlot6("ServiceSlot6"),
        @Json(name = "ServiceSlot7") serviceSlot7("ServiceSlot7"),
        @Json(name = "ShipHangar") shipHangar("ShipHangar"),
        @Json(name = "ShipOffline") shipOffline("ShipOffline"),
        @Json(name = "Skill") skill("Skill"),
        @Json(name = "SkillInTraining") skillInTraining("SkillInTraining"),
        @Json(name = "SpecializedAmmoHold") specializedAmmoHold("SpecializedAmmoHold"),
        @Json(name = "SpecializedCommandCenterHold") specializedCommandCenterHold("SpecializedCommandCenterHold"),
        @Json(name = "SpecializedFuelBay") specializedFuelBay("SpecializedFuelBay"),
        @Json(name = "SpecializedGasHold") specializedGasHold("SpecializedGasHold"),
        @Json(name = "SpecializedIndustrialShipHold") specializedIndustrialShipHold("SpecializedIndustrialShipHold"),
        @Json(name = "SpecializedLargeShipHold") specializedLargeShipHold("SpecializedLargeShipHold"),
        @Json(name = "SpecializedMaterialBay") specializedMaterialBay("SpecializedMaterialBay"),
        @Json(name = "SpecializedMediumShipHold") specializedMediumShipHold("SpecializedMediumShipHold"),
        @Json(name = "SpecializedMineralHold") specializedMineralHold("SpecializedMineralHold"),
        @Json(name = "SpecializedOreHold") specializedOreHold("SpecializedOreHold"),
        @Json(name = "SpecializedPlanetaryCommoditiesHold") specializedPlanetaryCommoditiesHold("SpecializedPlanetaryCommoditiesHold"),
        @Json(name = "SpecializedSalvageHold") specializedSalvageHold("SpecializedSalvageHold"),
        @Json(name = "SpecializedShipHold") specializedShipHold("SpecializedShipHold"),
        @Json(name = "SpecializedSmallShipHold") specializedSmallShipHold("SpecializedSmallShipHold"),
        @Json(name = "StructureActive") structureActive("StructureActive"),
        @Json(name = "StructureFuel") structureFuel("StructureFuel"),
        @Json(name = "StructureInactive") structureInactive("StructureInactive"),
        @Json(name = "StructureOffline") structureOffline("StructureOffline"),
        @Json(name = "SubSystemBay") subSystemBay("SubSystemBay"),
        @Json(name = "SubSystemSlot0") subSystemSlot0("SubSystemSlot0"),
        @Json(name = "SubSystemSlot1") subSystemSlot1("SubSystemSlot1"),
        @Json(name = "SubSystemSlot2") subSystemSlot2("SubSystemSlot2"),
        @Json(name = "SubSystemSlot3") subSystemSlot3("SubSystemSlot3"),
        @Json(name = "SubSystemSlot4") subSystemSlot4("SubSystemSlot4"),
        @Json(name = "SubSystemSlot5") subSystemSlot5("SubSystemSlot5"),
        @Json(name = "SubSystemSlot6") subSystemSlot6("SubSystemSlot6"),
        @Json(name = "SubSystemSlot7") subSystemSlot7("SubSystemSlot7"),
        @Json(name = "Unlocked") unlocked("Unlocked"),
        @Json(name = "Wallet") wallet("Wallet"),
        @Json(name = "Wardrobe") wardrobe("Wardrobe");
    }
}

