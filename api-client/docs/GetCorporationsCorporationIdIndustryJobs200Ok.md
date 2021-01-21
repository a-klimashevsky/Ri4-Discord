
# GetCorporationsCorporationIdIndustryJobs200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activityId** | **kotlin.Int** | Job activity ID | 
**blueprintId** | **kotlin.Long** | blueprint_id integer | 
**blueprintLocationId** | **kotlin.Long** | Location ID of the location from which the blueprint was installed. Normally a station ID, but can also be an asset (e.g. container) or corporation facility | 
**blueprintTypeId** | **kotlin.Int** | blueprint_type_id integer | 
**completedCharacterId** | **kotlin.Int** | ID of the character which completed this job |  [optional]
**completedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when this job was completed |  [optional]
**cost** | **kotlin.Double** | The sume of job installation fee and industry facility tax |  [optional]
**duration** | **kotlin.Int** | Job duration in seconds | 
**endDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when this job finished | 
**facilityId** | **kotlin.Long** | ID of the facility where this job is running | 
**installerId** | **kotlin.Int** | ID of the character which installed this job | 
**jobId** | **kotlin.Int** | Unique job ID | 
**licensedRuns** | **kotlin.Int** | Number of runs blueprint is licensed for |  [optional]
**locationId** | **kotlin.Long** | ID of the location for the industry facility | 
**outputLocationId** | **kotlin.Long** | Location ID of the location to which the output of the job will be delivered. Normally a station ID, but can also be a corporation facility | 
**pauseDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when this job was paused (i.e. time when the facility where this job was installed went offline) |  [optional]
**probability** | **kotlin.Float** | Chance of success for invention |  [optional]
**productTypeId** | **kotlin.Int** | Type ID of product (manufactured, copied or invented) |  [optional]
**runs** | **kotlin.Int** | Number of runs for a manufacturing job, or number of copies to make for a blueprint copy | 
**startDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when this job started | 
**status** | [**inline**](#StatusEnum) | status string | 
**successfulRuns** | **kotlin.Int** | Number of successful runs for this job. Equal to runs unless this is an invention job |  [optional]


<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | active, cancelled, delivered, paused, ready, reverted



