package com.axis.fsd.kotlin

import java.util.Scanner
fun main() {
    // swapping of two number with Temporary Variable
    val scanner = Scanner(System.`in`)
    println("Enter a number:")
    var num1 = scanner.nextInt()
    var t1 = 0
    var t2 = 1

    print("First $num1 terms: ")

    for (i in 1..num1) {
        print("$t1  ")

        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }

}