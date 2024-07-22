package com.example.note_app.feature.presentation.notes

import com.example.note_app.feature.domain.model.Note
import com.example.note_app.feature.domain.util.NoteOrder

// events we can perform on note
sealed class NotesEvent {

    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class  DeleteNote(val note: Note): NotesEvent()
    object ToggleOrderSection: NotesEvent()

}