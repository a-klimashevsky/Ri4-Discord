
# GetWarsWarIdOk

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggressor** | [**GetWarsWarIdAggressor**](GetWarsWarIdAggressor.md) |  | 
**allies** | [**kotlin.Array&lt;GetWarsWarIdAlly&gt;**](GetWarsWarIdAlly.md) | allied corporations or alliances, each object contains either corporation_id or alliance_id |  [optional]
**declared** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Time that the war was declared | 
**defender** | [**GetWarsWarIdDefender**](GetWarsWarIdDefender.md) |  | 
**finished** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Time the war ended and shooting was no longer allowed |  [optional]
**id** | **kotlin.Int** | ID of the specified war | 
**mutual** | **kotlin.Boolean** | Was the war declared mutual by both parties | 
**openForAllies** | **kotlin.Boolean** | Is the war currently open for allies or not | 
**retracted** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Time the war was retracted but both sides could still shoot each other |  [optional]
**started** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Time when the war started and both sides could shoot each other |  [optional]



