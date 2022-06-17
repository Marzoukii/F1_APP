package com.example.f1_app

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.coroutines.NonCancellable


class SplashScreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       val view= inflater.inflate(R.layout.fragment_splash_screen, container, false)
        Handler(Looper.getMainLooper()).postDelayed({
            if (!NonCancellable.isCancelled) {
                findNavController().navigate(R.id.action_splashScreenFragment_to_loginFragment)
            }
        }, 1000)
       // findNavController().navigate(R.id.action_splashScreenFragment_to_loginFragment)
        return view
    }


}