package com.example.session7recyclerviewwithbutton

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.session7recyclerviewwithbutton.databinding.ActivityMainBinding
import com.example.session7recyclerviewwithbutton.databinding.ItemLayout2Binding
import com.example.session7recyclerviewwithbutton.databinding.ItemLayoutBinding

class UserAdapter(private var userlist:MutableList<User>,
                  val onitemClick:(User)->Unit
):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    // Allow updating the list dynamically
    fun setUserList(updatedList: MutableList<User>) {
        userlist = updatedList
        notifyDataSetChanged() // Notify adapter of the data change
    }

    override fun getItemCount() = userlist.size
    override fun getItemViewType(position: Int): Int {
        return when (userlist[position].type) {
            1 -> Type_One
            2 -> Type_Two
            else -> Type_One
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            Type_One -> {
                val binding =
                    ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                return ViewHolderOne(binding)
            }

            Type_Two -> {
                val binding =
                    ItemLayout2Binding.inflate(LayoutInflater.from(parent.context), parent, false)
                return ViewHolderTwo(binding)
            }

            else -> throw IllegalAccessException("invalid type")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder.itemViewType) {
            Type_One -> (holder as ViewHolderOne).bindingData(userlist[position])
            Type_Two -> (holder as ViewHolderTwo).bindingData(userlist[position])
        }
    }

    companion object {
        private const val Type_One = 1
        private const val Type_Two = 2
    }

    inner class ViewHolderOne(val binding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindingData(user: User) {
            binding.userdata = user
            binding.openDetails.setOnClickListener {
                onitemClick(user)
            }
            // Handle delete button click
            binding.delete.setOnClickListener {
                // Remove the user from the list
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    userlist.removeAt(position)
                    notifyItemRemoved(position)  // Notify the adapter about item removal
                }
            }
        }
    }

    inner class ViewHolderTwo(val binding: ItemLayout2Binding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindingData(user: User) {
            binding.userdata = user
            binding.openDetails.setOnClickListener {
                onitemClick(user)
            }
            // Handle delete button click
            binding.delete.setOnClickListener {
                // Remove the user from the list
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    userlist.removeAt(position)
                    notifyItemRemoved(position)  // Notify the adapter about item removal
                }
            }
        }
    }
}