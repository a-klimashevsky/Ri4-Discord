
# GetCorporationsCorporationIdRolesHistory200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**changedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | changed_at string | 
**characterId** | **kotlin.Int** | The character whose roles are changed | 
**issuerId** | **kotlin.Int** | ID of the character who issued this change | 
**newRoles** | [**inline**](#kotlin.Array&lt;NewRolesEnum&gt;) | new_roles array | 
**oldRoles** | [**inline**](#kotlin.Array&lt;OldRolesEnum&gt;) | old_roles array | 
**roleType** | [**inline**](#RoleTypeEnum) | role_type string | 


<a name="kotlin.Array<NewRolesEnum>"></a>
## Enum: new_roles
Name | Value
---- | -----
newRoles | Account_Take_1, Account_Take_2, Account_Take_3, Account_Take_4, Account_Take_5, Account_Take_6, Account_Take_7, Accountant, Auditor, Communications_Officer, Config_Equipment, Config_Starbase_Equipment, Container_Take_1, Container_Take_2, Container_Take_3, Container_Take_4, Container_Take_5, Container_Take_6, Container_Take_7, Contract_Manager, Diplomat, Director, Factory_Manager, Fitting_Manager, Hangar_Query_1, Hangar_Query_2, Hangar_Query_3, Hangar_Query_4, Hangar_Query_5, Hangar_Query_6, Hangar_Query_7, Hangar_Take_1, Hangar_Take_2, Hangar_Take_3, Hangar_Take_4, Hangar_Take_5, Hangar_Take_6, Hangar_Take_7, Junior_Accountant, Personnel_Manager, Rent_Factory_Facility, Rent_Office, Rent_Research_Facility, Security_Officer, Starbase_Defense_Operator, Starbase_Fuel_Technician, Station_Manager, Trader


<a name="kotlin.Array<OldRolesEnum>"></a>
## Enum: old_roles
Name | Value
---- | -----
oldRoles | Account_Take_1, Account_Take_2, Account_Take_3, Account_Take_4, Account_Take_5, Account_Take_6, Account_Take_7, Accountant, Auditor, Communications_Officer, Config_Equipment, Config_Starbase_Equipment, Container_Take_1, Container_Take_2, Container_Take_3, Container_Take_4, Container_Take_5, Container_Take_6, Container_Take_7, Contract_Manager, Diplomat, Director, Factory_Manager, Fitting_Manager, Hangar_Query_1, Hangar_Query_2, Hangar_Query_3, Hangar_Query_4, Hangar_Query_5, Hangar_Query_6, Hangar_Query_7, Hangar_Take_1, Hangar_Take_2, Hangar_Take_3, Hangar_Take_4, Hangar_Take_5, Hangar_Take_6, Hangar_Take_7, Junior_Accountant, Personnel_Manager, Rent_Factory_Facility, Rent_Office, Rent_Research_Facility, Security_Officer, Starbase_Defense_Operator, Starbase_Fuel_Technician, Station_Manager, Trader


<a name="RoleTypeEnum"></a>
## Enum: role_type
Name | Value
---- | -----
roleType | grantable_roles, grantable_roles_at_base, grantable_roles_at_hq, grantable_roles_at_other, roles, roles_at_base, roles_at_hq, roles_at_other



