package com.example.session4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.session4.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Load all fragments into their respective containers
        loadFragment(BlankFragment1(), R.id.fragment_container_1)
        loadFragment(BlankFragment2(), R.id.fragment_container_2)
        loadFragment(BlankFragment3(), R.id.fragment_container_3)
        loadFragment(BlankFragment4(), R.id.fragment_container_4)
    }

    private fun loadFragment(fragment: Fragment, containerId: Int) {
        supportFragmentManager.beginTransaction()
            .replace(containerId, fragment)
            .commit()

    }
}
