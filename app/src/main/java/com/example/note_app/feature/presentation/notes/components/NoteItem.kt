package com.example.note_app.feature.presentation.notes.components

import com.example.note_app.feature.domain.model.Note
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun NoteItem(
    note:Note,
    modifier: Modifier = Modifier,
    onDeleteClick: () ->Unit
) {
    Box(modifier = modifier
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .padding(end = 32.dp)
        ) {
            Text(
                text =note.title,
                maxLines = 1,
                fontStyle = FontStyle.Normal,
                color = Color.Black,
                overflow = TextOverflow.Ellipsis
                )
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text =note.content,
                maxLines = 10,
                overflow = TextOverflow.Ellipsis
            )
        }
        
        IconButton(onClick = onDeleteClick,
            modifier = Modifier.align(Alignment.BottomEnd)) {
            Icon(imageVector = Icons.Default.Delete,
                contentDescription = "To Delete Note"
            )
            
        }
        

    }
    
}
