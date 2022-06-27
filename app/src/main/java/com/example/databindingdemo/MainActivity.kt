package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding //1.adım

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)//2.adım :)
        binding.submitButton.setOnClickListener { displayGreeting() }
    }
    private fun displayGreeting() {
        binding.apply {
            greetingTextView.text = "Merhaba! " + nameEditText.text
        }
    }
}