package com.example.guessthenumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.guessthenumber.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    //binding will be used to access the UI components in activity_main.xml through View Binding.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonStart.setOnClickListener {
            val intent=(Intent(this@MainActivity,GuessActivity::class.java))
            //When the button is clicked, it switches from MainActivity to GuessActivity.
            startActivity(intent)

        }
    }
}