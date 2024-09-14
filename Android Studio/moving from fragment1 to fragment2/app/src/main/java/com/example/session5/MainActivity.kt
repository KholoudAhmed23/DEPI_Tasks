package com.example.session5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //kholoud Ahmed Mahmoud Ahmed
        val navHost=supportFragmentManager.findFragmentById(R.id.fragmentContainerView2)as NavHostFragment
        navController=navHost.navController
    }
}