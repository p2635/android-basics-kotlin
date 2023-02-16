package co.uk.philwong.diceroller

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun addition_isNotCorrect() {
        assertNotEquals(6, 2 + 2)
    }
    @Test
    fun generates_number() {
        val diceResult = Dice(6).roll()
        assertTrue("The value of the dice roll was not between 1-6.",
            diceResult in 1..6)
    }
}