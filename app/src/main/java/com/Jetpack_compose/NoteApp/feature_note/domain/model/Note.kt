package com.Jetpack_compose.NoteApp.feature_note.domain.model

import androidx.compose.ui.graphics.Color
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.Jetpack_compose.NoteApp.ui.theme.*

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(Color.Cyan, Color.Magenta, Color.Yellow, Color.White ,RedOrange, LightGreen, Violet, BabyBlue, RedPink, DarkGray)
    }
}

class InvalidNoteException(message: String): Exception(message)