
# GetCorporationsCorporationIdStarbases200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**moonId** | **kotlin.Int** | The moon this starbase (POS) is anchored on, unanchored POSes do not have this information |  [optional]
**onlinedSince** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the POS onlined, for starbases (POSes) in online state |  [optional]
**reinforcedUntil** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the POS will be out of reinforcement, for starbases (POSes) in reinforced state |  [optional]
**starbaseId** | **kotlin.Long** | Unique ID for this starbase (POS) | 
**state** | [**inline**](#StateEnum) | state string |  [optional]
**systemId** | **kotlin.Int** | The solar system this starbase (POS) is in, unanchored POSes have this information | 
**typeId** | **kotlin.Int** | Starbase (POS) type | 
**unanchorAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the POS started unanchoring, for starbases (POSes) in unanchoring state |  [optional]


<a name="StateEnum"></a>
## Enum: state
Name | Value
---- | -----
state | offline, online, onlining, reinforced, unanchoring



