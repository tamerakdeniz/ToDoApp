package com.example.todoapp.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull
import java.io.Serializable

@Entity(tableName = "todos")
data class ToDos(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "todo_id") var todo_id: Int = 0,
    @ColumnInfo(name = "todo_name") @NotNull val todo_name: String,
    @ColumnInfo(name = "todo_item") @NotNull val todo_item: String
) : Serializable