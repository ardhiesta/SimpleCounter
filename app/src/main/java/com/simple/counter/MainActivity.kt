package com.simple.counter

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.simple.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // variabel binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val mainViewModel: MainViewModel by viewModels()

        updateTextCounter(mainViewModel)

//        var counter: Int = 0
        binding.btnAdd.setOnClickListener{
//            counter++
            mainViewModel.addNumber()
            updateTextCounter(mainViewModel)
        }
    }

    fun updateTextCounter(mainViewModel: MainViewModel) {
        binding.tvCounter.setText(mainViewModel.counter.toString())
    }
}