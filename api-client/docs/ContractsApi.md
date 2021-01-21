# ContractsApi

All URIs are relative to *https://esi.evetech.net/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdContracts**](ContractsApi.md#getCharactersCharacterIdContracts) | **GET** /characters/{character_id}/contracts/ | Get contracts
[**getCharactersCharacterIdContractsContractIdBids**](ContractsApi.md#getCharactersCharacterIdContractsContractIdBids) | **GET** /characters/{character_id}/contracts/{contract_id}/bids/ | Get contract bids
[**getCharactersCharacterIdContractsContractIdItems**](ContractsApi.md#getCharactersCharacterIdContractsContractIdItems) | **GET** /characters/{character_id}/contracts/{contract_id}/items/ | Get contract items
[**getContractsPublicBidsContractId**](ContractsApi.md#getContractsPublicBidsContractId) | **GET** /contracts/public/bids/{contract_id}/ | Get public contract bids
[**getContractsPublicItemsContractId**](ContractsApi.md#getContractsPublicItemsContractId) | **GET** /contracts/public/items/{contract_id}/ | Get public contract items
[**getContractsPublicRegionId**](ContractsApi.md#getContractsPublicRegionId) | **GET** /contracts/public/{region_id}/ | Get public contracts
[**getCorporationsCorporationIdContracts**](ContractsApi.md#getCorporationsCorporationIdContracts) | **GET** /corporations/{corporation_id}/contracts/ | Get corporation contracts
[**getCorporationsCorporationIdContractsContractIdBids**](ContractsApi.md#getCorporationsCorporationIdContractsContractIdBids) | **GET** /corporations/{corporation_id}/contracts/{contract_id}/bids/ | Get corporation contract bids
[**getCorporationsCorporationIdContractsContractIdItems**](ContractsApi.md#getCorporationsCorporationIdContractsContractIdItems) | **GET** /corporations/{corporation_id}/contracts/{contract_id}/items/ | Get corporation contract items


<a name="getCharactersCharacterIdContracts"></a>
# **getCharactersCharacterIdContracts**
> kotlin.Array&lt;GetCharactersCharacterIdContracts200Ok&gt; getCharactersCharacterIdContracts(characterId, datasource, ifMinusNoneMinusMatch, page, token)

Get contracts

Returns contracts available to a character, only if the character is issuer, acceptor or assignee. Only returns contracts no older than 30 days, or if the status is \&quot;in_progress\&quot;.  --- Alternate route: &#x60;/dev/characters/{character_id}/contracts/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contracts/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/contracts/&#x60;  --- This route is cached for up to 300 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = ContractsApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdContracts200Ok> = apiInstance.getCharactersCharacterIdContracts(characterId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContractsApi#getCharactersCharacterIdContracts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContractsApi#getCharactersCharacterIdContracts")
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

[**kotlin.Array&lt;GetCharactersCharacterIdContracts200Ok&gt;**](GetCharactersCharacterIdContracts200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdContractsContractIdBids"></a>
# **getCharactersCharacterIdContractsContractIdBids**
> kotlin.Array&lt;GetCharactersCharacterIdContractsContractIdBids200Ok&gt; getCharactersCharacterIdContractsContractIdBids(characterId, contractId, datasource, ifMinusNoneMinusMatch, token)

Get contract bids

Lists bids on a particular auction contract  --- Alternate route: &#x60;/dev/characters/{character_id}/contracts/{contract_id}/bids/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contracts/{contract_id}/bids/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/contracts/{contract_id}/bids/&#x60;  --- This route is cached for up to 300 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = ContractsApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val contractId : kotlin.Int = 56 // kotlin.Int | ID of a contract
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdContractsContractIdBids200Ok> = apiInstance.getCharactersCharacterIdContractsContractIdBids(characterId, contractId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContractsApi#getCharactersCharacterIdContractsContractIdBids")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContractsApi#getCharactersCharacterIdContractsContractIdBids")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **contractId** | **kotlin.Int**| ID of a contract |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**kotlin.Array&lt;GetCharactersCharacterIdContractsContractIdBids200Ok&gt;**](GetCharactersCharacterIdContractsContractIdBids200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdContractsContractIdItems"></a>
# **getCharactersCharacterIdContractsContractIdItems**
> kotlin.Array&lt;GetCharactersCharacterIdContractsContractIdItems200Ok&gt; getCharactersCharacterIdContractsContractIdItems(characterId, contractId, datasource, ifMinusNoneMinusMatch, token)

Get contract items

Lists items of a particular contract  --- Alternate route: &#x60;/dev/characters/{character_id}/contracts/{contract_id}/items/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contracts/{contract_id}/items/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/contracts/{contract_id}/items/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = ContractsApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val contractId : kotlin.Int = 56 // kotlin.Int | ID of a contract
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdContractsContractIdItems200Ok> = apiInstance.getCharactersCharacterIdContractsContractIdItems(characterId, contractId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContractsApi#getCharactersCharacterIdContractsContractIdItems")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContractsApi#getCharactersCharacterIdContractsContractIdItems")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **contractId** | **kotlin.Int**| ID of a contract |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**kotlin.Array&lt;GetCharactersCharacterIdContractsContractIdItems200Ok&gt;**](GetCharactersCharacterIdContractsContractIdItems200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getContractsPublicBidsContractId"></a>
# **getContractsPublicBidsContractId**
> kotlin.Array&lt;GetContractsPublicBidsContractId200Ok&gt; getContractsPublicBidsContractId(contractId, datasource, ifMinusNoneMinusMatch, page)

Get public contract bids

Lists bids on a public auction contract  --- Alternate route: &#x60;/dev/contracts/public/bids/{contract_id}/&#x60;  Alternate route: &#x60;/legacy/contracts/public/bids/{contract_id}/&#x60;  Alternate route: &#x60;/v1/contracts/public/bids/{contract_id}/&#x60;  --- This route is cached for up to 300 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = ContractsApi()
val contractId : kotlin.Int = 56 // kotlin.Int | ID of a contract
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
try {
    val result : kotlin.Array<GetContractsPublicBidsContractId200Ok> = apiInstance.getContractsPublicBidsContractId(contractId, datasource, ifMinusNoneMinusMatch, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContractsApi#getContractsPublicBidsContractId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContractsApi#getContractsPublicBidsContractId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractId** | **kotlin.Int**| ID of a contract |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **kotlin.Int**| Which page of results to return | [optional] [default to 1]

### Return type

[**kotlin.Array&lt;GetContractsPublicBidsContractId200Ok&gt;**](GetContractsPublicBidsContractId200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getContractsPublicItemsContractId"></a>
# **getContractsPublicItemsContractId**
> kotlin.Array&lt;GetContractsPublicItemsContractId200Ok&gt; getContractsPublicItemsContractId(contractId, datasource, ifMinusNoneMinusMatch, page)

Get public contract items

Lists items of a public contract  --- Alternate route: &#x60;/dev/contracts/public/items/{contract_id}/&#x60;  Alternate route: &#x60;/legacy/contracts/public/items/{contract_id}/&#x60;  Alternate route: &#x60;/v1/contracts/public/items/{contract_id}/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = ContractsApi()
val contractId : kotlin.Int = 56 // kotlin.Int | ID of a contract
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
try {
    val result : kotlin.Array<GetContractsPublicItemsContractId200Ok> = apiInstance.getContractsPublicItemsContractId(contractId, datasource, ifMinusNoneMinusMatch, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContractsApi#getContractsPublicItemsContractId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContractsApi#getContractsPublicItemsContractId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractId** | **kotlin.Int**| ID of a contract |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **kotlin.Int**| Which page of results to return | [optional] [default to 1]

### Return type

[**kotlin.Array&lt;GetContractsPublicItemsContractId200Ok&gt;**](GetContractsPublicItemsContractId200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getContractsPublicRegionId"></a>
# **getContractsPublicRegionId**
> kotlin.Array&lt;GetContractsPublicRegionId200Ok&gt; getContractsPublicRegionId(datasource, ifMinusNoneMinusMatch, page, regionId)

Get public contracts

Returns a paginated list of all public contracts in the given region  --- Alternate route: &#x60;/dev/contracts/public/{region_id}/&#x60;  Alternate route: &#x60;/legacy/contracts/public/{region_id}/&#x60;  Alternate route: &#x60;/v1/contracts/public/{region_id}/&#x60;  --- This route is cached for up to 1800 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = ContractsApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val regionId : kotlin.Int = 56 // kotlin.Int | An EVE region id
try {
    val result : kotlin.Array<GetContractsPublicRegionId200Ok> = apiInstance.getContractsPublicRegionId(datasource, ifMinusNoneMinusMatch, page, regionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContractsApi#getContractsPublicRegionId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContractsApi#getContractsPublicRegionId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **kotlin.Int**| Which page of results to return | [optional] [default to 1]
 **regionId** | **kotlin.Int**| An EVE region id |

### Return type

[**kotlin.Array&lt;GetContractsPublicRegionId200Ok&gt;**](GetContractsPublicRegionId200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdContracts"></a>
# **getCorporationsCorporationIdContracts**
> kotlin.Array&lt;GetCorporationsCorporationIdContracts200Ok&gt; getCorporationsCorporationIdContracts(corporationId, datasource, ifMinusNoneMinusMatch, page, token)

Get corporation contracts

Returns contracts available to a corporation, only if the corporation is issuer, acceptor or assignee. Only returns contracts no older than 30 days, or if the status is \&quot;in_progress\&quot;.  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/contracts/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/contracts/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/contracts/&#x60;  --- This route is cached for up to 300 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = ContractsApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdContracts200Ok> = apiInstance.getCorporationsCorporationIdContracts(corporationId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContractsApi#getCorporationsCorporationIdContracts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContractsApi#getCorporationsCorporationIdContracts")
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

[**kotlin.Array&lt;GetCorporationsCorporationIdContracts200Ok&gt;**](GetCorporationsCorporationIdContracts200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdContractsContractIdBids"></a>
# **getCorporationsCorporationIdContractsContractIdBids**
> kotlin.Array&lt;GetCorporationsCorporationIdContractsContractIdBids200Ok&gt; getCorporationsCorporationIdContractsContractIdBids(contractId, corporationId, datasource, ifMinusNoneMinusMatch, page, token)

Get corporation contract bids

Lists bids on a particular auction contract  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/contracts/{contract_id}/bids/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/contracts/{contract_id}/bids/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/contracts/{contract_id}/bids/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = ContractsApi()
val contractId : kotlin.Int = 56 // kotlin.Int | ID of a contract
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdContractsContractIdBids200Ok> = apiInstance.getCorporationsCorporationIdContractsContractIdBids(contractId, corporationId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContractsApi#getCorporationsCorporationIdContractsContractIdBids")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContractsApi#getCorporationsCorporationIdContractsContractIdBids")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractId** | **kotlin.Int**| ID of a contract |
 **corporationId** | **kotlin.Int**| An EVE corporation ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **kotlin.Int**| Which page of results to return | [optional] [default to 1]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**kotlin.Array&lt;GetCorporationsCorporationIdContractsContractIdBids200Ok&gt;**](GetCorporationsCorporationIdContractsContractIdBids200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdContractsContractIdItems"></a>
# **getCorporationsCorporationIdContractsContractIdItems**
> kotlin.Array&lt;GetCorporationsCorporationIdContractsContractIdItems200Ok&gt; getCorporationsCorporationIdContractsContractIdItems(contractId, corporationId, datasource, ifMinusNoneMinusMatch, token)

Get corporation contract items

Lists items of a particular contract  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/contracts/{contract_id}/items/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/contracts/{contract_id}/items/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/contracts/{contract_id}/items/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = ContractsApi()
val contractId : kotlin.Int = 56 // kotlin.Int | ID of a contract
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdContractsContractIdItems200Ok> = apiInstance.getCorporationsCorporationIdContractsContractIdItems(contractId, corporationId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContractsApi#getCorporationsCorporationIdContractsContractIdItems")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContractsApi#getCorporationsCorporationIdContractsContractIdItems")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractId** | **kotlin.Int**| ID of a contract |
 **corporationId** | **kotlin.Int**| An EVE corporation ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**kotlin.Array&lt;GetCorporationsCorporationIdContractsContractIdItems200Ok&gt;**](GetCorporationsCorporationIdContractsContractIdItems200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

