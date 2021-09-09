package com.example.dz_3.ui.viewmodel

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.dz_3.ui.MainActivity

class PagerAdapter (private val fragments:ArrayList<Fragment>, activity:MainActivity): FragmentStateAdapter(activity){
    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }
}