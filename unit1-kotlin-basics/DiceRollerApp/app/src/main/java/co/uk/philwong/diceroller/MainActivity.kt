package co.uk.philwong.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.buttonRoll)
        rollButton.setOnClickListener { rollDice() }
        rollDice()
    }

    /*
    Roll the dice and update the text on the screen.
    Also, show a toast because you might sometimes
    roll the same number twice.
     */
    private fun rollDice() {
        val dice = Dice(6)
        val rollValue = dice.roll()

        val resultTextView: TextView = findViewById(R.id.dieValue)
        val diceImageView: ImageView = findViewById(R.id.imageView)
        val drawableResource = when(rollValue) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
        resultTextView.text = rollValue.toString()
        diceImageView.setImageResource(drawableResource)
        diceImageView.contentDescription = rollValue.toString()
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}