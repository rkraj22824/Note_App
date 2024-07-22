package com.example.note_app.feature.domain.use_case

import com.example.note_app.feature.domain.model.InvalidNoteException
import com.example.note_app.feature.domain.model.Note
import com.example.note_app.feature.domain.repository.NoteRepository

class AddNote (
    private val repository: NoteRepository
){
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note){
        if(note.title.isBlank()){
            throw InvalidNoteException("The title of the note can't be empty. ")
        }
        if(note.content.isBlank()){
            throw InvalidNoteException("The content of the note can't be empty. ")
        }
        repository.insertNote(note)
    }
}