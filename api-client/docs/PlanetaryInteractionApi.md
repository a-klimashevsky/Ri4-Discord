# PlanetaryInteractionApi

All URIs are relative to *https://esi.evetech.net/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdPlanets**](PlanetaryInteractionApi.md#getCharactersCharacterIdPlanets) | **GET** /characters/{character_id}/planets/ | Get colonies
[**getCharactersCharacterIdPlanetsPlanetId**](PlanetaryInteractionApi.md#getCharactersCharacterIdPlanetsPlanetId) | **GET** /characters/{character_id}/planets/{planet_id}/ | Get colony layout
[**getCorporationsCorporationIdCustomsOffices**](PlanetaryInteractionApi.md#getCorporationsCorporationIdCustomsOffices) | **GET** /corporations/{corporation_id}/customs_offices/ | List corporation customs offices
[**getUniverseSchematicsSchematicId**](PlanetaryInteractionApi.md#getUniverseSchematicsSchematicId) | **GET** /universe/schematics/{schematic_id}/ | Get schematic information


<a name="getCharactersCharacterIdPlanets"></a>
# **getCharactersCharacterIdPlanets**
> kotlin.Array&lt;GetCharactersCharacterIdPlanets200Ok&gt; getCharactersCharacterIdPlanets(characterId, datasource, ifMinusNoneMinusMatch, token)

Get colonies

Returns a list of all planetary colonies owned by a character.  --- Alternate route: &#x60;/dev/characters/{character_id}/planets/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/planets/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/planets/&#x60;  --- This route is cached for up to 600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = PlanetaryInteractionApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdPlanets200Ok> = apiInstance.getCharactersCharacterIdPlanets(characterId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlanetaryInteractionApi#getCharactersCharacterIdPlanets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlanetaryInteractionApi#getCharactersCharacterIdPlanets")
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

[**kotlin.Array&lt;GetCharactersCharacterIdPlanets200Ok&gt;**](GetCharactersCharacterIdPlanets200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdPlanetsPlanetId"></a>
# **getCharactersCharacterIdPlanetsPlanetId**
> GetCharactersCharacterIdPlanetsPlanetIdOk getCharactersCharacterIdPlanetsPlanetId(characterId, datasource, planetId, token)

Get colony layout

Returns full details on the layout of a single planetary colony, including links, pins and routes. Note: Planetary information is only recalculated when the colony is viewed through the client. Information will not update until this criteria is met.  --- Alternate route: &#x60;/dev/characters/{character_id}/planets/{planet_id}/&#x60;  Alternate route: &#x60;/v3/characters/{character_id}/planets/{planet_id}/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = PlanetaryInteractionApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val planetId : kotlin.Int = 56 // kotlin.Int | Planet id of the target planet
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : GetCharactersCharacterIdPlanetsPlanetIdOk = apiInstance.getCharactersCharacterIdPlanetsPlanetId(characterId, datasource, planetId, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlanetaryInteractionApi#getCharactersCharacterIdPlanetsPlanetId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlanetaryInteractionApi#getCharactersCharacterIdPlanetsPlanetId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **planetId** | **kotlin.Int**| Planet id of the target planet |
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**GetCharactersCharacterIdPlanetsPlanetIdOk**](GetCharactersCharacterIdPlanetsPlanetIdOk.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdCustomsOffices"></a>
# **getCorporationsCorporationIdCustomsOffices**
> kotlin.Array&lt;GetCorporationsCorporationIdCustomsOffices200Ok&gt; getCorporationsCorporationIdCustomsOffices(corporationId, datasource, ifMinusNoneMinusMatch, page, token)

List corporation customs offices

List customs offices owned by a corporation  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/customs_offices/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/customs_offices/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/customs_offices/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = PlanetaryInteractionApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdCustomsOffices200Ok> = apiInstance.getCorporationsCorporationIdCustomsOffices(corporationId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlanetaryInteractionApi#getCorporationsCorporationIdCustomsOffices")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlanetaryInteractionApi#getCorporationsCorporationIdCustomsOffices")
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

[**kotlin.Array&lt;GetCorporationsCorporationIdCustomsOffices200Ok&gt;**](GetCorporationsCorporationIdCustomsOffices200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseSchematicsSchematicId"></a>
# **getUniverseSchematicsSchematicId**
> GetUniverseSchematicsSchematicIdOk getUniverseSchematicsSchematicId(datasource, ifMinusNoneMinusMatch, schematicId)

Get schematic information

Get information on a planetary factory schematic  --- Alternate route: &#x60;/dev/universe/schematics/{schematic_id}/&#x60;  Alternate route: &#x60;/legacy/universe/schematics/{schematic_id}/&#x60;  Alternate route: &#x60;/v1/universe/schematics/{schematic_id}/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = PlanetaryInteractionApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val schematicId : kotlin.Int = 56 // kotlin.Int | A PI schematic ID
try {
    val result : GetUniverseSchematicsSchematicIdOk = apiInstance.getUniverseSchematicsSchematicId(datasource, ifMinusNoneMinusMatch, schematicId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlanetaryInteractionApi#getUniverseSchematicsSchematicId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlanetaryInteractionApi#getUniverseSchematicsSchematicId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **schematicId** | **kotlin.Int**| A PI schematic ID |

### Return type

[**GetUniverseSchematicsSchematicIdOk**](GetUniverseSchematicsSchematicIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

