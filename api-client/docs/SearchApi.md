# SearchApi

All URIs are relative to *https://esi.evetech.net/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdSearch**](SearchApi.md#getCharactersCharacterIdSearch) | **GET** /characters/{character_id}/search/ | Search on a string
[**getSearch**](SearchApi.md#getSearch) | **GET** /search/ | Search on a string


<a name="getCharactersCharacterIdSearch"></a>
# **getCharactersCharacterIdSearch**
> GetCharactersCharacterIdSearchOk getCharactersCharacterIdSearch(acceptMinusLanguage, categories, characterId, datasource, ifMinusNoneMinusMatch, language, search, strict, token)

Search on a string

Search for entities that match a given sub-string.  --- Alternate route: &#x60;/dev/characters/{character_id}/search/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/search/&#x60;  Alternate route: &#x60;/v3/characters/{character_id}/search/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = SearchApi()
val acceptMinusLanguage : kotlin.String = acceptMinusLanguage_example // kotlin.String | Language to use in the response
val categories : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Type of entities to search for
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val language : kotlin.String = language_example // kotlin.String | Language to use in the response, takes precedence over Accept-Language
val search : kotlin.String = search_example // kotlin.String | The string to search on
val strict : kotlin.Boolean = true // kotlin.Boolean | Whether the search should be a strict match
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : GetCharactersCharacterIdSearchOk = apiInstance.getCharactersCharacterIdSearch(acceptMinusLanguage, categories, characterId, datasource, ifMinusNoneMinusMatch, language, search, strict, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#getCharactersCharacterIdSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#getCharactersCharacterIdSearch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptMinusLanguage** | **kotlin.String**| Language to use in the response | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **categories** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| Type of entities to search for | [enum: agent, alliance, character, constellation, corporation, faction, inventory_type, region, solar_system, station, structure]
 **characterId** | **kotlin.Int**| An EVE character ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **language** | **kotlin.String**| Language to use in the response, takes precedence over Accept-Language | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **search** | **kotlin.String**| The string to search on |
 **strict** | **kotlin.Boolean**| Whether the search should be a strict match | [optional] [default to false]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**GetCharactersCharacterIdSearchOk**](GetCharactersCharacterIdSearchOk.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSearch"></a>
# **getSearch**
> GetSearchOk getSearch(acceptMinusLanguage, categories, datasource, ifMinusNoneMinusMatch, language, search, strict)

Search on a string

Search for entities that match a given sub-string.  --- Alternate route: &#x60;/dev/search/&#x60;  Alternate route: &#x60;/legacy/search/&#x60;  Alternate route: &#x60;/v2/search/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = SearchApi()
val acceptMinusLanguage : kotlin.String = acceptMinusLanguage_example // kotlin.String | Language to use in the response
val categories : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Type of entities to search for
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val language : kotlin.String = language_example // kotlin.String | Language to use in the response, takes precedence over Accept-Language
val search : kotlin.String = search_example // kotlin.String | The string to search on
val strict : kotlin.Boolean = true // kotlin.Boolean | Whether the search should be a strict match
try {
    val result : GetSearchOk = apiInstance.getSearch(acceptMinusLanguage, categories, datasource, ifMinusNoneMinusMatch, language, search, strict)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#getSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#getSearch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptMinusLanguage** | **kotlin.String**| Language to use in the response | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **categories** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| Type of entities to search for | [enum: agent, alliance, character, constellation, corporation, faction, inventory_type, region, solar_system, station]
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **language** | **kotlin.String**| Language to use in the response, takes precedence over Accept-Language | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **search** | **kotlin.String**| The string to search on |
 **strict** | **kotlin.Boolean**| Whether the search should be a strict match | [optional] [default to false]

### Return type

[**GetSearchOk**](GetSearchOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

