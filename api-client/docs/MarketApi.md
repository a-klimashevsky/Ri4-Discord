# MarketApi

All URIs are relative to *https://esi.evetech.net/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdOrders**](MarketApi.md#getCharactersCharacterIdOrders) | **GET** /characters/{character_id}/orders/ | List open orders from a character
[**getCharactersCharacterIdOrdersHistory**](MarketApi.md#getCharactersCharacterIdOrdersHistory) | **GET** /characters/{character_id}/orders/history/ | List historical orders by a character
[**getCorporationsCorporationIdOrders**](MarketApi.md#getCorporationsCorporationIdOrders) | **GET** /corporations/{corporation_id}/orders/ | List open orders from a corporation
[**getCorporationsCorporationIdOrdersHistory**](MarketApi.md#getCorporationsCorporationIdOrdersHistory) | **GET** /corporations/{corporation_id}/orders/history/ | List historical orders from a corporation
[**getMarketsGroups**](MarketApi.md#getMarketsGroups) | **GET** /markets/groups/ | Get item groups
[**getMarketsGroupsMarketGroupId**](MarketApi.md#getMarketsGroupsMarketGroupId) | **GET** /markets/groups/{market_group_id}/ | Get item group information
[**getMarketsPrices**](MarketApi.md#getMarketsPrices) | **GET** /markets/prices/ | List market prices
[**getMarketsRegionIdHistory**](MarketApi.md#getMarketsRegionIdHistory) | **GET** /markets/{region_id}/history/ | List historical market statistics in a region
[**getMarketsRegionIdOrders**](MarketApi.md#getMarketsRegionIdOrders) | **GET** /markets/{region_id}/orders/ | List orders in a region
[**getMarketsRegionIdTypes**](MarketApi.md#getMarketsRegionIdTypes) | **GET** /markets/{region_id}/types/ | List type IDs relevant to a market
[**getMarketsStructuresStructureId**](MarketApi.md#getMarketsStructuresStructureId) | **GET** /markets/structures/{structure_id}/ | List orders in a structure


<a name="getCharactersCharacterIdOrders"></a>
# **getCharactersCharacterIdOrders**
> kotlin.Array&lt;GetCharactersCharacterIdOrders200Ok&gt; getCharactersCharacterIdOrders(characterId, datasource, ifMinusNoneMinusMatch, token)

List open orders from a character

List open market orders placed by a character  --- Alternate route: &#x60;/dev/characters/{character_id}/orders/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/orders/&#x60;  --- This route is cached for up to 1200 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = MarketApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdOrders200Ok> = apiInstance.getCharactersCharacterIdOrders(characterId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketApi#getCharactersCharacterIdOrders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketApi#getCharactersCharacterIdOrders")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**kotlin.Array&lt;GetCharactersCharacterIdOrders200Ok&gt;**](GetCharactersCharacterIdOrders200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdOrdersHistory"></a>
# **getCharactersCharacterIdOrdersHistory**
> kotlin.Array&lt;GetCharactersCharacterIdOrdersHistory200Ok&gt; getCharactersCharacterIdOrdersHistory(characterId, datasource, ifMinusNoneMinusMatch, page, token)

List historical orders by a character

List cancelled and expired market orders placed by a character up to 90 days in the past.  --- Alternate route: &#x60;/dev/characters/{character_id}/orders/history/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/orders/history/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/orders/history/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = MarketApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdOrdersHistory200Ok> = apiInstance.getCharactersCharacterIdOrdersHistory(characterId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketApi#getCharactersCharacterIdOrdersHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketApi#getCharactersCharacterIdOrdersHistory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **kotlin.Int**| Which page of results to return | [optional] [default to 1]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**kotlin.Array&lt;GetCharactersCharacterIdOrdersHistory200Ok&gt;**](GetCharactersCharacterIdOrdersHistory200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdOrders"></a>
# **getCorporationsCorporationIdOrders**
> kotlin.Array&lt;GetCorporationsCorporationIdOrders200Ok&gt; getCorporationsCorporationIdOrders(corporationId, datasource, ifMinusNoneMinusMatch, page, token)

List open orders from a corporation

List open market orders placed on behalf of a corporation  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/orders/&#x60;  Alternate route: &#x60;/v3/corporations/{corporation_id}/orders/&#x60;  --- This route is cached for up to 1200 seconds  --- Requires one of the following EVE corporation role(s): Accountant, Trader 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = MarketApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdOrders200Ok> = apiInstance.getCorporationsCorporationIdOrders(corporationId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketApi#getCorporationsCorporationIdOrders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketApi#getCorporationsCorporationIdOrders")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **kotlin.Int**| An EVE corporation ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **kotlin.Int**| Which page of results to return | [optional] [default to 1]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**kotlin.Array&lt;GetCorporationsCorporationIdOrders200Ok&gt;**](GetCorporationsCorporationIdOrders200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdOrdersHistory"></a>
# **getCorporationsCorporationIdOrdersHistory**
> kotlin.Array&lt;GetCorporationsCorporationIdOrdersHistory200Ok&gt; getCorporationsCorporationIdOrdersHistory(corporationId, datasource, ifMinusNoneMinusMatch, page, token)

List historical orders from a corporation

List cancelled and expired market orders placed on behalf of a corporation up to 90 days in the past.  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/orders/history/&#x60;  Alternate route: &#x60;/v2/corporations/{corporation_id}/orders/history/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Accountant, Trader 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = MarketApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdOrdersHistory200Ok> = apiInstance.getCorporationsCorporationIdOrdersHistory(corporationId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketApi#getCorporationsCorporationIdOrdersHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketApi#getCorporationsCorporationIdOrdersHistory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **kotlin.Int**| An EVE corporation ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **kotlin.Int**| Which page of results to return | [optional] [default to 1]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**kotlin.Array&lt;GetCorporationsCorporationIdOrdersHistory200Ok&gt;**](GetCorporationsCorporationIdOrdersHistory200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMarketsGroups"></a>
# **getMarketsGroups**
> kotlin.Array&lt;kotlin.Int&gt; getMarketsGroups(datasource, ifMinusNoneMinusMatch)

Get item groups

Get a list of item groups  --- Alternate route: &#x60;/dev/markets/groups/&#x60;  Alternate route: &#x60;/legacy/markets/groups/&#x60;  Alternate route: &#x60;/v1/markets/groups/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = MarketApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : kotlin.Array<kotlin.Int> = apiInstance.getMarketsGroups(datasource, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketApi#getMarketsGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketApi#getMarketsGroups")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]

### Return type

**kotlin.Array&lt;kotlin.Int&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMarketsGroupsMarketGroupId"></a>
# **getMarketsGroupsMarketGroupId**
> GetMarketsGroupsMarketGroupIdOk getMarketsGroupsMarketGroupId(acceptMinusLanguage, datasource, ifMinusNoneMinusMatch, language, marketGroupId)

Get item group information

Get information on an item group  --- Alternate route: &#x60;/dev/markets/groups/{market_group_id}/&#x60;  Alternate route: &#x60;/legacy/markets/groups/{market_group_id}/&#x60;  Alternate route: &#x60;/v1/markets/groups/{market_group_id}/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = MarketApi()
val acceptMinusLanguage : kotlin.String = acceptMinusLanguage_example // kotlin.String | Language to use in the response
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val language : kotlin.String = language_example // kotlin.String | Language to use in the response, takes precedence over Accept-Language
val marketGroupId : kotlin.Int = 56 // kotlin.Int | An Eve item group ID
try {
    val result : GetMarketsGroupsMarketGroupIdOk = apiInstance.getMarketsGroupsMarketGroupId(acceptMinusLanguage, datasource, ifMinusNoneMinusMatch, language, marketGroupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketApi#getMarketsGroupsMarketGroupId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketApi#getMarketsGroupsMarketGroupId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptMinusLanguage** | **kotlin.String**| Language to use in the response | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **language** | **kotlin.String**| Language to use in the response, takes precedence over Accept-Language | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **marketGroupId** | **kotlin.Int**| An Eve item group ID |

### Return type

[**GetMarketsGroupsMarketGroupIdOk**](GetMarketsGroupsMarketGroupIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMarketsPrices"></a>
# **getMarketsPrices**
> kotlin.Array&lt;GetMarketsPrices200Ok&gt; getMarketsPrices(datasource, ifMinusNoneMinusMatch)

List market prices

Return a list of prices  --- Alternate route: &#x60;/dev/markets/prices/&#x60;  Alternate route: &#x60;/legacy/markets/prices/&#x60;  Alternate route: &#x60;/v1/markets/prices/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = MarketApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : kotlin.Array<GetMarketsPrices200Ok> = apiInstance.getMarketsPrices(datasource, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketApi#getMarketsPrices")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketApi#getMarketsPrices")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]

### Return type

[**kotlin.Array&lt;GetMarketsPrices200Ok&gt;**](GetMarketsPrices200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMarketsRegionIdHistory"></a>
# **getMarketsRegionIdHistory**
> kotlin.Array&lt;GetMarketsRegionIdHistory200Ok&gt; getMarketsRegionIdHistory(datasource, ifMinusNoneMinusMatch, regionId, typeId)

List historical market statistics in a region

Return a list of historical market statistics for the specified type in a region  --- Alternate route: &#x60;/dev/markets/{region_id}/history/&#x60;  Alternate route: &#x60;/legacy/markets/{region_id}/history/&#x60;  Alternate route: &#x60;/v1/markets/{region_id}/history/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = MarketApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val regionId : kotlin.Int = 56 // kotlin.Int | Return statistics in this region
val typeId : kotlin.Int = 56 // kotlin.Int | Return statistics for this type
try {
    val result : kotlin.Array<GetMarketsRegionIdHistory200Ok> = apiInstance.getMarketsRegionIdHistory(datasource, ifMinusNoneMinusMatch, regionId, typeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketApi#getMarketsRegionIdHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketApi#getMarketsRegionIdHistory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **regionId** | **kotlin.Int**| Return statistics in this region |
 **typeId** | **kotlin.Int**| Return statistics for this type |

### Return type

[**kotlin.Array&lt;GetMarketsRegionIdHistory200Ok&gt;**](GetMarketsRegionIdHistory200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMarketsRegionIdOrders"></a>
# **getMarketsRegionIdOrders**
> kotlin.Array&lt;GetMarketsRegionIdOrders200Ok&gt; getMarketsRegionIdOrders(datasource, ifMinusNoneMinusMatch, orderType, page, regionId, typeId)

List orders in a region

Return a list of orders in a region  --- Alternate route: &#x60;/dev/markets/{region_id}/orders/&#x60;  Alternate route: &#x60;/legacy/markets/{region_id}/orders/&#x60;  Alternate route: &#x60;/v1/markets/{region_id}/orders/&#x60;  --- This route is cached for up to 300 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = MarketApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val orderType : kotlin.String = orderType_example // kotlin.String | Filter buy/sell orders, return all orders by default. If you query without type_id, we always return both buy and sell orders
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val regionId : kotlin.Int = 56 // kotlin.Int | Return orders in this region
val typeId : kotlin.Int = 56 // kotlin.Int | Return orders only for this type
try {
    val result : kotlin.Array<GetMarketsRegionIdOrders200Ok> = apiInstance.getMarketsRegionIdOrders(datasource, ifMinusNoneMinusMatch, orderType, page, regionId, typeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketApi#getMarketsRegionIdOrders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketApi#getMarketsRegionIdOrders")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **orderType** | **kotlin.String**| Filter buy/sell orders, return all orders by default. If you query without type_id, we always return both buy and sell orders | [default to &quot;all&quot;] [enum: buy, sell, all]
 **page** | **kotlin.Int**| Which page of results to return | [optional] [default to 1]
 **regionId** | **kotlin.Int**| Return orders in this region |
 **typeId** | **kotlin.Int**| Return orders only for this type | [optional]

### Return type

[**kotlin.Array&lt;GetMarketsRegionIdOrders200Ok&gt;**](GetMarketsRegionIdOrders200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMarketsRegionIdTypes"></a>
# **getMarketsRegionIdTypes**
> kotlin.Array&lt;kotlin.Int&gt; getMarketsRegionIdTypes(datasource, ifMinusNoneMinusMatch, page, regionId)

List type IDs relevant to a market

Return a list of type IDs that have active orders in the region, for efficient market indexing.  --- Alternate route: &#x60;/dev/markets/{region_id}/types/&#x60;  Alternate route: &#x60;/legacy/markets/{region_id}/types/&#x60;  Alternate route: &#x60;/v1/markets/{region_id}/types/&#x60;  --- This route is cached for up to 600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = MarketApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val regionId : kotlin.Int = 56 // kotlin.Int | Return statistics in this region
try {
    val result : kotlin.Array<kotlin.Int> = apiInstance.getMarketsRegionIdTypes(datasource, ifMinusNoneMinusMatch, page, regionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketApi#getMarketsRegionIdTypes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketApi#getMarketsRegionIdTypes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **kotlin.Int**| Which page of results to return | [optional] [default to 1]
 **regionId** | **kotlin.Int**| Return statistics in this region |

### Return type

**kotlin.Array&lt;kotlin.Int&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMarketsStructuresStructureId"></a>
# **getMarketsStructuresStructureId**
> kotlin.Array&lt;GetMarketsStructuresStructureId200Ok&gt; getMarketsStructuresStructureId(datasource, ifMinusNoneMinusMatch, page, structureId, token)

List orders in a structure

Return all orders in a structure  --- Alternate route: &#x60;/dev/markets/structures/{structure_id}/&#x60;  Alternate route: &#x60;/legacy/markets/structures/{structure_id}/&#x60;  Alternate route: &#x60;/v1/markets/structures/{structure_id}/&#x60;  --- This route is cached for up to 300 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = MarketApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val structureId : kotlin.Long = 789 // kotlin.Long | Return orders in this structure
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetMarketsStructuresStructureId200Ok> = apiInstance.getMarketsStructuresStructureId(datasource, ifMinusNoneMinusMatch, page, structureId, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketApi#getMarketsStructuresStructureId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketApi#getMarketsStructuresStructureId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **kotlin.Int**| Which page of results to return | [optional] [default to 1]
 **structureId** | **kotlin.Long**| Return orders in this structure |
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**kotlin.Array&lt;GetMarketsStructuresStructureId200Ok&gt;**](GetMarketsStructuresStructureId200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

