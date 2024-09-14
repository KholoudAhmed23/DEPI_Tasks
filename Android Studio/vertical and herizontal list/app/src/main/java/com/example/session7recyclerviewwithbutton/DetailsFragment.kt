package com.example.session7recyclerviewwithbutton

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.activity.OnBackPressedCallback
import androidx.activity.OnBackPressedDispatcher
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.session7recyclerviewwithbutton.databinding.FragmentDetailsBinding

@Suppress("UNREACHABLE_CODE")
class DetailsFragment : Fragment() {
    lateinit var binding: FragmentDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentDetailsBinding.inflate(layoutInflater)
        return binding.root



////////////////back btn///////////////////////////////
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                parentFragmentManager.popBackStack()
            }
        })
    }
///////////////////////////////////////////////////////////

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.userdata = arguments?.getSerializable("user", User::class.java)


//////////////back btn////////////////////////////////
        val back_btn: Button = view.findViewById(R.id.back_btn)
     /*  // (requireActivity() as AppCompatActivity).setSupportActionBar(back_btn)

        // Enable the back button
        (requireActivity() as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        (requireActivity() as AppCompatActivity).supportActionBar?.setDisplayShowHomeEnabled(true)*/

        back_btn.setOnClickListener {
            // Handle back button press, usually you pop the fragment from the back stack
            parentFragmentManager.popBackStack()
        }
        /////////////////////////////////////////////////

    }
}