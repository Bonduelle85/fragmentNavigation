package com.example.fragmentnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.fragmentnavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var _binding: ActivityMainBinding
    val binding
        get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(_binding.root)
        binding.button1.setOnClickListener { navigate(Fragment1()) }
        binding.button2.setOnClickListener { navigate(Fragment2()) }
    }
    private fun navigate(fragment:Fragment){
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }

//    private fun navigate1(fragment: Fragment){
//        supportFragmentManager
//            .beginTransaction()
//            .replace(R.id.fragmentContainer, fragment)
//            .commit()
//    }

}