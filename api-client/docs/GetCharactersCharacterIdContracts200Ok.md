
# GetCharactersCharacterIdContracts200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptorId** | **kotlin.Int** | Who will accept the contract | 
**assigneeId** | **kotlin.Int** | ID to whom the contract is assigned, can be corporation or character ID | 
**availability** | [**inline**](#AvailabilityEnum) | To whom the contract is available | 
**buyout** | **kotlin.Double** | Buyout price (for Auctions only) |  [optional]
**collateral** | **kotlin.Double** | Collateral price (for Couriers only) |  [optional]
**contractId** | **kotlin.Int** | contract_id integer | 
**dateAccepted** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date of confirmation of contract |  [optional]
**dateCompleted** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date of completed of contract |  [optional]
**dateExpired** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Expiration date of the contract | 
**dateIssued** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Сreation date of the contract | 
**daysToComplete** | **kotlin.Int** | Number of days to perform the contract |  [optional]
**endLocationId** | **kotlin.Long** | End location ID (for Couriers contract) |  [optional]
**forCorporation** | **kotlin.Boolean** | true if the contract was issued on behalf of the issuer&#39;s corporation | 
**issuerCorporationId** | **kotlin.Int** | Character&#39;s corporation ID for the issuer | 
**issuerId** | **kotlin.Int** | Character ID for the issuer | 
**price** | **kotlin.Double** | Price of contract (for ItemsExchange and Auctions) |  [optional]
**reward** | **kotlin.Double** | Remuneration for contract (for Couriers only) |  [optional]
**startLocationId** | **kotlin.Long** | Start location ID (for Couriers contract) |  [optional]
**status** | [**inline**](#StatusEnum) | Status of the the contract | 
**title** | **kotlin.String** | Title of the contract |  [optional]
**type** | [**inline**](#TypeEnum) | Type of the contract | 
**volume** | **kotlin.Double** | Volume of items in the contract |  [optional]


<a name="AvailabilityEnum"></a>
## Enum: availability
Name | Value
---- | -----
availability | public, personal, corporation, alliance


<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | outstanding, in_progress, finished_issuer, finished_contractor, finished, cancelled, rejected, failed, deleted, reversed


<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | unknown, item_exchange, auction, courier, loan



