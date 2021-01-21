# CharacterApi

All URIs are relative to *https://esi.evetech.net/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterId**](CharacterApi.md#getCharactersCharacterId) | **GET** /characters/{character_id}/ | Get character&#39;s public information
[**getCharactersCharacterIdAgentsResearch**](CharacterApi.md#getCharactersCharacterIdAgentsResearch) | **GET** /characters/{character_id}/agents_research/ | Get agents research
[**getCharactersCharacterIdBlueprints**](CharacterApi.md#getCharactersCharacterIdBlueprints) | **GET** /characters/{character_id}/blueprints/ | Get blueprints
[**getCharactersCharacterIdCorporationhistory**](CharacterApi.md#getCharactersCharacterIdCorporationhistory) | **GET** /characters/{character_id}/corporationhistory/ | Get corporation history
[**getCharactersCharacterIdFatigue**](CharacterApi.md#getCharactersCharacterIdFatigue) | **GET** /characters/{character_id}/fatigue/ | Get jump fatigue
[**getCharactersCharacterIdMedals**](CharacterApi.md#getCharactersCharacterIdMedals) | **GET** /characters/{character_id}/medals/ | Get medals
[**getCharactersCharacterIdNotifications**](CharacterApi.md#getCharactersCharacterIdNotifications) | **GET** /characters/{character_id}/notifications/ | Get character notifications
[**getCharactersCharacterIdNotificationsContacts**](CharacterApi.md#getCharactersCharacterIdNotificationsContacts) | **GET** /characters/{character_id}/notifications/contacts/ | Get new contact notifications
[**getCharactersCharacterIdPortrait**](CharacterApi.md#getCharactersCharacterIdPortrait) | **GET** /characters/{character_id}/portrait/ | Get character portraits
[**getCharactersCharacterIdRoles**](CharacterApi.md#getCharactersCharacterIdRoles) | **GET** /characters/{character_id}/roles/ | Get character corporation roles
[**getCharactersCharacterIdStandings**](CharacterApi.md#getCharactersCharacterIdStandings) | **GET** /characters/{character_id}/standings/ | Get standings
[**getCharactersCharacterIdTitles**](CharacterApi.md#getCharactersCharacterIdTitles) | **GET** /characters/{character_id}/titles/ | Get character corporation titles
[**postCharactersAffiliation**](CharacterApi.md#postCharactersAffiliation) | **POST** /characters/affiliation/ | Character affiliation
[**postCharactersCharacterIdCspa**](CharacterApi.md#postCharactersCharacterIdCspa) | **POST** /characters/{character_id}/cspa/ | Calculate a CSPA charge cost


<a name="getCharactersCharacterId"></a>
# **getCharactersCharacterId**
> GetCharactersCharacterIdOk getCharactersCharacterId(characterId, datasource, ifMinusNoneMinusMatch)

Get character&#39;s public information

Public information about a character  --- Alternate route: &#x60;/dev/characters/{character_id}/&#x60;  Alternate route: &#x60;/v4/characters/{character_id}/&#x60;  --- This route is cached for up to 86400 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CharacterApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : GetCharactersCharacterIdOk = apiInstance.getCharactersCharacterId(characterId, datasource, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CharacterApi#getCharactersCharacterId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CharacterApi#getCharactersCharacterId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]

### Return type

[**GetCharactersCharacterIdOk**](GetCharactersCharacterIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdAgentsResearch"></a>
# **getCharactersCharacterIdAgentsResearch**
> kotlin.Array&lt;GetCharactersCharacterIdAgentsResearch200Ok&gt; getCharactersCharacterIdAgentsResearch(characterId, datasource, ifMinusNoneMinusMatch, token)

Get agents research

Return a list of agents research information for a character. The formula for finding the current research points with an agent is: currentPoints &#x3D; remainderPoints + pointsPerDay * days(currentTime - researchStartDate)  --- Alternate route: &#x60;/legacy/characters/{character_id}/agents_research/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/agents_research/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CharacterApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdAgentsResearch200Ok> = apiInstance.getCharactersCharacterIdAgentsResearch(characterId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CharacterApi#getCharactersCharacterIdAgentsResearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CharacterApi#getCharactersCharacterIdAgentsResearch")
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

[**kotlin.Array&lt;GetCharactersCharacterIdAgentsResearch200Ok&gt;**](GetCharactersCharacterIdAgentsResearch200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdBlueprints"></a>
# **getCharactersCharacterIdBlueprints**
> kotlin.Array&lt;GetCharactersCharacterIdBlueprints200Ok&gt; getCharactersCharacterIdBlueprints(characterId, datasource, ifMinusNoneMinusMatch, page, token)

Get blueprints

Return a list of blueprints the character owns  --- Alternate route: &#x60;/v2/characters/{character_id}/blueprints/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CharacterApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdBlueprints200Ok> = apiInstance.getCharactersCharacterIdBlueprints(characterId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CharacterApi#getCharactersCharacterIdBlueprints")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CharacterApi#getCharactersCharacterIdBlueprints")
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

[**kotlin.Array&lt;GetCharactersCharacterIdBlueprints200Ok&gt;**](GetCharactersCharacterIdBlueprints200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdCorporationhistory"></a>
# **getCharactersCharacterIdCorporationhistory**
> kotlin.Array&lt;GetCharactersCharacterIdCorporationhistory200Ok&gt; getCharactersCharacterIdCorporationhistory(characterId, datasource, ifMinusNoneMinusMatch)

Get corporation history

Get a list of all the corporations a character has been a member of  --- Alternate route: &#x60;/legacy/characters/{character_id}/corporationhistory/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/corporationhistory/&#x60;  --- This route is cached for up to 86400 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CharacterApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : kotlin.Array<GetCharactersCharacterIdCorporationhistory200Ok> = apiInstance.getCharactersCharacterIdCorporationhistory(characterId, datasource, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CharacterApi#getCharactersCharacterIdCorporationhistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CharacterApi#getCharactersCharacterIdCorporationhistory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]

### Return type

[**kotlin.Array&lt;GetCharactersCharacterIdCorporationhistory200Ok&gt;**](GetCharactersCharacterIdCorporationhistory200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdFatigue"></a>
# **getCharactersCharacterIdFatigue**
> GetCharactersCharacterIdFatigueOk getCharactersCharacterIdFatigue(characterId, datasource, ifMinusNoneMinusMatch, token)

Get jump fatigue

Return a character&#39;s jump activation and fatigue information  --- Alternate route: &#x60;/legacy/characters/{character_id}/fatigue/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/fatigue/&#x60;  --- This route is cached for up to 300 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CharacterApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : GetCharactersCharacterIdFatigueOk = apiInstance.getCharactersCharacterIdFatigue(characterId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CharacterApi#getCharactersCharacterIdFatigue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CharacterApi#getCharactersCharacterIdFatigue")
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

[**GetCharactersCharacterIdFatigueOk**](GetCharactersCharacterIdFatigueOk.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdMedals"></a>
# **getCharactersCharacterIdMedals**
> kotlin.Array&lt;GetCharactersCharacterIdMedals200Ok&gt; getCharactersCharacterIdMedals(characterId, datasource, ifMinusNoneMinusMatch, token)

Get medals

Return a list of medals the character has  --- Alternate route: &#x60;/legacy/characters/{character_id}/medals/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/medals/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CharacterApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdMedals200Ok> = apiInstance.getCharactersCharacterIdMedals(characterId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CharacterApi#getCharactersCharacterIdMedals")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CharacterApi#getCharactersCharacterIdMedals")
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

[**kotlin.Array&lt;GetCharactersCharacterIdMedals200Ok&gt;**](GetCharactersCharacterIdMedals200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdNotifications"></a>
# **getCharactersCharacterIdNotifications**
> kotlin.Array&lt;GetCharactersCharacterIdNotifications200Ok&gt; getCharactersCharacterIdNotifications(characterId, datasource, ifMinusNoneMinusMatch, token)

Get character notifications

Return character notifications  --- Alternate route: &#x60;/dev/characters/{character_id}/notifications/&#x60;  Alternate route: &#x60;/v5/characters/{character_id}/notifications/&#x60;  Alternate route: &#x60;/v6/characters/{character_id}/notifications/&#x60;  --- This route is cached for up to 600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CharacterApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdNotifications200Ok> = apiInstance.getCharactersCharacterIdNotifications(characterId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CharacterApi#getCharactersCharacterIdNotifications")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CharacterApi#getCharactersCharacterIdNotifications")
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

[**kotlin.Array&lt;GetCharactersCharacterIdNotifications200Ok&gt;**](GetCharactersCharacterIdNotifications200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdNotificationsContacts"></a>
# **getCharactersCharacterIdNotificationsContacts**
> kotlin.Array&lt;GetCharactersCharacterIdNotificationsContacts200Ok&gt; getCharactersCharacterIdNotificationsContacts(characterId, datasource, ifMinusNoneMinusMatch, token)

Get new contact notifications

Return notifications about having been added to someone&#39;s contact list  --- Alternate route: &#x60;/legacy/characters/{character_id}/notifications/contacts/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/notifications/contacts/&#x60;  --- This route is cached for up to 600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CharacterApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdNotificationsContacts200Ok> = apiInstance.getCharactersCharacterIdNotificationsContacts(characterId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CharacterApi#getCharactersCharacterIdNotificationsContacts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CharacterApi#getCharactersCharacterIdNotificationsContacts")
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

[**kotlin.Array&lt;GetCharactersCharacterIdNotificationsContacts200Ok&gt;**](GetCharactersCharacterIdNotificationsContacts200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdPortrait"></a>
# **getCharactersCharacterIdPortrait**
> GetCharactersCharacterIdPortraitOk getCharactersCharacterIdPortrait(characterId, datasource, ifMinusNoneMinusMatch)

Get character portraits

Get portrait urls for a character  --- Alternate route: &#x60;/dev/characters/{character_id}/portrait/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/portrait/&#x60;  Alternate route: &#x60;/v3/characters/{character_id}/portrait/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CharacterApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : GetCharactersCharacterIdPortraitOk = apiInstance.getCharactersCharacterIdPortrait(characterId, datasource, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CharacterApi#getCharactersCharacterIdPortrait")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CharacterApi#getCharactersCharacterIdPortrait")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]

### Return type

[**GetCharactersCharacterIdPortraitOk**](GetCharactersCharacterIdPortraitOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdRoles"></a>
# **getCharactersCharacterIdRoles**
> GetCharactersCharacterIdRolesOk getCharactersCharacterIdRoles(characterId, datasource, ifMinusNoneMinusMatch, token)

Get character corporation roles

Returns a character&#39;s corporation roles  --- Alternate route: &#x60;/v2/characters/{character_id}/roles/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CharacterApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : GetCharactersCharacterIdRolesOk = apiInstance.getCharactersCharacterIdRoles(characterId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CharacterApi#getCharactersCharacterIdRoles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CharacterApi#getCharactersCharacterIdRoles")
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

[**GetCharactersCharacterIdRolesOk**](GetCharactersCharacterIdRolesOk.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdStandings"></a>
# **getCharactersCharacterIdStandings**
> kotlin.Array&lt;GetCharactersCharacterIdStandings200Ok&gt; getCharactersCharacterIdStandings(characterId, datasource, ifMinusNoneMinusMatch, token)

Get standings

Return character standings from agents, NPC corporations, and factions  --- Alternate route: &#x60;/legacy/characters/{character_id}/standings/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/standings/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CharacterApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdStandings200Ok> = apiInstance.getCharactersCharacterIdStandings(characterId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CharacterApi#getCharactersCharacterIdStandings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CharacterApi#getCharactersCharacterIdStandings")
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

[**kotlin.Array&lt;GetCharactersCharacterIdStandings200Ok&gt;**](GetCharactersCharacterIdStandings200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdTitles"></a>
# **getCharactersCharacterIdTitles**
> kotlin.Array&lt;GetCharactersCharacterIdTitles200Ok&gt; getCharactersCharacterIdTitles(characterId, datasource, ifMinusNoneMinusMatch, token)

Get character corporation titles

Returns a character&#39;s titles  --- Alternate route: &#x60;/legacy/characters/{character_id}/titles/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/titles/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CharacterApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdTitles200Ok> = apiInstance.getCharactersCharacterIdTitles(characterId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CharacterApi#getCharactersCharacterIdTitles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CharacterApi#getCharactersCharacterIdTitles")
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

[**kotlin.Array&lt;GetCharactersCharacterIdTitles200Ok&gt;**](GetCharactersCharacterIdTitles200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postCharactersAffiliation"></a>
# **postCharactersAffiliation**
> kotlin.Array&lt;PostCharactersAffiliation200Ok&gt; postCharactersAffiliation(datasource, characters)

Character affiliation

Bulk lookup of character IDs to corporation, alliance and faction  --- Alternate route: &#x60;/legacy/characters/affiliation/&#x60;  Alternate route: &#x60;/v1/characters/affiliation/&#x60;  --- This route is cached for up to 3600 seconds  --- [Diff of the upcoming changes](https://esi.evetech.net/diff/latest/dev/#POST-/characters/affiliation/)

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CharacterApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val characters : kotlin.collections.Set<kotlin.Int> =  // kotlin.collections.Set<kotlin.Int> | The character IDs to fetch affiliations for. All characters must exist, or none will be returned
try {
    val result : kotlin.Array<PostCharactersAffiliation200Ok> = apiInstance.postCharactersAffiliation(datasource, characters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CharacterApi#postCharactersAffiliation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CharacterApi#postCharactersAffiliation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **characters** | [**kotlin.collections.Set&lt;kotlin.Int&gt;**](kotlin.Int.md)| The character IDs to fetch affiliations for. All characters must exist, or none will be returned |

### Return type

[**kotlin.Array&lt;PostCharactersAffiliation200Ok&gt;**](PostCharactersAffiliation200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCharactersCharacterIdCspa"></a>
# **postCharactersCharacterIdCspa**
> kotlin.Float postCharactersCharacterIdCspa(characterId, datasource, token, characters)

Calculate a CSPA charge cost

Takes a source character ID in the url and a set of target character ID&#39;s in the body, returns a CSPA charge cost  --- Alternate route: &#x60;/v4/characters/{character_id}/cspa/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CharacterApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
val characters : kotlin.collections.Set<kotlin.Int> =  // kotlin.collections.Set<kotlin.Int> | The target characters to calculate the charge for
try {
    val result : kotlin.Float = apiInstance.postCharactersCharacterIdCspa(characterId, datasource, token, characters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CharacterApi#postCharactersCharacterIdCspa")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CharacterApi#postCharactersCharacterIdCspa")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]
 **characters** | [**kotlin.collections.Set&lt;kotlin.Int&gt;**](kotlin.Int.md)| The target characters to calculate the charge for |

### Return type

**kotlin.Float**

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

