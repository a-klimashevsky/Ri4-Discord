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
import tv.z85.esi.models.GetCharactersCharacterIdIndustryJobs200Ok
import tv.z85.esi.models.GetCharactersCharacterIdMining200Ok
import tv.z85.esi.models.GetCorporationCorporationIdMiningExtractions200Ok
import tv.z85.esi.models.GetCorporationCorporationIdMiningObservers200Ok
import tv.z85.esi.models.GetCorporationCorporationIdMiningObserversObserverId200Ok
import tv.z85.esi.models.GetCorporationsCorporationIdIndustryJobs200Ok
import tv.z85.esi.models.GetIndustryFacilities200Ok
import tv.z85.esi.models.GetIndustrySystems200Ok
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

class IndustryApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("tv.z85.esi.baseUrl", "https://esi.evetech.net/latest")
        }
    }

    /**
    * List character industry jobs
    * List industry jobs placed by a character  --- Alternate route: &#x60;/dev/characters/{character_id}/industry/jobs/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/industry/jobs/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/industry/jobs/&#x60;  --- This route is cached for up to 300 seconds
    * @param characterId An EVE character ID 
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @param includeCompleted Whether to retrieve completed character industry jobs. Only includes jobs from the past 90 days (optional)
    * @param token Access token to use if unable to set a header (optional)
    * @return kotlin.Array<GetCharactersCharacterIdIndustryJobs200Ok>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getCharactersCharacterIdIndustryJobs(characterId: kotlin.Int, datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?, includeCompleted: kotlin.Boolean?, token: kotlin.String?) : kotlin.Array<GetCharactersCharacterIdIndustryJobs200Ok> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (datasource != null) {
                    put("datasource", listOf(datasource.toString()))
                }
                if (includeCompleted != null) {
                    put("include_completed", listOf(includeCompleted.toString()))
                }
                if (token != null) {
                    put("token", listOf(token.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-None-Match" to ifMinusNoneMinusMatch.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/characters/{character_id}/industry/jobs/".replace("{"+"character_id"+"}", "$characterId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<GetCharactersCharacterIdIndustryJobs200Ok>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<GetCharactersCharacterIdIndustryJobs200Ok>
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
    * Character mining ledger
    * Paginated record of all mining done by a character for the past 30 days   --- Alternate route: &#x60;/dev/characters/{character_id}/mining/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mining/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/mining/&#x60;  --- This route is cached for up to 600 seconds
    * @param characterId An EVE character ID 
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @param page Which page of results to return (optional, default to 1)
    * @param token Access token to use if unable to set a header (optional)
    * @return kotlin.Array<GetCharactersCharacterIdMining200Ok>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getCharactersCharacterIdMining(characterId: kotlin.Int, datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?, page: kotlin.Int?, token: kotlin.String?) : kotlin.Array<GetCharactersCharacterIdMining200Ok> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (datasource != null) {
                    put("datasource", listOf(datasource.toString()))
                }
                if (page != null) {
                    put("page", listOf(page.toString()))
                }
                if (token != null) {
                    put("token", listOf(token.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-None-Match" to ifMinusNoneMinusMatch.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/characters/{character_id}/mining/".replace("{"+"character_id"+"}", "$characterId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<GetCharactersCharacterIdMining200Ok>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<GetCharactersCharacterIdMining200Ok>
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
    * Moon extraction timers
    * Extraction timers for all moon chunks being extracted by refineries belonging to a corporation.   --- Alternate route: &#x60;/dev/corporation/{corporation_id}/mining/extractions/&#x60;  Alternate route: &#x60;/legacy/corporation/{corporation_id}/mining/extractions/&#x60;  Alternate route: &#x60;/v1/corporation/{corporation_id}/mining/extractions/&#x60;  --- This route is cached for up to 1800 seconds  --- Requires one of the following EVE corporation role(s): Station_Manager 
    * @param corporationId An EVE corporation ID 
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @param page Which page of results to return (optional, default to 1)
    * @param token Access token to use if unable to set a header (optional)
    * @return kotlin.Array<GetCorporationCorporationIdMiningExtractions200Ok>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getCorporationCorporationIdMiningExtractions(corporationId: kotlin.Int, datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?, page: kotlin.Int?, token: kotlin.String?) : kotlin.Array<GetCorporationCorporationIdMiningExtractions200Ok> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (datasource != null) {
                    put("datasource", listOf(datasource.toString()))
                }
                if (page != null) {
                    put("page", listOf(page.toString()))
                }
                if (token != null) {
                    put("token", listOf(token.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-None-Match" to ifMinusNoneMinusMatch.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/corporation/{corporation_id}/mining/extractions/".replace("{"+"corporation_id"+"}", "$corporationId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<GetCorporationCorporationIdMiningExtractions200Ok>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<GetCorporationCorporationIdMiningExtractions200Ok>
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
    * Corporation mining observers
    * Paginated list of all entities capable of observing and recording mining for a corporation   --- Alternate route: &#x60;/dev/corporation/{corporation_id}/mining/observers/&#x60;  Alternate route: &#x60;/legacy/corporation/{corporation_id}/mining/observers/&#x60;  Alternate route: &#x60;/v1/corporation/{corporation_id}/mining/observers/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Accountant 
    * @param corporationId An EVE corporation ID 
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @param page Which page of results to return (optional, default to 1)
    * @param token Access token to use if unable to set a header (optional)
    * @return kotlin.Array<GetCorporationCorporationIdMiningObservers200Ok>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getCorporationCorporationIdMiningObservers(corporationId: kotlin.Int, datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?, page: kotlin.Int?, token: kotlin.String?) : kotlin.Array<GetCorporationCorporationIdMiningObservers200Ok> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (datasource != null) {
                    put("datasource", listOf(datasource.toString()))
                }
                if (page != null) {
                    put("page", listOf(page.toString()))
                }
                if (token != null) {
                    put("token", listOf(token.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-None-Match" to ifMinusNoneMinusMatch.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/corporation/{corporation_id}/mining/observers/".replace("{"+"corporation_id"+"}", "$corporationId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<GetCorporationCorporationIdMiningObservers200Ok>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<GetCorporationCorporationIdMiningObservers200Ok>
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
    * Observed corporation mining
    * Paginated record of all mining seen by an observer   --- Alternate route: &#x60;/dev/corporation/{corporation_id}/mining/observers/{observer_id}/&#x60;  Alternate route: &#x60;/legacy/corporation/{corporation_id}/mining/observers/{observer_id}/&#x60;  Alternate route: &#x60;/v1/corporation/{corporation_id}/mining/observers/{observer_id}/&#x60;  --- This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Accountant 
    * @param corporationId An EVE corporation ID 
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @param observerId A mining observer id 
    * @param page Which page of results to return (optional, default to 1)
    * @param token Access token to use if unable to set a header (optional)
    * @return kotlin.Array<GetCorporationCorporationIdMiningObserversObserverId200Ok>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getCorporationCorporationIdMiningObserversObserverId(corporationId: kotlin.Int, datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?, observerId: kotlin.Long, page: kotlin.Int?, token: kotlin.String?) : kotlin.Array<GetCorporationCorporationIdMiningObserversObserverId200Ok> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (datasource != null) {
                    put("datasource", listOf(datasource.toString()))
                }
                if (page != null) {
                    put("page", listOf(page.toString()))
                }
                if (token != null) {
                    put("token", listOf(token.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-None-Match" to ifMinusNoneMinusMatch.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/corporation/{corporation_id}/mining/observers/{observer_id}/".replace("{"+"corporation_id"+"}", "$corporationId").replace("{"+"observer_id"+"}", "$observerId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<GetCorporationCorporationIdMiningObserversObserverId200Ok>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<GetCorporationCorporationIdMiningObserversObserverId200Ok>
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
    * List corporation industry jobs
    * List industry jobs run by a corporation  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/industry/jobs/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/industry/jobs/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/industry/jobs/&#x60;  --- This route is cached for up to 300 seconds  --- Requires one of the following EVE corporation role(s): Factory_Manager 
    * @param corporationId An EVE corporation ID 
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @param includeCompleted Whether to retrieve completed corporation industry jobs. Only includes jobs from the past 90 days (optional, default to false)
    * @param page Which page of results to return (optional, default to 1)
    * @param token Access token to use if unable to set a header (optional)
    * @return kotlin.Array<GetCorporationsCorporationIdIndustryJobs200Ok>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getCorporationsCorporationIdIndustryJobs(corporationId: kotlin.Int, datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?, includeCompleted: kotlin.Boolean?, page: kotlin.Int?, token: kotlin.String?) : kotlin.Array<GetCorporationsCorporationIdIndustryJobs200Ok> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (datasource != null) {
                    put("datasource", listOf(datasource.toString()))
                }
                if (includeCompleted != null) {
                    put("include_completed", listOf(includeCompleted.toString()))
                }
                if (page != null) {
                    put("page", listOf(page.toString()))
                }
                if (token != null) {
                    put("token", listOf(token.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-None-Match" to ifMinusNoneMinusMatch.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/corporations/{corporation_id}/industry/jobs/".replace("{"+"corporation_id"+"}", "$corporationId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<GetCorporationsCorporationIdIndustryJobs200Ok>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<GetCorporationsCorporationIdIndustryJobs200Ok>
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
    * List industry facilities
    * Return a list of industry facilities  --- Alternate route: &#x60;/dev/industry/facilities/&#x60;  Alternate route: &#x60;/legacy/industry/facilities/&#x60;  Alternate route: &#x60;/v1/industry/facilities/&#x60;  --- This route is cached for up to 3600 seconds
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @return kotlin.Array<GetIndustryFacilities200Ok>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getIndustryFacilities(datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?) : kotlin.Array<GetIndustryFacilities200Ok> {
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
            "/industry/facilities/",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<GetIndustryFacilities200Ok>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<GetIndustryFacilities200Ok>
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
    * List solar system cost indices
    * Return cost indices for solar systems  --- Alternate route: &#x60;/dev/industry/systems/&#x60;  Alternate route: &#x60;/legacy/industry/systems/&#x60;  Alternate route: &#x60;/v1/industry/systems/&#x60;  --- This route is cached for up to 3600 seconds
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @return kotlin.Array<GetIndustrySystems200Ok>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getIndustrySystems(datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?) : kotlin.Array<GetIndustrySystems200Ok> {
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
            "/industry/systems/",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<GetIndustrySystems200Ok>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<GetIndustrySystems200Ok>
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