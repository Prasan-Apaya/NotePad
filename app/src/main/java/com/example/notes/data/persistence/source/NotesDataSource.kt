package com.example.notes.data.persistence.source

import androidx.lifecycle.LiveData
import com.example.notes.data.model.Note

interface NotesDataSource {

    suspend fun insertNote(note:Note)

    suspend fun deleteNote(note: Note)

    suspend fun updateNote(note:Note)

    fun getAllNotes():LiveData<List<Note>>
}