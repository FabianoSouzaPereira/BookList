package br.com.seventh.bookslist.model.book.sale.offers

import com.google.gson.annotations.SerializedName

data class Offer(
    @SerializedName("finskyOfferType")
    var finskyOfferType: Int?,
    @SerializedName("listPrice")
    var listPrice: MutableList<ListPrice>?,
    @SerializedName("retailPrice")
    var retailPrice: MutableList<RetailPrice>?,
    @SerializedName("giftable")
    var giftable: Boolean?
)