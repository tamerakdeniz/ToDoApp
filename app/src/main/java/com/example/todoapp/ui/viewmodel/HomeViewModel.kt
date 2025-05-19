package com.example.todoapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.todoapp.data.entity.ToDos
import com.example.todoapp.data.repo.ToDoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(var toDoRepository : ToDoRepository) : ViewModel(){
    var toDoList = MutableLiveData<List<ToDos>>()

    init {
        loadToDo()
    }

    fun delete(todo_id:Int) {
        CoroutineScope(Dispatchers.Main).launch {
            toDoRepository.delete(todo_id)
            loadToDo()
        }
    }

    fun loadToDo() {
        CoroutineScope(Dispatchers.Main).launch {
            toDoList.value = toDoRepository.loadToDo()
        }
    }

    fun search(searchText:String) {
        CoroutineScope(Dispatchers.Main).launch {
            toDoList.value = toDoRepository.search(searchText)
        }
    }
}