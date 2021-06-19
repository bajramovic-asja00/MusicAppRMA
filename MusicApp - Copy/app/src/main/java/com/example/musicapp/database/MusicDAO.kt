package com.example.musicapp.database

import androidx.room.*
import com.example.musicapp.database.Music

@Dao
interface MusicDAO {

    @Insert
    fun insertSong(music: Music)

    @Update
    fun updateSong(music: Music)

    @Delete
    fun deleteSong(music: Music)

    @Query("delete from music")
    fun clear()

    @Query("select * from music order by naslovi asc")
    fun getAllSongs(): List<Music>

    @Query("select * from music where favorite = 'true' order by naslovi asc")
    fun getAllFavorites(): List<Music>

    @Query("select * from music where izvodjaci = :izvodjac order by naslovi asc")
    fun getSongsByArtist(izvodjac: String): List<Music>

    @Query("select * from music where godina_izdavanja= :godinaIzdavanja order by naslovi asc")
    fun getSongsByYear(godinaIzdavanja: Int): List<Music>
}