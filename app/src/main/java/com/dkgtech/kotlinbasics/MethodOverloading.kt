package com.dkgtech.kotlinbasics

// Method Overloading --> function with same name & different parameters or of different types

fun main() {
    val result1 = addition(2, 5)
    println(result1)

    val result2 = addition(2.5, 2.2)
    println(result2)
}

fun addition(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun addition(num1: Double, num2: Double): Double {
    return num1 + num2
}

