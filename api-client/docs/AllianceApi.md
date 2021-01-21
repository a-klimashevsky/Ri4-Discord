# AllianceApi

All URIs are relative to *https://esi.evetech.net/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAlliances**](AllianceApi.md#getAlliances) | **GET** /alliances/ | List all alliances
[**getAlliancesAllianceId**](AllianceApi.md#getAlliancesAllianceId) | **GET** /alliances/{alliance_id}/ | Get alliance information
[**getAlliancesAllianceIdCorporations**](AllianceApi.md#getAlliancesAllianceIdCorporations) | **GET** /alliances/{alliance_id}/corporations/ | List alliance&#39;s corporations
[**getAlliancesAllianceIdIcons**](AllianceApi.md#getAlliancesAllianceIdIcons) | **GET** /alliances/{alliance_id}/icons/ | Get alliance icon


<a name="getAlliances"></a>
# **getAlliances**
> kotlin.Array&lt;kotlin.Int&gt; getAlliances(datasource, ifMinusNoneMinusMatch)

List all alliances

List all active player alliances  --- Alternate route: &#x60;/dev/alliances/&#x60;  Alternate route: &#x60;/legacy/alliances/&#x60;  Alternate route: &#x60;/v1/alliances/&#x60;  Alternate route: &#x60;/v2/alliances/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = AllianceApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : kotlin.Array<kotlin.Int> = apiInstance.getAlliances(datasource, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AllianceApi#getAlliances")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AllianceApi#getAlliances")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]

### Return type

**kotlin.Array&lt;kotlin.Int&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAlliancesAllianceId"></a>
# **getAlliancesAllianceId**
> GetAlliancesAllianceIdOk getAlliancesAllianceId(allianceId, datasource, ifMinusNoneMinusMatch)

Get alliance information

Public information about an alliance  --- Alternate route: &#x60;/dev/alliances/{alliance_id}/&#x60;  Alternate route: &#x60;/legacy/alliances/{alliance_id}/&#x60;  Alternate route: &#x60;/v3/alliances/{alliance_id}/&#x60;  Alternate route: &#x60;/v4/alliances/{alliance_id}/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = AllianceApi()
val allianceId : kotlin.Int = 56 // kotlin.Int | An EVE alliance ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : GetAlliancesAllianceIdOk = apiInstance.getAlliancesAllianceId(allianceId, datasource, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AllianceApi#getAlliancesAllianceId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AllianceApi#getAlliancesAllianceId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allianceId** | **kotlin.Int**| An EVE alliance ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]

### Return type

[**GetAlliancesAllianceIdOk**](GetAlliancesAllianceIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAlliancesAllianceIdCorporations"></a>
# **getAlliancesAllianceIdCorporations**
> kotlin.Array&lt;kotlin.Int&gt; getAlliancesAllianceIdCorporations(allianceId, datasource, ifMinusNoneMinusMatch)

List alliance&#39;s corporations

List all current member corporations of an alliance  --- Alternate route: &#x60;/dev/alliances/{alliance_id}/corporations/&#x60;  Alternate route: &#x60;/legacy/alliances/{alliance_id}/corporations/&#x60;  Alternate route: &#x60;/v1/alliances/{alliance_id}/corporations/&#x60;  Alternate route: &#x60;/v2/alliances/{alliance_id}/corporations/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = AllianceApi()
val allianceId : kotlin.Int = 56 // kotlin.Int | An EVE alliance ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : kotlin.Array<kotlin.Int> = apiInstance.getAlliancesAllianceIdCorporations(allianceId, datasource, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AllianceApi#getAlliancesAllianceIdCorporations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AllianceApi#getAlliancesAllianceIdCorporations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allianceId** | **kotlin.Int**| An EVE alliance ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]

### Return type

**kotlin.Array&lt;kotlin.Int&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAlliancesAllianceIdIcons"></a>
# **getAlliancesAllianceIdIcons**
> GetAlliancesAllianceIdIconsOk getAlliancesAllianceIdIcons(allianceId, datasource, ifMinusNoneMinusMatch)

Get alliance icon

Get the icon urls for a alliance  --- Alternate route: &#x60;/legacy/alliances/{alliance_id}/icons/&#x60;  Alternate route: &#x60;/v1/alliances/{alliance_id}/icons/&#x60;  --- This route expires daily at 11:05  --- [Diff of the upcoming changes](https://esi.evetech.net/diff/latest/dev/#GET-/alliances/{alliance_id}/icons/)

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = AllianceApi()
val allianceId : kotlin.Int = 56 // kotlin.Int | An EVE alliance ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : GetAlliancesAllianceIdIconsOk = apiInstance.getAlliancesAllianceIdIcons(allianceId, datasource, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AllianceApi#getAlliancesAllianceIdIcons")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AllianceApi#getAlliancesAllianceIdIcons")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allianceId** | **kotlin.Int**| An EVE alliance ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]

### Return type

[**GetAlliancesAllianceIdIconsOk**](GetAlliancesAllianceIdIconsOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

