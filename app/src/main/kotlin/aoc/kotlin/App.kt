/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package aoc.kotlin

import java.io.File;

class App (dataFilePath: String = "data.txt") {

    var dataLines: List<String> = File(dataFilePath).bufferedReader().readLines();

    fun calculateLine(line: String): Int {
        val digitsString = line.filter(){ c -> c.isDigit()}
        if (digitsString.length == 1) {
            return "$digitsString$digitsString".toInt()
        }
        return digitsString.filterIndexed(){ i, _ -> i == 0 || i == digitsString.length - 1}.toInt()
    }

    fun calculateLines(lines: List<String>): Int {
        return lines.map(){ line -> calculateLine(line) }.sum()
    }

    val calculationValue: Int
        get() {
            return calculateLines(dataLines)
        }
}

fun main() {
    println(App().calculationValue)
}
