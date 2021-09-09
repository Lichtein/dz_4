package com.example.dz_3.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.dz_3.ui.viewmodel.MainViewModel
import com.example.dz_3.databinding.Fragment1Binding


class Fragment_1 : Fragment() {

    private lateinit var binding: Fragment1Binding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater : LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Fragment1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

        binding.btn1.setOnClickListener {
            viewModel.onIncrementClick()
        }

        binding.btn2.setOnClickListener {
            viewModel.onDecrementClick()
        }
    }
    }