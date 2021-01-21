# FittingsApi

All URIs are relative to *https://esi.evetech.net/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCharactersCharacterIdFittingsFittingId**](FittingsApi.md#deleteCharactersCharacterIdFittingsFittingId) | **DELETE** /characters/{character_id}/fittings/{fitting_id}/ | Delete fitting
[**getCharactersCharacterIdFittings**](FittingsApi.md#getCharactersCharacterIdFittings) | **GET** /characters/{character_id}/fittings/ | Get fittings
[**postCharactersCharacterIdFittings**](FittingsApi.md#postCharactersCharacterIdFittings) | **POST** /characters/{character_id}/fittings/ | Create fitting


<a name="deleteCharactersCharacterIdFittingsFittingId"></a>
# **deleteCharactersCharacterIdFittingsFittingId**
> deleteCharactersCharacterIdFittingsFittingId(characterId, datasource, fittingId, token)

Delete fitting

Delete a fitting from a character  --- Alternate route: &#x60;/dev/characters/{character_id}/fittings/{fitting_id}/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/fittings/{fitting_id}/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/fittings/{fitting_id}/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = FittingsApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val fittingId : kotlin.Int = 56 // kotlin.Int | ID for a fitting of this character
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    apiInstance.deleteCharactersCharacterIdFittingsFittingId(characterId, datasource, fittingId, token)
} catch (e: ClientException) {
    println("4xx response calling FittingsApi#deleteCharactersCharacterIdFittingsFittingId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FittingsApi#deleteCharactersCharacterIdFittingsFittingId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **fittingId** | **kotlin.Int**| ID for a fitting of this character |
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

null (empty response body)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdFittings"></a>
# **getCharactersCharacterIdFittings**
> kotlin.Array&lt;GetCharactersCharacterIdFittings200Ok&gt; getCharactersCharacterIdFittings(characterId, datasource, ifMinusNoneMinusMatch, token)

Get fittings

Return fittings of a character  --- Alternate route: &#x60;/dev/characters/{character_id}/fittings/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/fittings/&#x60;  --- This route is cached for up to 300 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = FittingsApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdFittings200Ok> = apiInstance.getCharactersCharacterIdFittings(characterId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FittingsApi#getCharactersCharacterIdFittings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FittingsApi#getCharactersCharacterIdFittings")
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

[**kotlin.Array&lt;GetCharactersCharacterIdFittings200Ok&gt;**](GetCharactersCharacterIdFittings200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postCharactersCharacterIdFittings"></a>
# **postCharactersCharacterIdFittings**
> PostCharactersCharacterIdFittingsCreated postCharactersCharacterIdFittings(characterId, datasource, token, fitting)

Create fitting

Save a new fitting for a character  --- Alternate route: &#x60;/dev/characters/{character_id}/fittings/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/fittings/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = FittingsApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
val fitting : PostCharactersCharacterIdFittingsFitting =  // PostCharactersCharacterIdFittingsFitting | 
try {
    val result : PostCharactersCharacterIdFittingsCreated = apiInstance.postCharactersCharacterIdFittings(characterId, datasource, token, fitting)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FittingsApi#postCharactersCharacterIdFittings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FittingsApi#postCharactersCharacterIdFittings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]
 **fitting** | [**PostCharactersCharacterIdFittingsFitting**](PostCharactersCharacterIdFittingsFitting.md)|  |

### Return type

[**PostCharactersCharacterIdFittingsCreated**](PostCharactersCharacterIdFittingsCreated.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

