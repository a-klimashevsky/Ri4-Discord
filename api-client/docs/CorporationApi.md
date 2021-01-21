# CorporationApi

All URIs are relative to *https://esi.evetech.net/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCorporationsCorporationId**](CorporationApi.md#getCorporationsCorporationId) | **GET** /corporations/{corporation_id}/ | Get corporation information
[**getCorporationsCorporationIdAlliancehistory**](CorporationApi.md#getCorporationsCorporationIdAlliancehistory) | **GET** /corporations/{corporation_id}/alliancehistory/ | Get alliance history
[**getCorporationsCorporationIdBlueprints**](CorporationApi.md#getCorporationsCorporationIdBlueprints) | **GET** /corporations/{corporation_id}/blueprints/ | Get corporation blueprints
[**getCorporationsCorporationIdContainersLogs**](CorporationApi.md#getCorporationsCorporationIdContainersLogs) | **GET** /corporations/{corporation_id}/containers/logs/ | Get all corporation ALSC logs
[**getCorporationsCorporationIdDivisions**](CorporationApi.md#getCorporationsCorporationIdDivisions) | **GET** /corporations/{corporation_id}/divisions/ | Get corporation divisions
[**getCorporationsCorporationIdFacilities**](CorporationApi.md#getCorporationsCorporationIdFacilities) | **GET** /corporations/{corporation_id}/facilities/ | Get corporation facilities
[**getCorporationsCorporationIdIcons**](CorporationApi.md#getCorporationsCorporationIdIcons) | **GET** /corporations/{corporation_id}/icons/ | Get corporation icon
[**getCorporationsCorporationIdMedals**](CorporationApi.md#getCorporationsCorporationIdMedals) | **GET** /corporations/{corporation_id}/medals/ | Get corporation medals
[**getCorporationsCorporationIdMedalsIssued**](CorporationApi.md#getCorporationsCorporationIdMedalsIssued) | **GET** /corporations/{corporation_id}/medals/issued/ | Get corporation issued medals
[**getCorporationsCorporationIdMembers**](CorporationApi.md#getCorporationsCorporationIdMembers) | **GET** /corporations/{corporation_id}/members/ | Get corporation members
[**getCorporationsCorporationIdMembersLimit**](CorporationApi.md#getCorporationsCorporationIdMembersLimit) | **GET** /corporations/{corporation_id}/members/limit/ | Get corporation member limit
[**getCorporationsCorporationIdMembersTitles**](CorporationApi.md#getCorporationsCorporationIdMembersTitles) | **GET** /corporations/{corporation_id}/members/titles/ | Get corporation&#39;s members&#39; titles
[**getCorporationsCorporationIdMembertracking**](CorporationApi.md#getCorporationsCorporationIdMembertracking) | **GET** /corporations/{corporation_id}/membertracking/ | Track corporation members
[**getCorporationsCorporationIdRoles**](CorporationApi.md#getCorporationsCorporationIdRoles) | **GET** /corporations/{corporation_id}/roles/ | Get corporation member roles
[**getCorporationsCorporationIdRolesHistory**](CorporationApi.md#getCorporationsCorporationIdRolesHistory) | **GET** /corporations/{corporation_id}/roles/history/ | Get corporation member roles history
[**getCorporationsCorporationIdShareholders**](CorporationApi.md#getCorporationsCorporationIdShareholders) | **GET** /corporations/{corporation_id}/shareholders/ | Get corporation shareholders
[**getCorporationsCorporationIdStandings**](CorporationApi.md#getCorporationsCorporationIdStandings) | **GET** /corporations/{corporation_id}/standings/ | Get corporation standings
[**getCorporationsCorporationIdStarbases**](CorporationApi.md#getCorporationsCorporationIdStarbases) | **GET** /corporations/{corporation_id}/starbases/ | Get corporation starbases (POSes)
[**getCorporationsCorporationIdStarbasesStarbaseId**](CorporationApi.md#getCorporationsCorporationIdStarbasesStarbaseId) | **GET** /corporations/{corporation_id}/starbases/{starbase_id}/ | Get starbase (POS) detail
[**getCorporationsCorporationIdStructures**](CorporationApi.md#getCorporationsCorporationIdStructures) | **GET** /corporations/{corporation_id}/structures/ | Get corporation structures
[**getCorporationsCorporationIdTitles**](CorporationApi.md#getCorporationsCorporationIdTitles) | **GET** /corporations/{corporation_id}/titles/ | Get corporation titles
[**getCorporationsNpccorps**](CorporationApi.md#getCorporationsNpccorps) | **GET** /corporations/npccorps/ | Get npc corporations


<a name="getCorporationsCorporationId"></a>
# **getCorporationsCorporationId**
> GetCorporationsCorporationIdOk getCorporationsCorporationId(corporationId, datasource, ifMinusNoneMinusMatch)

Get corporation information

Public information about a corporation  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/&#x60;  Alternate route: &#x60;/v4/corporations/{corporation_id}/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CorporationApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : GetCorporationsCorporationIdOk = apiInstance.getCorporationsCorporationId(corporationId, datasource, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CorporationApi#getCorporationsCorporationId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CorporationApi#getCorporationsCorporationId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **kotlin.Int**| An EVE corporation ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]

### Return type

[**GetCorporationsCorporationIdOk**](GetCorporationsCorporationIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdAlliancehistory"></a>
# **getCorporationsCorporationIdAlliancehistory**
> kotlin.Array&lt;GetCorporationsCorporationIdAlliancehistory200Ok&gt; getCorporationsCorporationIdAlliancehistory(corporationId, datasource, ifMinusNoneMinusMatch)

Get alliance history

Get a list of all the alliances a corporation has been a member of  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/alliancehistory/&#x60;  Alternate route: &#x60;/v2/corporations/{corporation_id}/alliancehistory/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CorporationApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : kotlin.Array<GetCorporationsCorporationIdAlliancehistory200Ok> = apiInstance.getCorporationsCorporationIdAlliancehistory(corporationId, datasource, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CorporationApi#getCorporationsCorporationIdAlliancehistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CorporationApi#getCorporationsCorporationIdAlliancehistory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **kotlin.Int**| An EVE corporation ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]

### Return type

[**kotlin.Array&lt;GetCorporationsCorporationIdAlliancehistory200Ok&gt;**](GetCorporationsCorporationIdAlliancehistory200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdBlueprints"></a>
# **getCorporationsCorporationIdBlueprints**
> kotlin.Array&lt;GetCorporationsCorporationIdBlueprints200Ok&gt; getCorporationsCorporationIdBlueprints(corporationId, datasource, ifMinusNoneMinusMatch, page, token)

Get corporation blueprints

Returns a list of blueprints the corporation owns  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/blueprints/&#x60;  Alternate route: &#x60;/v2/corporations/{corporation_id}/blueprints/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CorporationApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdBlueprints200Ok> = apiInstance.getCorporationsCorporationIdBlueprints(corporationId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CorporationApi#getCorporationsCorporationIdBlueprints")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CorporationApi#getCorporationsCorporationIdBlueprints")
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

[**kotlin.Array&lt;GetCorporationsCorporationIdBlueprints200Ok&gt;**](GetCorporationsCorporationIdBlueprints200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdContainersLogs"></a>
# **getCorporationsCorporationIdContainersLogs**
> kotlin.Array&lt;GetCorporationsCorporationIdContainersLogs200Ok&gt; getCorporationsCorporationIdContainersLogs(corporationId, datasource, ifMinusNoneMinusMatch, page, token)

Get all corporation ALSC logs

Returns logs recorded in the past seven days from all audit log secure containers (ALSC) owned by a given corporation  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/containers/logs/&#x60;  Alternate route: &#x60;/v2/corporations/{corporation_id}/containers/logs/&#x60;  --- This route is cached for up to 600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CorporationApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdContainersLogs200Ok> = apiInstance.getCorporationsCorporationIdContainersLogs(corporationId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CorporationApi#getCorporationsCorporationIdContainersLogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CorporationApi#getCorporationsCorporationIdContainersLogs")
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

[**kotlin.Array&lt;GetCorporationsCorporationIdContainersLogs200Ok&gt;**](GetCorporationsCorporationIdContainersLogs200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdDivisions"></a>
# **getCorporationsCorporationIdDivisions**
> GetCorporationsCorporationIdDivisionsOk getCorporationsCorporationIdDivisions(corporationId, datasource, ifMinusNoneMinusMatch, token)

Get corporation divisions

Return corporation hangar and wallet division names, only show if a division is not using the default name  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/divisions/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/divisions/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/divisions/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CorporationApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : GetCorporationsCorporationIdDivisionsOk = apiInstance.getCorporationsCorporationIdDivisions(corporationId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CorporationApi#getCorporationsCorporationIdDivisions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CorporationApi#getCorporationsCorporationIdDivisions")
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

[**GetCorporationsCorporationIdDivisionsOk**](GetCorporationsCorporationIdDivisionsOk.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdFacilities"></a>
# **getCorporationsCorporationIdFacilities**
> kotlin.Array&lt;GetCorporationsCorporationIdFacilities200Ok&gt; getCorporationsCorporationIdFacilities(corporationId, datasource, ifMinusNoneMinusMatch, token)

Get corporation facilities

Return a corporation&#39;s facilities  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/facilities/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/facilities/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/facilities/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Factory_Manager 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CorporationApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdFacilities200Ok> = apiInstance.getCorporationsCorporationIdFacilities(corporationId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CorporationApi#getCorporationsCorporationIdFacilities")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CorporationApi#getCorporationsCorporationIdFacilities")
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

[**kotlin.Array&lt;GetCorporationsCorporationIdFacilities200Ok&gt;**](GetCorporationsCorporationIdFacilities200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdIcons"></a>
# **getCorporationsCorporationIdIcons**
> GetCorporationsCorporationIdIconsOk getCorporationsCorporationIdIcons(corporationId, datasource, ifMinusNoneMinusMatch)

Get corporation icon

Get the icon urls for a corporation  --- Alternate route: &#x60;/legacy/corporations/{corporation_id}/icons/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/icons/&#x60;  --- This route is cached for up to 3600 seconds  --- [Diff of the upcoming changes](https://esi.evetech.net/diff/latest/dev/#GET-/corporations/{corporation_id}/icons/)

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CorporationApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : GetCorporationsCorporationIdIconsOk = apiInstance.getCorporationsCorporationIdIcons(corporationId, datasource, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CorporationApi#getCorporationsCorporationIdIcons")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CorporationApi#getCorporationsCorporationIdIcons")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **kotlin.Int**| An EVE corporation ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]

### Return type

[**GetCorporationsCorporationIdIconsOk**](GetCorporationsCorporationIdIconsOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdMedals"></a>
# **getCorporationsCorporationIdMedals**
> kotlin.Array&lt;GetCorporationsCorporationIdMedals200Ok&gt; getCorporationsCorporationIdMedals(corporationId, datasource, ifMinusNoneMinusMatch, page, token)

Get corporation medals

Returns a corporation&#39;s medals  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/medals/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/medals/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/medals/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CorporationApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdMedals200Ok> = apiInstance.getCorporationsCorporationIdMedals(corporationId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CorporationApi#getCorporationsCorporationIdMedals")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CorporationApi#getCorporationsCorporationIdMedals")
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

[**kotlin.Array&lt;GetCorporationsCorporationIdMedals200Ok&gt;**](GetCorporationsCorporationIdMedals200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdMedalsIssued"></a>
# **getCorporationsCorporationIdMedalsIssued**
> kotlin.Array&lt;GetCorporationsCorporationIdMedalsIssued200Ok&gt; getCorporationsCorporationIdMedalsIssued(corporationId, datasource, ifMinusNoneMinusMatch, page, token)

Get corporation issued medals

Returns medals issued by a corporation  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/medals/issued/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/medals/issued/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/medals/issued/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CorporationApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdMedalsIssued200Ok> = apiInstance.getCorporationsCorporationIdMedalsIssued(corporationId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CorporationApi#getCorporationsCorporationIdMedalsIssued")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CorporationApi#getCorporationsCorporationIdMedalsIssued")
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

[**kotlin.Array&lt;GetCorporationsCorporationIdMedalsIssued200Ok&gt;**](GetCorporationsCorporationIdMedalsIssued200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdMembers"></a>
# **getCorporationsCorporationIdMembers**
> kotlin.Array&lt;kotlin.Int&gt; getCorporationsCorporationIdMembers(corporationId, datasource, ifMinusNoneMinusMatch, token)

Get corporation members

Return the current member list of a corporation, the token&#39;s character need to be a member of the corporation.  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/members/&#x60;  Alternate route: &#x60;/v3/corporations/{corporation_id}/members/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CorporationApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<kotlin.Int> = apiInstance.getCorporationsCorporationIdMembers(corporationId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CorporationApi#getCorporationsCorporationIdMembers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CorporationApi#getCorporationsCorporationIdMembers")
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

**kotlin.Array&lt;kotlin.Int&gt;**

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdMembersLimit"></a>
# **getCorporationsCorporationIdMembersLimit**
> kotlin.Int getCorporationsCorporationIdMembersLimit(corporationId, datasource, ifMinusNoneMinusMatch, token)

Get corporation member limit

Return a corporation&#39;s member limit, not including CEO himself  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/members/limit/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/members/limit/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/members/limit/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CorporationApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Int = apiInstance.getCorporationsCorporationIdMembersLimit(corporationId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CorporationApi#getCorporationsCorporationIdMembersLimit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CorporationApi#getCorporationsCorporationIdMembersLimit")
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

**kotlin.Int**

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdMembersTitles"></a>
# **getCorporationsCorporationIdMembersTitles**
> kotlin.Array&lt;GetCorporationsCorporationIdMembersTitles200Ok&gt; getCorporationsCorporationIdMembersTitles(corporationId, datasource, ifMinusNoneMinusMatch, token)

Get corporation&#39;s members&#39; titles

Returns a corporation&#39;s members&#39; titles  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/members/titles/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/members/titles/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/members/titles/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CorporationApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdMembersTitles200Ok> = apiInstance.getCorporationsCorporationIdMembersTitles(corporationId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CorporationApi#getCorporationsCorporationIdMembersTitles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CorporationApi#getCorporationsCorporationIdMembersTitles")
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

[**kotlin.Array&lt;GetCorporationsCorporationIdMembersTitles200Ok&gt;**](GetCorporationsCorporationIdMembersTitles200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdMembertracking"></a>
# **getCorporationsCorporationIdMembertracking**
> kotlin.Array&lt;GetCorporationsCorporationIdMembertracking200Ok&gt; getCorporationsCorporationIdMembertracking(corporationId, datasource, ifMinusNoneMinusMatch, token)

Track corporation members

Returns additional information about a corporation&#39;s members which helps tracking their activities  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/membertracking/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/membertracking/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/membertracking/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CorporationApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdMembertracking200Ok> = apiInstance.getCorporationsCorporationIdMembertracking(corporationId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CorporationApi#getCorporationsCorporationIdMembertracking")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CorporationApi#getCorporationsCorporationIdMembertracking")
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

[**kotlin.Array&lt;GetCorporationsCorporationIdMembertracking200Ok&gt;**](GetCorporationsCorporationIdMembertracking200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdRoles"></a>
# **getCorporationsCorporationIdRoles**
> kotlin.Array&lt;GetCorporationsCorporationIdRoles200Ok&gt; getCorporationsCorporationIdRoles(corporationId, datasource, ifMinusNoneMinusMatch, token)

Get corporation member roles

Return the roles of all members if the character has the personnel manager role or any grantable role.  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/roles/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/roles/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/roles/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CorporationApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdRoles200Ok> = apiInstance.getCorporationsCorporationIdRoles(corporationId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CorporationApi#getCorporationsCorporationIdRoles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CorporationApi#getCorporationsCorporationIdRoles")
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

[**kotlin.Array&lt;GetCorporationsCorporationIdRoles200Ok&gt;**](GetCorporationsCorporationIdRoles200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdRolesHistory"></a>
# **getCorporationsCorporationIdRolesHistory**
> kotlin.Array&lt;GetCorporationsCorporationIdRolesHistory200Ok&gt; getCorporationsCorporationIdRolesHistory(corporationId, datasource, ifMinusNoneMinusMatch, page, token)

Get corporation member roles history

Return how roles have changed for a coporation&#39;s members, up to a month  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/roles/history/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/roles/history/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/roles/history/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CorporationApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdRolesHistory200Ok> = apiInstance.getCorporationsCorporationIdRolesHistory(corporationId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CorporationApi#getCorporationsCorporationIdRolesHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CorporationApi#getCorporationsCorporationIdRolesHistory")
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

[**kotlin.Array&lt;GetCorporationsCorporationIdRolesHistory200Ok&gt;**](GetCorporationsCorporationIdRolesHistory200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdShareholders"></a>
# **getCorporationsCorporationIdShareholders**
> kotlin.Array&lt;GetCorporationsCorporationIdShareholders200Ok&gt; getCorporationsCorporationIdShareholders(corporationId, datasource, ifMinusNoneMinusMatch, page, token)

Get corporation shareholders

Return the current shareholders of a corporation.  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/shareholders/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/shareholders/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/shareholders/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CorporationApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdShareholders200Ok> = apiInstance.getCorporationsCorporationIdShareholders(corporationId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CorporationApi#getCorporationsCorporationIdShareholders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CorporationApi#getCorporationsCorporationIdShareholders")
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

[**kotlin.Array&lt;GetCorporationsCorporationIdShareholders200Ok&gt;**](GetCorporationsCorporationIdShareholders200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdStandings"></a>
# **getCorporationsCorporationIdStandings**
> kotlin.Array&lt;GetCorporationsCorporationIdStandings200Ok&gt; getCorporationsCorporationIdStandings(corporationId, datasource, ifMinusNoneMinusMatch, page, token)

Get corporation standings

Return corporation standings from agents, NPC corporations, and factions  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/standings/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/standings/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/standings/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CorporationApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdStandings200Ok> = apiInstance.getCorporationsCorporationIdStandings(corporationId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CorporationApi#getCorporationsCorporationIdStandings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CorporationApi#getCorporationsCorporationIdStandings")
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

[**kotlin.Array&lt;GetCorporationsCorporationIdStandings200Ok&gt;**](GetCorporationsCorporationIdStandings200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdStarbases"></a>
# **getCorporationsCorporationIdStarbases**
> kotlin.Array&lt;GetCorporationsCorporationIdStarbases200Ok&gt; getCorporationsCorporationIdStarbases(corporationId, datasource, ifMinusNoneMinusMatch, page, token)

Get corporation starbases (POSes)

Returns list of corporation starbases (POSes)  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/starbases/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/starbases/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/starbases/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CorporationApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdStarbases200Ok> = apiInstance.getCorporationsCorporationIdStarbases(corporationId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CorporationApi#getCorporationsCorporationIdStarbases")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CorporationApi#getCorporationsCorporationIdStarbases")
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

[**kotlin.Array&lt;GetCorporationsCorporationIdStarbases200Ok&gt;**](GetCorporationsCorporationIdStarbases200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdStarbasesStarbaseId"></a>
# **getCorporationsCorporationIdStarbasesStarbaseId**
> GetCorporationsCorporationIdStarbasesStarbaseIdOk getCorporationsCorporationIdStarbasesStarbaseId(corporationId, datasource, ifMinusNoneMinusMatch, starbaseId, systemId, token)

Get starbase (POS) detail

Returns various settings and fuels of a starbase (POS)  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/starbases/{starbase_id}/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/starbases/{starbase_id}/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/starbases/{starbase_id}/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CorporationApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val starbaseId : kotlin.Long = 789 // kotlin.Long | An EVE starbase (POS) ID
val systemId : kotlin.Int = 56 // kotlin.Int | The solar system this starbase (POS) is located in,
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : GetCorporationsCorporationIdStarbasesStarbaseIdOk = apiInstance.getCorporationsCorporationIdStarbasesStarbaseId(corporationId, datasource, ifMinusNoneMinusMatch, starbaseId, systemId, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CorporationApi#getCorporationsCorporationIdStarbasesStarbaseId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CorporationApi#getCorporationsCorporationIdStarbasesStarbaseId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **kotlin.Int**| An EVE corporation ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **starbaseId** | **kotlin.Long**| An EVE starbase (POS) ID |
 **systemId** | **kotlin.Int**| The solar system this starbase (POS) is located in, |
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**GetCorporationsCorporationIdStarbasesStarbaseIdOk**](GetCorporationsCorporationIdStarbasesStarbaseIdOk.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdStructures"></a>
# **getCorporationsCorporationIdStructures**
> kotlin.Array&lt;GetCorporationsCorporationIdStructures200Ok&gt; getCorporationsCorporationIdStructures(acceptMinusLanguage, corporationId, datasource, ifMinusNoneMinusMatch, language, page, token)

Get corporation structures

Get a list of corporation structures. This route&#39;s version includes the changes to structures detailed in this blog: https://www.eveonline.com/article/upwell-2.0-structures-changes-coming-on-february-13th  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/structures/&#x60;  Alternate route: &#x60;/v3/corporations/{corporation_id}/structures/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Station_Manager 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CorporationApi()
val acceptMinusLanguage : kotlin.String = acceptMinusLanguage_example // kotlin.String | Language to use in the response
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val language : kotlin.String = language_example // kotlin.String | Language to use in the response, takes precedence over Accept-Language
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdStructures200Ok> = apiInstance.getCorporationsCorporationIdStructures(acceptMinusLanguage, corporationId, datasource, ifMinusNoneMinusMatch, language, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CorporationApi#getCorporationsCorporationIdStructures")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CorporationApi#getCorporationsCorporationIdStructures")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptMinusLanguage** | **kotlin.String**| Language to use in the response | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **corporationId** | **kotlin.Int**| An EVE corporation ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **language** | **kotlin.String**| Language to use in the response, takes precedence over Accept-Language | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **page** | **kotlin.Int**| Which page of results to return | [optional] [default to 1]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**kotlin.Array&lt;GetCorporationsCorporationIdStructures200Ok&gt;**](GetCorporationsCorporationIdStructures200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdTitles"></a>
# **getCorporationsCorporationIdTitles**
> kotlin.Array&lt;GetCorporationsCorporationIdTitles200Ok&gt; getCorporationsCorporationIdTitles(corporationId, datasource, ifMinusNoneMinusMatch, token)

Get corporation titles

Returns a corporation&#39;s titles  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/titles/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/titles/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/titles/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CorporationApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdTitles200Ok> = apiInstance.getCorporationsCorporationIdTitles(corporationId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CorporationApi#getCorporationsCorporationIdTitles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CorporationApi#getCorporationsCorporationIdTitles")
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

[**kotlin.Array&lt;GetCorporationsCorporationIdTitles200Ok&gt;**](GetCorporationsCorporationIdTitles200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsNpccorps"></a>
# **getCorporationsNpccorps**
> kotlin.Array&lt;kotlin.Int&gt; getCorporationsNpccorps(datasource, ifMinusNoneMinusMatch)

Get npc corporations

Get a list of npc corporations  --- Alternate route: &#x60;/dev/corporations/npccorps/&#x60;  Alternate route: &#x60;/legacy/corporations/npccorps/&#x60;  Alternate route: &#x60;/v1/corporations/npccorps/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CorporationApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : kotlin.Array<kotlin.Int> = apiInstance.getCorporationsNpccorps(datasource, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CorporationApi#getCorporationsNpccorps")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CorporationApi#getCorporationsNpccorps")
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

