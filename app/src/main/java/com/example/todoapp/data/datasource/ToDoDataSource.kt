package com.example.todoapp.data.datasource

import com.example.todoapp.data.entity.ToDos
import com.example.todoapp.room.ToDoDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ToDoDataSource (var toDoDao: ToDoDao) {
    suspend fun save(todo_name: String,todo_item: String) {
        val newToDo = ToDos(0, todo_name,todo_item)
        toDoDao.save(newToDo)
    }

    suspend fun update(todo_id:Int,todo_name: String,todo_item: String) {
        val updatedToDo = ToDos(todo_id,todo_name,todo_item)
        toDoDao.update(updatedToDo)
    }

    suspend fun delete(todo_id:Int) {
        val deletedTodo = ToDos(todo_id,"","")
        toDoDao.delete(deletedTodo)
    }

    suspend fun loadToDo() : List<ToDos> = withContext(Dispatchers.IO) {
        return@withContext toDoDao.loadToDo()
    }

    suspend fun search(searchText:String) : List<ToDos> = withContext(Dispatchers.IO) {
        return@withContext toDoDao.search(searchText)
    }
}