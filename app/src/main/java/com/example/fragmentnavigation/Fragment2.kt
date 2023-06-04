package com.example.fragmentnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentnavigation.databinding.Fragment2Binding


class Fragment2 : Fragment() {
    private lateinit var _binding: Fragment2Binding
    val binding
        get() = _binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = Fragment2Binding.inflate(inflater, container, false)
        return binding.root
    }

}