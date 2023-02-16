/*
Add conditional behavior in Kotlin
Lesson: https://developer.android.com/codelabs/basic-android-kotlin-training-conditional-dice-roll-behavior
Checked output on https://developer.android.com/training/kotlinplayground
 */
fun main() {
    val num = 5
    // skip
    if (num > 6) {
        println("Hello, world!")
	} else {
        println("Else condition has been met!")
    }
    // run
    if (num > 4) {
        println("Condition has been met!")
	}

    val rollResult = 4
    // Like switch
    when (rollResult) {
        4 -> println("You won!")
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! You rolled a 6. Try again!")
    }
}