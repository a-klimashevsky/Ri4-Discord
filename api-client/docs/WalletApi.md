# WalletApi

All URIs are relative to *https://esi.evetech.net/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdWallet**](WalletApi.md#getCharactersCharacterIdWallet) | **GET** /characters/{character_id}/wallet/ | Get a character&#39;s wallet balance
[**getCharactersCharacterIdWalletJournal**](WalletApi.md#getCharactersCharacterIdWalletJournal) | **GET** /characters/{character_id}/wallet/journal/ | Get character wallet journal
[**getCharactersCharacterIdWalletTransactions**](WalletApi.md#getCharactersCharacterIdWalletTransactions) | **GET** /characters/{character_id}/wallet/transactions/ | Get wallet transactions
[**getCorporationsCorporationIdWallets**](WalletApi.md#getCorporationsCorporationIdWallets) | **GET** /corporations/{corporation_id}/wallets/ | Returns a corporation&#39;s wallet balance
[**getCorporationsCorporationIdWalletsDivisionJournal**](WalletApi.md#getCorporationsCorporationIdWalletsDivisionJournal) | **GET** /corporations/{corporation_id}/wallets/{division}/journal/ | Get corporation wallet journal
[**getCorporationsCorporationIdWalletsDivisionTransactions**](WalletApi.md#getCorporationsCorporationIdWalletsDivisionTransactions) | **GET** /corporations/{corporation_id}/wallets/{division}/transactions/ | Get corporation wallet transactions


<a name="getCharactersCharacterIdWallet"></a>
# **getCharactersCharacterIdWallet**
> kotlin.Double getCharactersCharacterIdWallet(characterId, datasource, ifMinusNoneMinusMatch, token)

Get a character&#39;s wallet balance

Returns a character&#39;s wallet balance  --- Alternate route: &#x60;/legacy/characters/{character_id}/wallet/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/wallet/&#x60;  --- This route is cached for up to 120 seconds  --- [Diff of the upcoming changes](https://esi.evetech.net/diff/latest/dev/#GET-/characters/{character_id}/wallet/)

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = WalletApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Double = apiInstance.getCharactersCharacterIdWallet(characterId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#getCharactersCharacterIdWallet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#getCharactersCharacterIdWallet")
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

**kotlin.Double**

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdWalletJournal"></a>
# **getCharactersCharacterIdWalletJournal**
> kotlin.Array&lt;GetCharactersCharacterIdWalletJournal200Ok&gt; getCharactersCharacterIdWalletJournal(characterId, datasource, ifMinusNoneMinusMatch, page, token)

Get character wallet journal

Retrieve the given character&#39;s wallet journal going 30 days back  --- Alternate route: &#x60;/dev/characters/{character_id}/wallet/journal/&#x60;  Alternate route: &#x60;/v6/characters/{character_id}/wallet/journal/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = WalletApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdWalletJournal200Ok> = apiInstance.getCharactersCharacterIdWalletJournal(characterId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#getCharactersCharacterIdWalletJournal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#getCharactersCharacterIdWalletJournal")
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

[**kotlin.Array&lt;GetCharactersCharacterIdWalletJournal200Ok&gt;**](GetCharactersCharacterIdWalletJournal200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdWalletTransactions"></a>
# **getCharactersCharacterIdWalletTransactions**
> kotlin.Array&lt;GetCharactersCharacterIdWalletTransactions200Ok&gt; getCharactersCharacterIdWalletTransactions(characterId, datasource, fromId, ifMinusNoneMinusMatch, token)

Get wallet transactions

Get wallet transactions of a character  --- Alternate route: &#x60;/dev/characters/{character_id}/wallet/transactions/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/wallet/transactions/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/wallet/transactions/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = WalletApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val fromId : kotlin.Long = 789 // kotlin.Long | Only show transactions happened before the one referenced by this id
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdWalletTransactions200Ok> = apiInstance.getCharactersCharacterIdWalletTransactions(characterId, datasource, fromId, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#getCharactersCharacterIdWalletTransactions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#getCharactersCharacterIdWalletTransactions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **fromId** | **kotlin.Long**| Only show transactions happened before the one referenced by this id | [optional]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**kotlin.Array&lt;GetCharactersCharacterIdWalletTransactions200Ok&gt;**](GetCharactersCharacterIdWalletTransactions200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdWallets"></a>
# **getCorporationsCorporationIdWallets**
> kotlin.Array&lt;GetCorporationsCorporationIdWallets200Ok&gt; getCorporationsCorporationIdWallets(corporationId, datasource, ifMinusNoneMinusMatch, token)

Returns a corporation&#39;s wallet balance

Get a corporation&#39;s wallets  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/wallets/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/wallets/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/wallets/&#x60;  --- This route is cached for up to 300 seconds  --- Requires one of the following EVE corporation role(s): Accountant, Junior_Accountant 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = WalletApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdWallets200Ok> = apiInstance.getCorporationsCorporationIdWallets(corporationId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#getCorporationsCorporationIdWallets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#getCorporationsCorporationIdWallets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **kotlin.Int**| An EVE corporation ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**kotlin.Array&lt;GetCorporationsCorporationIdWallets200Ok&gt;**](GetCorporationsCorporationIdWallets200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdWalletsDivisionJournal"></a>
# **getCorporationsCorporationIdWalletsDivisionJournal**
> kotlin.Array&lt;GetCorporationsCorporationIdWalletsDivisionJournal200Ok&gt; getCorporationsCorporationIdWalletsDivisionJournal(corporationId, datasource, division, ifMinusNoneMinusMatch, page, token)

Get corporation wallet journal

Retrieve the given corporation&#39;s wallet journal for the given division going 30 days back  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/wallets/{division}/journal/&#x60;  Alternate route: &#x60;/v4/corporations/{corporation_id}/wallets/{division}/journal/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Accountant, Junior_Accountant 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = WalletApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val division : kotlin.Int = 56 // kotlin.Int | Wallet key of the division to fetch journals from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdWalletsDivisionJournal200Ok> = apiInstance.getCorporationsCorporationIdWalletsDivisionJournal(corporationId, datasource, division, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#getCorporationsCorporationIdWalletsDivisionJournal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#getCorporationsCorporationIdWalletsDivisionJournal")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **kotlin.Int**| An EVE corporation ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **division** | **kotlin.Int**| Wallet key of the division to fetch journals from |
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **kotlin.Int**| Which page of results to return | [optional] [default to 1]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**kotlin.Array&lt;GetCorporationsCorporationIdWalletsDivisionJournal200Ok&gt;**](GetCorporationsCorporationIdWalletsDivisionJournal200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdWalletsDivisionTransactions"></a>
# **getCorporationsCorporationIdWalletsDivisionTransactions**
> kotlin.Array&lt;GetCorporationsCorporationIdWalletsDivisionTransactions200Ok&gt; getCorporationsCorporationIdWalletsDivisionTransactions(corporationId, datasource, division, fromId, ifMinusNoneMinusMatch, token)

Get corporation wallet transactions

Get wallet transactions of a corporation  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/wallets/{division}/transactions/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/wallets/{division}/transactions/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/wallets/{division}/transactions/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Accountant, Junior_Accountant 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = WalletApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val division : kotlin.Int = 56 // kotlin.Int | Wallet key of the division to fetch journals from
val fromId : kotlin.Long = 789 // kotlin.Long | Only show journal entries happened before the transaction referenced by this id
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdWalletsDivisionTransactions200Ok> = apiInstance.getCorporationsCorporationIdWalletsDivisionTransactions(corporationId, datasource, division, fromId, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletApi#getCorporationsCorporationIdWalletsDivisionTransactions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletApi#getCorporationsCorporationIdWalletsDivisionTransactions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **kotlin.Int**| An EVE corporation ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **division** | **kotlin.Int**| Wallet key of the division to fetch journals from |
 **fromId** | **kotlin.Long**| Only show journal entries happened before the transaction referenced by this id | [optional]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**kotlin.Array&lt;GetCorporationsCorporationIdWalletsDivisionTransactions200Ok&gt;**](GetCorporationsCorporationIdWalletsDivisionTransactions200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

