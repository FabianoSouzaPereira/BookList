package br.com.seventh.bookslist.model.book.volume

import br.com.seventh.bookslist.model.book.volume.*
import com.google.gson.annotations.SerializedName

/* This is in Book */
data class VolumeInfo (
    @SerializedName("title")
    var title: String?,
    @SerializedName("subtitle")
    var subtitle: String?,
    @SerializedName("authors")
    var authors: MutableList<String>?,
    @SerializedName("publisher")
    var publisher: String?,
    @SerializedName("publishedDate")
    var publishedDate: String?,
    @SerializedName("description")
    var description: String?,
    @SerializedName("ndustryIdentifiers")
    var industryIdentifiers: MutableList<IndustryIdentifiers>?,
    @SerializedName("readingModes")
    var readingModes: ReadingModes?,
    @SerializedName("pageCount")
    var pageCount: Int?,
    @SerializedName("printType")
    var printType: String?,
    @SerializedName("categories")
    var categories: MutableList<String>?,
    @SerializedName("maturityRating")
    var maturityRating: String?,
    @SerializedName("allowAnonLogging")
    var allowAnonLogging: Boolean?,
    @SerializedName("contentVersion")
    var contentVersion: String?,
    @SerializedName("panelizationSummary")
    var panelizationSummary: PanelizationSummary?,
    @SerializedName("containsEpubBubbles")
    var containsEpubBubbles: Boolean?,
    @SerializedName("containsImageBubbles")
    var containsImageBubbles: Boolean?,
    @SerializedName("imageLinks")
    var imageLinks: ImageLinks?,
    @SerializedName("language")
    var language: String?,
    @SerializedName("reviewLink")
    var previewLink: String?,
    @SerializedName("infoLink")
    var infoLink: String?,
    @SerializedName("canonicalVolumeLink")
    var canonicalVolumeLink: String?,
)









