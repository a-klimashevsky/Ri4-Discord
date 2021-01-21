# ContactsApi

All URIs are relative to *https://esi.evetech.net/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCharactersCharacterIdContacts**](ContactsApi.md#deleteCharactersCharacterIdContacts) | **DELETE** /characters/{character_id}/contacts/ | Delete contacts
[**getAlliancesAllianceIdContacts**](ContactsApi.md#getAlliancesAllianceIdContacts) | **GET** /alliances/{alliance_id}/contacts/ | Get alliance contacts
[**getAlliancesAllianceIdContactsLabels**](ContactsApi.md#getAlliancesAllianceIdContactsLabels) | **GET** /alliances/{alliance_id}/contacts/labels/ | Get alliance contact labels
[**getCharactersCharacterIdContacts**](ContactsApi.md#getCharactersCharacterIdContacts) | **GET** /characters/{character_id}/contacts/ | Get contacts
[**getCharactersCharacterIdContactsLabels**](ContactsApi.md#getCharactersCharacterIdContactsLabels) | **GET** /characters/{character_id}/contacts/labels/ | Get contact labels
[**getCorporationsCorporationIdContacts**](ContactsApi.md#getCorporationsCorporationIdContacts) | **GET** /corporations/{corporation_id}/contacts/ | Get corporation contacts
[**getCorporationsCorporationIdContactsLabels**](ContactsApi.md#getCorporationsCorporationIdContactsLabels) | **GET** /corporations/{corporation_id}/contacts/labels/ | Get corporation contact labels
[**postCharactersCharacterIdContacts**](ContactsApi.md#postCharactersCharacterIdContacts) | **POST** /characters/{character_id}/contacts/ | Add contacts
[**putCharactersCharacterIdContacts**](ContactsApi.md#putCharactersCharacterIdContacts) | **PUT** /characters/{character_id}/contacts/ | Edit contacts


<a name="deleteCharactersCharacterIdContacts"></a>
# **deleteCharactersCharacterIdContacts**
> deleteCharactersCharacterIdContacts(characterId, contactIds, datasource, token)

Delete contacts

Bulk delete contacts  --- Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/contacts/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = ContactsApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val contactIds : kotlin.Array<kotlin.Int> =  // kotlin.Array<kotlin.Int> | A list of contacts to delete
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    apiInstance.deleteCharactersCharacterIdContacts(characterId, contactIds, datasource, token)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#deleteCharactersCharacterIdContacts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#deleteCharactersCharacterIdContacts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **contactIds** | [**kotlin.Array&lt;kotlin.Int&gt;**](kotlin.Int.md)| A list of contacts to delete |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

null (empty response body)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAlliancesAllianceIdContacts"></a>
# **getAlliancesAllianceIdContacts**
> kotlin.Array&lt;GetAlliancesAllianceIdContacts200Ok&gt; getAlliancesAllianceIdContacts(allianceId, datasource, ifMinusNoneMinusMatch, page, token)

Get alliance contacts

Return contacts of an alliance  --- Alternate route: &#x60;/dev/alliances/{alliance_id}/contacts/&#x60;  Alternate route: &#x60;/v2/alliances/{alliance_id}/contacts/&#x60;  --- This route is cached for up to 300 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = ContactsApi()
val allianceId : kotlin.Int = 56 // kotlin.Int | An EVE alliance ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetAlliancesAllianceIdContacts200Ok> = apiInstance.getAlliancesAllianceIdContacts(allianceId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getAlliancesAllianceIdContacts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getAlliancesAllianceIdContacts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allianceId** | **kotlin.Int**| An EVE alliance ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **kotlin.Int**| Which page of results to return | [optional] [default to 1]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**kotlin.Array&lt;GetAlliancesAllianceIdContacts200Ok&gt;**](GetAlliancesAllianceIdContacts200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAlliancesAllianceIdContactsLabels"></a>
# **getAlliancesAllianceIdContactsLabels**
> kotlin.Array&lt;GetAlliancesAllianceIdContactsLabels200Ok&gt; getAlliancesAllianceIdContactsLabels(allianceId, datasource, ifMinusNoneMinusMatch, token)

Get alliance contact labels

Return custom labels for an alliance&#39;s contacts  --- Alternate route: &#x60;/dev/alliances/{alliance_id}/contacts/labels/&#x60;  Alternate route: &#x60;/legacy/alliances/{alliance_id}/contacts/labels/&#x60;  Alternate route: &#x60;/v1/alliances/{alliance_id}/contacts/labels/&#x60;  --- This route is cached for up to 300 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = ContactsApi()
val allianceId : kotlin.Int = 56 // kotlin.Int | An EVE alliance ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetAlliancesAllianceIdContactsLabels200Ok> = apiInstance.getAlliancesAllianceIdContactsLabels(allianceId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getAlliancesAllianceIdContactsLabels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getAlliancesAllianceIdContactsLabels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allianceId** | **kotlin.Int**| An EVE alliance ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**kotlin.Array&lt;GetAlliancesAllianceIdContactsLabels200Ok&gt;**](GetAlliancesAllianceIdContactsLabels200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdContacts"></a>
# **getCharactersCharacterIdContacts**
> kotlin.Array&lt;GetCharactersCharacterIdContacts200Ok&gt; getCharactersCharacterIdContacts(characterId, datasource, ifMinusNoneMinusMatch, page, token)

Get contacts

Return contacts of a character  --- Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/contacts/&#x60;  --- This route is cached for up to 300 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = ContactsApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdContacts200Ok> = apiInstance.getCharactersCharacterIdContacts(characterId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getCharactersCharacterIdContacts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getCharactersCharacterIdContacts")
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

[**kotlin.Array&lt;GetCharactersCharacterIdContacts200Ok&gt;**](GetCharactersCharacterIdContacts200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdContactsLabels"></a>
# **getCharactersCharacterIdContactsLabels**
> kotlin.Array&lt;GetCharactersCharacterIdContactsLabels200Ok&gt; getCharactersCharacterIdContactsLabels(characterId, datasource, ifMinusNoneMinusMatch, token)

Get contact labels

Return custom labels for a character&#39;s contacts  --- Alternate route: &#x60;/dev/characters/{character_id}/contacts/labels/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contacts/labels/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/contacts/labels/&#x60;  --- This route is cached for up to 300 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = ContactsApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdContactsLabels200Ok> = apiInstance.getCharactersCharacterIdContactsLabels(characterId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getCharactersCharacterIdContactsLabels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getCharactersCharacterIdContactsLabels")
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

[**kotlin.Array&lt;GetCharactersCharacterIdContactsLabels200Ok&gt;**](GetCharactersCharacterIdContactsLabels200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdContacts"></a>
# **getCorporationsCorporationIdContacts**
> kotlin.Array&lt;GetCorporationsCorporationIdContacts200Ok&gt; getCorporationsCorporationIdContacts(corporationId, datasource, ifMinusNoneMinusMatch, page, token)

Get corporation contacts

Return contacts of a corporation  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/contacts/&#x60;  Alternate route: &#x60;/v2/corporations/{corporation_id}/contacts/&#x60;  --- This route is cached for up to 300 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = ContactsApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdContacts200Ok> = apiInstance.getCorporationsCorporationIdContacts(corporationId, datasource, ifMinusNoneMinusMatch, page, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getCorporationsCorporationIdContacts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getCorporationsCorporationIdContacts")
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

[**kotlin.Array&lt;GetCorporationsCorporationIdContacts200Ok&gt;**](GetCorporationsCorporationIdContacts200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdContactsLabels"></a>
# **getCorporationsCorporationIdContactsLabels**
> kotlin.Array&lt;GetCorporationsCorporationIdContactsLabels200Ok&gt; getCorporationsCorporationIdContactsLabels(corporationId, datasource, ifMinusNoneMinusMatch, token)

Get corporation contact labels

Return custom labels for a corporation&#39;s contacts  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/contacts/labels/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/contacts/labels/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/contacts/labels/&#x60;  --- This route is cached for up to 300 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = ContactsApi()
val corporationId : kotlin.Int = 56 // kotlin.Int | An EVE corporation ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCorporationsCorporationIdContactsLabels200Ok> = apiInstance.getCorporationsCorporationIdContactsLabels(corporationId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getCorporationsCorporationIdContactsLabels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getCorporationsCorporationIdContactsLabels")
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

[**kotlin.Array&lt;GetCorporationsCorporationIdContactsLabels200Ok&gt;**](GetCorporationsCorporationIdContactsLabels200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postCharactersCharacterIdContacts"></a>
# **postCharactersCharacterIdContacts**
> kotlin.Array&lt;kotlin.Int&gt; postCharactersCharacterIdContacts(characterId, datasource, labelIds, standing, token, watched, contactIds)

Add contacts

Bulk add contacts with same settings  --- Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/contacts/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = ContactsApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val labelIds : kotlin.Array<kotlin.Long> =  // kotlin.Array<kotlin.Long> | Add custom labels to the new contact
val standing : kotlin.Float = 3.4 // kotlin.Float | Standing for the contact
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
val watched : kotlin.Boolean = true // kotlin.Boolean | Whether the contact should be watched, note this is only effective on characters
val contactIds : kotlin.Array<kotlin.Int> =  // kotlin.Array<kotlin.Int> | A list of contacts
try {
    val result : kotlin.Array<kotlin.Int> = apiInstance.postCharactersCharacterIdContacts(characterId, datasource, labelIds, standing, token, watched, contactIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#postCharactersCharacterIdContacts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#postCharactersCharacterIdContacts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **labelIds** | [**kotlin.Array&lt;kotlin.Long&gt;**](kotlin.Long.md)| Add custom labels to the new contact | [optional]
 **standing** | **kotlin.Float**| Standing for the contact |
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]
 **watched** | **kotlin.Boolean**| Whether the contact should be watched, note this is only effective on characters | [optional] [default to false]
 **contactIds** | [**kotlin.Array&lt;kotlin.Int&gt;**](kotlin.Int.md)| A list of contacts |

### Return type

**kotlin.Array&lt;kotlin.Int&gt;**

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putCharactersCharacterIdContacts"></a>
# **putCharactersCharacterIdContacts**
> putCharactersCharacterIdContacts(characterId, datasource, labelIds, standing, token, watched, contactIds)

Edit contacts

Bulk edit contacts with same settings  --- Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/contacts/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = ContactsApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val labelIds : kotlin.Array<kotlin.Long> =  // kotlin.Array<kotlin.Long> | Add custom labels to the contact
val standing : kotlin.Float = 3.4 // kotlin.Float | Standing for the contact
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
val watched : kotlin.Boolean = true // kotlin.Boolean | Whether the contact should be watched, note this is only effective on characters
val contactIds : kotlin.Array<kotlin.Int> =  // kotlin.Array<kotlin.Int> | A list of contacts
try {
    apiInstance.putCharactersCharacterIdContacts(characterId, datasource, labelIds, standing, token, watched, contactIds)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#putCharactersCharacterIdContacts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#putCharactersCharacterIdContacts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **labelIds** | [**kotlin.Array&lt;kotlin.Long&gt;**](kotlin.Long.md)| Add custom labels to the contact | [optional]
 **standing** | **kotlin.Float**| Standing for the contact |
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]
 **watched** | **kotlin.Boolean**| Whether the contact should be watched, note this is only effective on characters | [optional] [default to false]
 **contactIds** | [**kotlin.Array&lt;kotlin.Int&gt;**](kotlin.Int.md)| A list of contacts |

### Return type

null (empty response body)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

