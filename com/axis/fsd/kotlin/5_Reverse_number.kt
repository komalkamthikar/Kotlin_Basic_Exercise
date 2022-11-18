package com.axis.fsd.kotlin

import java.util.Scanner;
fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter a number:")
    var num = scanner.nextInt()
    var reversed = 0

    while (num != 0) {
        val digit = num % 10
        reversed = reversed * 10 + digit
        num /= 10
    }

    println("Reversed Number: $reversed")
}