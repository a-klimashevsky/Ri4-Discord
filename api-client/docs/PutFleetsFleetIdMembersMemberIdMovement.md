
# PutFleetsFleetIdMembersMemberIdMovement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | [**inline**](#RoleEnum) | If a character is moved to the &#x60;fleet_commander&#x60; role, neither &#x60;wing_id&#x60; or &#x60;squad_id&#x60; should be specified. If a character is moved to the &#x60;wing_commander&#x60; role, only &#x60;wing_id&#x60; should be specified. If a character is moved to the &#x60;squad_commander&#x60; role, both &#x60;wing_id&#x60; and &#x60;squad_id&#x60; should be specified. If a character is moved to the &#x60;squad_member&#x60; role, both &#x60;wing_id&#x60; and &#x60;squad_id&#x60; should be specified. | 
**squadId** | **kotlin.Long** | squad_id integer |  [optional]
**wingId** | **kotlin.Long** | wing_id integer |  [optional]


<a name="RoleEnum"></a>
## Enum: role
Name | Value
---- | -----
role | fleet_commander, wing_commander, squad_commander, squad_member



