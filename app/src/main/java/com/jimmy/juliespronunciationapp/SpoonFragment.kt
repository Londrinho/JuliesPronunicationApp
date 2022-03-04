package com.jimmy.juliespronunciationapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.jimmy.juliespronunciationapp.databinding.FragmentSpoonBinding


class SpoonFragment : Fragment() {

    private lateinit var binding:FragmentSpoonBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_spoon, container, false)

        return binding.root
    }


}