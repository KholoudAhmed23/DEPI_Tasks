package com.example.session4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.session4.databinding.FragmentBlank1Binding
import com.example.session4.databinding.FragmentBlank2Binding
import com.example.session4.databinding.FragmentBlank3Binding

class BlankFragment3 : Fragment() {
    lateinit var binding: FragmentBlank3Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentBlank3Binding.inflate(layoutInflater, container, false)
        return binding.root
    }
}