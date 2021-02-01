/**
* EVE Swagger Interface
* An OpenAPI for EVE Online
*
* The version of the OpenAPI document: 1.7.2
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package tv.z85.esi.apis

import tv.z85.esi.models.BadRequest
import tv.z85.esi.models.ErrorLimited
import tv.z85.esi.models.GatewayTimeout
import tv.z85.esi.models.GetDogmaAttributesAttributeIdNotFound
import tv.z85.esi.models.GetDogmaAttributesAttributeIdOk
import tv.z85.esi.models.GetDogmaDynamicItemsTypeIdItemIdNotFound
import tv.z85.esi.models.GetDogmaDynamicItemsTypeIdItemIdOk
import tv.z85.esi.models.GetDogmaEffectsEffectIdNotFound
import tv.z85.esi.models.GetDogmaEffectsEffectIdOk
import tv.z85.esi.models.InternalServerError
import tv.z85.esi.models.ServiceUnavailable

import tv.z85.esi.infrastructure.ApiClient
import tv.z85.esi.infrastructure.ClientException
import tv.z85.esi.infrastructure.ClientError
import tv.z85.esi.infrastructure.ServerException
import tv.z85.esi.infrastructure.ServerError
import tv.z85.esi.infrastructure.MultiValueMap
import tv.z85.esi.infrastructure.RequestConfig
import tv.z85.esi.infrastructure.RequestMethod
import tv.z85.esi.infrastructure.ResponseType
import tv.z85.esi.infrastructure.Success
import tv.z85.esi.infrastructure.toMultiValue

class DogmaApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("tv.z85.esi.baseUrl", "https://esi.evetech.net/latest")
        }
    }

    /**
    * Get attributes
    * Get a list of dogma attribute ids  --- Alternate route: &#x60;/dev/dogma/attributes/&#x60;  Alternate route: &#x60;/legacy/dogma/attributes/&#x60;  Alternate route: &#x60;/v1/dogma/attributes/&#x60;  --- This route expires daily at 11:05
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @return kotlin.Array<kotlin.Int>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getDogmaAttributes(datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?) : kotlin.Array<kotlin.Int> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (datasource != null) {
                    put("datasource", listOf(datasource.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-None-Match" to ifMinusNoneMinusMatch.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/dogma/attributes/",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<kotlin.Int>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<kotlin.Int>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Get attribute information
    * Get information on a dogma attribute  --- Alternate route: &#x60;/dev/dogma/attributes/{attribute_id}/&#x60;  Alternate route: &#x60;/legacy/dogma/attributes/{attribute_id}/&#x60;  Alternate route: &#x60;/v1/dogma/attributes/{attribute_id}/&#x60;  --- This route expires daily at 11:05
    * @param attributeId A dogma attribute ID 
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @return GetDogmaAttributesAttributeIdOk
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getDogmaAttributesAttributeId(attributeId: kotlin.Int, datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?) : GetDogmaAttributesAttributeIdOk {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (datasource != null) {
                    put("datasource", listOf(datasource.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-None-Match" to ifMinusNoneMinusMatch.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/dogma/attributes/{attribute_id}/".replace("{"+"attribute_id"+"}", "$attributeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<GetDogmaAttributesAttributeIdOk>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetDogmaAttributesAttributeIdOk
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Get dynamic item information
    * Returns info about a dynamic item resulting from mutation with a mutaplasmid.  --- Alternate route: &#x60;/dev/dogma/dynamic/items/{type_id}/{item_id}/&#x60;  Alternate route: &#x60;/legacy/dogma/dynamic/items/{type_id}/{item_id}/&#x60;  Alternate route: &#x60;/v1/dogma/dynamic/items/{type_id}/{item_id}/&#x60;  --- This route expires daily at 11:05
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @param itemId item_id integer 
    * @param typeId type_id integer 
    * @return GetDogmaDynamicItemsTypeIdItemIdOk
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getDogmaDynamicItemsTypeIdItemId(datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?, itemId: kotlin.Long, typeId: kotlin.Int) : GetDogmaDynamicItemsTypeIdItemIdOk {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (datasource != null) {
                    put("datasource", listOf(datasource.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-None-Match" to ifMinusNoneMinusMatch.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/dogma/dynamic/items/{type_id}/{item_id}/".replace("{"+"item_id"+"}", "$itemId").replace("{"+"type_id"+"}", "$typeId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<GetDogmaDynamicItemsTypeIdItemIdOk>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetDogmaDynamicItemsTypeIdItemIdOk
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Get effects
    * Get a list of dogma effect ids  --- Alternate route: &#x60;/dev/dogma/effects/&#x60;  Alternate route: &#x60;/legacy/dogma/effects/&#x60;  Alternate route: &#x60;/v1/dogma/effects/&#x60;  --- This route expires daily at 11:05
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @return kotlin.Array<kotlin.Int>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getDogmaEffects(datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?) : kotlin.Array<kotlin.Int> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (datasource != null) {
                    put("datasource", listOf(datasource.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-None-Match" to ifMinusNoneMinusMatch.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/dogma/effects/",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<kotlin.Int>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<kotlin.Int>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Get effect information
    * Get information on a dogma effect  --- Alternate route: &#x60;/dev/dogma/effects/{effect_id}/&#x60;  Alternate route: &#x60;/v2/dogma/effects/{effect_id}/&#x60;  --- This route expires daily at 11:05
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param effectId A dogma effect ID 
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @return GetDogmaEffectsEffectIdOk
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getDogmaEffectsEffectId(datasource: kotlin.String?, effectId: kotlin.Int, ifMinusNoneMinusMatch: kotlin.String?) : GetDogmaEffectsEffectIdOk {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (datasource != null) {
                    put("datasource", listOf(datasource.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-None-Match" to ifMinusNoneMinusMatch.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/dogma/effects/{effect_id}/".replace("{"+"effect_id"+"}", "$effectId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<GetDogmaEffectsEffectIdOk>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetDogmaEffectsEffectIdOk
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

}