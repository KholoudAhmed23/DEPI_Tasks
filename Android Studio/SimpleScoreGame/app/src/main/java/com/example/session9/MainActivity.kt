package com.example.session9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.session9.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    //private lateinit var viewModel:ScoreViewModel
    //private var viewModel:ScoreViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
   //     viewModel = ViewModelProvider(this).get(ScoreViewModel::class.java)
        setContentView(binding.root)
/*
        viewModel.score1.observe(this, Observer {
            binding.team1score.text=it.toString()
        })
        viewModel.score2.observe(this, Observer {
            binding.team2score.text=it.toString()
        })
        binding.incressteam1.setOnClickListener{
            viewModel.incrementScoreTeamOne()
        }
        binding.incressteam2.setOnClickListener{
            viewModel.incrementScoreTeamTwo()
        }
 */
    }
}