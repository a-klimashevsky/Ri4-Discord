
# GetCorporationsCorporationIdOrders200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration** | **kotlin.Int** | Number of days for which order is valid (starting from the issued date). An order expires at time issued + duration | 
**escrow** | **kotlin.Double** | For buy orders, the amount of ISK in escrow |  [optional]
**isBuyOrder** | **kotlin.Boolean** | True if the order is a bid (buy) order |  [optional]
**issued** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when this order was issued | 
**issuedBy** | **kotlin.Int** | The character who issued this order | 
**locationId** | **kotlin.Long** | ID of the location where order was placed | 
**minVolume** | **kotlin.Int** | For buy orders, the minimum quantity that will be accepted in a matching sell order |  [optional]
**orderId** | **kotlin.Long** | Unique order ID | 
**price** | **kotlin.Double** | Cost per unit for this order | 
**range** | [**inline**](#RangeEnum) | Valid order range, numbers are ranges in jumps | 
**regionId** | **kotlin.Int** | ID of the region where order was placed | 
**typeId** | **kotlin.Int** | The type ID of the item transacted in this order | 
**volumeRemain** | **kotlin.Int** | Quantity of items still required or offered | 
**volumeTotal** | **kotlin.Int** | Quantity of items required or offered at time order was placed | 
**walletDivision** | **kotlin.Int** | The corporation wallet division used for this order. | 


<a name="RangeEnum"></a>
## Enum: range
Name | Value
---- | -----
range | 1, 10, 2, 20, 3, 30, 4, 40, 5, region, solarsystem, station



