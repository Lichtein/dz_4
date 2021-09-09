package com.example.dz_3.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.dz_3.databinding.ActivityMainBinding
import com.example.dz_3.ui.viewmodel.PagerAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragments: ArrayList<Fragment> = arrayListOf(
            Fragment_1(),
            Fragment2(),
            Fragment3()
        )
        val adapter = PagerAdapter(fragments, this)
        binding.viewpager.adapter = adapter

    }

}