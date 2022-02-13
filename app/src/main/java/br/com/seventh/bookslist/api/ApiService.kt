package br.com.seventh.bookslist.api

import br.com.seventh.bookslist.model.book.Book
import br.com.seventh.bookslist.utils.Constants
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ApiService {
    
   @GET(Constants.Endpoint.GET_BOOKS)
    fun getBook(
        @Header("Accept")  applicationJson: String,
        @Header("Content-Type")  contentType: String,
        @Query(Constants.Endpoint.PARAM_Q) q: String): Call<Book>
}