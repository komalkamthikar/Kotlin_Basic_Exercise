package com.axis.fsd.kotlin

import java.util.Scanner
fun main(){
    // swapping of two number with Temporary Variable
    val scanner=Scanner(System.`in`)
    println("Enter first number:")
    var num1=scanner.nextInt()
    println("Enter second number:")
    var num2=scanner.nextInt()

    println("******Before Swapping******")
    println("Number1=$num1")
    println("Number2=$num2")

    val temp=num1
    num1=num2
    num2=temp

    println("******After Swapping******")
    println("Number1=$num1")
    println("Number2=$num2")

}

