# LocationApi

All URIs are relative to *https://esi.evetech.net/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdLocation**](LocationApi.md#getCharactersCharacterIdLocation) | **GET** /characters/{character_id}/location/ | Get character location
[**getCharactersCharacterIdOnline**](LocationApi.md#getCharactersCharacterIdOnline) | **GET** /characters/{character_id}/online/ | Get character online
[**getCharactersCharacterIdShip**](LocationApi.md#getCharactersCharacterIdShip) | **GET** /characters/{character_id}/ship/ | Get current ship


<a name="getCharactersCharacterIdLocation"></a>
# **getCharactersCharacterIdLocation**
> GetCharactersCharacterIdLocationOk getCharactersCharacterIdLocation(characterId, datasource, ifMinusNoneMinusMatch, token)

Get character location

Information about the characters current location. Returns the current solar system id, and also the current station or structure ID if applicable  --- Alternate route: &#x60;/dev/characters/{character_id}/location/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/location/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/location/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/location/&#x60;  --- This route is cached for up to 5 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = LocationApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : GetCharactersCharacterIdLocationOk = apiInstance.getCharactersCharacterIdLocation(characterId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationApi#getCharactersCharacterIdLocation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationApi#getCharactersCharacterIdLocation")
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

[**GetCharactersCharacterIdLocationOk**](GetCharactersCharacterIdLocationOk.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdOnline"></a>
# **getCharactersCharacterIdOnline**
> GetCharactersCharacterIdOnlineOk getCharactersCharacterIdOnline(characterId, datasource, ifMinusNoneMinusMatch, token)

Get character online

Checks if the character is currently online  --- Alternate route: &#x60;/dev/characters/{character_id}/online/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/online/&#x60;  Alternate route: &#x60;/v3/characters/{character_id}/online/&#x60;  --- This route is cached for up to 60 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = LocationApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : GetCharactersCharacterIdOnlineOk = apiInstance.getCharactersCharacterIdOnline(characterId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationApi#getCharactersCharacterIdOnline")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationApi#getCharactersCharacterIdOnline")
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

[**GetCharactersCharacterIdOnlineOk**](GetCharactersCharacterIdOnlineOk.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdShip"></a>
# **getCharactersCharacterIdShip**
> GetCharactersCharacterIdShipOk getCharactersCharacterIdShip(characterId, datasource, ifMinusNoneMinusMatch, token)

Get current ship

Get the current ship type, name and id  --- Alternate route: &#x60;/dev/characters/{character_id}/ship/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/ship/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/ship/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/ship/&#x60;  --- This route is cached for up to 5 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = LocationApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : GetCharactersCharacterIdShipOk = apiInstance.getCharactersCharacterIdShip(characterId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationApi#getCharactersCharacterIdShip")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationApi#getCharactersCharacterIdShip")
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

[**GetCharactersCharacterIdShipOk**](GetCharactersCharacterIdShipOk.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

