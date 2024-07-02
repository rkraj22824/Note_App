package com.example.note_app.feature.presentation.notes

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.note_app.feature.domain.model.Note
import com.example.note_app.feature.domain.use_case.NoteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NotesViewModel @Inject constructor(
 private val noteUseCases: NoteUseCase
) : ViewModel(){

 private val _state= mutableStateOf( NoteState())
 val state: State<NoteState> = _state

 private var recentlyDeleteNote: Note?=null


 fun onEvent(event: NotesEvent){
  when(event){
   is NotesEvent.Order -> {

   }
   is NotesEvent.DeleteNote -> {
    viewModelScope.launch {
     noteUseCases.deleteNote(event.note)
     recentlyDeleteNote = event.note
    }
   }
   is NotesEvent.RestoreNote -> {
    viewModelScope.launch {

    }
   }
   is NotesEvent.ToggleOrderSection -> {
    _state.value = state.value.copy(
     isOrderSectionVisible = !state.value.isOrderSectionVisible
    )
   }
  }
 }

}