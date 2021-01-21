# UserInterfaceApi

All URIs are relative to *https://esi.evetech.net/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postUiAutopilotWaypoint**](UserInterfaceApi.md#postUiAutopilotWaypoint) | **POST** /ui/autopilot/waypoint/ | Set Autopilot Waypoint
[**postUiOpenwindowContract**](UserInterfaceApi.md#postUiOpenwindowContract) | **POST** /ui/openwindow/contract/ | Open Contract Window
[**postUiOpenwindowInformation**](UserInterfaceApi.md#postUiOpenwindowInformation) | **POST** /ui/openwindow/information/ | Open Information Window
[**postUiOpenwindowMarketdetails**](UserInterfaceApi.md#postUiOpenwindowMarketdetails) | **POST** /ui/openwindow/marketdetails/ | Open Market Details
[**postUiOpenwindowNewmail**](UserInterfaceApi.md#postUiOpenwindowNewmail) | **POST** /ui/openwindow/newmail/ | Open New Mail Window


<a name="postUiAutopilotWaypoint"></a>
# **postUiAutopilotWaypoint**
> postUiAutopilotWaypoint(addToBeginning, clearOtherWaypoints, datasource, destinationId, token)

Set Autopilot Waypoint

Set a solar system as autopilot waypoint  --- Alternate route: &#x60;/dev/ui/autopilot/waypoint/&#x60;  Alternate route: &#x60;/legacy/ui/autopilot/waypoint/&#x60;  Alternate route: &#x60;/v2/ui/autopilot/waypoint/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UserInterfaceApi()
val addToBeginning : kotlin.Boolean = true // kotlin.Boolean | Whether this solar system should be added to the beginning of all waypoints
val clearOtherWaypoints : kotlin.Boolean = true // kotlin.Boolean | Whether clean other waypoints beforing adding this one
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val destinationId : kotlin.Long = 789 // kotlin.Long | The destination to travel to, can be solar system, station or structure's id
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    apiInstance.postUiAutopilotWaypoint(addToBeginning, clearOtherWaypoints, datasource, destinationId, token)
} catch (e: ClientException) {
    println("4xx response calling UserInterfaceApi#postUiAutopilotWaypoint")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserInterfaceApi#postUiAutopilotWaypoint")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addToBeginning** | **kotlin.Boolean**| Whether this solar system should be added to the beginning of all waypoints | [default to false]
 **clearOtherWaypoints** | **kotlin.Boolean**| Whether clean other waypoints beforing adding this one | [default to false]
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **destinationId** | **kotlin.Long**| The destination to travel to, can be solar system, station or structure&#39;s id |
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

null (empty response body)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postUiOpenwindowContract"></a>
# **postUiOpenwindowContract**
> postUiOpenwindowContract(contractId, datasource, token)

Open Contract Window

Open the contract window inside the client  --- Alternate route: &#x60;/dev/ui/openwindow/contract/&#x60;  Alternate route: &#x60;/legacy/ui/openwindow/contract/&#x60;  Alternate route: &#x60;/v1/ui/openwindow/contract/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UserInterfaceApi()
val contractId : kotlin.Int = 56 // kotlin.Int | The contract to open
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    apiInstance.postUiOpenwindowContract(contractId, datasource, token)
} catch (e: ClientException) {
    println("4xx response calling UserInterfaceApi#postUiOpenwindowContract")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserInterfaceApi#postUiOpenwindowContract")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractId** | **kotlin.Int**| The contract to open |
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

<a name="postUiOpenwindowInformation"></a>
# **postUiOpenwindowInformation**
> postUiOpenwindowInformation(datasource, targetId, token)

Open Information Window

Open the information window for a character, corporation or alliance inside the client  --- Alternate route: &#x60;/dev/ui/openwindow/information/&#x60;  Alternate route: &#x60;/legacy/ui/openwindow/information/&#x60;  Alternate route: &#x60;/v1/ui/openwindow/information/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UserInterfaceApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val targetId : kotlin.Int = 56 // kotlin.Int | The target to open
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    apiInstance.postUiOpenwindowInformation(datasource, targetId, token)
} catch (e: ClientException) {
    println("4xx response calling UserInterfaceApi#postUiOpenwindowInformation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserInterfaceApi#postUiOpenwindowInformation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **targetId** | **kotlin.Int**| The target to open |
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

null (empty response body)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postUiOpenwindowMarketdetails"></a>
# **postUiOpenwindowMarketdetails**
> postUiOpenwindowMarketdetails(datasource, token, typeId)

Open Market Details

Open the market details window for a specific typeID inside the client  --- Alternate route: &#x60;/dev/ui/openwindow/marketdetails/&#x60;  Alternate route: &#x60;/legacy/ui/openwindow/marketdetails/&#x60;  Alternate route: &#x60;/v1/ui/openwindow/marketdetails/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UserInterfaceApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
val typeId : kotlin.Int = 56 // kotlin.Int | The item type to open in market window
try {
    apiInstance.postUiOpenwindowMarketdetails(datasource, token, typeId)
} catch (e: ClientException) {
    println("4xx response calling UserInterfaceApi#postUiOpenwindowMarketdetails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserInterfaceApi#postUiOpenwindowMarketdetails")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]
 **typeId** | **kotlin.Int**| The item type to open in market window |

### Return type

null (empty response body)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postUiOpenwindowNewmail"></a>
# **postUiOpenwindowNewmail**
> postUiOpenwindowNewmail(datasource, token, newMail)

Open New Mail Window

Open the New Mail window, according to settings from the request if applicable  --- Alternate route: &#x60;/dev/ui/openwindow/newmail/&#x60;  Alternate route: &#x60;/legacy/ui/openwindow/newmail/&#x60;  Alternate route: &#x60;/v1/ui/openwindow/newmail/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UserInterfaceApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
val newMail : PostUiOpenwindowNewmailNewMail =  // PostUiOpenwindowNewmailNewMail | 
try {
    apiInstance.postUiOpenwindowNewmail(datasource, token, newMail)
} catch (e: ClientException) {
    println("4xx response calling UserInterfaceApi#postUiOpenwindowNewmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserInterfaceApi#postUiOpenwindowNewmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]
 **newMail** | [**PostUiOpenwindowNewmailNewMail**](PostUiOpenwindowNewmailNewMail.md)|  |

### Return type

null (empty response body)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

