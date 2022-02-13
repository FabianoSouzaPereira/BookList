package br.com.seventh.bookslist.model.book

import br.com.seventh.bookslist.model.book.access.AccessInfo
import br.com.seventh.bookslist.model.book.sale.SaleInfo
import br.com.seventh.bookslist.model.book.search.SearchInfo
import br.com.seventh.bookslist.model.book.volume.VolumeInfo
import com.google.gson.annotations.SerializedName

/* Main Object Book */
data class Book (
    @SerializedName("kind")
    var kind: String?,
    @SerializedName("totalItems")
    var totalItems: Int?,
    @SerializedName("items")
    var items: MutableList<Item>?
)