package com.example.note_app.feature.domain.use_case


// this  is the tha we will be  inject to the viewModel
data class NoteUseCase(
    val getNotes: GetNotesUseCase,
    val deleteNote: DeleteNoteUseCase,
    val addNote: AddNote,
    val getNote: GetNote
)
