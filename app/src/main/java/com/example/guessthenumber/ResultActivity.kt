package com.example.guessthenumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.guessthenumber.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val result = intent.getBooleanExtra("result", false)  // Correct key to match GuessActivity

        if (result) {
            binding.textView2.text = "VİCTORY!!"
            binding.imageViewResult.setImageResource(R.drawable.happy)
        } else {
            binding.textView2.text = "GAME OVER!!"
            binding.imageViewResult.setImageResource(R.drawable.unhappy)
        }

        //If result is true, it displays:
        //"VICTORY!!" text.
        //A happy image (R.drawable.happy).
        //If result is false, it displays:
        //"GAME OVER!!" text.
        //A sad image (R.drawable.unhappy).

        binding.buttonRetry.setOnClickListener {
            val intent=(Intent(this@ResultActivity, GuessActivity::class.java))

            finish()

            startActivity(intent)
        }
        //Listens for a click on the "Retry" button.
        //Creates an Intent to restart the GuessActivity (new game).
        //Calls finish() to close the current ResultActivity before starting the new one.
    }
}