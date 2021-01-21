# CalendarApi

All URIs are relative to *https://esi.evetech.net/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdCalendar**](CalendarApi.md#getCharactersCharacterIdCalendar) | **GET** /characters/{character_id}/calendar/ | List calendar event summaries
[**getCharactersCharacterIdCalendarEventId**](CalendarApi.md#getCharactersCharacterIdCalendarEventId) | **GET** /characters/{character_id}/calendar/{event_id}/ | Get an event
[**getCharactersCharacterIdCalendarEventIdAttendees**](CalendarApi.md#getCharactersCharacterIdCalendarEventIdAttendees) | **GET** /characters/{character_id}/calendar/{event_id}/attendees/ | Get attendees
[**putCharactersCharacterIdCalendarEventId**](CalendarApi.md#putCharactersCharacterIdCalendarEventId) | **PUT** /characters/{character_id}/calendar/{event_id}/ | Respond to an event


<a name="getCharactersCharacterIdCalendar"></a>
# **getCharactersCharacterIdCalendar**
> kotlin.Array&lt;GetCharactersCharacterIdCalendar200Ok&gt; getCharactersCharacterIdCalendar(characterId, datasource, fromEvent, ifMinusNoneMinusMatch, token)

List calendar event summaries

Get 50 event summaries from the calendar. If no from_event ID is given, the resource will return the next 50 chronological event summaries from now. If a from_event ID is specified, it will return the next 50 chronological event summaries from after that event  --- Alternate route: &#x60;/dev/characters/{character_id}/calendar/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/calendar/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/calendar/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/calendar/&#x60;  --- This route is cached for up to 5 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CalendarApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val fromEvent : kotlin.Int = 56 // kotlin.Int | The event ID to retrieve events from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdCalendar200Ok> = apiInstance.getCharactersCharacterIdCalendar(characterId, datasource, fromEvent, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CalendarApi#getCharactersCharacterIdCalendar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CalendarApi#getCharactersCharacterIdCalendar")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **fromEvent** | **kotlin.Int**| The event ID to retrieve events from | [optional]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**kotlin.Array&lt;GetCharactersCharacterIdCalendar200Ok&gt;**](GetCharactersCharacterIdCalendar200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdCalendarEventId"></a>
# **getCharactersCharacterIdCalendarEventId**
> GetCharactersCharacterIdCalendarEventIdOk getCharactersCharacterIdCalendarEventId(characterId, datasource, eventId, ifMinusNoneMinusMatch, token)

Get an event

Get all the information for a specific event  --- Alternate route: &#x60;/dev/characters/{character_id}/calendar/{event_id}/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/calendar/{event_id}/&#x60;  Alternate route: &#x60;/v3/characters/{character_id}/calendar/{event_id}/&#x60;  Alternate route: &#x60;/v4/characters/{character_id}/calendar/{event_id}/&#x60;  --- This route is cached for up to 5 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CalendarApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val eventId : kotlin.Int = 56 // kotlin.Int | The id of the event requested
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : GetCharactersCharacterIdCalendarEventIdOk = apiInstance.getCharactersCharacterIdCalendarEventId(characterId, datasource, eventId, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CalendarApi#getCharactersCharacterIdCalendarEventId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CalendarApi#getCharactersCharacterIdCalendarEventId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **eventId** | **kotlin.Int**| The id of the event requested |
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**GetCharactersCharacterIdCalendarEventIdOk**](GetCharactersCharacterIdCalendarEventIdOk.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdCalendarEventIdAttendees"></a>
# **getCharactersCharacterIdCalendarEventIdAttendees**
> kotlin.Array&lt;GetCharactersCharacterIdCalendarEventIdAttendees200Ok&gt; getCharactersCharacterIdCalendarEventIdAttendees(characterId, datasource, eventId, ifMinusNoneMinusMatch, token)

Get attendees

Get all invited attendees for a given event  --- Alternate route: &#x60;/dev/characters/{character_id}/calendar/{event_id}/attendees/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/calendar/{event_id}/attendees/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/calendar/{event_id}/attendees/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/calendar/{event_id}/attendees/&#x60;  --- This route is cached for up to 600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CalendarApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val eventId : kotlin.Int = 56 // kotlin.Int | The id of the event requested
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : kotlin.Array<GetCharactersCharacterIdCalendarEventIdAttendees200Ok> = apiInstance.getCharactersCharacterIdCalendarEventIdAttendees(characterId, datasource, eventId, ifMinusNoneMinusMatch, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CalendarApi#getCharactersCharacterIdCalendarEventIdAttendees")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CalendarApi#getCharactersCharacterIdCalendarEventIdAttendees")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **eventId** | **kotlin.Int**| The id of the event requested |
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**kotlin.Array&lt;GetCharactersCharacterIdCalendarEventIdAttendees200Ok&gt;**](GetCharactersCharacterIdCalendarEventIdAttendees200Ok.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="putCharactersCharacterIdCalendarEventId"></a>
# **putCharactersCharacterIdCalendarEventId**
> putCharactersCharacterIdCalendarEventId(characterId, datasource, eventId, token, response)

Respond to an event

Set your response status to an event  --- Alternate route: &#x60;/dev/characters/{character_id}/calendar/{event_id}/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/calendar/{event_id}/&#x60;  Alternate route: &#x60;/v3/characters/{character_id}/calendar/{event_id}/&#x60;  Alternate route: &#x60;/v4/characters/{character_id}/calendar/{event_id}/&#x60;  --- This route is cached for up to 5 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = CalendarApi()
val characterId : kotlin.Int = 56 // kotlin.Int | An EVE character ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val eventId : kotlin.Int = 56 // kotlin.Int | The ID of the event requested
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
val response : PutCharactersCharacterIdCalendarEventIdResponse =  // PutCharactersCharacterIdCalendarEventIdResponse | 
try {
    apiInstance.putCharactersCharacterIdCalendarEventId(characterId, datasource, eventId, token, response)
} catch (e: ClientException) {
    println("4xx response calling CalendarApi#putCharactersCharacterIdCalendarEventId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CalendarApi#putCharactersCharacterIdCalendarEventId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **kotlin.Int**| An EVE character ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **eventId** | **kotlin.Int**| The ID of the event requested |
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]
 **response** | [**PutCharactersCharacterIdCalendarEventIdResponse**](PutCharactersCharacterIdCalendarEventIdResponse.md)|  |

### Return type

null (empty response body)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

