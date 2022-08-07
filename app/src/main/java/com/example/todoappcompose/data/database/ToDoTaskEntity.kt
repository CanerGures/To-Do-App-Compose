package com.example.todoappcompose.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.todoappcompose.data.model.PriorityModel
import com.example.todoappcompose.util.Constants.DATABASE_TABLE

@Entity(tableName = DATABASE_TABLE)
data class ToDoTaskEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: PriorityModel
)