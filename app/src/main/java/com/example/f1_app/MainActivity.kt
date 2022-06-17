package com.example.f1_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.f1_app.R

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navHostFragment =supportFragmentManager.findFragmentById(R.id.fragment)  as NavHostFragment

        navController= navHostFragment.navController
    }
}