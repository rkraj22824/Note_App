package com.example.note_app.feature.data.data_source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.note_app.feature.domain.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Query("SELECT * FROM note")
    fun getNotes(): Flow<List<Note>>    // return the note from DB

    @Query("SELECT * FROM note WHERE id= :id")
    suspend fun getNoteById(id: Int):Note?  // to get specific note by id

    @Insert(onConflict = OnConflictStrategy.REPLACE)   // to insert the note if already exists then
    suspend fun insertNote(note: Note)                  // gonna replace  with the help of id
                                                        // now no need to add another function for updating note
    @Delete
    suspend fun deleteNote(note: Note)

}