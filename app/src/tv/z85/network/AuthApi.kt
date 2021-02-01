package tv.z85.network

import com.squareup.moshi.Json
import io.ktor.auth.*
import io.ktor.http.*
import io.ktor.http.auth.*
import tv.z85.domain.VerificationInfo
import tv.z85.esi.infrastructure.*
import java.util.*


class AuthApi(basePath: String = defaultBasePath) : ApiClient(basePath) {

    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            "https://login.eveonline.com"
        }
    }

    fun updateAuthToken(
        refreshToken: String,
        clientId: String,
        clientSecret: String
    ): RefreshTokenResponse {
        val headerAuth = Base64.getEncoder().encodeToString("$clientId:$clientSecret".toByteArray(Charsets.ISO_8859_1))
        val headers: MutableMap<String, String> =
            mutableMapOf(
                HttpHeaders.Authorization to HttpAuthHeader.Single(
                    AuthScheme.Basic,
                    headerAuth
                ).render(),
                HttpHeaders.ContentType to "application/json"
            )

        val body = RefreshTokenRequest(refreshToken)

        val config = RequestConfig(
            method = RequestMethod.POST,
            path = "/oauth/token",
            headers = headers
        )

        val response = request<RefreshTokenResponse>(
            requestConfig = config,
            body = body
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as RefreshTokenResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = response as ClientError<*>
                throw ClientException(
                    "Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}",
                    localVarError.statusCode,
                    response
                )
            }
            ResponseType.ServerError -> {
                val localVarError = response as ServerError<*>
                throw ServerException(
                    "Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}",
                    localVarError.statusCode,
                    response
                )
            }
        }
    }

    fun verify(authToken: String): VerificationInfo {

        val headers: MutableMap<String, String> =
            mutableMapOf("Authorization" to "Bearer $authToken")

        val config = RequestConfig(
            method = RequestMethod.GET,
            path = "/oauth/verify",
            headers = headers
        )

        val response = request<VerificationInfo>(
            requestConfig = config,
            body = null
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as VerificationInfo
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = response as ClientError<*>
                throw ClientException(
                    "Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}",
                    localVarError.statusCode,
                    response
                )
            }
            ResponseType.ServerError -> {
                val localVarError = response as ServerError<*>
                throw ServerException(
                    "Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}",
                    localVarError.statusCode,
                    response
                )
            }
        }
    }
}

data class RefreshTokenRequest(
    @Json(name = "refresh_token")
    val refreshToken: String,

    @Json(name = "grant_type")
    val grantType: String = "refresh_token"
)

data class RefreshTokenResponse(
    @Json(name = "access_token")
    val accessToken: String,
    @Json(name = "token_type")
    val tokenType: String,
    @Json(name = "expires_in")
    val expiresIn: Long,
    @Json(name = "refresh_token")
    val refreshToken: String
)