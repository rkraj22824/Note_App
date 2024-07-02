package com.example.note_app.feature.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.note_app.feature.domain.model.Note


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