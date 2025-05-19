package com.example.todoapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.todoapp.data.entity.ToDos
import com.example.todoapp.databinding.CardDesignBinding
import com.example.todoapp.ui.fragment.HomeFragmentDirections
import com.example.todoapp.ui.viewmodel.HomeViewModel
import com.example.todoapp.utils.transition
import com.google.android.material.snackbar.Snackbar

class ToDoAdapter(var mContext: Context, var toDoList:List<ToDos>, var viewModel : HomeViewModel)
    : RecyclerView.Adapter<ToDoAdapter.CardDesingHolder>() {

    inner class CardDesingHolder(var design: CardDesignBinding) : RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesingHolder {
        val design = CardDesignBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardDesingHolder(design)

    }

    override fun onBindViewHolder(holder: CardDesingHolder, position: Int) {
        val todo = toDoList.get(position)
        val t = holder.design
        t.textViewName.text = todo.todo_name

        t.cardViewLine.setOnClickListener {
            val transition = HomeFragmentDirections.detailToDoTransition(todo = todo)
            Navigation.transition(it,transition)
        }

        t.imageViewDelete.setOnClickListener {
            Snackbar.make(it,"${todo.todo_name} should it be deleted?", Snackbar.LENGTH_SHORT)
                .setAction("Yes") {
                    viewModel.delete(todo.todo_id)
                }.show()

        }
    }

    override fun getItemCount(): Int {
        return toDoList.size

    }
}