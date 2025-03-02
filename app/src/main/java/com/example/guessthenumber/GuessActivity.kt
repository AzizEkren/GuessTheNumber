package com.example.guessthenumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.guessthenumber.databinding.ActivityGuessBinding
import kotlin.random.Random

class GuessActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGuessBinding
    private var random=0
    private var counter=5
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuessBinding.inflate(layoutInflater)
        setContentView(binding.root)
        random=Random.nextInt(101)
        Log.e("Random Number",random.toString())
        //Generates a random number between 0 and 100



        binding.buttonGuess.setOnClickListener {

            counter=counter-1


            val guess=binding.editTextInput.text.toString().toInt() //Gets the number entered by the user and converts it to an integer.

            if (guess == random) {
                val intent = Intent(this@GuessActivity, ResultActivity::class.java)
                intent.putExtra("result", true)  // Corrected the key
                finish()
                startActivity(intent)
                return@setOnClickListener
            }
            //Passes true as an extra ("result") indicating a correct guess.
            //Calls finish() to close the current activity.
            //Starts ResultActivity.
            //Uses return@setOnClickListener to exit the function early.


            if (guess>random){
                binding.textViewHelp.text="Lower"
                binding.textViewAttemnts.text="Attempts Left:$counter"

            }
            if (guess<random){
                binding.textViewHelp.text="Higher"
                binding.textViewAttemnts.text="Attempts Left:$counter"

                //If the guess is too high, it updates the hint text to "Lower".
                //If the guess is too low, it updates the hint text to "Higher".
                //Updates the attempts left counter.

            }
            if (counter==0){
                val intent=(Intent(this@GuessActivity, ResultActivity::class.java))
                intent.putExtra("result",false)

                finish()

                startActivity(intent)

            }
            //Creates an Intent to ResultActivity.
            //Passes false as an extra ("result") indicating failure.
            //Closes GuessActivity and starts ResultActivity.

            binding.editTextInput.setText("")
            //Resets the input field after each guess so the user can enter a new number.

        }

    }
}