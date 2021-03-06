package br.com.seventh.bookslist.model.book.sale

import br.com.seventh.bookslist.model.book.sale.offers.ListPrice
import br.com.seventh.bookslist.model.book.sale.offers.Offers
import br.com.seventh.bookslist.model.book.sale.offers.RetailPrice

data class SaleInfo(
    var country: String,
    var saleability: String,
    var isEbook: Boolean,
    var listPrice: ListPrice,
    var retailPrice: RetailPrice,
    var buyLink: String,
    var offers: Offers,
)







