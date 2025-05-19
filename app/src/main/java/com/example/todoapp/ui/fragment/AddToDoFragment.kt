package com.example.todoapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.example.todoapp.R
import com.example.todoapp.databinding.FragmentAddToDoBinding
import com.example.todoapp.ui.viewmodel.AddToDoViewModel
import com.example.todoapp.utils.transition
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddToDoFragment : Fragment() {
    private lateinit var binding: FragmentAddToDoBinding
    private lateinit var viewModel: AddToDoViewModel
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddToDoBinding.inflate(inflater, container, false)

        binding.buttonSave.setOnClickListener {
            val todo_name = binding.editTextToDoName.text.toString()
            val todo_item = binding.editTextToDoItem.text.toString()
            
            if (todo_name.isNotEmpty() && todo_item.isNotEmpty()) {
                viewModel.save(todo_name, todo_item)
                Snackbar.make(binding.root, "ToDo saved successfully!", Snackbar.LENGTH_SHORT).show()
                Navigation.transition(it, R.id.backToHomeTransition)
            } else {
                Snackbar.make(binding.root, "Please fill in all fields", Snackbar.LENGTH_SHORT).show()
            }
        }

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel: AddToDoViewModel by viewModels()
        viewModel = tempViewModel
    }
}