package br.com.seventh.bookslist.utils

import br.com.seventh.bookslist.model.book.Book
import br.com.seventh.bookslist.model.book.Item


class Shared {
    companion object {
        @JvmStatic
        var instance = Shared()
    }

    init {
        instance = this
    }

    var booksList: Book = Book("",0,ArrayList())
    var list: MutableList<Item> = ArrayList()


}