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
    @SerializedName("id")
    var id: String?,
    @SerializedName("etag")
    var etag: String?,
    @SerializedName("selfLink")
    var selfLink: String?,
    @SerializedName("volumeInfo")
    var volumeInfo: VolumeInfo?,
    @SerializedName("saleInfo")
    var saleInfo: SaleInfo?,
    @SerializedName("accessInfo")
    var accessInfo: AccessInfo?,
    @SerializedName("searchInfo")
    var searchInfo: SearchInfo?
)