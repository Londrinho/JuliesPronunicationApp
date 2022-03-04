package com.jimmy.juliespronunciationapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.jimmy.juliespronunciationapp.databinding.FragmentTwigBinding


class TwigFragment : Fragment() {

    private lateinit var binding: FragmentTwigBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_twig, container, false)

        return binding.root
    }


}