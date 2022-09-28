package com.example.jetnote.model

import java.time.LocalDateTime
import java.util.UUID

data class Note(
    // create id on object instance
    val id: UUID = UUID.randomUUID(),
    val title: String,
    val description: String,
    val entryDate: LocalDateTime = LocalDateTime.now()
)