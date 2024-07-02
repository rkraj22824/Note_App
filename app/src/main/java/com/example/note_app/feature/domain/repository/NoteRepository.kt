package com.example.note_app.feature.domain.repository

import com.example.note_app.feature.domain.model.Note
import  kotlinx.coroutines.flow.Flow


// for testing
interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int):Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)

}