
# PostFleetsFleetIdMembersInvitation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**characterId** | **kotlin.Int** | The character you want to invite | 
**role** | [**inline**](#RoleEnum) | If a character is invited with the &#x60;fleet_commander&#x60; role, neither &#x60;wing_id&#x60; or &#x60;squad_id&#x60; should be specified. If a character is invited with the &#x60;wing_commander&#x60; role, only &#x60;wing_id&#x60; should be specified. If a character is invited with the &#x60;squad_commander&#x60; role, both &#x60;wing_id&#x60; and &#x60;squad_id&#x60; should be specified. If a character is invited with the &#x60;squad_member&#x60; role, &#x60;wing_id&#x60; and &#x60;squad_id&#x60; should either both be specified or not specified at all. If they aren’t specified, the invited character will join any squad with available positions. | 
**squadId** | **kotlin.Long** | squad_id integer |  [optional]
**wingId** | **kotlin.Long** | wing_id integer |  [optional]


<a name="RoleEnum"></a>
## Enum: role
Name | Value
---- | -----
role | fleet_commander, wing_commander, squad_commander, squad_member



