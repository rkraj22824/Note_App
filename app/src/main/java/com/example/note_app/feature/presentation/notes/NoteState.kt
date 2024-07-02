package com.example.note_app.feature.presentation.notes

import com.example.note_app.feature.domain.model.Note
import com.example.note_app.feature.domain.util.NoteOrder
import com.example.note_app.feature.domain.util.OrderType


//state that we gonna keep in viewModel and  this observe by the ui
data class NoteState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
