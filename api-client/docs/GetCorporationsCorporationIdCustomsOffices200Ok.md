
# GetCorporationsCorporationIdCustomsOffices200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allianceTaxRate** | **kotlin.Float** | Only present if alliance access is allowed |  [optional]
**allowAccessWithStandings** | **kotlin.Boolean** | standing_level and any standing related tax rate only present when this is true | 
**allowAllianceAccess** | **kotlin.Boolean** | allow_alliance_access boolean | 
**badStandingTaxRate** | **kotlin.Float** | bad_standing_tax_rate number |  [optional]
**corporationTaxRate** | **kotlin.Float** | corporation_tax_rate number |  [optional]
**excellentStandingTaxRate** | **kotlin.Float** | Tax rate for entities with excellent level of standing, only present if this level is allowed, same for all other standing related tax rates |  [optional]
**goodStandingTaxRate** | **kotlin.Float** | good_standing_tax_rate number |  [optional]
**neutralStandingTaxRate** | **kotlin.Float** | neutral_standing_tax_rate number |  [optional]
**officeId** | **kotlin.Long** | unique ID of this customs office | 
**reinforceExitEnd** | **kotlin.Int** | reinforce_exit_end integer | 
**reinforceExitStart** | **kotlin.Int** | Together with reinforce_exit_end, marks a 2-hour period where this customs office could exit reinforcement mode during the day after initial attack | 
**standingLevel** | [**inline**](#StandingLevelEnum) | Access is allowed only for entities with this level of standing or better |  [optional]
**systemId** | **kotlin.Int** | ID of the solar system this customs office is located in | 
**terribleStandingTaxRate** | **kotlin.Float** | terrible_standing_tax_rate number |  [optional]


<a name="StandingLevelEnum"></a>
## Enum: standing_level
Name | Value
---- | -----
standingLevel | bad, excellent, good, neutral, terrible



