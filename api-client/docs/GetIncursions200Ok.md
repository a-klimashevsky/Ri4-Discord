
# GetIncursions200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**constellationId** | **kotlin.Int** | The constellation id in which this incursion takes place | 
**factionId** | **kotlin.Int** | The attacking faction&#39;s id | 
**hasBoss** | **kotlin.Boolean** | Whether the final encounter has boss or not | 
**infestedSolarSystems** | **kotlin.Array&lt;kotlin.Int&gt;** | A list of infested solar system ids that are a part of this incursion | 
**influence** | **kotlin.Float** | Influence of this incursion as a float from 0 to 1 | 
**stagingSolarSystemId** | **kotlin.Int** | Staging solar system for this incursion | 
**state** | [**inline**](#StateEnum) | The state of this incursion | 
**type** | **kotlin.String** | The type of this incursion | 


<a name="StateEnum"></a>
## Enum: state
Name | Value
---- | -----
state | withdrawing, mobilizing, established



