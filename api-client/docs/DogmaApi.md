# DogmaApi

All URIs are relative to *https://esi.evetech.net/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDogmaAttributes**](DogmaApi.md#getDogmaAttributes) | **GET** /dogma/attributes/ | Get attributes
[**getDogmaAttributesAttributeId**](DogmaApi.md#getDogmaAttributesAttributeId) | **GET** /dogma/attributes/{attribute_id}/ | Get attribute information
[**getDogmaDynamicItemsTypeIdItemId**](DogmaApi.md#getDogmaDynamicItemsTypeIdItemId) | **GET** /dogma/dynamic/items/{type_id}/{item_id}/ | Get dynamic item information
[**getDogmaEffects**](DogmaApi.md#getDogmaEffects) | **GET** /dogma/effects/ | Get effects
[**getDogmaEffectsEffectId**](DogmaApi.md#getDogmaEffectsEffectId) | **GET** /dogma/effects/{effect_id}/ | Get effect information


<a name="getDogmaAttributes"></a>
# **getDogmaAttributes**
> kotlin.Array&lt;kotlin.Int&gt; getDogmaAttributes(datasource, ifMinusNoneMinusMatch)

Get attributes

Get a list of dogma attribute ids  --- Alternate route: &#x60;/dev/dogma/attributes/&#x60;  Alternate route: &#x60;/legacy/dogma/attributes/&#x60;  Alternate route: &#x60;/v1/dogma/attributes/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = DogmaApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : kotlin.Array<kotlin.Int> = apiInstance.getDogmaAttributes(datasource, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DogmaApi#getDogmaAttributes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DogmaApi#getDogmaAttributes")
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

<a name="getDogmaAttributesAttributeId"></a>
# **getDogmaAttributesAttributeId**
> GetDogmaAttributesAttributeIdOk getDogmaAttributesAttributeId(attributeId, datasource, ifMinusNoneMinusMatch)

Get attribute information

Get information on a dogma attribute  --- Alternate route: &#x60;/dev/dogma/attributes/{attribute_id}/&#x60;  Alternate route: &#x60;/legacy/dogma/attributes/{attribute_id}/&#x60;  Alternate route: &#x60;/v1/dogma/attributes/{attribute_id}/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = DogmaApi()
val attributeId : kotlin.Int = 56 // kotlin.Int | A dogma attribute ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : GetDogmaAttributesAttributeIdOk = apiInstance.getDogmaAttributesAttributeId(attributeId, datasource, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DogmaApi#getDogmaAttributesAttributeId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DogmaApi#getDogmaAttributesAttributeId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributeId** | **kotlin.Int**| A dogma attribute ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]

### Return type

[**GetDogmaAttributesAttributeIdOk**](GetDogmaAttributesAttributeIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDogmaDynamicItemsTypeIdItemId"></a>
# **getDogmaDynamicItemsTypeIdItemId**
> GetDogmaDynamicItemsTypeIdItemIdOk getDogmaDynamicItemsTypeIdItemId(datasource, ifMinusNoneMinusMatch, itemId, typeId)

Get dynamic item information

Returns info about a dynamic item resulting from mutation with a mutaplasmid.  --- Alternate route: &#x60;/dev/dogma/dynamic/items/{type_id}/{item_id}/&#x60;  Alternate route: &#x60;/legacy/dogma/dynamic/items/{type_id}/{item_id}/&#x60;  Alternate route: &#x60;/v1/dogma/dynamic/items/{type_id}/{item_id}/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = DogmaApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val itemId : kotlin.Long = 789 // kotlin.Long | item_id integer
val typeId : kotlin.Int = 56 // kotlin.Int | type_id integer
try {
    val result : GetDogmaDynamicItemsTypeIdItemIdOk = apiInstance.getDogmaDynamicItemsTypeIdItemId(datasource, ifMinusNoneMinusMatch, itemId, typeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DogmaApi#getDogmaDynamicItemsTypeIdItemId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DogmaApi#getDogmaDynamicItemsTypeIdItemId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **itemId** | **kotlin.Long**| item_id integer |
 **typeId** | **kotlin.Int**| type_id integer |

### Return type

[**GetDogmaDynamicItemsTypeIdItemIdOk**](GetDogmaDynamicItemsTypeIdItemIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDogmaEffects"></a>
# **getDogmaEffects**
> kotlin.Array&lt;kotlin.Int&gt; getDogmaEffects(datasource, ifMinusNoneMinusMatch)

Get effects

Get a list of dogma effect ids  --- Alternate route: &#x60;/dev/dogma/effects/&#x60;  Alternate route: &#x60;/legacy/dogma/effects/&#x60;  Alternate route: &#x60;/v1/dogma/effects/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = DogmaApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : kotlin.Array<kotlin.Int> = apiInstance.getDogmaEffects(datasource, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DogmaApi#getDogmaEffects")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DogmaApi#getDogmaEffects")
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

<a name="getDogmaEffectsEffectId"></a>
# **getDogmaEffectsEffectId**
> GetDogmaEffectsEffectIdOk getDogmaEffectsEffectId(datasource, effectId, ifMinusNoneMinusMatch)

Get effect information

Get information on a dogma effect  --- Alternate route: &#x60;/dev/dogma/effects/{effect_id}/&#x60;  Alternate route: &#x60;/v2/dogma/effects/{effect_id}/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = DogmaApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val effectId : kotlin.Int = 56 // kotlin.Int | A dogma effect ID
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : GetDogmaEffectsEffectIdOk = apiInstance.getDogmaEffectsEffectId(datasource, effectId, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DogmaApi#getDogmaEffectsEffectId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DogmaApi#getDogmaEffectsEffectId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **effectId** | **kotlin.Int**| A dogma effect ID |
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]

### Return type

[**GetDogmaEffectsEffectIdOk**](GetDogmaEffectsEffectIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

