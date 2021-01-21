
# GetCorporationsCorporationIdStructures200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**corporationId** | **kotlin.Int** | ID of the corporation that owns the structure | 
**fuelExpires** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date on which the structure will run out of fuel |  [optional]
**nextReinforceApply** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time when the structure&#39;s newly requested reinforcement times (e.g. next_reinforce_hour and next_reinforce_day) will take effect |  [optional]
**nextReinforceHour** | **kotlin.Int** | The requested change to reinforce_hour that will take effect at the time shown by next_reinforce_apply |  [optional]
**nextReinforceWeekday** | **kotlin.Int** | The requested change to reinforce_weekday that will take effect at the time shown by next_reinforce_apply |  [optional]
**profileId** | **kotlin.Int** | The id of the ACL profile for this citadel | 
**reinforceHour** | **kotlin.Int** | The hour of day that determines the four hour window when the structure will randomly exit its reinforcement periods and become vulnerable to attack against its armor and/or hull. The structure will become vulnerable at a random time that is +/- 2 hours centered on the value of this property | 
**reinforceWeekday** | **kotlin.Int** | The day of the week when the structure exits its final reinforcement period and becomes vulnerable to attack against its hull. Monday is 0 and Sunday is 6 |  [optional]
**services** | [**kotlin.Array&lt;GetCorporationsCorporationIdStructuresService&gt;**](GetCorporationsCorporationIdStructuresService.md) | Contains a list of service upgrades, and their state |  [optional]
**state** | [**inline**](#StateEnum) | state string | 
**stateTimerEnd** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date at which the structure will move to it&#39;s next state |  [optional]
**stateTimerStart** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date at which the structure entered it&#39;s current state |  [optional]
**structureId** | **kotlin.Long** | The Item ID of the structure | 
**systemId** | **kotlin.Int** | The solar system the structure is in | 
**typeId** | **kotlin.Int** | The type id of the structure | 
**unanchorsAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date at which the structure will unanchor |  [optional]


<a name="StateEnum"></a>
## Enum: state
Name | Value
---- | -----
state | anchor_vulnerable, anchoring, armor_reinforce, armor_vulnerable, deploy_vulnerable, fitting_invulnerable, hull_reinforce, hull_vulnerable, online_deprecated, onlining_vulnerable, shield_vulnerable, unanchored, unknown



