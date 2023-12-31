/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package aoc.kotlin

import kotlin.test.Test
import kotlin.test.assertEquals

class AppTest {
    private val classUnderTest = App("test_data.txt")

    @Test fun calculateLinesIsCorrect() {
        assertEquals(927, classUnderTest.calculateLines(classUnderTest.dataLines))
    }
    @Test fun calculateLineWithTwoDigits() {
        val input = "29lzrxseven"
        val expected = 29
        assertEquals(expected, classUnderTest.calculateLine(input))
    }
    @Test fun calculateLineWithFourDigits() {
        val input = "2954two"
        val expected = 24
        assertEquals(expected, classUnderTest.calculateLine(input))
    }
    @Test fun calculateLineWithThreeDigits() {
        val input = "5sixtwo75four"
        val expected = 55
        assertEquals(expected, classUnderTest.calculateLine(input))
    }
    @Test fun calcaulteLineWithSingleDigit() {
        val input = "onetwo6"
        val expected = 66
        assertEquals(expected, classUnderTest.calculateLine(input))
    }
}
