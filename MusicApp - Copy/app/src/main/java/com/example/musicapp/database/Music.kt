package com.example.musicapp.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "music")
data class Music (
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    @ColumnInfo(name = "naslovi") var naslov: String,
    @ColumnInfo(name = "izvodjaci") var izvodjac: String,
    @ColumnInfo(name = "albumi") var album: String,
    @ColumnInfo(name = "slike") var slika: String,
    @ColumnInfo(name = "trajanje") var trajanje: String,
    @ColumnInfo(name = "godina_izdavanja") var godinaIzdavanja: Int,
    @ColumnInfo(name = "favorite") var favorite: Boolean
)