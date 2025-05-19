package com.example.todoapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.todoapp.data.repo.ToDoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddToDoViewModel @Inject constructor(var toDoRepository: ToDoRepository) : ViewModel(){
    fun save(todo_name: String, todo_item: String) {
        CoroutineScope(Dispatchers.Main).launch {
            toDoRepository.save(todo_name,todo_item)
        }

    }
}