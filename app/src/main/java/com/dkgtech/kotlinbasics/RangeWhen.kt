package com.dkgtech.kotlinbasics

fun main() {
//    val number = 2
//    val result = number in 1..5
//    println(result)
//
//    val result1 = number in 1 until 5
//    println(result1)

    val animal = "Cat"
    when (animal) {
        "Dog" -> println("The animal is Dog")
        "Cat" -> println("The animal is Cat")
        "Horse" -> println("The animal is Horse")
        else -> println("Animal not found")
    }

}