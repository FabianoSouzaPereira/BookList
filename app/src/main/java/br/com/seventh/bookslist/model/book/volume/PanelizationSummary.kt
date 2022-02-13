package br.com.seventh.bookslist.model.book.volume

import com.google.gson.annotations.SerializedName

/* This is in VolumeInfo */
data class PanelizationSummary(
    @SerializedName("containsEpubBubbles")
    var containsEpubBubbles: Boolean?,
    @SerializedName("containsImageBubbles")
    var containsImageBubbles: Boolean?
)