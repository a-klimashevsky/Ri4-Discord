# RoutesApi

All URIs are relative to *https://esi.evetech.net/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRouteOriginDestination**](RoutesApi.md#getRouteOriginDestination) | **GET** /route/{origin}/{destination}/ | Get route


<a name="getRouteOriginDestination"></a>
# **getRouteOriginDestination**
> kotlin.Array&lt;kotlin.Int&gt; getRouteOriginDestination(avoid, connections, datasource, destination, flag, ifMinusNoneMinusMatch, origin)

Get route

Get the systems between origin and destination  --- Alternate route: &#x60;/dev/route/{origin}/{destination}/&#x60;  Alternate route: &#x60;/legacy/route/{origin}/{destination}/&#x60;  Alternate route: &#x60;/v1/route/{origin}/{destination}/&#x60;  --- This route is cached for up to 86400 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = RoutesApi()
val avoid : kotlin.collections.Set<kotlin.Int> =  // kotlin.collections.Set<kotlin.Int> | avoid solar system ID(s)
val connections : kotlin.collections.Set<kotlin.collections.Set<kotlin.Int>> =  // kotlin.collections.Set<kotlin.collections.Set<kotlin.Int>> | connected solar system pairs
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val destination : kotlin.Int = 56 // kotlin.Int | destination solar system ID
val flag : kotlin.String = flag_example // kotlin.String | route security preference
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val origin : kotlin.Int = 56 // kotlin.Int | origin solar system ID
try {
    val result : kotlin.Array<kotlin.Int> = apiInstance.getRouteOriginDestination(avoid, connections, datasource, destination, flag, ifMinusNoneMinusMatch, origin)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoutesApi#getRouteOriginDestination")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoutesApi#getRouteOriginDestination")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **avoid** | [**kotlin.collections.Set&lt;kotlin.Int&gt;**](kotlin.Int.md)| avoid solar system ID(s) | [optional]
 **connections** | [**kotlin.collections.Set&lt;kotlin.collections.Set&lt;kotlin.Int&gt;&gt;**](kotlin.collections.Set&lt;kotlin.Int&gt;.md)| connected solar system pairs | [optional]
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **destination** | **kotlin.Int**| destination solar system ID |
 **flag** | **kotlin.String**| route security preference | [optional] [default to &quot;shortest&quot;] [enum: shortest, secure, insecure]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **origin** | **kotlin.Int**| origin solar system ID |

### Return type

**kotlin.Array&lt;kotlin.Int&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

