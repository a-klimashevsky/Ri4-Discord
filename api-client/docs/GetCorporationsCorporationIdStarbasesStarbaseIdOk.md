
# GetCorporationsCorporationIdStarbasesStarbaseIdOk

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowAllianceMembers** | **kotlin.Boolean** | allow_alliance_members boolean | 
**allowCorporationMembers** | **kotlin.Boolean** | allow_corporation_members boolean | 
**anchor** | [**inline**](#AnchorEnum) | Who can anchor starbase (POS) and its structures | 
**attackIfAtWar** | **kotlin.Boolean** | attack_if_at_war boolean | 
**attackIfOtherSecurityStatusDropping** | **kotlin.Boolean** | attack_if_other_security_status_dropping boolean | 
**attackSecurityStatusThreshold** | **kotlin.Float** | Starbase (POS) will attack if target&#39;s security standing is lower than this value |  [optional]
**attackStandingThreshold** | **kotlin.Float** | Starbase (POS) will attack if target&#39;s standing is lower than this value |  [optional]
**fuelBayTake** | [**inline**](#FuelBayTakeEnum) | Who can take fuel blocks out of the starbase (POS)&#39;s fuel bay | 
**fuelBayView** | [**inline**](#FuelBayViewEnum) | Who can view the starbase (POS)&#39;s fule bay. Characters either need to have required role or belong to the starbase (POS) owner&#39;s corporation or alliance, as described by the enum, all other access settings follows the same scheme | 
**fuels** | [**kotlin.Array&lt;GetCorporationsCorporationIdStarbasesStarbaseIdFuel&gt;**](GetCorporationsCorporationIdStarbasesStarbaseIdFuel.md) | Fuel blocks and other things that will be consumed when operating a starbase (POS) |  [optional]
**offline** | [**inline**](#OfflineEnum) | Who can offline starbase (POS) and its structures | 
**online** | [**inline**](#OnlineEnum) | Who can online starbase (POS) and its structures | 
**unanchor** | [**inline**](#UnanchorEnum) | Who can unanchor starbase (POS) and its structures | 
**useAllianceStandings** | **kotlin.Boolean** | True if the starbase (POS) is using alliance standings, otherwise using corporation&#39;s | 


<a name="AnchorEnum"></a>
## Enum: anchor
Name | Value
---- | -----
anchor | alliance_member, config_starbase_equipment_role, corporation_member, starbase_fuel_technician_role


<a name="FuelBayTakeEnum"></a>
## Enum: fuel_bay_take
Name | Value
---- | -----
fuelBayTake | alliance_member, config_starbase_equipment_role, corporation_member, starbase_fuel_technician_role


<a name="FuelBayViewEnum"></a>
## Enum: fuel_bay_view
Name | Value
---- | -----
fuelBayView | alliance_member, config_starbase_equipment_role, corporation_member, starbase_fuel_technician_role


<a name="OfflineEnum"></a>
## Enum: offline
Name | Value
---- | -----
offline | alliance_member, config_starbase_equipment_role, corporation_member, starbase_fuel_technician_role


<a name="OnlineEnum"></a>
## Enum: online
Name | Value
---- | -----
online | alliance_member, config_starbase_equipment_role, corporation_member, starbase_fuel_technician_role


<a name="UnanchorEnum"></a>
## Enum: unanchor
Name | Value
---- | -----
unanchor | alliance_member, config_starbase_equipment_role, corporation_member, starbase_fuel_technician_role



