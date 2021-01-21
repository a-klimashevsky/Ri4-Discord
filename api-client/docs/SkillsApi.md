# SkillsApi

All URIs are relative to *https://esi.evetech.net/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdAttributes**](SkillsApi.md#getCharactersCharacterIdAttributes) | **GET** /characters/{character_id}/attributes/ | Get character attributes
[**getCharactersCharacterIdSkillqueue**](SkillsApi.md#getCharactersCharacterIdSkillqueue) | **GET** /characters/{character_id}/skillqueue/ | Get character&#39;s skill queue
[**getCharactersCharacterIdSkills**](SkillsApi.md#getCharactersCharacterIdSkills) | **GET** /characters/{character_id}/skills/ | Get character skills


<a name="getCharactersCharacterIdAttributes"></a>
# **getCharactersCharacterIdAttributes**
> GetCharactersCharacterIdAttributesOk getCharactersCharacterIdAttributes(characterId, datasource, ifMinusNoneMinusMatch, token)

Get character attributes

Return attributes of a character  --- Alternate route: &#x60;/dev/characters/{character_id}/attributes/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/attributes/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/attributes/&#x60;  --- This route is cached for up to 120 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = SkillsApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : GetCharactersCharacterIdAttributesOk = apiInstance.getCharactersCharacterIdAttributes(characterId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SkillsApi#getCharactersCharacterIdAttributes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkillsApi#getCharactersCharacterIdAttributes")
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

[**GetCharactersCharacterIdAttributesOk**](GetCharactersCharacterIdAttributesOk.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdSkillqueue"></a>
# **getCharactersCharacterIdSkillqueue**
> kotlin.Array&lt;GetCharactersCharacterIdSkillqueue200Ok&gt; getCharactersCharacterIdSkillqueue(characterId, datasource, ifMinusNoneMinusMatch, token)

Get character&#39;s skill queue

List the configured skill queue for the given character  --- Alternate route: &#x60;/dev/characters/{character_id}/skillqueue/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/skillqueue/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/skillqueue/&#x60;  --- This route is cached for up to 120 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = SkillsApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdSkillqueue200Ok> = apiInstance.getCharactersCharacterIdSkillqueue(characterId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SkillsApi#getCharactersCharacterIdSkillqueue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkillsApi#getCharactersCharacterIdSkillqueue")
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

[**kotlin.Array&lt;GetCharactersCharacterIdSkillqueue200Ok&gt;**](GetCharactersCharacterIdSkillqueue200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdSkills"></a>
# **getCharactersCharacterIdSkills**
> GetCharactersCharacterIdSkillsOk getCharactersCharacterIdSkills(characterId, datasource, ifMinusNoneMinusMatch, token)

Get character skills

List all trained skills for the given character  --- Alternate route: &#x60;/dev/characters/{character_id}/skills/&#x60;  Alternate route: &#x60;/v4/characters/{character_id}/skills/&#x60;  --- This route is cached for up to 120 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = SkillsApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : GetCharactersCharacterIdSkillsOk = apiInstance.getCharactersCharacterIdSkills(characterId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SkillsApi#getCharactersCharacterIdSkills")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkillsApi#getCharactersCharacterIdSkills")
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

[**GetCharactersCharacterIdSkillsOk**](GetCharactersCharacterIdSkillsOk.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

