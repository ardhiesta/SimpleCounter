package com.simple.counter

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var counter: Int = 0

    fun addNumber() {
        counter++
    }
}