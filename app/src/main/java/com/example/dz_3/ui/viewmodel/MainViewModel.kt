package com.example.dz_3.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var mCounter = 0
    val counter = MutableLiveData<Int>()
    val count = MutableLiveData<String>()
    private var plus = "+"
    private var minus = "-"

    fun onIncrementClick(){
        count.value = plus
        mCounter++
        counter.value = mCounter
    }
    fun onDecrementClick(){
        count.value = minus
        mCounter--
        counter.value = mCounter
    }
}