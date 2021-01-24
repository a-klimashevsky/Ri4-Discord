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
import tv.z85.esi.models.*
import java.lang.Integer.parseInt

class ContractsApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("tv.z85.esi.baseUrl", "https://esi.evetech.net/latest")
        }
    }

    /**
    * Get contracts
    * Returns contracts available to a character, only if the character is issuer, acceptor or assignee. Only returns contracts no older than 30 days, or if the status is \&quot;in_progress\&quot;.  --- Alternate route: &#x60;/dev/characters/{character_id}/contracts/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contracts/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/contracts/&#x60;  --- This route is cached for up to 300 seconds
    * @param characterId An EVE character ID 
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @param page Which page of results to return (optional, default to 1)
    * @param token Access token to use if unable to set a header (optional)
    * @return kotlin.Array<GetCharactersCharacterIdContracts200Ok>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getCharactersCharacterIdContracts(characterId: kotlin.Int, datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?, page: kotlin.Int?, token: kotlin.String?) : kotlin.Array<GetCharactersCharacterIdContracts200Ok> {
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
            "/characters/{character_id}/contracts/".replace("{"+"character_id"+"}", "$characterId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<GetCharactersCharacterIdContracts200Ok>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<GetCharactersCharacterIdContracts200Ok>
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
    * Get contract bids
    * Lists bids on a particular auction contract  --- Alternate route: &#x60;/dev/characters/{character_id}/contracts/{contract_id}/bids/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contracts/{contract_id}/bids/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/contracts/{contract_id}/bids/&#x60;  --- This route is cached for up to 300 seconds
    * @param characterId An EVE character ID 
    * @param contractId ID of a contract 
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @param token Access token to use if unable to set a header (optional)
    * @return kotlin.Array<GetCharactersCharacterIdContractsContractIdBids200Ok>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getCharactersCharacterIdContractsContractIdBids(characterId: kotlin.Int, contractId: kotlin.Int, datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?, token: kotlin.String?) : kotlin.Array<GetCharactersCharacterIdContractsContractIdBids200Ok> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (datasource != null) {
                    put("datasource", listOf(datasource.toString()))
                }
                if (token != null) {
                    put("token", listOf(token.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-None-Match" to ifMinusNoneMinusMatch.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/characters/{character_id}/contracts/{contract_id}/bids/".replace("{"+"character_id"+"}", "$characterId").replace("{"+"contract_id"+"}", "$contractId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<GetCharactersCharacterIdContractsContractIdBids200Ok>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<GetCharactersCharacterIdContractsContractIdBids200Ok>
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
    * Get contract items
    * Lists items of a particular contract  --- Alternate route: &#x60;/dev/characters/{character_id}/contracts/{contract_id}/items/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contracts/{contract_id}/items/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/contracts/{contract_id}/items/&#x60;  --- This route is cached for up to 3600 seconds
    * @param characterId An EVE character ID 
    * @param contractId ID of a contract 
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @param token Access token to use if unable to set a header (optional)
    * @return kotlin.Array<GetCharactersCharacterIdContractsContractIdItems200Ok>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getCharactersCharacterIdContractsContractIdItems(characterId: kotlin.Int, contractId: kotlin.Int, datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?, token: kotlin.String?) : kotlin.Array<GetCharactersCharacterIdContractsContractIdItems200Ok> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (datasource != null) {
                    put("datasource", listOf(datasource.toString()))
                }
                if (token != null) {
                    put("token", listOf(token.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-None-Match" to ifMinusNoneMinusMatch.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/characters/{character_id}/contracts/{contract_id}/items/".replace("{"+"character_id"+"}", "$characterId").replace("{"+"contract_id"+"}", "$contractId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<GetCharactersCharacterIdContractsContractIdItems200Ok>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<GetCharactersCharacterIdContractsContractIdItems200Ok>
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
    * Get public contract bids
    * Lists bids on a public auction contract  --- Alternate route: &#x60;/dev/contracts/public/bids/{contract_id}/&#x60;  Alternate route: &#x60;/legacy/contracts/public/bids/{contract_id}/&#x60;  Alternate route: &#x60;/v1/contracts/public/bids/{contract_id}/&#x60;  --- This route is cached for up to 300 seconds
    * @param contractId ID of a contract 
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @param page Which page of results to return (optional, default to 1)
    * @return kotlin.Array<GetContractsPublicBidsContractId200Ok>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getContractsPublicBidsContractId(contractId: kotlin.Int, datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?, page: kotlin.Int?) : kotlin.Array<GetContractsPublicBidsContractId200Ok> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (datasource != null) {
                    put("datasource", listOf(datasource.toString()))
                }
                if (page != null) {
                    put("page", listOf(page.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-None-Match" to ifMinusNoneMinusMatch.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/contracts/public/bids/{contract_id}/".replace("{"+"contract_id"+"}", "$contractId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<GetContractsPublicBidsContractId200Ok>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<GetContractsPublicBidsContractId200Ok>
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
    * Get public contract items
    * Lists items of a public contract  --- Alternate route: &#x60;/dev/contracts/public/items/{contract_id}/&#x60;  Alternate route: &#x60;/legacy/contracts/public/items/{contract_id}/&#x60;  Alternate route: &#x60;/v1/contracts/public/items/{contract_id}/&#x60;  --- This route is cached for up to 3600 seconds
    * @param contractId ID of a contract 
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @param page Which page of results to return (optional, default to 1)
    * @return kotlin.Array<GetContractsPublicItemsContractId200Ok>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getContractsPublicItemsContractId(contractId: kotlin.Int, datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?, page: kotlin.Int?) : kotlin.Array<GetContractsPublicItemsContractId200Ok> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (datasource != null) {
                    put("datasource", listOf(datasource.toString()))
                }
                if (page != null) {
                    put("page", listOf(page.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-None-Match" to ifMinusNoneMinusMatch.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/contracts/public/items/{contract_id}/".replace("{"+"contract_id"+"}", "$contractId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<GetContractsPublicItemsContractId200Ok>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<GetContractsPublicItemsContractId200Ok>
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
    * Get public contracts
    * Returns a paginated list of all public contracts in the given region  --- Alternate route: &#x60;/dev/contracts/public/{region_id}/&#x60;  Alternate route: &#x60;/legacy/contracts/public/{region_id}/&#x60;  Alternate route: &#x60;/v1/contracts/public/{region_id}/&#x60;  --- This route is cached for up to 1800 seconds
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @param page Which page of results to return (optional, default to 1)
    * @param regionId An EVE region id 
    * @return kotlin.Array<GetContractsPublicRegionId200Ok>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getContractsPublicRegionId(datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?, page: kotlin.Int?, regionId: kotlin.Int) : kotlin.Array<GetContractsPublicRegionId200Ok> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (datasource != null) {
                    put("datasource", listOf(datasource.toString()))
                }
                if (page != null) {
                    put("page", listOf(page.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-None-Match" to ifMinusNoneMinusMatch.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/contracts/public/{region_id}/".replace("{"+"region_id"+"}", "$regionId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<GetContractsPublicRegionId200Ok>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<GetContractsPublicRegionId200Ok>
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
    * Get corporation contracts
    * Returns contracts available to a corporation, only if the corporation is issuer, acceptor or assignee. Only returns contracts no older than 30 days, or if the status is \&quot;in_progress\&quot;.  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/contracts/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/contracts/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/contracts/&#x60;  --- This route is cached for up to 300 seconds
    * @param corporationId An EVE corporation ID 
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @param page Which page of results to return (optional, default to 1)
    * @param token Access token to use if unable to set a header (optional)
    * @return kotlin.Array<GetCorporationsCorporationIdContracts200Ok>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getCorporationsCorporationIdContracts(corporationId: kotlin.Int, datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?, page: kotlin.Int?, token: kotlin.String?) : Paged<Array<GetCorporationsCorporationIdContracts200Ok>> {
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
            "/corporations/{corporation_id}/contracts/".replace("{"+"corporation_id"+"}", "$corporationId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<GetCorporationsCorporationIdContracts200Ok>>(
            localVariableConfig,
            localVariableBody
        )

        val pageCount = parseInt(localVarResponse.headers["X-Pages"]?.first())

        return when (localVarResponse.responseType) {
            ResponseType.Success ->Paged(
                data = (localVarResponse as Success<*>).data as Array<GetCorporationsCorporationIdContracts200Ok>,
                pageCount = pageCount
            )
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
    * Get corporation contract bids
    * Lists bids on a particular auction contract  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/contracts/{contract_id}/bids/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/contracts/{contract_id}/bids/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/contracts/{contract_id}/bids/&#x60;  --- This route is cached for up to 3600 seconds
    * @param contractId ID of a contract 
    * @param corporationId An EVE corporation ID 
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @param page Which page of results to return (optional, default to 1)
    * @param token Access token to use if unable to set a header (optional)
    * @return kotlin.Array<GetCorporationsCorporationIdContractsContractIdBids200Ok>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getCorporationsCorporationIdContractsContractIdBids(contractId: kotlin.Int, corporationId: kotlin.Int, datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?, page: kotlin.Int?, token: kotlin.String?) : kotlin.Array<GetCorporationsCorporationIdContractsContractIdBids200Ok> {
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
            "/corporations/{corporation_id}/contracts/{contract_id}/bids/".replace("{"+"contract_id"+"}", "$contractId").replace("{"+"corporation_id"+"}", "$corporationId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<GetCorporationsCorporationIdContractsContractIdBids200Ok>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<GetCorporationsCorporationIdContractsContractIdBids200Ok>
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
    * Get corporation contract items
    * Lists items of a particular contract  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/contracts/{contract_id}/items/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/contracts/{contract_id}/items/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/contracts/{contract_id}/items/&#x60;  --- This route is cached for up to 3600 seconds
    * @param contractId ID of a contract 
    * @param corporationId An EVE corporation ID 
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @param token Access token to use if unable to set a header (optional)
    * @return kotlin.Array<GetCorporationsCorporationIdContractsContractIdItems200Ok>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getCorporationsCorporationIdContractsContractIdItems(contractId: kotlin.Int, corporationId: kotlin.Int, datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?, token: kotlin.String?) : kotlin.Array<GetCorporationsCorporationIdContractsContractIdItems200Ok> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (datasource != null) {
                    put("datasource", listOf(datasource.toString()))
                }
                if (token != null) {
                    put("token", listOf(token.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("If-None-Match" to ifMinusNoneMinusMatch.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/corporations/{corporation_id}/contracts/{contract_id}/items/".replace("{"+"contract_id"+"}", "$contractId").replace("{"+"corporation_id"+"}", "$corporationId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<GetCorporationsCorporationIdContractsContractIdItems200Ok>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<GetCorporationsCorporationIdContractsContractIdItems200Ok>
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
