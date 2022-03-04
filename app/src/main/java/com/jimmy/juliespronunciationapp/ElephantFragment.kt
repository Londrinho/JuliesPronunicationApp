package com.jimmy.juliespronunciationapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.jimmy.juliespronunciationapp.databinding.FragmentElephantBinding


class ElephantFragment : Fragment() {

    private lateinit var binding: FragmentElephantBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_elephant, container, false)

        return binding.root
    }


}