package com.example.todoappcompose.data.repository

import com.example.todoappcompose.data.database.ToDoDAO
import com.example.todoappcompose.data.database.ToDoTaskEntity
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class ToDoRepository @Inject constructor(private val toDoDAO: ToDoDAO) {

    val getAllTasks: Flow<List<ToDoTaskEntity>> = toDoDAO.getAll()
    val sortByLowPriority: Flow<List<ToDoTaskEntity>> = toDoDAO.sortByLowPriority()
    val sortByHighPriority: Flow<List<ToDoTaskEntity>> = toDoDAO.sortByHighPriority()

    fun getSelectedTask(taskId: Int): Flow<ToDoTaskEntity> {
        return toDoDAO.getSelectedTask(taskId = taskId)
    }

    suspend fun addTask(toDoTask: ToDoTaskEntity) {
        toDoDAO.addTask(toDoTaskEntity = toDoTask)
    }

    suspend fun updateTask(toDoTask: ToDoTaskEntity) {
        toDoDAO.updateTask(toDoTaskEntity = toDoTask)
    }

    suspend fun deleteTask(toDoTask: ToDoTaskEntity) {
        toDoDAO.deleteTask(toDoTaskEntity = toDoTask)
    }

    suspend fun deleteAllTasks() {
        toDoDAO.deleteAllTasks()
    }

    fun searchDatabase(searchQuery: String): Flow<List<ToDoTaskEntity>> {
        return toDoDAO.searchDatabase(searchQuery = searchQuery)
    }
}