package br.com.seventh.bookslist.model.book.access

import com.google.gson.annotations.SerializedName

data class AccessInfo (
    @SerializedName("country")
    var country: String?,
    @SerializedName("viewability")
    var viewability: String?,
    @SerializedName("embeddable")
    var embeddable: Boolean?,
    @SerializedName("publicDomain")
    var publicDomain: Boolean?,
    @SerializedName("textToSpeechPermission")
    var textToSpeechPermission: String?,
    @SerializedName("epub")
    var epub: Epub?,
    @SerializedName("pdf")
    var pdf: Pdf?
)




