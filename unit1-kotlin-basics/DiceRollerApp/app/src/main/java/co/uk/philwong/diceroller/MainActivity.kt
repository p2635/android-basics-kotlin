package co.uk.philwong.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.buttonRoll)

        rollButton.setOnClickListener { rollDice() }
    }

    /*
    Roll the dice and update the text on the screen.
    Also, show a toast because you might sometimes
    roll the same number twice.
     */
    private fun rollDice() {
        val dice = Dice(6)
        val resultTextView: TextView = findViewById(R.id.dieValue)
        resultTextView.text = dice.roll().toString()
        val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}