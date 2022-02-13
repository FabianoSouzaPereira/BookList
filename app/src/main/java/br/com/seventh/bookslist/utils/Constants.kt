package br.com.seventh.bookslist.utils

object Constants {
    const val API_GOOGLE_BOOKS_URL = "https://www.googleapis.com/"

    object Endpoint {
        private const val PREFIX = "books/"
        private const val PARAM_V1 = "v1/"
        private const val PARAM_VOLUME = "volumes/"
        private const val PARAM_Q = "q="
        const val PARAM_REQUEST = "Dicionário do Espírito Santo"
        const val PARAMS = "${PARAM_V1}${PARAM_VOLUME}${PARAM_Q}"
        const val GET_BOOKS = "${API_GOOGLE_BOOKS_URL}${PREFIX}${PARAMS}${PARAM_REQUEST}"
    }
}