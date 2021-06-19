package com.example.musicapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.musicapp.R
import com.example.musicapp.databinding.FragmentFilterBinding

class FilterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentFilterBinding>(inflater,
            R.layout.fragment_filter, container, false);

        // Inflate the layout for this fragment
        return binding.root;
    }


}