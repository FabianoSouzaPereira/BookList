package br.com.seventh.bookslist.api

import br.com.seventh.bookslist.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInitializer {
    private val retrofit = Retrofit.Builder()
        .baseUrl(Constants.API_GOOGLE_BOOKS_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    /** Get a new instance of retrofit */
    fun userService() = retrofit.create(ApiService::class.java)!!


    companion object {

        /** Retorna uma Instância do Client Retrofit para Requisições
         * @param path Caminho Principal da API
         */
        fun getRetrofitInstance(path : String) : Retrofit {
            return Retrofit.Builder()
                .baseUrl(path)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}