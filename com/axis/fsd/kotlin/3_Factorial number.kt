package com.axis.fsd.kotlin

import java.util.Scanner;
fun main(){
    val scanner=Scanner(System.`in`)
    println("Enter a number:")
    var number=scanner.nextInt()
    var factorial: Long = 1
    for (i in 1..number) {
        // factorial = factorial * i;
        factorial *= i.toLong()
    }
    println("Factorial of $number = $factorial")
}