package com.example.jetnote.util

import androidx.room.TypeConverter
import java.util.*

class UUIDConverter {
    @TypeConverter
    fun fromUUID(uuid: UUID) = uuid.toString()

    @TypeConverter
    fun toUUID(string: String) = UUID.fromString(string)
}