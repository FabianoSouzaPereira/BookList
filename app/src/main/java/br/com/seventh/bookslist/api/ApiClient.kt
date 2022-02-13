package br.com.seventh.bookslist.api

import android.content.Context
import android.widget.Toast
import br.com.seventh.bookslist.R
import br.com.seventh.bookslist.model.book.Book
import br.com.seventh.bookslist.utils.Constants
import org.json.JSONObject

class ApiClient {

    private fun <T> validateResponse(
        context: Context,
        response: retrofit2.Response<T>?
    ): Throwable? {
        var throwable: Throwable? = null

        if (response == null) {
            return Throwable(context.resources.getString(R.string.error_server_general))
        }

        if (response.code() != Constants.API_RESPONSE_OK && response.errorBody()?.string() !== "") {
            try {
                throwable = if (response.errorBody() != null) {
                    val json = JSONObject(response.errorBody()!!.string())

                    if ((response.code() == (Constants.API_RESPONSE_FORBIDDEN)) &&
                        (json.get(Constants.API_FIELD_ERROR_BODY)
                            .toString() == (Constants.API_RESPONSE_MESSAGE_INVALID_TOKEN))
                    ) {
                        Throwable(context.getString(R.string.info_login_token_expired))
                    } else {
                        Throwable(context.resources.getString(R.string.error_server_access))
                    }
                } else {
                    Throwable(context.resources.getString(R.string.error_server_access))
                }
            } catch (e: Exception) {
                throwable = Throwable(context.resources.getString(R.string.error_server_access))
                //  Toast.makeText(context, context.resources.getString(R.string.error_server_access)+ ": " + e, Toast.LENGTH_SHORT).show()
            }
            //todo descomentar estes trechos após melhorar o tratamento de erros
            //  Helper.Preferences.setPreference(context, context.getString(R.string.key_api_token), "")

            //  context.startActivity(Intent(context, LoginActivity::class.java))
        }

        return throwable
    }

    fun getBook(
        context: Context,
        param: String,
        success: (response: Book) -> Unit,
        failure: (throwable: Throwable) -> Unit
    ) {

        val call = RetrofitInitializer()
            .userService().getBook("application/json","application/json", param)

        call.enqueue(callback({ response ->
            
            val throwable = validateResponse(context, response)

            if (response?.code() == 200) {
                success(response!!.body()!!)
            } else {
                failure(throwable!!)
            } 

        }, { throwable ->
            throwable?.let {
                failure(Throwable(Constants.API_ERROR_CALL_SERVER))
            }
            Toast.makeText(context, "Erro na requisição", Toast.LENGTH_SHORT).show()
        }))
    }
}