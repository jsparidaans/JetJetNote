package com.example.jetnote.util

import androidx.room.TypeConverter
import java.util.Date

class DateConverter {
    @TypeConverter
    fun timeStampFromDate(date:Date) = date.time

    @TypeConverter
    fun dateFromTimeStamp(timestamp:Long) = Date(timestamp)
}