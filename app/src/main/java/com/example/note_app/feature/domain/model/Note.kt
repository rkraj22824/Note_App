package com.example.note_app.feature.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.note_app.ui.theme.BabyBlue
import com.example.note_app.ui.theme.LightGreen
import com.example.note_app.ui.theme.RedOrange
import com.example.note_app.ui.theme.RedPink
import com.example.note_app.ui.theme.Violet


@Entity
data class Note(
    val title: String,
    val timestamp: Long,
    val color: Int,
    val content: String,
    @PrimaryKey val id:Int?=null
){
    val NoteColors= listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
}
