package com.example.jetnote.data

import androidx.room.*
import com.example.jetnote.model.Note

@Dao
interface NoteDatabaseDao {
    @Query("SELECT * FROM notes_table")
    fun getNotes(): List<Note>

    @Query("SELECT * FROM notes_table WHERE id = :id")
    suspend fun getNoteById(id: String): Note

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(note: Note)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(note: Note)

    @Delete
    suspend fun delete(note: Note)

    @Query("DELETE FROM notes_table")
    suspend fun deleteAll()
}
