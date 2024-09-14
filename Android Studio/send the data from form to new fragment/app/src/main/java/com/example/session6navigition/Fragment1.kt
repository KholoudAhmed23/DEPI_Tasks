package com.example.session6navigition

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.core.widget.doAfterTextChanged
import androidx.navigation.fragment.findNavController
import com.example.session6navigition.databinding.Fragment1Binding

class Fragment1 : Fragment() {
    lateinit var binding: Fragment1Binding
    lateinit var name:String
    lateinit var mail:String
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=Fragment1Binding.inflate(layoutInflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.name.doAfterTextChanged {
            name=binding.name.text.toString()
        }
        binding.mail.doAfterTextChanged {
            mail=binding.mail.text.toString()
        }
        binding.login.setOnClickListener{
            findNavController().navigate(R.id.fragment2, bundleOf(
                "name" to name,
                "mail" to mail
            ))
        }
    }
}