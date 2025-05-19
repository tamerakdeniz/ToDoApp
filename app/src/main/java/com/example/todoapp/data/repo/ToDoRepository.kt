package com.example.todoapp.data.repo

import com.example.todoapp.data.datasource.ToDoDataSource
import com.example.todoapp.data.entity.ToDos

class ToDoRepository(var toDoDataSource : ToDoDataSource) {

    suspend fun save(todo_name: String, todo_item: String)
            = toDoDataSource.save(todo_name, todo_item)

    suspend fun update(todo_id:Int, todo_name: String, todo_item:String)
            = toDoDataSource.update(todo_id, todo_name,todo_item)

    suspend fun delete(todo_id:Int) = toDoDataSource.delete(todo_id)

    suspend fun loadToDo() : List<ToDos> = toDoDataSource.loadToDo()

    suspend fun search(searchText:String) : List<ToDos> = toDoDataSource.search(searchText)
}