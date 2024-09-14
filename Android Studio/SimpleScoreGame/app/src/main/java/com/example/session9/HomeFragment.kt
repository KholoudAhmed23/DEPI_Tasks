package com.example.session9

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.session9.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
    private val viewModel:ScoreViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentHomeBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.score1.observe(viewLifecycleOwner, Observer {
            binding.team1score.text=it.toString()
        })
        viewModel.score2.observe(viewLifecycleOwner, Observer {
            binding.team2score.text=it.toString()
        })
        binding.incressteam1.setOnClickListener {
            viewModel.incrementScoreTeamOne()
        }
        binding.incressteam2.setOnClickListener {
            viewModel.incrementScoreTeamTwo()
        }
        binding.finalresult.setOnClickListener {
            findNavController().navigate(R.id.twoFragment)
        }
        //
        binding.finalresult.setOnClickListener {
            // Update the ViewModel with the final results
            viewModel.checkTeamWinner()

            // Navigate to TwoFragment
            findNavController().navigate(R.id.twoFragment)
        }
    }
}