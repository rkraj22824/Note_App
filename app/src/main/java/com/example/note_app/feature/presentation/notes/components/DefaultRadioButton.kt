package com.example.note_app.feature.presentation.notes.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DefaultRadioButton(
    modifier: Modifier = Modifier
,text:String,
    selected:Boolean,
    onSelect:()->Unit
) {
    Row(modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
      RadioButton(selected = selected, onClick = onSelect,
          colors = RadioButtonDefaults.colors())
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = text)
    }
}
