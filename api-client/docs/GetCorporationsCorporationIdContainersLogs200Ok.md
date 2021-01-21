
# GetCorporationsCorporationIdContainersLogs200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**inline**](#ActionEnum) | action string | 
**characterId** | **kotlin.Int** | ID of the character who performed the action. | 
**containerId** | **kotlin.Long** | ID of the container | 
**containerTypeId** | **kotlin.Int** | Type ID of the container | 
**locationFlag** | [**inline**](#LocationFlagEnum) | location_flag string | 
**locationId** | **kotlin.Long** | location_id integer | 
**loggedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp when this log was created | 
**newConfigBitmask** | **kotlin.Int** | new_config_bitmask integer |  [optional]
**oldConfigBitmask** | **kotlin.Int** | old_config_bitmask integer |  [optional]
**passwordType** | [**inline**](#PasswordTypeEnum) | Type of password set if action is of type SetPassword or EnterPassword |  [optional]
**quantity** | **kotlin.Int** | Quantity of the item being acted upon |  [optional]
**typeId** | **kotlin.Int** | Type ID of the item being acted upon |  [optional]


<a name="ActionEnum"></a>
## Enum: action
Name | Value
---- | -----
action | add, assemble, configure, enter_password, lock, move, repackage, set_name, set_password, unlock


<a name="LocationFlagEnum"></a>
## Enum: location_flag
Name | Value
---- | -----
locationFlag | AssetSafety, AutoFit, Bonus, Booster, BoosterBay, Capsule, Cargo, CorpDeliveries, CorpSAG1, CorpSAG2, CorpSAG3, CorpSAG4, CorpSAG5, CorpSAG6, CorpSAG7, CrateLoot, Deliveries, DroneBay, DustBattle, DustDatabank, FighterBay, FighterTube0, FighterTube1, FighterTube2, FighterTube3, FighterTube4, FleetHangar, FrigateEscapeBay, Hangar, HangarAll, HiSlot0, HiSlot1, HiSlot2, HiSlot3, HiSlot4, HiSlot5, HiSlot6, HiSlot7, HiddenModifiers, Implant, Impounded, JunkyardReprocessed, JunkyardTrashed, LoSlot0, LoSlot1, LoSlot2, LoSlot3, LoSlot4, LoSlot5, LoSlot6, LoSlot7, Locked, MedSlot0, MedSlot1, MedSlot2, MedSlot3, MedSlot4, MedSlot5, MedSlot6, MedSlot7, OfficeFolder, Pilot, PlanetSurface, QuafeBay, Reward, RigSlot0, RigSlot1, RigSlot2, RigSlot3, RigSlot4, RigSlot5, RigSlot6, RigSlot7, SecondaryStorage, ServiceSlot0, ServiceSlot1, ServiceSlot2, ServiceSlot3, ServiceSlot4, ServiceSlot5, ServiceSlot6, ServiceSlot7, ShipHangar, ShipOffline, Skill, SkillInTraining, SpecializedAmmoHold, SpecializedCommandCenterHold, SpecializedFuelBay, SpecializedGasHold, SpecializedIndustrialShipHold, SpecializedLargeShipHold, SpecializedMaterialBay, SpecializedMediumShipHold, SpecializedMineralHold, SpecializedOreHold, SpecializedPlanetaryCommoditiesHold, SpecializedSalvageHold, SpecializedShipHold, SpecializedSmallShipHold, StructureActive, StructureFuel, StructureInactive, StructureOffline, SubSystemBay, SubSystemSlot0, SubSystemSlot1, SubSystemSlot2, SubSystemSlot3, SubSystemSlot4, SubSystemSlot5, SubSystemSlot6, SubSystemSlot7, Unlocked, Wallet, Wardrobe


<a name="PasswordTypeEnum"></a>
## Enum: password_type
Name | Value
---- | -----
passwordType | config, general



