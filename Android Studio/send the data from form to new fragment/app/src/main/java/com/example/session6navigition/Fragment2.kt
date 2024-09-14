package com.example.session6navigition

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.session6navigition.databinding.Fragment1Binding
import com.example.session6navigition.databinding.Fragment2Binding

class Fragment2 : Fragment() {
    lateinit var binding: Fragment2Binding
    lateinit var name:String
    lateinit var mail:String
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= Fragment2Binding.inflate(layoutInflater,container,false)
        name=arguments?.getString("name","").toString()
        mail=arguments?.getString("mail","").toString()
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewname.text=name
        binding.viewmail.text=mail

    }
}