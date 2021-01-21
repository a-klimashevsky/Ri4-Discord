# MailApi

All URIs are relative to *https://esi.evetech.net/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCharactersCharacterIdMailLabelsLabelId**](MailApi.md#deleteCharactersCharacterIdMailLabelsLabelId) | **DELETE** /characters/{character_id}/mail/labels/{label_id}/ | Delete a mail label
[**deleteCharactersCharacterIdMailMailId**](MailApi.md#deleteCharactersCharacterIdMailMailId) | **DELETE** /characters/{character_id}/mail/{mail_id}/ | Delete a mail
[**getCharactersCharacterIdMail**](MailApi.md#getCharactersCharacterIdMail) | **GET** /characters/{character_id}/mail/ | Return mail headers
[**getCharactersCharacterIdMailLabels**](MailApi.md#getCharactersCharacterIdMailLabels) | **GET** /characters/{character_id}/mail/labels/ | Get mail labels and unread counts
[**getCharactersCharacterIdMailLists**](MailApi.md#getCharactersCharacterIdMailLists) | **GET** /characters/{character_id}/mail/lists/ | Return mailing list subscriptions
[**getCharactersCharacterIdMailMailId**](MailApi.md#getCharactersCharacterIdMailMailId) | **GET** /characters/{character_id}/mail/{mail_id}/ | Return a mail
[**postCharactersCharacterIdMail**](MailApi.md#postCharactersCharacterIdMail) | **POST** /characters/{character_id}/mail/ | Send a new mail
[**postCharactersCharacterIdMailLabels**](MailApi.md#postCharactersCharacterIdMailLabels) | **POST** /characters/{character_id}/mail/labels/ | Create a mail label
[**putCharactersCharacterIdMailMailId**](MailApi.md#putCharactersCharacterIdMailMailId) | **PUT** /characters/{character_id}/mail/{mail_id}/ | Update metadata about a mail


<a name="deleteCharactersCharacterIdMailLabelsLabelId"></a>
# **deleteCharactersCharacterIdMailLabelsLabelId**
> deleteCharactersCharacterIdMailLabelsLabelId(characterId, datasource, labelId, token)

Delete a mail label

Delete a mail label  --- Alternate route: &#x60;/dev/characters/{character_id}/mail/labels/{label_id}/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/labels/{label_id}/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/mail/labels/{label_id}/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = MailApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val labelId : kotlin.Int = 56 // kotlin.Int | An EVE label id
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    apiInstance.deleteCharactersCharacterIdMailLabelsLabelId(characterId, datasource, labelId, token)
} catch (e: ClientException) {
    println("4xx response calling MailApi#deleteCharactersCharacterIdMailLabelsLabelId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailApi#deleteCharactersCharacterIdMailLabelsLabelId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **labelId** | **kotlin.Int**| An EVE label id |
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

null (empty response body)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCharactersCharacterIdMailMailId"></a>
# **deleteCharactersCharacterIdMailMailId**
> deleteCharactersCharacterIdMailMailId(characterId, datasource, mailId, token)

Delete a mail

Delete a mail  --- Alternate route: &#x60;/dev/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/mail/{mail_id}/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = MailApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val mailId : kotlin.Int = 56 // kotlin.Int | An EVE mail ID
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    apiInstance.deleteCharactersCharacterIdMailMailId(characterId, datasource, mailId, token)
} catch (e: ClientException) {
    println("4xx response calling MailApi#deleteCharactersCharacterIdMailMailId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailApi#deleteCharactersCharacterIdMailMailId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **mailId** | **kotlin.Int**| An EVE mail ID |
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

null (empty response body)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdMail"></a>
# **getCharactersCharacterIdMail**
> kotlin.Array&lt;GetCharactersCharacterIdMail200Ok&gt; getCharactersCharacterIdMail(characterId, datasource, ifMinusNoneMinusMatch, labels, lastMailId, token)

Return mail headers

Return the 50 most recent mail headers belonging to the character that match the query criteria. Queries can be filtered by label, and last_mail_id can be used to paginate backwards  --- Alternate route: &#x60;/dev/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/mail/&#x60;  --- This route is cached for up to 30 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = MailApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val labels : kotlin.collections.Set<kotlin.Int> =  // kotlin.collections.Set<kotlin.Int> | Fetch only mails that match one or more of the given labels
val lastMailId : kotlin.Int = 56 // kotlin.Int | List only mail with an ID lower than the given ID, if present
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdMail200Ok> = apiInstance.getCharactersCharacterIdMail(characterId, datasource, ifMinusNoneMinusMatch, labels, lastMailId, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailApi#getCharactersCharacterIdMail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailApi#getCharactersCharacterIdMail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **labels** | [**kotlin.collections.Set&lt;kotlin.Int&gt;**](kotlin.Int.md)| Fetch only mails that match one or more of the given labels | [optional]
 **lastMailId** | **kotlin.Int**| List only mail with an ID lower than the given ID, if present | [optional]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**kotlin.Array&lt;GetCharactersCharacterIdMail200Ok&gt;**](GetCharactersCharacterIdMail200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdMailLabels"></a>
# **getCharactersCharacterIdMailLabels**
> GetCharactersCharacterIdMailLabelsOk getCharactersCharacterIdMailLabels(characterId, datasource, ifMinusNoneMinusMatch, token)

Get mail labels and unread counts

Return a list of the users mail labels, unread counts for each label and a total unread count.  --- Alternate route: &#x60;/dev/characters/{character_id}/mail/labels/&#x60;  Alternate route: &#x60;/v3/characters/{character_id}/mail/labels/&#x60;  --- This route is cached for up to 30 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = MailApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : GetCharactersCharacterIdMailLabelsOk = apiInstance.getCharactersCharacterIdMailLabels(characterId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailApi#getCharactersCharacterIdMailLabels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailApi#getCharactersCharacterIdMailLabels")
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

[**GetCharactersCharacterIdMailLabelsOk**](GetCharactersCharacterIdMailLabelsOk.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdMailLists"></a>
# **getCharactersCharacterIdMailLists**
> kotlin.Array&lt;GetCharactersCharacterIdMailLists200Ok&gt; getCharactersCharacterIdMailLists(characterId, datasource, ifMinusNoneMinusMatch, token)

Return mailing list subscriptions

Return all mailing lists that the character is subscribed to  --- Alternate route: &#x60;/dev/characters/{character_id}/mail/lists/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/lists/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/mail/lists/&#x60;  --- This route is cached for up to 120 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = MailApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdMailLists200Ok> = apiInstance.getCharactersCharacterIdMailLists(characterId, datasource, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailApi#getCharactersCharacterIdMailLists")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailApi#getCharactersCharacterIdMailLists")
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

[**kotlin.Array&lt;GetCharactersCharacterIdMailLists200Ok&gt;**](GetCharactersCharacterIdMailLists200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdMailMailId"></a>
# **getCharactersCharacterIdMailMailId**
> GetCharactersCharacterIdMailMailIdOk getCharactersCharacterIdMailMailId(characterId, datasource, ifMinusNoneMinusMatch, mailId, token)

Return a mail

Return the contents of an EVE mail  --- Alternate route: &#x60;/dev/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/mail/{mail_id}/&#x60;  --- This route is cached for up to 30 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = MailApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val mailId : kotlin.Int = 56 // kotlin.Int | An EVE mail ID
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : GetCharactersCharacterIdMailMailIdOk = apiInstance.getCharactersCharacterIdMailMailId(characterId, datasource, ifMinusNoneMinusMatch, mailId, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailApi#getCharactersCharacterIdMailMailId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailApi#getCharactersCharacterIdMailMailId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **mailId** | **kotlin.Int**| An EVE mail ID |
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**GetCharactersCharacterIdMailMailIdOk**](GetCharactersCharacterIdMailMailIdOk.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postCharactersCharacterIdMail"></a>
# **postCharactersCharacterIdMail**
> kotlin.Int postCharactersCharacterIdMail(characterId, datasource, token, mail)

Send a new mail

Create and send a new mail  --- Alternate route: &#x60;/dev/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/mail/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = MailApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
val mail : PostCharactersCharacterIdMailMail =  // PostCharactersCharacterIdMailMail | 
try {
    val result : kotlin.Int = apiInstance.postCharactersCharacterIdMail(characterId, datasource, token, mail)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailApi#postCharactersCharacterIdMail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailApi#postCharactersCharacterIdMail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]
 **mail** | [**PostCharactersCharacterIdMailMail**](PostCharactersCharacterIdMailMail.md)|  |

### Return type

**kotlin.Int**

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCharactersCharacterIdMailLabels"></a>
# **postCharactersCharacterIdMailLabels**
> kotlin.Int postCharactersCharacterIdMailLabels(characterId, datasource, token, label)

Create a mail label

Create a mail label  --- Alternate route: &#x60;/dev/characters/{character_id}/mail/labels/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/labels/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/mail/labels/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = MailApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
val label : PostCharactersCharacterIdMailLabelsLabel =  // PostCharactersCharacterIdMailLabelsLabel | 
try {
    val result : kotlin.Int = apiInstance.postCharactersCharacterIdMailLabels(characterId, datasource, token, label)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MailApi#postCharactersCharacterIdMailLabels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailApi#postCharactersCharacterIdMailLabels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]
 **label** | [**PostCharactersCharacterIdMailLabelsLabel**](PostCharactersCharacterIdMailLabelsLabel.md)|  |

### Return type

**kotlin.Int**

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putCharactersCharacterIdMailMailId"></a>
# **putCharactersCharacterIdMailMailId**
> putCharactersCharacterIdMailMailId(characterId, datasource, mailId, token, contents)

Update metadata about a mail

Update metadata about a mail  --- Alternate route: &#x60;/dev/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/mail/{mail_id}/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = MailApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val mailId : kotlin.Int = 56 // kotlin.Int | An EVE mail ID
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
val contents : PutCharactersCharacterIdMailMailIdContents =  // PutCharactersCharacterIdMailMailIdContents | 
try {
    apiInstance.putCharactersCharacterIdMailMailId(characterId, datasource, mailId, token, contents)
} catch (e: ClientException) {
    println("4xx response calling MailApi#putCharactersCharacterIdMailMailId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MailApi#putCharactersCharacterIdMailMailId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **mailId** | **kotlin.Int**| An EVE mail ID |
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]
 **contents** | [**PutCharactersCharacterIdMailMailIdContents**](PutCharactersCharacterIdMailMailIdContents.md)|  |

### Return type

null (empty response body)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

