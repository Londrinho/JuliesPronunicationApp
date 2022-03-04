package com.jimmy.juliespronunciationapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.jimmy.juliespronunciationapp.databinding.FragmentScarfBinding


class ScarfFragment : Fragment() {

    private lateinit var binding:FragmentScarfBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_scarf, container, false)

        return binding.root
    }


}