package com.example.todoapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.todoapp.R
import com.example.todoapp.databinding.FragmentToDoDetailBinding
import com.example.todoapp.ui.viewmodel.ToDoDetailViewModel
import com.example.todoapp.utils.transition
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ToDoDetailFragment : Fragment() {
    private lateinit var binding: FragmentToDoDetailBinding
    private lateinit var viewModel: ToDoDetailViewModel
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentToDoDetailBinding.inflate(inflater, container, false)

        val bundle: ToDoDetailFragmentArgs by navArgs()
        val incomingToDo = bundle.todo

        binding.editTextToDoName.setText(incomingToDo.todo_name)
        binding.editTextToDoItem.setText(incomingToDo.todo_item)

        binding.buttonUptade.setOnClickListener {
            val todo_name = binding.editTextToDoName.text.toString()
            val todo_item = binding.editTextToDoItem.text.toString()
            
            if (todo_name.isNotEmpty() && todo_item.isNotEmpty()) {
                viewModel.update(incomingToDo.todo_id, todo_name, todo_item)
                Snackbar.make(binding.root, "ToDo updated successfully!", Snackbar.LENGTH_SHORT).show()
                Navigation.transition(it, R.id.backToHomeFromDetailTransition)
            } else {
                Snackbar.make(binding.root, "Please fill in all fields", Snackbar.LENGTH_SHORT).show()
            }
        }

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel: ToDoDetailViewModel by viewModels()
        viewModel = tempViewModel
    }
}