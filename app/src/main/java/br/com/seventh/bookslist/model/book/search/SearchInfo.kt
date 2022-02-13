package br.com.seventh.bookslist.model.book.search

import com.google.gson.annotations.SerializedName

data class SearchInfo (
    @SerializedName("textSnippet")
    var textSnippet: String?
)