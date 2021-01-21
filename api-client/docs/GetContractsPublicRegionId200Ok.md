
# GetContractsPublicRegionId200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**buyout** | **kotlin.Double** | Buyout price (for Auctions only) |  [optional]
**collateral** | **kotlin.Double** | Collateral price (for Couriers only) |  [optional]
**contractId** | **kotlin.Int** | contract_id integer | 
**dateExpired** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Expiration date of the contract | 
**dateIssued** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Сreation date of the contract | 
**daysToComplete** | **kotlin.Int** | Number of days to perform the contract |  [optional]
**endLocationId** | **kotlin.Long** | End location ID (for Couriers contract) |  [optional]
**forCorporation** | **kotlin.Boolean** | true if the contract was issued on behalf of the issuer&#39;s corporation |  [optional]
**issuerCorporationId** | **kotlin.Int** | Character&#39;s corporation ID for the issuer | 
**issuerId** | **kotlin.Int** | Character ID for the issuer | 
**price** | **kotlin.Double** | Price of contract (for ItemsExchange and Auctions) |  [optional]
**reward** | **kotlin.Double** | Remuneration for contract (for Couriers only) |  [optional]
**startLocationId** | **kotlin.Long** | Start location ID (for Couriers contract) |  [optional]
**title** | **kotlin.String** | Title of the contract |  [optional]
**type** | [**inline**](#TypeEnum) | Type of the contract | 
**volume** | **kotlin.Double** | Volume of items in the contract |  [optional]


<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | unknown, item_exchange, auction, courier, loan



