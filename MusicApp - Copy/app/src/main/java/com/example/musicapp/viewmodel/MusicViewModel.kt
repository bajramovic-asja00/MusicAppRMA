package com.example.musicapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.musicapp.database.MusicDAO
import com.example.musicapp.database.MusicDatabase

class MusicViewModel(
    val database: MusicDAO,
    application: Application
    ) :AndroidViewModel(application){

}