package com.example.dz_3.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.dz_3.ui.viewmodel.MainViewModel
import com.example.dz_3.databinding.Fragment3Binding

class Fragment3 : Fragment() {
    private lateinit var binding: Fragment3Binding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Fragment3Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val builder = StringBuilder()
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        viewModel.count.observe(viewLifecycleOwner,{
            binding.tvCount.text = builder.append(it)
        })
    }
}