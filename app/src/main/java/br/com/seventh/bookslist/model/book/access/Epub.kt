package br.com.seventh.bookslist.model.book.access

import com.google.gson.annotations.SerializedName

data class Epub(
    @SerializedName("isAvailable")
    var isAvailable: Boolean?,
    @SerializedName("acsTokenLink")
    var acsTokenLink: String?,
    @SerializedName("webReaderLink")
    var webReaderLink: String?,
    @SerializedName("accessViewStatus")
    var accessViewStatus: String?,
    @SerializedName("quoteSharingAllowed")
    var quoteSharingAllowed: Boolean?
)