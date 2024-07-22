package com.example.note_app.feature.domain.use_case

import com.example.note_app.feature.domain.model.Note
import com.example.note_app.feature.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}