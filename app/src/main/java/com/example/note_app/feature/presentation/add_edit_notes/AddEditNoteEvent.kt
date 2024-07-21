package com.example.note_app.feature.presentation.add_edit_notes

import androidx.compose.ui.focus.FocusState
import androidx.compose.ui.graphics.Color

sealed class AddEditNoteEvent {
    data class EnteredTitle(val value: String): AddEditNoteEvent()
    data class EnteredContent(val value: String): AddEditNoteEvent()
    data class ChangeTitleFocus(val focusState: FocusState): AddEditNoteEvent()
    data class ChangeContetnFocus(val focusState: FocusState): AddEditNoteEvent()
    data class ChangeColor(val color: Color): AddEditNoteEvent()
    object SaveNote:AddEditNoteEvent()
}