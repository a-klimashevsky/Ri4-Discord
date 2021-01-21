# InsuranceApi

All URIs are relative to *https://esi.evetech.net/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInsurancePrices**](InsuranceApi.md#getInsurancePrices) | **GET** /insurance/prices/ | List insurance levels


<a name="getInsurancePrices"></a>
# **getInsurancePrices**
> kotlin.Array&lt;GetInsurancePrices200Ok&gt; getInsurancePrices(acceptMinusLanguage, datasource, ifMinusNoneMinusMatch, language)

List insurance levels

Return available insurance levels for all ship types  --- Alternate route: &#x60;/dev/insurance/prices/&#x60;  Alternate route: &#x60;/legacy/insurance/prices/&#x60;  Alternate route: &#x60;/v1/insurance/prices/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```kotlin
// Import classes:
//import tv.z85.esi.infrastructure.*
//import tv.z85.esi.models.*

val apiInstance = InsuranceApi()
val acceptMinusLanguage : kotlin.String = acceptMinusLanguage_example // kotlin.String | Language to use in the response
val datasource : kotlin.String = datasource_example // kotlin.String | The server name you would like data from
val ifMinusNoneMinusMatch : kotlin.String = ifMinusNoneMinusMatch_example // kotlin.String | ETag from a previous request. A 304 will be returned if this matches the current ETag
val language : kotlin.String = language_example // kotlin.String | Language to use in the response, takes precedence over Accept-Language
try {
    val result : kotlin.Array<GetInsurancePrices200Ok> = apiInstance.getInsurancePrices(acceptMinusLanguage, datasource, ifMinusNoneMinusMatch, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InsuranceApi#getInsurancePrices")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InsuranceApi#getInsurancePrices")
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

[**kotlin.Array&lt;GetInsurancePrices200Ok&gt;**](GetInsurancePrices200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

