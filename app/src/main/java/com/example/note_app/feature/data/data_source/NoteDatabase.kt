package com.example.note_app.feature.data.data_source

import androidx.room.Dao
import androidx.room.Database
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.RoomDatabase
import androidx.room.Update
import com.example.note_app.feature.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.data.data_source.NoteDao


@Database(
    entities = [Note::class], // for defining no. of tables in entity
    version = 1
)
abstract class NoteDatabase : RoomDatabase(){

abstract val noteDao: NoteDao

    companion object{
        const val DATABASE_NAME="notes_db"
    }
}




