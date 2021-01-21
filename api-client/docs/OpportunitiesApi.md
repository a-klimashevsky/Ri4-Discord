# OpportunitiesApi

All URIs are relative to *https://esi.evetech.net/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdOpportunities**](OpportunitiesApi.md#getCharactersCharacterIdOpportunities) | **GET** /characters/{character_id}/opportunities/ | Get a character&#39;s completed tasks
[**getOpportunitiesGroups**](OpportunitiesApi.md#getOpportunitiesGroups) | **GET** /opportunities/groups/ | Get opportunities groups
[**getOpportunitiesGroupsGroupId**](OpportunitiesApi.md#getOpportunitiesGroupsGroupId) | **GET** /opportunities/groups/{group_id}/ | Get opportunities group
[**getOpportunitiesTasks**](OpportunitiesApi.md#getOpportunitiesTasks) | **GET** /opportunities/tasks/ | Get opportunities tasks
[**getOpportunitiesTasksTaskId**](OpportunitiesApi.md#getOpportunitiesTasksTaskId) | **GET** /opportunities/tasks/{task_id}/ | Get opportunities task


<a name="getCharactersCharacterIdOpportunities"></a>
# **getCharactersCharacterIdOpportunities**
> kotlin.Array&lt;GetCharactersCharacterIdOpportunities200Ok&gt; getCharactersCharacterIdOpportunities(characterId, datasource, ifMinusNoneMinusMatch, token)

Get a character&#39;s completed tasks

Return a list of tasks finished by a character  --- Alternate route: &#x60;/dev/characters/{character_id}/opportunities/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/opportunities/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/opportunities/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = OpportunitiesApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdOpportunities200Ok> = apiInstance.getCharactersCharacterIdOpportunities(characterId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpportunitiesApi#getCharactersCharacterIdOpportunities")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpportunitiesApi#getCharactersCharacterIdOpportunities")
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

[**kotlin.Array&lt;GetCharactersCharacterIdOpportunities200Ok&gt;**](GetCharactersCharacterIdOpportunities200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOpportunitiesGroups"></a>
# **getOpportunitiesGroups**
> kotlin.Array&lt;kotlin.Int&gt; getOpportunitiesGroups(datasource, ifMinusNoneMinusMatch)

Get opportunities groups

Return a list of opportunities groups  --- Alternate route: &#x60;/dev/opportunities/groups/&#x60;  Alternate route: &#x60;/legacy/opportunities/groups/&#x60;  Alternate route: &#x60;/v1/opportunities/groups/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = OpportunitiesApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : kotlin.Array<kotlin.Int> = apiInstance.getOpportunitiesGroups(datasource, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpportunitiesApi#getOpportunitiesGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpportunitiesApi#getOpportunitiesGroups")
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

<a name="getOpportunitiesGroupsGroupId"></a>
# **getOpportunitiesGroupsGroupId**
> GetOpportunitiesGroupsGroupIdOk getOpportunitiesGroupsGroupId(acceptMinusLanguage, datasource, groupId, ifMinusNoneMinusMatch, language)

Get opportunities group

Return information of an opportunities group  --- Alternate route: &#x60;/dev/opportunities/groups/{group_id}/&#x60;  Alternate route: &#x60;/legacy/opportunities/groups/{group_id}/&#x60;  Alternate route: &#x60;/v1/opportunities/groups/{group_id}/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = OpportunitiesApi()
val acceptMinusLanguage : kotlin.String = acceptMinusLanguage_example // kotlin.String | Language to use in the response
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val groupId : kotlin.Int = 56 // kotlin.Int | ID of an opportunities group
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val language : kotlin.String = language_example // kotlin.String | Language to use in the response, takes precedence over Accept-Language
try {
    val result : GetOpportunitiesGroupsGroupIdOk = apiInstance.getOpportunitiesGroupsGroupId(acceptMinusLanguage, datasource, groupId, ifMinusNoneMinusMatch, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpportunitiesApi#getOpportunitiesGroupsGroupId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpportunitiesApi#getOpportunitiesGroupsGroupId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptMinusLanguage** | **kotlin.String**| Language to use in the response | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **groupId** | **kotlin.Int**| ID of an opportunities group |
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **language** | **kotlin.String**| Language to use in the response, takes precedence over Accept-Language | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]

### Return type

[**GetOpportunitiesGroupsGroupIdOk**](GetOpportunitiesGroupsGroupIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOpportunitiesTasks"></a>
# **getOpportunitiesTasks**
> kotlin.Array&lt;kotlin.Int&gt; getOpportunitiesTasks(datasource, ifMinusNoneMinusMatch)

Get opportunities tasks

Return a list of opportunities tasks  --- Alternate route: &#x60;/dev/opportunities/tasks/&#x60;  Alternate route: &#x60;/legacy/opportunities/tasks/&#x60;  Alternate route: &#x60;/v1/opportunities/tasks/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = OpportunitiesApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : kotlin.Array<kotlin.Int> = apiInstance.getOpportunitiesTasks(datasource, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpportunitiesApi#getOpportunitiesTasks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpportunitiesApi#getOpportunitiesTasks")
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

<a name="getOpportunitiesTasksTaskId"></a>
# **getOpportunitiesTasksTaskId**
> GetOpportunitiesTasksTaskIdOk getOpportunitiesTasksTaskId(datasource, ifMinusNoneMinusMatch, taskId)

Get opportunities task

Return information of an opportunities task  --- Alternate route: &#x60;/dev/opportunities/tasks/{task_id}/&#x60;  Alternate route: &#x60;/legacy/opportunities/tasks/{task_id}/&#x60;  Alternate route: &#x60;/v1/opportunities/tasks/{task_id}/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = OpportunitiesApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val taskId : kotlin.Int = 56 // kotlin.Int | ID of an opportunities task
try {
    val result : GetOpportunitiesTasksTaskIdOk = apiInstance.getOpportunitiesTasksTaskId(datasource, ifMinusNoneMinusMatch, taskId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpportunitiesApi#getOpportunitiesTasksTaskId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpportunitiesApi#getOpportunitiesTasksTaskId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **taskId** | **kotlin.Int**| ID of an opportunities task |

### Return type

[**GetOpportunitiesTasksTaskIdOk**](GetOpportunitiesTasksTaskIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

