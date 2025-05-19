package com.example.todoapp.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.todoapp.data.entity.ToDos

@Dao
interface ToDoDao {
    @Query("SELECT * FROM todos")
    suspend fun loadToDo() : List<ToDos>

    @Insert
    suspend fun save(todo: ToDos)

    @Update
    suspend fun update(todo: ToDos)

    @Delete
    suspend fun delete(todo: ToDos)

    @Query("SELECT * FROM todos WHERE todo_name LIKE '%' || :searchText || '%'")
    suspend fun search(searchText: String) : List<ToDos>
}