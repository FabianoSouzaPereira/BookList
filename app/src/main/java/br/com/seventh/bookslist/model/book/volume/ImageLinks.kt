package br.com.seventh.bookslist.model.book.volume

import com.google.gson.annotations.SerializedName

/* This is in VolumeInfo */
data class ImageLinks(
    @SerializedName("smallThumbnail")
    var smallThumbnail: String?,
    @SerializedName("thumbnail")
    var thumbnail: String?
)