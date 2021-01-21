# KillmailsApi

All URIs are relative to *https://esi.evetech.net/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdKillmailsRecent**](KillmailsApi.md#getCharactersCharacterIdKillmailsRecent) | **GET** /characters/{character_id}/killmails/recent/ | Get a character&#39;s recent kills and losses
[**getCorporationsCorporationIdKillmailsRecent**](KillmailsApi.md#getCorporationsCorporationIdKillmailsRecent) | **GET** /corporations/{corporation_id}/killmails/recent/ | Get a corporation&#39;s recent kills and losses
[**getKillmailsKillmailIdKillmailHash**](KillmailsApi.md#getKillmailsKillmailIdKillmailHash) | **GET** /killmails/{killmail_id}/{killmail_hash}/ | Get a single killmail


<a name="getCharactersCharacterIdKillmailsRecent"></a>
# **getCharactersCharacterIdKillmailsRecent**
> kotlin.Array&lt;GetCharactersCharacterIdKillmailsRecent200Ok&gt; getCharactersCharacterIdKillmailsRecent(characterId, datasource, ifMinusNoneMinusMatch, page, token)

Get a character&#39;s recent kills and losses

Return a list of a character&#39;s kills and losses going back 90 days  --- Alternate route: &#x60;/dev/characters/{character_id}/killmails/recent/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/killmails/recent/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/killmails/recent/&#x60;  --- This route is cached for up to 300 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = KillmailsApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdKillmailsRecent200Ok> = apiInstance.getCharactersCharacterIdKillmailsRecent(characterId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KillmailsApi#getCharactersCharacterIdKillmailsRecent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KillmailsApi#getCharactersCharacterIdKillmailsRecent")
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

[**kotlin.Array&lt;GetCharactersCharacterIdKillmailsRecent200Ok&gt;**](GetCharactersCharacterIdKillmailsRecent200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdKillmailsRecent"></a>
# **getCorporationsCorporationIdKillmailsRecent**
> kotlin.Array&lt;GetCorporationsCorporationIdKillmailsRecent200Ok&gt; getCorporationsCorporationIdKillmailsRecent(corporationId, datasource, ifMinusNoneMinusMatch, page, token)

Get a corporation&#39;s recent kills and losses

Get a list of a corporation&#39;s kills and losses going back 90 days  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/killmails/recent/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/killmails/recent/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/killmails/recent/&#x60;  --- This route is cached for up to 300 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = KillmailsApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdKillmailsRecent200Ok> = apiInstance.getCorporationsCorporationIdKillmailsRecent(corporationId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KillmailsApi#getCorporationsCorporationIdKillmailsRecent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KillmailsApi#getCorporationsCorporationIdKillmailsRecent")
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

[**kotlin.Array&lt;GetCorporationsCorporationIdKillmailsRecent200Ok&gt;**](GetCorporationsCorporationIdKillmailsRecent200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getKillmailsKillmailIdKillmailHash"></a>
# **getKillmailsKillmailIdKillmailHash**
> GetKillmailsKillmailIdKillmailHashOk getKillmailsKillmailIdKillmailHash(datasource, ifMinusNoneMinusMatch, killmailHash, killmailId)

Get a single killmail

Return a single killmail from its ID and hash  --- Alternate route: &#x60;/dev/killmails/{killmail_id}/{killmail_hash}/&#x60;  Alternate route: &#x60;/legacy/killmails/{killmail_id}/{killmail_hash}/&#x60;  Alternate route: &#x60;/v1/killmails/{killmail_id}/{killmail_hash}/&#x60;  --- This route is cached for up to 30758400 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = KillmailsApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val killmailHash : kotlin.String = killmailHash_example // kotlin.String | The killmail hash for verification
val killmailId : kotlin.Int = 56 // kotlin.Int | The killmail ID to be queried
try {
    val result : GetKillmailsKillmailIdKillmailHashOk = apiInstance.getKillmailsKillmailIdKillmailHash(datasource, ifMinusNoneMinusMatch, killmailHash, killmailId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KillmailsApi#getKillmailsKillmailIdKillmailHash")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KillmailsApi#getKillmailsKillmailIdKillmailHash")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **killmailHash** | **kotlin.String**| The killmail hash for verification |
 **killmailId** | **kotlin.Int**| The killmail ID to be queried |

### Return type

[**GetKillmailsKillmailIdKillmailHashOk**](GetKillmailsKillmailIdKillmailHashOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

