package br.com.seventh.bookslist.api

import br.com.seventh.bookslist.model.book.Book
import br.com.seventh.bookslist.utils.Constants
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface ApiService {

    @GET(Constants.Endpoint.GET_BOOKS)
    fun getBook(
        @Header(Constants.Endpoint.PARAM_REQUEST) q: String): Call<List<Book>>
}