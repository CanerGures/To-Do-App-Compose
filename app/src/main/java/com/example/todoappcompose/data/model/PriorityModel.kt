package com.example.todoappcompose.data.model

import androidx.compose.ui.graphics.Color
import com.example.todoappcompose.ui.theme.HighPriorityColor
import com.example.todoappcompose.ui.theme.LowPriorityColor
import com.example.todoappcompose.ui.theme.MediumPriorityColor
import com.example.todoappcompose.ui.theme.NonePriorityColor

enum class PriorityModel(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}