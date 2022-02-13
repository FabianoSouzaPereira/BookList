package br.com.seventh.bookslist.model.book.access

import com.google.gson.annotations.SerializedName

data class Pdf(
    @SerializedName("isAvailable")
    var isAvailable: Boolean?,
    @SerializedName("acsTokenLink")
    var acsTokenLink: String?
)