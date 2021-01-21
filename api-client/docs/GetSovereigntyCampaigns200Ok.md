
# GetSovereigntyCampaigns200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attackersScore** | **kotlin.Float** | Score for all attacking parties, only present in Defense Events.  |  [optional]
**campaignId** | **kotlin.Int** | Unique ID for this campaign. | 
**constellationId** | **kotlin.Int** | The constellation in which the campaign will take place.  | 
**defenderId** | **kotlin.Int** | Defending alliance, only present in Defense Events  |  [optional]
**defenderScore** | **kotlin.Float** | Score for the defending alliance, only present in Defense Events.  |  [optional]
**eventType** | [**inline**](#EventTypeEnum) | Type of event this campaign is for. tcu_defense, ihub_defense and station_defense are referred to as \&quot;Defense Events\&quot;, station_freeport as \&quot;Freeport Events\&quot;.  | 
**participants** | [**kotlin.Array&lt;GetSovereigntyCampaignsParticipant&gt;**](GetSovereigntyCampaignsParticipant.md) | Alliance participating and their respective scores, only present in Freeport Events.  |  [optional]
**solarSystemId** | **kotlin.Int** | The solar system the structure is located in.  | 
**startTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Time the event is scheduled to start.  | 
**structureId** | **kotlin.Long** | The structure item ID that is related to this campaign.  | 


<a name="EventTypeEnum"></a>
## Enum: event_type
Name | Value
---- | -----
eventType | tcu_defense, ihub_defense, station_defense, station_freeport



