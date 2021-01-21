# BookmarksApi

All URIs are relative to *https://esi.evetech.net/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdBookmarks**](BookmarksApi.md#getCharactersCharacterIdBookmarks) | **GET** /characters/{character_id}/bookmarks/ | List bookmarks
[**getCharactersCharacterIdBookmarksFolders**](BookmarksApi.md#getCharactersCharacterIdBookmarksFolders) | **GET** /characters/{character_id}/bookmarks/folders/ | List bookmark folders
[**getCorporationsCorporationIdBookmarks**](BookmarksApi.md#getCorporationsCorporationIdBookmarks) | **GET** /corporations/{corporation_id}/bookmarks/ | List corporation bookmarks
[**getCorporationsCorporationIdBookmarksFolders**](BookmarksApi.md#getCorporationsCorporationIdBookmarksFolders) | **GET** /corporations/{corporation_id}/bookmarks/folders/ | List corporation bookmark folders


<a name="getCharactersCharacterIdBookmarks"></a>
# **getCharactersCharacterIdBookmarks**
> kotlin.Array&lt;GetCharactersCharacterIdBookmarks200Ok&gt; getCharactersCharacterIdBookmarks(characterId, datasource, ifMinusNoneMinusMatch, page, token)

List bookmarks

A list of your character&#39;s personal bookmarks  --- Alternate route: &#x60;/dev/characters/{character_id}/bookmarks/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/bookmarks/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = BookmarksApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdBookmarks200Ok> = apiInstance.getCharactersCharacterIdBookmarks(characterId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookmarksApi#getCharactersCharacterIdBookmarks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookmarksApi#getCharactersCharacterIdBookmarks")
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

[**kotlin.Array&lt;GetCharactersCharacterIdBookmarks200Ok&gt;**](GetCharactersCharacterIdBookmarks200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdBookmarksFolders"></a>
# **getCharactersCharacterIdBookmarksFolders**
> kotlin.Array&lt;GetCharactersCharacterIdBookmarksFolders200Ok&gt; getCharactersCharacterIdBookmarksFolders(characterId, datasource, ifMinusNoneMinusMatch, page, token)

List bookmark folders

A list of your character&#39;s personal bookmark folders  --- Alternate route: &#x60;/dev/characters/{character_id}/bookmarks/folders/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/bookmarks/folders/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = BookmarksApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdBookmarksFolders200Ok> = apiInstance.getCharactersCharacterIdBookmarksFolders(characterId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookmarksApi#getCharactersCharacterIdBookmarksFolders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookmarksApi#getCharactersCharacterIdBookmarksFolders")
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

[**kotlin.Array&lt;GetCharactersCharacterIdBookmarksFolders200Ok&gt;**](GetCharactersCharacterIdBookmarksFolders200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdBookmarks"></a>
# **getCorporationsCorporationIdBookmarks**
> kotlin.Array&lt;GetCorporationsCorporationIdBookmarks200Ok&gt; getCorporationsCorporationIdBookmarks(corporationId, datasource, ifMinusNoneMinusMatch, page, token)

List corporation bookmarks

A list of your corporation&#39;s bookmarks  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/bookmarks/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/bookmarks/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/bookmarks/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = BookmarksApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdBookmarks200Ok> = apiInstance.getCorporationsCorporationIdBookmarks(corporationId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookmarksApi#getCorporationsCorporationIdBookmarks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookmarksApi#getCorporationsCorporationIdBookmarks")
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

[**kotlin.Array&lt;GetCorporationsCorporationIdBookmarks200Ok&gt;**](GetCorporationsCorporationIdBookmarks200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdBookmarksFolders"></a>
# **getCorporationsCorporationIdBookmarksFolders**
> kotlin.Array&lt;GetCorporationsCorporationIdBookmarksFolders200Ok&gt; getCorporationsCorporationIdBookmarksFolders(corporationId, datasource, ifMinusNoneMinusMatch, page, token)

List corporation bookmark folders

A list of your corporation&#39;s bookmark folders  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/bookmarks/folders/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/bookmarks/folders/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/bookmarks/folders/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = BookmarksApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdBookmarksFolders200Ok> = apiInstance.getCorporationsCorporationIdBookmarksFolders(corporationId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookmarksApi#getCorporationsCorporationIdBookmarksFolders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookmarksApi#getCorporationsCorporationIdBookmarksFolders")
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

[**kotlin.Array&lt;GetCorporationsCorporationIdBookmarksFolders200Ok&gt;**](GetCorporationsCorporationIdBookmarksFolders200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

