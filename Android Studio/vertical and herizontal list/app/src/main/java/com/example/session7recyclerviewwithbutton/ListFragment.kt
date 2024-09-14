package com.example.session7recyclerviewwithbutton

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.session7recyclerviewwithbutton.databinding.FragmentListBinding
import com.example.session7recyclerviewwithbutton.databinding.ItemLayoutBinding

class ListFragment : Fragment() {
    lateinit var binding: FragmentListBinding
    val userList:MutableList<User> = mutableListOf()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=FragmentListBinding.inflate(layoutInflater)
        addToList()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.myList.apply {
            layoutManager=GridLayoutManager(requireContext(),1)
            adapter=UserAdapter(userList){
                userItem ->
                userList.remove(userItem)   //delete
                (adapter as? UserAdapter)?.setUserList(userList) // Update adapter's list properly
                navigateToDetails(userItem)
            }
        }
    }
    private fun navigateToDetails(user: User) {
        val bundle = bundleOf("user" to user)
        view?.findNavController()?.navigate(R.id.detailsFragment, bundle)
    }


    fun addToList(){
            userList.add(User(1,1,"kholoud","kholoud@gmail.com","546666"))
            userList.add(User(2,2,"kholoud","kholoud@gmail.com","546666"))
            userList.add(User(3,1,"kholoud","kholoud@gmail.com","546666"))
            userList.add(User(4,2,"kholoud","kholoud@gmail.com","546666"))
            userList.add(User(5,1,"kholoud","kholoud@gmail.com","546666"))
    }
}