package com.axis.fsd.kotlin

import java.util.Scanner;
fun main(){
    // Swapping of two number without Temporary Variable
    val scanner  = Scanner(System.`in`)
    println("Enter First number:")
    var number1 = scanner.nextInt()
    println("Enter Second number:")
    var number2 = scanner.nextInt()

    println("*****Before Swapping*****")
    println("First number: $number1")
    println("Second number: $number2")

    number1=number1-number2
    number2=number2+number1
    number1=number2-number1

    println("*****After Swapping*****")
    println("First number: $number1")
    println("Second number: $number2")
}