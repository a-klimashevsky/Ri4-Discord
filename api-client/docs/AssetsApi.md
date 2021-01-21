# AssetsApi

All URIs are relative to *https://esi.evetech.net/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdAssets**](AssetsApi.md#getCharactersCharacterIdAssets) | **GET** /characters/{character_id}/assets/ | Get character assets
[**getCorporationsCorporationIdAssets**](AssetsApi.md#getCorporationsCorporationIdAssets) | **GET** /corporations/{corporation_id}/assets/ | Get corporation assets
[**postCharactersCharacterIdAssetsLocations**](AssetsApi.md#postCharactersCharacterIdAssetsLocations) | **POST** /characters/{character_id}/assets/locations/ | Get character asset locations
[**postCharactersCharacterIdAssetsNames**](AssetsApi.md#postCharactersCharacterIdAssetsNames) | **POST** /characters/{character_id}/assets/names/ | Get character asset names
[**postCorporationsCorporationIdAssetsLocations**](AssetsApi.md#postCorporationsCorporationIdAssetsLocations) | **POST** /corporations/{corporation_id}/assets/locations/ | Get corporation asset locations
[**postCorporationsCorporationIdAssetsNames**](AssetsApi.md#postCorporationsCorporationIdAssetsNames) | **POST** /corporations/{corporation_id}/assets/names/ | Get corporation asset names


<a name="getCharactersCharacterIdAssets"></a>
# **getCharactersCharacterIdAssets**
> kotlin.Array&lt;GetCharactersCharacterIdAssets200Ok&gt; getCharactersCharacterIdAssets(characterId, datasource, ifMinusNoneMinusMatch, page, token)

Get character assets

Return a list of the characters assets  --- Alternate route: &#x60;/dev/characters/{character_id}/assets/&#x60;  Alternate route: &#x60;/v5/characters/{character_id}/assets/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = AssetsApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdAssets200Ok> = apiInstance.getCharactersCharacterIdAssets(characterId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getCharactersCharacterIdAssets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getCharactersCharacterIdAssets")
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

[**kotlin.Array&lt;GetCharactersCharacterIdAssets200Ok&gt;**](GetCharactersCharacterIdAssets200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdAssets"></a>
# **getCorporationsCorporationIdAssets**
> kotlin.Array&lt;GetCorporationsCorporationIdAssets200Ok&gt; getCorporationsCorporationIdAssets(corporationId, datasource, ifMinusNoneMinusMatch, page, token)

Get corporation assets

Return a list of the corporation assets  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/assets/&#x60;  Alternate route: &#x60;/v5/corporations/{corporation_id}/assets/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = AssetsApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdAssets200Ok> = apiInstance.getCorporationsCorporationIdAssets(corporationId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getCorporationsCorporationIdAssets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getCorporationsCorporationIdAssets")
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

[**kotlin.Array&lt;GetCorporationsCorporationIdAssets200Ok&gt;**](GetCorporationsCorporationIdAssets200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postCharactersCharacterIdAssetsLocations"></a>
# **postCharactersCharacterIdAssetsLocations**
> kotlin.Array&lt;PostCharactersCharacterIdAssetsLocations200Ok&gt; postCharactersCharacterIdAssetsLocations(characterId, datasource, token, itemIds)

Get character asset locations

Return locations for a set of item ids, which you can get from character assets endpoint. Coordinates for items in hangars or stations are set to (0,0,0)  --- Alternate route: &#x60;/dev/characters/{character_id}/assets/locations/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/assets/locations/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = AssetsApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
val itemIds : kotlin.collections.Set<kotlin.Long> =  // kotlin.collections.Set<kotlin.Long> | A list of item ids
try {
    val result : kotlin.Array<PostCharactersCharacterIdAssetsLocations200Ok> = apiInstance.postCharactersCharacterIdAssetsLocations(characterId, datasource, token, itemIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#postCharactersCharacterIdAssetsLocations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#postCharactersCharacterIdAssetsLocations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]
 **itemIds** | [**kotlin.collections.Set&lt;kotlin.Long&gt;**](kotlin.Long.md)| A list of item ids |

### Return type

[**kotlin.Array&lt;PostCharactersCharacterIdAssetsLocations200Ok&gt;**](PostCharactersCharacterIdAssetsLocations200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCharactersCharacterIdAssetsNames"></a>
# **postCharactersCharacterIdAssetsNames**
> kotlin.Array&lt;PostCharactersCharacterIdAssetsNames200Ok&gt; postCharactersCharacterIdAssetsNames(characterId, datasource, token, itemIds)

Get character asset names

Return names for a set of item ids, which you can get from character assets endpoint. Typically used for items that can customize names, like containers or ships.  --- Alternate route: &#x60;/dev/characters/{character_id}/assets/names/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/assets/names/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/assets/names/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = AssetsApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
val itemIds : kotlin.collections.Set<kotlin.Long> =  // kotlin.collections.Set<kotlin.Long> | A list of item ids
try {
    val result : kotlin.Array<PostCharactersCharacterIdAssetsNames200Ok> = apiInstance.postCharactersCharacterIdAssetsNames(characterId, datasource, token, itemIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#postCharactersCharacterIdAssetsNames")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#postCharactersCharacterIdAssetsNames")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]
 **itemIds** | [**kotlin.collections.Set&lt;kotlin.Long&gt;**](kotlin.Long.md)| A list of item ids |

### Return type

[**kotlin.Array&lt;PostCharactersCharacterIdAssetsNames200Ok&gt;**](PostCharactersCharacterIdAssetsNames200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCorporationsCorporationIdAssetsLocations"></a>
# **postCorporationsCorporationIdAssetsLocations**
> kotlin.Array&lt;PostCorporationsCorporationIdAssetsLocations200Ok&gt; postCorporationsCorporationIdAssetsLocations(corporationId, datasource, token, itemIds)

Get corporation asset locations

Return locations for a set of item ids, which you can get from corporation assets endpoint. Coordinates for items in hangars or stations are set to (0,0,0)  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/assets/locations/&#x60;  Alternate route: &#x60;/v2/corporations/{corporation_id}/assets/locations/&#x60;   --- Requires one of the following EVE corporation role(s): Director 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = AssetsApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
val itemIds : kotlin.collections.Set<kotlin.Long> =  // kotlin.collections.Set<kotlin.Long> | A list of item ids
try {
    val result : kotlin.Array<PostCorporationsCorporationIdAssetsLocations200Ok> = apiInstance.postCorporationsCorporationIdAssetsLocations(corporationId, datasource, token, itemIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#postCorporationsCorporationIdAssetsLocations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#postCorporationsCorporationIdAssetsLocations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **kotlin.Int**| An EVE corporation ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]
 **itemIds** | [**kotlin.collections.Set&lt;kotlin.Long&gt;**](kotlin.Long.md)| A list of item ids |

### Return type

[**kotlin.Array&lt;PostCorporationsCorporationIdAssetsLocations200Ok&gt;**](PostCorporationsCorporationIdAssetsLocations200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCorporationsCorporationIdAssetsNames"></a>
# **postCorporationsCorporationIdAssetsNames**
> kotlin.Array&lt;PostCorporationsCorporationIdAssetsNames200Ok&gt; postCorporationsCorporationIdAssetsNames(corporationId, datasource, token, itemIds)

Get corporation asset names

Return names for a set of item ids, which you can get from corporation assets endpoint. Only valid for items that can customize names, like containers or ships  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/assets/names/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/assets/names/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/assets/names/&#x60;   --- Requires one of the following EVE corporation role(s): Director 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = AssetsApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
val itemIds : kotlin.collections.Set<kotlin.Long> =  // kotlin.collections.Set<kotlin.Long> | A list of item ids
try {
    val result : kotlin.Array<PostCorporationsCorporationIdAssetsNames200Ok> = apiInstance.postCorporationsCorporationIdAssetsNames(corporationId, datasource, token, itemIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#postCorporationsCorporationIdAssetsNames")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#postCorporationsCorporationIdAssetsNames")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **kotlin.Int**| An EVE corporation ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]
 **itemIds** | [**kotlin.collections.Set&lt;kotlin.Long&gt;**](kotlin.Long.md)| A list of item ids |

### Return type

[**kotlin.Array&lt;PostCorporationsCorporationIdAssetsNames200Ok&gt;**](PostCorporationsCorporationIdAssetsNames200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

