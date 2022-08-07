package com.example.todoappcompose.data.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ToDoTaskEntity::class], version = 1, exportSchema = false)
abstract class ToDoDatabase : RoomDatabase() {

    abstract fun toDoDao(): ToDoDAO
}