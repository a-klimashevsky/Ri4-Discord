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
import tv.z85.esi.models.GetAlliancesAllianceIdContacts200Ok
import tv.z85.esi.models.GetAlliancesAllianceIdContactsLabels200Ok
import tv.z85.esi.models.GetCharactersCharacterIdContacts200Ok
import tv.z85.esi.models.GetCharactersCharacterIdContactsLabels200Ok
import tv.z85.esi.models.GetCorporationsCorporationIdContacts200Ok
import tv.z85.esi.models.GetCorporationsCorporationIdContactsLabels200Ok
import tv.z85.esi.models.InternalServerError
import tv.z85.esi.models.PostCharactersCharacterIdContactsError520
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

class ContactsApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("tv.z85.esi.baseUrl", "https://esi.evetech.net/latest")
        }
    }

    /**
    * Delete contacts
    * Bulk delete contacts  --- Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/contacts/&#x60; 
    * @param characterId An EVE character ID 
    * @param contactIds A list of contacts to delete 
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param token Access token to use if unable to set a header (optional)
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deleteCharactersCharacterIdContacts(characterId: kotlin.Int, contactIds: kotlin.Array<kotlin.Int>, datasource: kotlin.String?, token: kotlin.String?) : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                put("contact_ids", toMultiValue(contactIds.toList(), "csv"))
                if (datasource != null) {
                    put("datasource", listOf(datasource.toString()))
                }
                if (token != null) {
                    put("token", listOf(token.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/characters/{character_id}/contacts/".replace("{"+"character_id"+"}", "$characterId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
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
    * Get alliance contacts
    * Return contacts of an alliance  --- Alternate route: &#x60;/dev/alliances/{alliance_id}/contacts/&#x60;  Alternate route: &#x60;/v2/alliances/{alliance_id}/contacts/&#x60;  --- This route is cached for up to 300 seconds
    * @param allianceId An EVE alliance ID 
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @param page Which page of results to return (optional, default to 1)
    * @param token Access token to use if unable to set a header (optional)
    * @return kotlin.Array<GetAlliancesAllianceIdContacts200Ok>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getAlliancesAllianceIdContacts(allianceId: kotlin.Int, datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?, page: kotlin.Int?, token: kotlin.String?) : kotlin.Array<GetAlliancesAllianceIdContacts200Ok> {
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
            "/alliances/{alliance_id}/contacts/".replace("{"+"alliance_id"+"}", "$allianceId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<GetAlliancesAllianceIdContacts200Ok>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<GetAlliancesAllianceIdContacts200Ok>
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
    * Get alliance contact labels
    * Return custom labels for an alliance&#39;s contacts  --- Alternate route: &#x60;/dev/alliances/{alliance_id}/contacts/labels/&#x60;  Alternate route: &#x60;/legacy/alliances/{alliance_id}/contacts/labels/&#x60;  Alternate route: &#x60;/v1/alliances/{alliance_id}/contacts/labels/&#x60;  --- This route is cached for up to 300 seconds
    * @param allianceId An EVE alliance ID 
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @param token Access token to use if unable to set a header (optional)
    * @return kotlin.Array<GetAlliancesAllianceIdContactsLabels200Ok>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getAlliancesAllianceIdContactsLabels(allianceId: kotlin.Int, datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?, token: kotlin.String?) : kotlin.Array<GetAlliancesAllianceIdContactsLabels200Ok> {
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
            "/alliances/{alliance_id}/contacts/labels/".replace("{"+"alliance_id"+"}", "$allianceId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<GetAlliancesAllianceIdContactsLabels200Ok>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<GetAlliancesAllianceIdContactsLabels200Ok>
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
    * Get contacts
    * Return contacts of a character  --- Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/contacts/&#x60;  --- This route is cached for up to 300 seconds
    * @param characterId An EVE character ID 
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @param page Which page of results to return (optional, default to 1)
    * @param token Access token to use if unable to set a header (optional)
    * @return kotlin.Array<GetCharactersCharacterIdContacts200Ok>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getCharactersCharacterIdContacts(characterId: kotlin.Int, datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?, page: kotlin.Int?, token: kotlin.String?) : kotlin.Array<GetCharactersCharacterIdContacts200Ok> {
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
            "/characters/{character_id}/contacts/".replace("{"+"character_id"+"}", "$characterId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<GetCharactersCharacterIdContacts200Ok>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<GetCharactersCharacterIdContacts200Ok>
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
    * Get contact labels
    * Return custom labels for a character&#39;s contacts  --- Alternate route: &#x60;/dev/characters/{character_id}/contacts/labels/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contacts/labels/&#x60;  Alternate route: &#x60;/v1/characters/{character_id}/contacts/labels/&#x60;  --- This route is cached for up to 300 seconds
    * @param characterId An EVE character ID 
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @param token Access token to use if unable to set a header (optional)
    * @return kotlin.Array<GetCharactersCharacterIdContactsLabels200Ok>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getCharactersCharacterIdContactsLabels(characterId: kotlin.Int, datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?, token: kotlin.String?) : kotlin.Array<GetCharactersCharacterIdContactsLabels200Ok> {
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
            "/characters/{character_id}/contacts/labels/".replace("{"+"character_id"+"}", "$characterId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<GetCharactersCharacterIdContactsLabels200Ok>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<GetCharactersCharacterIdContactsLabels200Ok>
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
    * Get corporation contacts
    * Return contacts of a corporation  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/contacts/&#x60;  Alternate route: &#x60;/v2/corporations/{corporation_id}/contacts/&#x60;  --- This route is cached for up to 300 seconds
    * @param corporationId An EVE corporation ID 
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @param page Which page of results to return (optional, default to 1)
    * @param token Access token to use if unable to set a header (optional)
    * @return kotlin.Array<GetCorporationsCorporationIdContacts200Ok>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getCorporationsCorporationIdContacts(corporationId: kotlin.Int, datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?, page: kotlin.Int?, token: kotlin.String?) : kotlin.Array<GetCorporationsCorporationIdContacts200Ok> {
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
            "/corporations/{corporation_id}/contacts/".replace("{"+"corporation_id"+"}", "$corporationId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<GetCorporationsCorporationIdContacts200Ok>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<GetCorporationsCorporationIdContacts200Ok>
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
    * Get corporation contact labels
    * Return custom labels for a corporation&#39;s contacts  --- Alternate route: &#x60;/dev/corporations/{corporation_id}/contacts/labels/&#x60;  Alternate route: &#x60;/legacy/corporations/{corporation_id}/contacts/labels/&#x60;  Alternate route: &#x60;/v1/corporations/{corporation_id}/contacts/labels/&#x60;  --- This route is cached for up to 300 seconds
    * @param corporationId An EVE corporation ID 
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param ifMinusNoneMinusMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
    * @param token Access token to use if unable to set a header (optional)
    * @return kotlin.Array<GetCorporationsCorporationIdContactsLabels200Ok>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getCorporationsCorporationIdContactsLabels(corporationId: kotlin.Int, datasource: kotlin.String?, ifMinusNoneMinusMatch: kotlin.String?, token: kotlin.String?) : kotlin.Array<GetCorporationsCorporationIdContactsLabels200Ok> {
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
            "/corporations/{corporation_id}/contacts/labels/".replace("{"+"corporation_id"+"}", "$corporationId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<kotlin.Array<GetCorporationsCorporationIdContactsLabels200Ok>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Array<GetCorporationsCorporationIdContactsLabels200Ok>
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
    * Add contacts
    * Bulk add contacts with same settings  --- Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/contacts/&#x60; 
    * @param characterId An EVE character ID 
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param labelIds Add custom labels to the new contact (optional)
    * @param standing Standing for the contact 
    * @param token Access token to use if unable to set a header (optional)
    * @param watched Whether the contact should be watched, note this is only effective on characters (optional, default to false)
    * @param contactIds A list of contacts 
    * @return kotlin.Array<kotlin.Int>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun postCharactersCharacterIdContacts(characterId: kotlin.Int, datasource: kotlin.String?, labelIds: kotlin.Array<kotlin.Long>?, standing: kotlin.Float, token: kotlin.String?, watched: kotlin.Boolean?, contactIds: kotlin.Array<kotlin.Int>) : kotlin.Array<kotlin.Int> {
        val localVariableBody: kotlin.Any? = contactIds
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (datasource != null) {
                    put("datasource", listOf(datasource.toString()))
                }
                if (labelIds != null) {
                    put("label_ids", toMultiValue(labelIds.toList(), "csv"))
                }
                put("standing", listOf(standing.toString()))
                if (token != null) {
                    put("token", listOf(token.toString()))
                }
                if (watched != null) {
                    put("watched", listOf(watched.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/characters/{character_id}/contacts/".replace("{"+"character_id"+"}", "$characterId"),
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
    * Edit contacts
    * Bulk edit contacts with same settings  --- Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/v2/characters/{character_id}/contacts/&#x60; 
    * @param characterId An EVE character ID 
    * @param datasource The server name you would like data from (optional, default to "tranquility")
    * @param labelIds Add custom labels to the contact (optional)
    * @param standing Standing for the contact 
    * @param token Access token to use if unable to set a header (optional)
    * @param watched Whether the contact should be watched, note this is only effective on characters (optional, default to false)
    * @param contactIds A list of contacts 
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun putCharactersCharacterIdContacts(characterId: kotlin.Int, datasource: kotlin.String?, labelIds: kotlin.Array<kotlin.Long>?, standing: kotlin.Float, token: kotlin.String?, watched: kotlin.Boolean?, contactIds: kotlin.Array<kotlin.Int>) : Unit {
        val localVariableBody: kotlin.Any? = contactIds
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (datasource != null) {
                    put("datasource", listOf(datasource.toString()))
                }
                if (labelIds != null) {
                    put("label_ids", toMultiValue(labelIds.toList(), "csv"))
                }
                put("standing", listOf(standing.toString()))
                if (token != null) {
                    put("token", listOf(token.toString()))
                }
                if (watched != null) {
                    put("watched", listOf(watched.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/characters/{character_id}/contacts/".replace("{"+"character_id"+"}", "$characterId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
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
