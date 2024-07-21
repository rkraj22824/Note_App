package com.example.note_app.feature.domain.use_case

import com.example.note_app.feature.domain.model.Note
import com.example.note_app.feature.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note?{
        return repository.getNoteById(id)
    }
}