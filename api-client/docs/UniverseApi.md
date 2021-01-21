# UniverseApi

All URIs are relative to *https://esi.evetech.net/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUniverseAncestries**](UniverseApi.md#getUniverseAncestries) | **GET** /universe/ancestries/ | Get ancestries
[**getUniverseAsteroidBeltsAsteroidBeltId**](UniverseApi.md#getUniverseAsteroidBeltsAsteroidBeltId) | **GET** /universe/asteroid_belts/{asteroid_belt_id}/ | Get asteroid belt information
[**getUniverseBloodlines**](UniverseApi.md#getUniverseBloodlines) | **GET** /universe/bloodlines/ | Get bloodlines
[**getUniverseCategories**](UniverseApi.md#getUniverseCategories) | **GET** /universe/categories/ | Get item categories
[**getUniverseCategoriesCategoryId**](UniverseApi.md#getUniverseCategoriesCategoryId) | **GET** /universe/categories/{category_id}/ | Get item category information
[**getUniverseConstellations**](UniverseApi.md#getUniverseConstellations) | **GET** /universe/constellations/ | Get constellations
[**getUniverseConstellationsConstellationId**](UniverseApi.md#getUniverseConstellationsConstellationId) | **GET** /universe/constellations/{constellation_id}/ | Get constellation information
[**getUniverseFactions**](UniverseApi.md#getUniverseFactions) | **GET** /universe/factions/ | Get factions
[**getUniverseGraphics**](UniverseApi.md#getUniverseGraphics) | **GET** /universe/graphics/ | Get graphics
[**getUniverseGraphicsGraphicId**](UniverseApi.md#getUniverseGraphicsGraphicId) | **GET** /universe/graphics/{graphic_id}/ | Get graphic information
[**getUniverseGroups**](UniverseApi.md#getUniverseGroups) | **GET** /universe/groups/ | Get item groups
[**getUniverseGroupsGroupId**](UniverseApi.md#getUniverseGroupsGroupId) | **GET** /universe/groups/{group_id}/ | Get item group information
[**getUniverseMoonsMoonId**](UniverseApi.md#getUniverseMoonsMoonId) | **GET** /universe/moons/{moon_id}/ | Get moon information
[**getUniversePlanetsPlanetId**](UniverseApi.md#getUniversePlanetsPlanetId) | **GET** /universe/planets/{planet_id}/ | Get planet information
[**getUniverseRaces**](UniverseApi.md#getUniverseRaces) | **GET** /universe/races/ | Get character races
[**getUniverseRegions**](UniverseApi.md#getUniverseRegions) | **GET** /universe/regions/ | Get regions
[**getUniverseRegionsRegionId**](UniverseApi.md#getUniverseRegionsRegionId) | **GET** /universe/regions/{region_id}/ | Get region information
[**getUniverseStargatesStargateId**](UniverseApi.md#getUniverseStargatesStargateId) | **GET** /universe/stargates/{stargate_id}/ | Get stargate information
[**getUniverseStarsStarId**](UniverseApi.md#getUniverseStarsStarId) | **GET** /universe/stars/{star_id}/ | Get star information
[**getUniverseStationsStationId**](UniverseApi.md#getUniverseStationsStationId) | **GET** /universe/stations/{station_id}/ | Get station information
[**getUniverseStructures**](UniverseApi.md#getUniverseStructures) | **GET** /universe/structures/ | List all public structures
[**getUniverseStructuresStructureId**](UniverseApi.md#getUniverseStructuresStructureId) | **GET** /universe/structures/{structure_id}/ | Get structure information
[**getUniverseSystemJumps**](UniverseApi.md#getUniverseSystemJumps) | **GET** /universe/system_jumps/ | Get system jumps
[**getUniverseSystemKills**](UniverseApi.md#getUniverseSystemKills) | **GET** /universe/system_kills/ | Get system kills
[**getUniverseSystems**](UniverseApi.md#getUniverseSystems) | **GET** /universe/systems/ | Get solar systems
[**getUniverseSystemsSystemId**](UniverseApi.md#getUniverseSystemsSystemId) | **GET** /universe/systems/{system_id}/ | Get solar system information
[**getUniverseTypes**](UniverseApi.md#getUniverseTypes) | **GET** /universe/types/ | Get types
[**getUniverseTypesTypeId**](UniverseApi.md#getUniverseTypesTypeId) | **GET** /universe/types/{type_id}/ | Get type information
[**postUniverseIds**](UniverseApi.md#postUniverseIds) | **POST** /universe/ids/ | Bulk names to IDs
[**postUniverseNames**](UniverseApi.md#postUniverseNames) | **POST** /universe/names/ | Get names and categories for a set of IDs


<a name="getUniverseAncestries"></a>
# **getUniverseAncestries**
> kotlin.Array&lt;GetUniverseAncestries200Ok&gt; getUniverseAncestries(acceptMinusLanguage, datasource, ifMinusNoneMinusMatch, language)

Get ancestries

Get all character ancestries  --- Alternate route: &#x60;/dev/universe/ancestries/&#x60;  Alternate route: &#x60;/legacy/universe/ancestries/&#x60;  Alternate route: &#x60;/v1/universe/ancestries/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val acceptMinusLanguage : kotlin.String = acceptMinusLanguage_example // kotlin.String | Language to use in the response
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val language : kotlin.String = language_example // kotlin.String | Language to use in the response, takes precedence over Accept-Language
try {
    val result : kotlin.Array<GetUniverseAncestries200Ok> = apiInstance.getUniverseAncestries(acceptMinusLanguage, datasource, ifMinusNoneMinusMatch, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniverseAncestries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniverseAncestries")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptMinusLanguage** | **kotlin.String**| Language to use in the response | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **language** | **kotlin.String**| Language to use in the response, takes precedence over Accept-Language | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]

### Return type

[**kotlin.Array&lt;GetUniverseAncestries200Ok&gt;**](GetUniverseAncestries200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseAsteroidBeltsAsteroidBeltId"></a>
# **getUniverseAsteroidBeltsAsteroidBeltId**
> GetUniverseAsteroidBeltsAsteroidBeltIdOk getUniverseAsteroidBeltsAsteroidBeltId(asteroidBeltId, datasource, ifMinusNoneMinusMatch)

Get asteroid belt information

Get information on an asteroid belt  --- Alternate route: &#x60;/dev/universe/asteroid_belts/{asteroid_belt_id}/&#x60;  Alternate route: &#x60;/legacy/universe/asteroid_belts/{asteroid_belt_id}/&#x60;  Alternate route: &#x60;/v1/universe/asteroid_belts/{asteroid_belt_id}/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val asteroidBeltId : kotlin.Int = 56 // kotlin.Int | asteroid_belt_id integer
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : GetUniverseAsteroidBeltsAsteroidBeltIdOk = apiInstance.getUniverseAsteroidBeltsAsteroidBeltId(asteroidBeltId, datasource, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniverseAsteroidBeltsAsteroidBeltId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniverseAsteroidBeltsAsteroidBeltId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asteroidBeltId** | **kotlin.Int**| asteroid_belt_id integer |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]

### Return type

[**GetUniverseAsteroidBeltsAsteroidBeltIdOk**](GetUniverseAsteroidBeltsAsteroidBeltIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseBloodlines"></a>
# **getUniverseBloodlines**
> kotlin.Array&lt;GetUniverseBloodlines200Ok&gt; getUniverseBloodlines(acceptMinusLanguage, datasource, ifMinusNoneMinusMatch, language)

Get bloodlines

Get a list of bloodlines  --- Alternate route: &#x60;/dev/universe/bloodlines/&#x60;  Alternate route: &#x60;/legacy/universe/bloodlines/&#x60;  Alternate route: &#x60;/v1/universe/bloodlines/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val acceptMinusLanguage : kotlin.String = acceptMinusLanguage_example // kotlin.String | Language to use in the response
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val language : kotlin.String = language_example // kotlin.String | Language to use in the response, takes precedence over Accept-Language
try {
    val result : kotlin.Array<GetUniverseBloodlines200Ok> = apiInstance.getUniverseBloodlines(acceptMinusLanguage, datasource, ifMinusNoneMinusMatch, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniverseBloodlines")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniverseBloodlines")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptMinusLanguage** | **kotlin.String**| Language to use in the response | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **language** | **kotlin.String**| Language to use in the response, takes precedence over Accept-Language | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]

### Return type

[**kotlin.Array&lt;GetUniverseBloodlines200Ok&gt;**](GetUniverseBloodlines200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseCategories"></a>
# **getUniverseCategories**
> kotlin.Array&lt;kotlin.Int&gt; getUniverseCategories(datasource, ifMinusNoneMinusMatch)

Get item categories

Get a list of item categories  --- Alternate route: &#x60;/dev/universe/categories/&#x60;  Alternate route: &#x60;/legacy/universe/categories/&#x60;  Alternate route: &#x60;/v1/universe/categories/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : kotlin.Array<kotlin.Int> = apiInstance.getUniverseCategories(datasource, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniverseCategories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniverseCategories")
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

<a name="getUniverseCategoriesCategoryId"></a>
# **getUniverseCategoriesCategoryId**
> GetUniverseCategoriesCategoryIdOk getUniverseCategoriesCategoryId(acceptMinusLanguage, categoryId, datasource, ifMinusNoneMinusMatch, language)

Get item category information

Get information of an item category  --- Alternate route: &#x60;/dev/universe/categories/{category_id}/&#x60;  Alternate route: &#x60;/legacy/universe/categories/{category_id}/&#x60;  Alternate route: &#x60;/v1/universe/categories/{category_id}/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val acceptMinusLanguage : kotlin.String = acceptMinusLanguage_example // kotlin.String | Language to use in the response
val categoryId : kotlin.Int = 56 // kotlin.Int | An Eve item category ID
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val language : kotlin.String = language_example // kotlin.String | Language to use in the response, takes precedence over Accept-Language
try {
    val result : GetUniverseCategoriesCategoryIdOk = apiInstance.getUniverseCategoriesCategoryId(acceptMinusLanguage, categoryId, datasource, ifMinusNoneMinusMatch, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniverseCategoriesCategoryId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniverseCategoriesCategoryId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptMinusLanguage** | **kotlin.String**| Language to use in the response | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **categoryId** | **kotlin.Int**| An Eve item category ID |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **language** | **kotlin.String**| Language to use in the response, takes precedence over Accept-Language | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]

### Return type

[**GetUniverseCategoriesCategoryIdOk**](GetUniverseCategoriesCategoryIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseConstellations"></a>
# **getUniverseConstellations**
> kotlin.Array&lt;kotlin.Int&gt; getUniverseConstellations(datasource, ifMinusNoneMinusMatch)

Get constellations

Get a list of constellations  --- Alternate route: &#x60;/dev/universe/constellations/&#x60;  Alternate route: &#x60;/legacy/universe/constellations/&#x60;  Alternate route: &#x60;/v1/universe/constellations/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : kotlin.Array<kotlin.Int> = apiInstance.getUniverseConstellations(datasource, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniverseConstellations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniverseConstellations")
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

<a name="getUniverseConstellationsConstellationId"></a>
# **getUniverseConstellationsConstellationId**
> GetUniverseConstellationsConstellationIdOk getUniverseConstellationsConstellationId(acceptMinusLanguage, constellationId, datasource, ifMinusNoneMinusMatch, language)

Get constellation information

Get information on a constellation  --- Alternate route: &#x60;/dev/universe/constellations/{constellation_id}/&#x60;  Alternate route: &#x60;/legacy/universe/constellations/{constellation_id}/&#x60;  Alternate route: &#x60;/v1/universe/constellations/{constellation_id}/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val acceptMinusLanguage : kotlin.String = acceptMinusLanguage_example // kotlin.String | Language to use in the response
val constellationId : kotlin.Int = 56 // kotlin.Int | constellation_id integer
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val language : kotlin.String = language_example // kotlin.String | Language to use in the response, takes precedence over Accept-Language
try {
    val result : GetUniverseConstellationsConstellationIdOk = apiInstance.getUniverseConstellationsConstellationId(acceptMinusLanguage, constellationId, datasource, ifMinusNoneMinusMatch, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniverseConstellationsConstellationId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniverseConstellationsConstellationId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptMinusLanguage** | **kotlin.String**| Language to use in the response | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **constellationId** | **kotlin.Int**| constellation_id integer |
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **language** | **kotlin.String**| Language to use in the response, takes precedence over Accept-Language | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]

### Return type

[**GetUniverseConstellationsConstellationIdOk**](GetUniverseConstellationsConstellationIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseFactions"></a>
# **getUniverseFactions**
> kotlin.Array&lt;GetUniverseFactions200Ok&gt; getUniverseFactions(acceptMinusLanguage, datasource, ifMinusNoneMinusMatch, language)

Get factions

Get a list of factions  --- Alternate route: &#x60;/dev/universe/factions/&#x60;  Alternate route: &#x60;/v2/universe/factions/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val acceptMinusLanguage : kotlin.String = acceptMinusLanguage_example // kotlin.String | Language to use in the response
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val language : kotlin.String = language_example // kotlin.String | Language to use in the response, takes precedence over Accept-Language
try {
    val result : kotlin.Array<GetUniverseFactions200Ok> = apiInstance.getUniverseFactions(acceptMinusLanguage, datasource, ifMinusNoneMinusMatch, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniverseFactions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniverseFactions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptMinusLanguage** | **kotlin.String**| Language to use in the response | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **language** | **kotlin.String**| Language to use in the response, takes precedence over Accept-Language | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]

### Return type

[**kotlin.Array&lt;GetUniverseFactions200Ok&gt;**](GetUniverseFactions200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseGraphics"></a>
# **getUniverseGraphics**
> kotlin.Array&lt;kotlin.Int&gt; getUniverseGraphics(datasource, ifMinusNoneMinusMatch)

Get graphics

Get a list of graphics  --- Alternate route: &#x60;/dev/universe/graphics/&#x60;  Alternate route: &#x60;/legacy/universe/graphics/&#x60;  Alternate route: &#x60;/v1/universe/graphics/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : kotlin.Array<kotlin.Int> = apiInstance.getUniverseGraphics(datasource, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniverseGraphics")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniverseGraphics")
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

<a name="getUniverseGraphicsGraphicId"></a>
# **getUniverseGraphicsGraphicId**
> GetUniverseGraphicsGraphicIdOk getUniverseGraphicsGraphicId(datasource, graphicId, ifMinusNoneMinusMatch)

Get graphic information

Get information on a graphic  --- Alternate route: &#x60;/dev/universe/graphics/{graphic_id}/&#x60;  Alternate route: &#x60;/legacy/universe/graphics/{graphic_id}/&#x60;  Alternate route: &#x60;/v1/universe/graphics/{graphic_id}/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val graphicId : kotlin.Int = 56 // kotlin.Int | graphic_id integer
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : GetUniverseGraphicsGraphicIdOk = apiInstance.getUniverseGraphicsGraphicId(datasource, graphicId, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniverseGraphicsGraphicId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniverseGraphicsGraphicId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **graphicId** | **kotlin.Int**| graphic_id integer |
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]

### Return type

[**GetUniverseGraphicsGraphicIdOk**](GetUniverseGraphicsGraphicIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseGroups"></a>
# **getUniverseGroups**
> kotlin.Array&lt;kotlin.Int&gt; getUniverseGroups(datasource, ifMinusNoneMinusMatch, page)

Get item groups

Get a list of item groups  --- Alternate route: &#x60;/dev/universe/groups/&#x60;  Alternate route: &#x60;/legacy/universe/groups/&#x60;  Alternate route: &#x60;/v1/universe/groups/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
try {
    val result : kotlin.Array<kotlin.Int> = apiInstance.getUniverseGroups(datasource, ifMinusNoneMinusMatch, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniverseGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniverseGroups")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **kotlin.Int**| Which page of results to return | [optional] [default to 1]

### Return type

**kotlin.Array&lt;kotlin.Int&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseGroupsGroupId"></a>
# **getUniverseGroupsGroupId**
> GetUniverseGroupsGroupIdOk getUniverseGroupsGroupId(acceptMinusLanguage, datasource, groupId, ifMinusNoneMinusMatch, language)

Get item group information

Get information on an item group  --- Alternate route: &#x60;/dev/universe/groups/{group_id}/&#x60;  Alternate route: &#x60;/legacy/universe/groups/{group_id}/&#x60;  Alternate route: &#x60;/v1/universe/groups/{group_id}/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val acceptMinusLanguage : kotlin.String = acceptMinusLanguage_example // kotlin.String | Language to use in the response
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val groupId : kotlin.Int = 56 // kotlin.Int | An Eve item group ID
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val language : kotlin.String = language_example // kotlin.String | Language to use in the response, takes precedence over Accept-Language
try {
    val result : GetUniverseGroupsGroupIdOk = apiInstance.getUniverseGroupsGroupId(acceptMinusLanguage, datasource, groupId, ifMinusNoneMinusMatch, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniverseGroupsGroupId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniverseGroupsGroupId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptMinusLanguage** | **kotlin.String**| Language to use in the response | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **groupId** | **kotlin.Int**| An Eve item group ID |
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **language** | **kotlin.String**| Language to use in the response, takes precedence over Accept-Language | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]

### Return type

[**GetUniverseGroupsGroupIdOk**](GetUniverseGroupsGroupIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseMoonsMoonId"></a>
# **getUniverseMoonsMoonId**
> GetUniverseMoonsMoonIdOk getUniverseMoonsMoonId(datasource, ifMinusNoneMinusMatch, moonId)

Get moon information

Get information on a moon  --- Alternate route: &#x60;/dev/universe/moons/{moon_id}/&#x60;  Alternate route: &#x60;/legacy/universe/moons/{moon_id}/&#x60;  Alternate route: &#x60;/v1/universe/moons/{moon_id}/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val moonId : kotlin.Int = 56 // kotlin.Int | moon_id integer
try {
    val result : GetUniverseMoonsMoonIdOk = apiInstance.getUniverseMoonsMoonId(datasource, ifMinusNoneMinusMatch, moonId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniverseMoonsMoonId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniverseMoonsMoonId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **moonId** | **kotlin.Int**| moon_id integer |

### Return type

[**GetUniverseMoonsMoonIdOk**](GetUniverseMoonsMoonIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniversePlanetsPlanetId"></a>
# **getUniversePlanetsPlanetId**
> GetUniversePlanetsPlanetIdOk getUniversePlanetsPlanetId(datasource, ifMinusNoneMinusMatch, planetId)

Get planet information

Get information on a planet  --- Alternate route: &#x60;/dev/universe/planets/{planet_id}/&#x60;  Alternate route: &#x60;/legacy/universe/planets/{planet_id}/&#x60;  Alternate route: &#x60;/v1/universe/planets/{planet_id}/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val planetId : kotlin.Int = 56 // kotlin.Int | planet_id integer
try {
    val result : GetUniversePlanetsPlanetIdOk = apiInstance.getUniversePlanetsPlanetId(datasource, ifMinusNoneMinusMatch, planetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniversePlanetsPlanetId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniversePlanetsPlanetId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **planetId** | **kotlin.Int**| planet_id integer |

### Return type

[**GetUniversePlanetsPlanetIdOk**](GetUniversePlanetsPlanetIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseRaces"></a>
# **getUniverseRaces**
> kotlin.Array&lt;GetUniverseRaces200Ok&gt; getUniverseRaces(acceptMinusLanguage, datasource, ifMinusNoneMinusMatch, language)

Get character races

Get a list of character races  --- Alternate route: &#x60;/dev/universe/races/&#x60;  Alternate route: &#x60;/legacy/universe/races/&#x60;  Alternate route: &#x60;/v1/universe/races/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val acceptMinusLanguage : kotlin.String = acceptMinusLanguage_example // kotlin.String | Language to use in the response
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val language : kotlin.String = language_example // kotlin.String | Language to use in the response, takes precedence over Accept-Language
try {
    val result : kotlin.Array<GetUniverseRaces200Ok> = apiInstance.getUniverseRaces(acceptMinusLanguage, datasource, ifMinusNoneMinusMatch, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniverseRaces")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniverseRaces")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptMinusLanguage** | **kotlin.String**| Language to use in the response | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **language** | **kotlin.String**| Language to use in the response, takes precedence over Accept-Language | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]

### Return type

[**kotlin.Array&lt;GetUniverseRaces200Ok&gt;**](GetUniverseRaces200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseRegions"></a>
# **getUniverseRegions**
> kotlin.Array&lt;kotlin.Int&gt; getUniverseRegions(datasource, ifMinusNoneMinusMatch)

Get regions

Get a list of regions  --- Alternate route: &#x60;/dev/universe/regions/&#x60;  Alternate route: &#x60;/legacy/universe/regions/&#x60;  Alternate route: &#x60;/v1/universe/regions/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : kotlin.Array<kotlin.Int> = apiInstance.getUniverseRegions(datasource, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniverseRegions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniverseRegions")
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

<a name="getUniverseRegionsRegionId"></a>
# **getUniverseRegionsRegionId**
> GetUniverseRegionsRegionIdOk getUniverseRegionsRegionId(acceptMinusLanguage, datasource, ifMinusNoneMinusMatch, language, regionId)

Get region information

Get information on a region  --- Alternate route: &#x60;/dev/universe/regions/{region_id}/&#x60;  Alternate route: &#x60;/legacy/universe/regions/{region_id}/&#x60;  Alternate route: &#x60;/v1/universe/regions/{region_id}/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val acceptMinusLanguage : kotlin.String = acceptMinusLanguage_example // kotlin.String | Language to use in the response
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val language : kotlin.String = language_example // kotlin.String | Language to use in the response, takes precedence over Accept-Language
val regionId : kotlin.Int = 56 // kotlin.Int | region_id integer
try {
    val result : GetUniverseRegionsRegionIdOk = apiInstance.getUniverseRegionsRegionId(acceptMinusLanguage, datasource, ifMinusNoneMinusMatch, language, regionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniverseRegionsRegionId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniverseRegionsRegionId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptMinusLanguage** | **kotlin.String**| Language to use in the response | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **language** | **kotlin.String**| Language to use in the response, takes precedence over Accept-Language | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **regionId** | **kotlin.Int**| region_id integer |

### Return type

[**GetUniverseRegionsRegionIdOk**](GetUniverseRegionsRegionIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseStargatesStargateId"></a>
# **getUniverseStargatesStargateId**
> GetUniverseStargatesStargateIdOk getUniverseStargatesStargateId(datasource, ifMinusNoneMinusMatch, stargateId)

Get stargate information

Get information on a stargate  --- Alternate route: &#x60;/dev/universe/stargates/{stargate_id}/&#x60;  Alternate route: &#x60;/legacy/universe/stargates/{stargate_id}/&#x60;  Alternate route: &#x60;/v1/universe/stargates/{stargate_id}/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val stargateId : kotlin.Int = 56 // kotlin.Int | stargate_id integer
try {
    val result : GetUniverseStargatesStargateIdOk = apiInstance.getUniverseStargatesStargateId(datasource, ifMinusNoneMinusMatch, stargateId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniverseStargatesStargateId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniverseStargatesStargateId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **stargateId** | **kotlin.Int**| stargate_id integer |

### Return type

[**GetUniverseStargatesStargateIdOk**](GetUniverseStargatesStargateIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseStarsStarId"></a>
# **getUniverseStarsStarId**
> GetUniverseStarsStarIdOk getUniverseStarsStarId(datasource, ifMinusNoneMinusMatch, starId)

Get star information

Get information on a star  --- Alternate route: &#x60;/dev/universe/stars/{star_id}/&#x60;  Alternate route: &#x60;/legacy/universe/stars/{star_id}/&#x60;  Alternate route: &#x60;/v1/universe/stars/{star_id}/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val starId : kotlin.Int = 56 // kotlin.Int | star_id integer
try {
    val result : GetUniverseStarsStarIdOk = apiInstance.getUniverseStarsStarId(datasource, ifMinusNoneMinusMatch, starId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniverseStarsStarId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniverseStarsStarId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **starId** | **kotlin.Int**| star_id integer |

### Return type

[**GetUniverseStarsStarIdOk**](GetUniverseStarsStarIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseStationsStationId"></a>
# **getUniverseStationsStationId**
> GetUniverseStationsStationIdOk getUniverseStationsStationId(datasource, ifMinusNoneMinusMatch, stationId)

Get station information

Get information on a station  --- Alternate route: &#x60;/dev/universe/stations/{station_id}/&#x60;  Alternate route: &#x60;/v2/universe/stations/{station_id}/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val stationId : kotlin.Int = 56 // kotlin.Int | station_id integer
try {
    val result : GetUniverseStationsStationIdOk = apiInstance.getUniverseStationsStationId(datasource, ifMinusNoneMinusMatch, stationId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniverseStationsStationId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniverseStationsStationId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **stationId** | **kotlin.Int**| station_id integer |

### Return type

[**GetUniverseStationsStationIdOk**](GetUniverseStationsStationIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseStructures"></a>
# **getUniverseStructures**
> kotlin.collections.Set&lt;kotlin.Long&gt; getUniverseStructures(datasource, filter, ifMinusNoneMinusMatch)

List all public structures

List all public structures  --- Alternate route: &#x60;/dev/universe/structures/&#x60;  Alternate route: &#x60;/legacy/universe/structures/&#x60;  Alternate route: &#x60;/v1/universe/structures/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val filter : kotlin.String = filter_example // kotlin.String | Only list public structures that have this service online
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : kotlin.collections.Set<kotlin.Long> = apiInstance.getUniverseStructures(datasource, filter, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniverseStructures")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniverseStructures")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **filter** | **kotlin.String**| Only list public structures that have this service online | [optional] [enum: market, manufacturing_basic]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]

### Return type

**kotlin.collections.Set&lt;kotlin.Long&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseStructuresStructureId"></a>
# **getUniverseStructuresStructureId**
> GetUniverseStructuresStructureIdOk getUniverseStructuresStructureId(datasource, ifMinusNoneMinusMatch, structureId, token)

Get structure information

Returns information on requested structure if you are on the ACL. Otherwise, returns \&quot;Forbidden\&quot; for all inputs.  --- Alternate route: &#x60;/dev/universe/structures/{structure_id}/&#x60;  Alternate route: &#x60;/v2/universe/structures/{structure_id}/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val structureId : kotlin.Long = 789 // kotlin.Long | An Eve structure ID
val token : kotlin.String = token_example // kotlin.String | Access token to use if unable to set a header
try {
    val result : GetUniverseStructuresStructureIdOk = apiInstance.getUniverseStructuresStructureId(datasource, ifMinusNoneMinusMatch, structureId, token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniverseStructuresStructureId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniverseStructuresStructureId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **structureId** | **kotlin.Long**| An Eve structure ID |
 **token** | **kotlin.String**| Access token to use if unable to set a header | [optional]

### Return type

[**GetUniverseStructuresStructureIdOk**](GetUniverseStructuresStructureIdOk.md)

### Authorization


Configure evesso:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseSystemJumps"></a>
# **getUniverseSystemJumps**
> kotlin.Array&lt;GetUniverseSystemJumps200Ok&gt; getUniverseSystemJumps(datasource, ifMinusNoneMinusMatch)

Get system jumps

Get the number of jumps in solar systems within the last hour ending at the timestamp of the Last-Modified header, excluding wormhole space. Only systems with jumps will be listed  --- Alternate route: &#x60;/dev/universe/system_jumps/&#x60;  Alternate route: &#x60;/legacy/universe/system_jumps/&#x60;  Alternate route: &#x60;/v1/universe/system_jumps/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : kotlin.Array<GetUniverseSystemJumps200Ok> = apiInstance.getUniverseSystemJumps(datasource, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniverseSystemJumps")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniverseSystemJumps")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]

### Return type

[**kotlin.Array&lt;GetUniverseSystemJumps200Ok&gt;**](GetUniverseSystemJumps200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseSystemKills"></a>
# **getUniverseSystemKills**
> kotlin.Array&lt;GetUniverseSystemKills200Ok&gt; getUniverseSystemKills(datasource, ifMinusNoneMinusMatch)

Get system kills

Get the number of ship, pod and NPC kills per solar system within the last hour ending at the timestamp of the Last-Modified header, excluding wormhole space. Only systems with kills will be listed  --- Alternate route: &#x60;/dev/universe/system_kills/&#x60;  Alternate route: &#x60;/v2/universe/system_kills/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : kotlin.Array<GetUniverseSystemKills200Ok> = apiInstance.getUniverseSystemKills(datasource, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniverseSystemKills")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniverseSystemKills")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]

### Return type

[**kotlin.Array&lt;GetUniverseSystemKills200Ok&gt;**](GetUniverseSystemKills200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseSystems"></a>
# **getUniverseSystems**
> kotlin.Array&lt;kotlin.Int&gt; getUniverseSystems(datasource, ifMinusNoneMinusMatch)

Get solar systems

Get a list of solar systems  --- Alternate route: &#x60;/dev/universe/systems/&#x60;  Alternate route: &#x60;/legacy/universe/systems/&#x60;  Alternate route: &#x60;/v1/universe/systems/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    val result : kotlin.Array<kotlin.Int> = apiInstance.getUniverseSystems(datasource, ifMinusNoneMinusMatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniverseSystems")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniverseSystems")
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

<a name="getUniverseSystemsSystemId"></a>
# **getUniverseSystemsSystemId**
> GetUniverseSystemsSystemIdOk getUniverseSystemsSystemId(acceptMinusLanguage, datasource, ifMinusNoneMinusMatch, language, systemId)

Get solar system information

Get information on a solar system.  --- Alternate route: &#x60;/dev/universe/systems/{system_id}/&#x60;  Alternate route: &#x60;/v4/universe/systems/{system_id}/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val acceptMinusLanguage : kotlin.String = acceptMinusLanguage_example // kotlin.String | Language to use in the response
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val language : kotlin.String = language_example // kotlin.String | Language to use in the response, takes precedence over Accept-Language
val systemId : kotlin.Int = 56 // kotlin.Int | system_id integer
try {
    val result : GetUniverseSystemsSystemIdOk = apiInstance.getUniverseSystemsSystemId(acceptMinusLanguage, datasource, ifMinusNoneMinusMatch, language, systemId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniverseSystemsSystemId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniverseSystemsSystemId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptMinusLanguage** | **kotlin.String**| Language to use in the response | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **language** | **kotlin.String**| Language to use in the response, takes precedence over Accept-Language | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **systemId** | **kotlin.Int**| system_id integer |

### Return type

[**GetUniverseSystemsSystemIdOk**](GetUniverseSystemsSystemIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseTypes"></a>
# **getUniverseTypes**
> kotlin.Array&lt;kotlin.Int&gt; getUniverseTypes(datasource, ifMinusNoneMinusMatch, page)

Get types

Get a list of type ids  --- Alternate route: &#x60;/dev/universe/types/&#x60;  Alternate route: &#x60;/legacy/universe/types/&#x60;  Alternate route: &#x60;/v1/universe/types/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val page : kotlin.Int = 56 // kotlin.Int | Which page of results to return
try {
    val result : kotlin.Array<kotlin.Int> = apiInstance.getUniverseTypes(datasource, ifMinusNoneMinusMatch, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniverseTypes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniverseTypes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **kotlin.Int**| Which page of results to return | [optional] [default to 1]

### Return type

**kotlin.Array&lt;kotlin.Int&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseTypesTypeId"></a>
# **getUniverseTypesTypeId**
> GetUniverseTypesTypeIdOk getUniverseTypesTypeId(acceptMinusLanguage, datasource, ifMinusNoneMinusMatch, language, typeId)

Get type information

Get information on a type  --- Alternate route: &#x60;/dev/universe/types/{type_id}/&#x60;  Alternate route: &#x60;/v3/universe/types/{type_id}/&#x60;  --- This route expires daily at 11:05

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val acceptMinusLanguage : kotlin.String = acceptMinusLanguage_example // kotlin.String | Language to use in the response
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val language : kotlin.String = language_example // kotlin.String | Language to use in the response, takes precedence over Accept-Language
val typeId : kotlin.Int = 56 // kotlin.Int | An Eve item type ID
try {
    val result : GetUniverseTypesTypeIdOk = apiInstance.getUniverseTypesTypeId(acceptMinusLanguage, datasource, ifMinusNoneMinusMatch, language, typeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#getUniverseTypesTypeId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#getUniverseTypesTypeId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptMinusLanguage** | **kotlin.String**| Language to use in the response | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ifMinusNoneMinusMatch** | **kotlin.String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **language** | **kotlin.String**| Language to use in the response, takes precedence over Accept-Language | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **typeId** | **kotlin.Int**| An Eve item type ID |

### Return type

[**GetUniverseTypesTypeIdOk**](GetUniverseTypesTypeIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postUniverseIds"></a>
# **postUniverseIds**
> PostUniverseIdsOk postUniverseIds(acceptMinusLanguage, datasource, language, names)

Bulk names to IDs

Resolve a set of names to IDs in the following categories: agents, alliances, characters, constellations, corporations factions, inventory_types, regions, stations, and systems. Only exact matches will be returned. All names searched for are cached for 12 hours  --- Alternate route: &#x60;/dev/universe/ids/&#x60;  Alternate route: &#x60;/legacy/universe/ids/&#x60;  Alternate route: &#x60;/v1/universe/ids/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val acceptMinusLanguage : kotlin.String = acceptMinusLanguage_example // kotlin.String | Language to use in the response
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val language : kotlin.String = language_example // kotlin.String | Language to use in the response, takes precedence over Accept-Language
val names : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | The names to resolve
try {
    val result : PostUniverseIdsOk = apiInstance.postUniverseIds(acceptMinusLanguage, datasource, language, names)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#postUniverseIds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#postUniverseIds")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptMinusLanguage** | **kotlin.String**| Language to use in the response | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **language** | **kotlin.String**| Language to use in the response, takes precedence over Accept-Language | [optional] [default to &quot;en-us&quot;] [enum: de, en-us, fr, ja, ru, ko]
 **names** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| The names to resolve |

### Return type

[**PostUniverseIdsOk**](PostUniverseIdsOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUniverseNames"></a>
# **postUniverseNames**
> kotlin.Array&lt;PostUniverseNames200Ok&gt; postUniverseNames(datasource, ids)

Get names and categories for a set of IDs

Resolve a set of IDs to names and categories. Supported ID&#39;s for resolving are: Characters, Corporations, Alliances, Stations, Solar Systems, Constellations, Regions, Types, Factions  --- Alternate route: &#x60;/dev/universe/names/&#x60;  Alternate route: &#x60;/v3/universe/names/&#x60; 

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = UniverseApi()
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ids : kotlin.collections.Set<kotlin.Int> =  // kotlin.collections.Set<kotlin.Int> | The ids to resolve
try {
    val result : kotlin.Array<PostUniverseNames200Ok> = apiInstance.postUniverseNames(datasource, ids)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UniverseApi#postUniverseNames")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UniverseApi#postUniverseNames")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **kotlin.String**| The server name you would like data from | [optional] [default to &quot;tranquility&quot;] [enum: tranquility]
 **ids** | [**kotlin.collections.Set&lt;kotlin.Int&gt;**](kotlin.Int.md)| The ids to resolve |

### Return type

[**kotlin.Array&lt;PostUniverseNames200Ok&gt;**](PostUniverseNames200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

