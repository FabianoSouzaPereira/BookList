package br.com.seventh.bookslist.utils

object Constants {
    const val API_GOOGLE_BOOKS_URL = "https://www.googleapis.com/"
    const val API_RESPONSE_OK = 200
    const val API_RESPONSE_FORBIDDEN: Int = 403
    const val API_FIELD_ERROR_BODY = "message"
    const val API_RESPONSE_MESSAGE_INVALID_TOKEN = "Token inválido."
    const val API_ERROR_CALL_SERVER = "error_call_api"

    object Endpoint {
        private const val PREFIX = "books/"
        private const val PARAM_V1 = "v1/"
        private const val PARAM_VOLUME = "volumes"
        const val PARAM_Q = "q"
       // const val PARAM_REQUEST = "Dicionario"
       // const val PARAMS = PARAM_Q
        const val GET_BOOKS = "${API_GOOGLE_BOOKS_URL}${PREFIX}${PARAM_V1}${PARAM_VOLUME}"
    }

}