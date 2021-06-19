package com.example.musicapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Music::class], version = 1, exportSchema = false)
abstract class MusicDatabase : RoomDatabase(){
    abstract val musicDAO: MusicDAO
    companion object {
        @Volatile
        private var INSTANCE: MusicDatabase? = null

        fun getInstance(context: Context): MusicDatabase? {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        MusicDatabase::class.java,
                        "music").fallbackToDestructiveMigration().build()
                        instance = INSTANCE
                }

                return instance
            }
        }
    }
}