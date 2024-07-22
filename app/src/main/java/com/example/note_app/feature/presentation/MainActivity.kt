package com.example.note_app.feature.presentation

import AddEditNoteScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.note_app.feature.presentation.notes.NotesScreen
import com.example.note_app.feature.presentation.util.Screen
import com.example.note_app.ui.theme.Note_AppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          Surface {
              val navController = rememberNavController()
              NavHost(navController = navController, startDestination = Screen.NoteScreen.route ) {
                 composable(route=Screen.NoteScreen.route){
                     NotesScreen(navController = navController)
                 }
                  composable(route=Screen.AddEditNoteScreen.route + "?noteId ={noteId}&noteColor={noteColor}",
                      arguments = listOf(
                          navArgument(name = "noteId"){
                              type =NavType.IntType
                              defaultValue = -1
                          },
                          navArgument(name = "noteColor"){
                              type =NavType.IntType
                              defaultValue = -1
                          }

                      )
                  ){
                      val color = it.arguments?.getInt("noteColor") ?:-1
                      AddEditNoteScreen(navController = navController,
                          noteColor = color
                      )
                  }
                  
              }
          }
        }
    }
}

