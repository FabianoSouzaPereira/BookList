package br.com.fabianospdev.bookslist.dao.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Books(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "name") val name: String?
)