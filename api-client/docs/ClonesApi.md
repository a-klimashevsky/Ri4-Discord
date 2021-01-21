# ClonesApi

All URIs are relative to *https://esi.evetech.net/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdClones**](ClonesApi.md#getCharactersCharacterIdClones) | **GET** /characters/{character_id}/clones/ | Get clones
[**getCharactersCharacterIdImplants**](ClonesApi.md#getCharactersCharacterIdImplants) | **GET** /characters/{character_id}/implants/ | Get active implants


<a name="getCharactersCharacterIdClones"></a>
# **getCharactersCharacterIdClones**
> GetCharactersCharacterIdClonesOk getCharactersCharacterIdClones(characterId, datasource, ifMinusNoneMinusMatch, token)

Get clones

A list of the character&#39;s clones  --- Alternate route: &#x60;/dev/characters/{character_id}/clones/&#x60;  Alternate route: &#x60;/v3/characters/{character_id}/clones/&#x60;  Alternate route: &#x60;/v4/characters/{character_id}/clones/&#x60;  --- This route is cached for up to 120 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = ClonesApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : GetCharactersCharacterIdClonesOk = apiInstance.getCharactersCharacterIdClones(characterId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClonesApi#getCharactersCharacterIdClones")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClonesApi#getCharactersCharacterIdClones")
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

[**GetCharactersCharacterIdClonesOk**](GetCharactersCharacterIdClonesOk.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdImplants"></a>
# **getCharactersCharacterIdImplants**
> kotlin.Array&lt;kotlin.Int&gt; getCharactersCharacterIdImplants(characterId, datasource, ifMinusNoneMinusMatch, token)

Get active implants

Return implants on the active clone of a character  --- Alternate route: &#x60;/dev/characters/{character_id}/implants/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/implants/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/implants/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/implants/&#x60;  --- This route is cached for up to 120 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = ClonesApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<kotlin.Int> = apiInstance.getCharactersCharacterIdImplants(characterId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClonesApi#getCharactersCharacterIdImplants")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClonesApi#getCharactersCharacterIdImplants")
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

**kotlin.Array&lt;kotlin.Int&gt;**

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

