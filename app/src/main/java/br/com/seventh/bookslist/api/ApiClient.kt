package br.com.seventh.bookslist.api

import android.content.Context
import android.widget.Toast
import br.com.seventh.bookslist.model.book.Book

class ApiClient {

    fun getBook(
        context: Context,
        param: String,
        success: (response: List<Book>) -> Unit,
        failure: (throwable: Throwable) -> Unit
    ) {

        val call = RetrofitInitializer()
            .userService().getBook(param)

        call.enqueue(callback({ response ->

            if (response?.code() == 200) {
                success(response.body()!!)
            } 

        }, {
            Toast.makeText(context, "Erro na requisição", Toast.LENGTH_SHORT).show()
        }))
    }
}