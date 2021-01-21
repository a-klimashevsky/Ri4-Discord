
# GetFleetsFleetIdMembers200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**characterId** | **kotlin.Int** | character_id integer | 
**joinTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | join_time string | 
**role** | [**inline**](#RoleEnum) | Member’s role in fleet | 
**roleName** | **kotlin.String** | Localized role names | 
**shipTypeId** | **kotlin.Int** | ship_type_id integer | 
**solarSystemId** | **kotlin.Int** | Solar system the member is located in | 
**squadId** | **kotlin.Long** | ID of the squad the member is in. If not applicable, will be set to -1 | 
**stationId** | **kotlin.Long** | Station in which the member is docked in, if applicable |  [optional]
**takesFleetWarp** | **kotlin.Boolean** | Whether the member take fleet warps | 
**wingId** | **kotlin.Long** | ID of the wing the member is in. If not applicable, will be set to -1 | 


<a name="RoleEnum"></a>
## Enum: role
Name | Value
---- | -----
role | fleet_commander, wing_commander, squad_commander, squad_member



