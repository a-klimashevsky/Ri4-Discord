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
import tv.z85.esi.models.Forbidden
import tv.z85.esi.models.GatewayTimeout
import tv.z85.esi.models.GetCharactersCharacterIdSearchOk
import tv.z85.esi.models.GetSearchOk
import tv.z85.esi.models.InternalServerError
import tv.z85.esi.models.ServiceUnavailable
import tv.z85.esi.models.Unauthorized

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

class SearchApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("tv.z85.esi.baseUrl", "https://esi.evetech.net/latest")
        }
    }

    /**
    * Search on a string
    * Search for entities that match a given sub-string.  --- Alternate route: &#x60;/dev/characters/{character_id}/search/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/search/&#x60;  Alternate route: &#x60;/v3/characters/{character_id}/search/&#x60;  --- This route is cached for up to 3600 seconds
    * @param acceptMinusLanguage Language to use in the response (optional, default to "en-us")
    * @param categories Type of entities to search for 
    * @param characterId An EVE character ID 
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @param language Language to use in the response, takes precedence over Accept-Language (optional, default to "en-us")
    * @param search The string to search on 
    * @param strict Whether the search should be a strict match (optional, default to false)
    * @param token Access token to use if unable to set a header (optional)
    * @return GetCharactersCharacterIdSearchOk
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getCharactersCharacterIdSearch(acceptMinusLanguage: kotlin.String?, categories: kotlin.collections.Set<kotlin.String>, characterId: kotlin.Int, datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?, language: kotlin.String?, search: kotlin.String, strict: kotlin.Boolean?, token: kotlin.String?) : GetCharactersCharacterIdSearchOk {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                put("categories", toMultiValue(categories.toList(), "csv"))
                if (datasource != null) {
                    put("datasource", listOf(datasource.toString()))
                }
                if (language != null) {
                    put("language", listOf(language.toString()))
                }
                put("search", listOf(search.toString()))
                if (strict != null) {
                    put("strict", listOf(strict.toString()))
                }
                if (token != null) {
                    put("token", listOf(token.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Accept-Language" to acceptMinusLanguage.toString(), "If-None-Match" to ifMinusNoneMinusMatch.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/characters/{character_id}/search/".replace("{"+"character_id"+"}", "$characterId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<GetCharactersCharacterIdSearchOk>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetCharactersCharacterIdSearchOk
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
    * Search on a string
    * Search for entities that match a given sub-string.  --- Alternate route: &#x60;/dev/search/&#x60;  Alternate route: &#x60;/legacy/search/&#x60;  Alternate route: &#x60;/v2/search/&#x60;  --- This route is cached for up to 3600 seconds
    * @param acceptMinusLanguage Language to use in the response (optional, default to "en-us")
    * @param categories Type of entities to search for 
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @param language Language to use in the response, takes precedence over Accept-Language (optional, default to "en-us")
    * @param search The string to search on 
    * @param strict Whether the search should be a strict match (optional, default to false)
    * @return GetSearchOk
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getSearch(acceptMinusLanguage: kotlin.String?, categories: kotlin.collections.Set<kotlin.String>, datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?, language: kotlin.String?, search: kotlin.String, strict: kotlin.Boolean?) : GetSearchOk {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                put("categories", toMultiValue(categories.toList(), "csv"))
                if (datasource != null) {
                    put("datasource", listOf(datasource.toString()))
                }
                if (language != null) {
                    put("language", listOf(language.toString()))
                }
                put("search", listOf(search.toString()))
                if (strict != null) {
                    put("strict", listOf(strict.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Accept-Language" to acceptMinusLanguage.toString(), "If-None-Match" to ifMinusNoneMinusMatch.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/search/",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<GetSearchOk>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetSearchOk
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
