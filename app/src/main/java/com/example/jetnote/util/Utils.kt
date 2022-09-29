package com.example.jetnote.util

import java.text.SimpleDateFormat
import java.util.*

fun formatDate(timestamp: Long): String {
    val date = Date(timestamp)
    val format = SimpleDateFormat(
        "EEE d MMM hh:mm aaa",
        Locale.getDefault()
    )
    return format.format(date)
}