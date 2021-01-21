# FleetsApi

All URIs are relative to *https://esi.evetech.net/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteFleetsFleetIdMembersMemberId**](FleetsApi.md#deleteFleetsFleetIdMembersMemberId) | **DELETE** /fleets/{fleet_id}/members/{member_id}/ | Kick fleet member
[**deleteFleetsFleetIdSquadsSquadId**](FleetsApi.md#deleteFleetsFleetIdSquadsSquadId) | **DELETE** /fleets/{fleet_id}/squads/{squad_id}/ | Delete fleet squad
[**deleteFleetsFleetIdWingsWingId**](FleetsApi.md#deleteFleetsFleetIdWingsWingId) | **DELETE** /fleets/{fleet_id}/wings/{wing_id}/ | Delete fleet wing
[**getCharactersCharacterIdFleet**](FleetsApi.md#getCharactersCharacterIdFleet) | **GET** /characters/{character_id}/fleet/ | Get character fleet info
[**getFleetsFleetId**](FleetsApi.md#getFleetsFleetId) | **GET** /fleets/{fleet_id}/ | Get fleet information
[**getFleetsFleetIdMembers**](FleetsApi.md#getFleetsFleetIdMembers) | **GET** /fleets/{fleet_id}/members/ | Get fleet members
[**getFleetsFleetIdWings**](FleetsApi.md#getFleetsFleetIdWings) | **GET** /fleets/{fleet_id}/wings/ | Get fleet wings
[**postFleetsFleetIdMembers**](FleetsApi.md#postFleetsFleetIdMembers) | **POST** /fleets/{fleet_id}/members/ | Create fleet invitation
[**postFleetsFleetIdWings**](FleetsApi.md#postFleetsFleetIdWings) | **POST** /fleets/{fleet_id}/wings/ | Create fleet wing
[**postFleetsFleetIdWingsWingIdSquads**](FleetsApi.md#postFleetsFleetIdWingsWingIdSquads) | **POST** /fleets/{fleet_id}/wings/{wing_id}/squads/ | Create fleet squad
[**putFleetsFleetId**](FleetsApi.md#putFleetsFleetId) | **PUT** /fleets/{fleet_id}/ | Update fleet
[**putFleetsFleetIdMembersMemberId**](FleetsApi.md#putFleetsFleetIdMembersMemberId) | **PUT** /fleets/{fleet_id}/members/{member_id}/ | Move fleet member
[**putFleetsFleetIdSquadsSquadId**](FleetsApi.md#putFleetsFleetIdSquadsSquadId) | **PUT** /fleets/{fleet_id}/squads/{squad_id}/ | Rename fleet squad
[**putFleetsFleetIdWingsWingId**](FleetsApi.md#putFleetsFleetIdWingsWingId) | **PUT** /fleets/{fleet_id}/wings/{wing_id}/ | Rename fleet wing


<a name="deleteFleetsFleetIdMembersMemberId"></a>
# **deleteFleetsFleetIdMembersMemberId**
> deleteFleetsFleetIdMembersMemberId(datasource, fleetId, memberId, token)

Kick fleet member

Kick a fleet member  --- Alternate route: &#x60;/dev/fleets/{fleet_id}/members/{member_id}/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/members/{member_id}/&#x60;  Alternate route: &#x60;/v1/fleets/{fleet_id}/members/{member_id}/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = FleetsApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val fleetId : kotlin.Long = 789 // kotlin.Long | ID for a fleet
val memberId : kotlin.Int = 56 // kotlin.Int | The character ID of a member in this fleet
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    apiInstance.deleteFleetsFleetIdMembersMemberId(datasource, fleetId, memberId, token)
} catch (e: ClientException) {
    println("4xx response calling FleetsApi#deleteFleetsFleetIdMembersMemberId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetsApi#deleteFleetsFleetIdMembersMemberId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **fleetId** | **kotlin.Long**| ID for a fleet |
 **memberId** | **kotlin.Int**| The character ID of a member in this fleet |
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

null (empty response body)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteFleetsFleetIdSquadsSquadId"></a>
# **deleteFleetsFleetIdSquadsSquadId**
> deleteFleetsFleetIdSquadsSquadId(datasource, fleetId, squadId, token)

Delete fleet squad

Delete a fleet squad, only empty squads can be deleted  --- Alternate route: &#x60;/dev/fleets/{fleet_id}/squads/{squad_id}/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/squads/{squad_id}/&#x60;  Alternate route: &#x60;/v1/fleets/{fleet_id}/squads/{squad_id}/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = FleetsApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val fleetId : kotlin.Long = 789 // kotlin.Long | ID for a fleet
val squadId : kotlin.Long = 789 // kotlin.Long | The squad to delete
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    apiInstance.deleteFleetsFleetIdSquadsSquadId(datasource, fleetId, squadId, token)
} catch (e: ClientException) {
    println("4xx response calling FleetsApi#deleteFleetsFleetIdSquadsSquadId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetsApi#deleteFleetsFleetIdSquadsSquadId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **fleetId** | **kotlin.Long**| ID for a fleet |
 **squadId** | **kotlin.Long**| The squad to delete |
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

null (empty response body)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteFleetsFleetIdWingsWingId"></a>
# **deleteFleetsFleetIdWingsWingId**
> deleteFleetsFleetIdWingsWingId(datasource, fleetId, token, wingId)

Delete fleet wing

Delete a fleet wing, only empty wings can be deleted. The wing may contain squads, but the squads must be empty  --- Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/{wing_id}/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/wings/{wing_id}/&#x60;  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/{wing_id}/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = FleetsApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val fleetId : kotlin.Long = 789 // kotlin.Long | ID for a fleet
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
val wingId : kotlin.Long = 789 // kotlin.Long | The wing to delete
try {
    apiInstance.deleteFleetsFleetIdWingsWingId(datasource, fleetId, token, wingId)
} catch (e: ClientException) {
    println("4xx response calling FleetsApi#deleteFleetsFleetIdWingsWingId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetsApi#deleteFleetsFleetIdWingsWingId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **fleetId** | **kotlin.Long**| ID for a fleet |
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]
 **wingId** | **kotlin.Long**| The wing to delete |

### Return type

null (empty response body)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdFleet"></a>
# **getCharactersCharacterIdFleet**
> GetCharactersCharacterIdFleetOk getCharactersCharacterIdFleet(characterId, datasource, ifMinusNoneMinusMatch, token)

Get character fleet info

Return the fleet ID the character is in, if any.  --- Alternate route: &#x60;/legacy/characters/{character_id}/fleet/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/fleet/&#x60;  --- This route is cached for up to 60 seconds  --- Warning: This route has an upgrade available  --- [Diff of the upcoming changes](https://esi.evetech.net/diff/latest/dev/#GET-/characters/{character_id}/fleet/)

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = FleetsApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : GetCharactersCharacterIdFleetOk = apiInstance.getCharactersCharacterIdFleet(characterId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetsApi#getCharactersCharacterIdFleet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetsApi#getCharactersCharacterIdFleet")
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

[**GetCharactersCharacterIdFleetOk**](GetCharactersCharacterIdFleetOk.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFleetsFleetId"></a>
# **getFleetsFleetId**
> GetFleetsFleetIdOk getFleetsFleetId(datasource, fleetId, ifMinusNoneMinusMatch, token)

Get fleet information

Return details about a fleet  --- Alternate route: &#x60;/dev/fleets/{fleet_id}/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/&#x60;  Alternate route: &#x60;/v1/fleets/{fleet_id}/&#x60;  --- This route is cached for up to 5 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = FleetsApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val fleetId : kotlin.Long = 789 // kotlin.Long | ID for a fleet
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : GetFleetsFleetIdOk = apiInstance.getFleetsFleetId(datasource, fleetId, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetsApi#getFleetsFleetId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetsApi#getFleetsFleetId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **fleetId** | **kotlin.Long**| ID for a fleet |
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**GetFleetsFleetIdOk**](GetFleetsFleetIdOk.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFleetsFleetIdMembers"></a>
# **getFleetsFleetIdMembers**
> kotlin.Array&lt;GetFleetsFleetIdMembers200Ok&gt; getFleetsFleetIdMembers(acceptMinusLanguage, datasource, fleetId, ifMinusNoneMinusMatch, language, token)

Get fleet members

Return information about fleet members  --- Alternate route: &#x60;/dev/fleets/{fleet_id}/members/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/members/&#x60;  Alternate route: &#x60;/v1/fleets/{fleet_id}/members/&#x60;  --- This route is cached for up to 5 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = FleetsApi()
val acceptMinusLanguage : kotlin.String = acceptMinusLanguage_example // kotlin.String | Language to use in the response
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val fleetId : kotlin.Long = 789 // kotlin.Long | ID for a fleet
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val language : kotlin.String = language_example // kotlin.String | Language to use in the response, takes precedence over Accept-Language
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetFleetsFleetIdMembers200Ok> = apiInstance.getFleetsFleetIdMembers(acceptMinusLanguage, datasource, fleetId, ifMinusNoneMinusMatch, language, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetsApi#getFleetsFleetIdMembers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetsApi#getFleetsFleetIdMembers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptMinusLanguage** | **kotlin.String**| Language to use in the response | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **fleetId** | **kotlin.Long**| ID for a fleet |
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **language** | **kotlin.String**| Language to use in the response, takes precedence over Accept-Language | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**kotlin.Array&lt;GetFleetsFleetIdMembers200Ok&gt;**](GetFleetsFleetIdMembers200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFleetsFleetIdWings"></a>
# **getFleetsFleetIdWings**
> kotlin.Array&lt;GetFleetsFleetIdWings200Ok&gt; getFleetsFleetIdWings(acceptMinusLanguage, datasource, fleetId, ifMinusNoneMinusMatch, language, token)

Get fleet wings

Return information about wings in a fleet  --- Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/wings/&#x60;  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/&#x60;  --- This route is cached for up to 5 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = FleetsApi()
val acceptMinusLanguage : kotlin.String = acceptMinusLanguage_example // kotlin.String | Language to use in the response
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val fleetId : kotlin.Long = 789 // kotlin.Long | ID for a fleet
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val language : kotlin.String = language_example // kotlin.String | Language to use in the response, takes precedence over Accept-Language
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetFleetsFleetIdWings200Ok> = apiInstance.getFleetsFleetIdWings(acceptMinusLanguage, datasource, fleetId, ifMinusNoneMinusMatch, language, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetsApi#getFleetsFleetIdWings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetsApi#getFleetsFleetIdWings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptMinusLanguage** | **kotlin.String**| Language to use in the response | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **fleetId** | **kotlin.Long**| ID for a fleet |
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **language** | **kotlin.String**| Language to use in the response, takes precedence over Accept-Language | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**kotlin.Array&lt;GetFleetsFleetIdWings200Ok&gt;**](GetFleetsFleetIdWings200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postFleetsFleetIdMembers"></a>
# **postFleetsFleetIdMembers**
> postFleetsFleetIdMembers(datasource, fleetId, token, invitation)

Create fleet invitation

Invite a character into the fleet. If a character has a CSPA charge set it is not possible to invite them to the fleet using ESI  --- Alternate route: &#x60;/dev/fleets/{fleet_id}/members/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/members/&#x60;  Alternate route: &#x60;/v1/fleets/{fleet_id}/members/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = FleetsApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val fleetId : kotlin.Long = 789 // kotlin.Long | ID for a fleet
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
val invitation : PostFleetsFleetIdMembersInvitation =  // PostFleetsFleetIdMembersInvitation | 
try {
    apiInstance.postFleetsFleetIdMembers(datasource, fleetId, token, invitation)
} catch (e: ClientException) {
    println("4xx response calling FleetsApi#postFleetsFleetIdMembers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetsApi#postFleetsFleetIdMembers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **fleetId** | **kotlin.Long**| ID for a fleet |
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]
 **invitation** | [**PostFleetsFleetIdMembersInvitation**](PostFleetsFleetIdMembersInvitation.md)|  |

### Return type

null (empty response body)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postFleetsFleetIdWings"></a>
# **postFleetsFleetIdWings**
> PostFleetsFleetIdWingsCreated postFleetsFleetIdWings(datasource, fleetId, token)

Create fleet wing

Create a new wing in a fleet  --- Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/wings/&#x60;  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = FleetsApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val fleetId : kotlin.Long = 789 // kotlin.Long | ID for a fleet
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : PostFleetsFleetIdWingsCreated = apiInstance.postFleetsFleetIdWings(datasource, fleetId, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetsApi#postFleetsFleetIdWings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetsApi#postFleetsFleetIdWings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **fleetId** | **kotlin.Long**| ID for a fleet |
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**PostFleetsFleetIdWingsCreated**](PostFleetsFleetIdWingsCreated.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postFleetsFleetIdWingsWingIdSquads"></a>
# **postFleetsFleetIdWingsWingIdSquads**
> PostFleetsFleetIdWingsWingIdSquadsCreated postFleetsFleetIdWingsWingIdSquads(datasource, fleetId, token, wingId)

Create fleet squad

Create a new squad in a fleet  --- Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/{wing_id}/squads/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/wings/{wing_id}/squads/&#x60;  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/{wing_id}/squads/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = FleetsApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val fleetId : kotlin.Long = 789 // kotlin.Long | ID for a fleet
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
val wingId : kotlin.Long = 789 // kotlin.Long | The wing_id to create squad in
try {
    val result : PostFleetsFleetIdWingsWingIdSquadsCreated = apiInstance.postFleetsFleetIdWingsWingIdSquads(datasource, fleetId, token, wingId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FleetsApi#postFleetsFleetIdWingsWingIdSquads")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetsApi#postFleetsFleetIdWingsWingIdSquads")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **fleetId** | **kotlin.Long**| ID for a fleet |
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]
 **wingId** | **kotlin.Long**| The wing_id to create squad in |

### Return type

[**PostFleetsFleetIdWingsWingIdSquadsCreated**](PostFleetsFleetIdWingsWingIdSquadsCreated.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="putFleetsFleetId"></a>
# **putFleetsFleetId**
> putFleetsFleetId(datasource, fleetId, token, newSettings)

Update fleet

Update settings about a fleet  --- Alternate route: &#x60;/dev/fleets/{fleet_id}/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/&#x60;  Alternate route: &#x60;/v1/fleets/{fleet_id}/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = FleetsApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val fleetId : kotlin.Long = 789 // kotlin.Long | ID for a fleet
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
val newSettings : PutFleetsFleetIdNewSettings =  // PutFleetsFleetIdNewSettings | 
try {
    apiInstance.putFleetsFleetId(datasource, fleetId, token, newSettings)
} catch (e: ClientException) {
    println("4xx response calling FleetsApi#putFleetsFleetId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetsApi#putFleetsFleetId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **fleetId** | **kotlin.Long**| ID for a fleet |
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]
 **newSettings** | [**PutFleetsFleetIdNewSettings**](PutFleetsFleetIdNewSettings.md)|  |

### Return type

null (empty response body)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putFleetsFleetIdMembersMemberId"></a>
# **putFleetsFleetIdMembersMemberId**
> putFleetsFleetIdMembersMemberId(datasource, fleetId, memberId, token, movement)

Move fleet member

Move a fleet member around  --- Alternate route: &#x60;/dev/fleets/{fleet_id}/members/{member_id}/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/members/{member_id}/&#x60;  Alternate route: &#x60;/v1/fleets/{fleet_id}/members/{member_id}/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = FleetsApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val fleetId : kotlin.Long = 789 // kotlin.Long | ID for a fleet
val memberId : kotlin.Int = 56 // kotlin.Int | The character ID of a member in this fleet
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
val movement : PutFleetsFleetIdMembersMemberIdMovement =  // PutFleetsFleetIdMembersMemberIdMovement | 
try {
    apiInstance.putFleetsFleetIdMembersMemberId(datasource, fleetId, memberId, token, movement)
} catch (e: ClientException) {
    println("4xx response calling FleetsApi#putFleetsFleetIdMembersMemberId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetsApi#putFleetsFleetIdMembersMemberId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **fleetId** | **kotlin.Long**| ID for a fleet |
 **memberId** | **kotlin.Int**| The character ID of a member in this fleet |
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]
 **movement** | [**PutFleetsFleetIdMembersMemberIdMovement**](PutFleetsFleetIdMembersMemberIdMovement.md)|  |

### Return type

null (empty response body)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putFleetsFleetIdSquadsSquadId"></a>
# **putFleetsFleetIdSquadsSquadId**
> putFleetsFleetIdSquadsSquadId(datasource, fleetId, squadId, token, naming)

Rename fleet squad

Rename a fleet squad  --- Alternate route: &#x60;/dev/fleets/{fleet_id}/squads/{squad_id}/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/squads/{squad_id}/&#x60;  Alternate route: &#x60;/v1/fleets/{fleet_id}/squads/{squad_id}/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = FleetsApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val fleetId : kotlin.Long = 789 // kotlin.Long | ID for a fleet
val squadId : kotlin.Long = 789 // kotlin.Long | The squad to rename
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
val naming : PutFleetsFleetIdSquadsSquadIdNaming =  // PutFleetsFleetIdSquadsSquadIdNaming | 
try {
    apiInstance.putFleetsFleetIdSquadsSquadId(datasource, fleetId, squadId, token, naming)
} catch (e: ClientException) {
    println("4xx response calling FleetsApi#putFleetsFleetIdSquadsSquadId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetsApi#putFleetsFleetIdSquadsSquadId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **fleetId** | **kotlin.Long**| ID for a fleet |
 **squadId** | **kotlin.Long**| The squad to rename |
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]
 **naming** | [**PutFleetsFleetIdSquadsSquadIdNaming**](PutFleetsFleetIdSquadsSquadIdNaming.md)|  |

### Return type

null (empty response body)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putFleetsFleetIdWingsWingId"></a>
# **putFleetsFleetIdWingsWingId**
> putFleetsFleetIdWingsWingId(datasource, fleetId, token, wingId, naming)

Rename fleet wing

Rename a fleet wing  --- Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/{wing_id}/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/wings/{wing_id}/&#x60;  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/{wing_id}/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = FleetsApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val fleetId : kotlin.Long = 789 // kotlin.Long | ID for a fleet
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
val wingId : kotlin.Long = 789 // kotlin.Long | The wing to rename
val naming : PutFleetsFleetIdWingsWingIdNaming =  // PutFleetsFleetIdWingsWingIdNaming | 
try {
    apiInstance.putFleetsFleetIdWingsWingId(datasource, fleetId, token, wingId, naming)
} catch (e: ClientException) {
    println("4xx response calling FleetsApi#putFleetsFleetIdWingsWingId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FleetsApi#putFleetsFleetIdWingsWingId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **fleetId** | **kotlin.Long**| ID for a fleet |
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]
 **wingId** | **kotlin.Long**| The wing to rename |
 **naming** | [**PutFleetsFleetIdWingsWingIdNaming**](PutFleetsFleetIdWingsWingIdNaming.md)|  |

### Return type

null (empty response body)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

