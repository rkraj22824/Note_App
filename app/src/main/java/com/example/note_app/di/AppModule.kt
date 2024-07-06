package com.example.note_app.di

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.note_app.feature.data.data_source.NoteDatabase
import com.example.note_app.feature.data.repository.NoteRepositoryImpl
import com.example.note_app.feature.domain.repository.NoteRepository
import com.example.note_app.feature.domain.use_case.AddNote
import com.example.note_app.feature.domain.use_case.DeleteNoteUseCase
import com.example.note_app.feature.domain.use_case.GetNotesUseCase
import com.example.note_app.feature.domain.use_case.NoteUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app:Application) : NoteDatabase{
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME,
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository{
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCase(repository: NoteRepository): NoteUseCase{
        return NoteUseCase(
            getNotes = GetNotesUseCase(repository),
            deleteNote = DeleteNoteUseCase(repository),
            addNote = AddNote(repository)
        )
    }

}