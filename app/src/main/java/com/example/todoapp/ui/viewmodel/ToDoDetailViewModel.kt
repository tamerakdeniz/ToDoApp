package com.example.todoapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.todoapp.data.repo.ToDoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ToDoDetailViewModel @Inject constructor(var toDoRepository: ToDoRepository) : ViewModel(){

    fun update(todo_id:Int, todo_name:String, todo_item:String) {
        CoroutineScope(Dispatchers.Main).launch {
            toDoRepository.update(todo_id,todo_name,todo_item)
        }
    }
}