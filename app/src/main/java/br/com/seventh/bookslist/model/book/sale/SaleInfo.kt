package br.com.seventh.bookslist.model.book.sale

import br.com.seventh.bookslist.model.book.sale.offers.ListPrice
import br.com.seventh.bookslist.model.book.sale.offers.Offers
import br.com.seventh.bookslist.model.book.sale.offers.RetailPrice
import com.google.gson.annotations.SerializedName

data class SaleInfo(
    @SerializedName("country")
    var country: String?,
    @SerializedName("saleability")
    var saleability: String?,
    @SerializedName("isEbook")
    var isEbook: Boolean?,
    @SerializedName("listPrice")
    var listPrice: ListPrice?,
    @SerializedName("retailPrice")
    var retailPrice: RetailPrice?,
    @SerializedName("buyLink")
    var buyLink: String?,
    @SerializedName("offers")
    var offers: Offers?,
)







