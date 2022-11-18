package com.axis.fsd.kotlin

import java.util.Scanner;

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter Year :")
    var year = scanner.nextInt()
    var leap = false
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            // year is divisible by 400, hence the year is a leap year
            leap = year % 400 == 0
        } else
            leap = true
    } else
        leap = false

    println(if (leap) "$year is a leap year." else "$year is not a leap year.")
}