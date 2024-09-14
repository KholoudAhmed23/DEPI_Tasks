package com.example.session4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.session4.databinding.FragmentBlank1Binding

class BlankFragment1 : Fragment() {
    lateinit var binding:FragmentBlank1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentBlank1Binding.inflate(layoutInflater, container, false)
        // Inflate the layout for this fragment
        return binding.root

    }
}