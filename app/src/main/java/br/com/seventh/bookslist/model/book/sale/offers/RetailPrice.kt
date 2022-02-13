package br.com.seventh.bookslist.model.book.sale.offers

import com.google.gson.annotations.SerializedName

data class RetailPrice(
    @SerializedName("amount")
    var amount: Double?,
    @SerializedName("currencyCode")
    var currencyCode: String?
)