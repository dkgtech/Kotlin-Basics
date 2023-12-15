package com.dkgtech.kotlinbasics

// var can be reassigned

// val can't be reassigned

//    Integer (Byte, Short, Int, Long)
//    Floating (Float, Double)
//    Boolean (True, False)
//    Character (CHAR, STRING)

fun main() {

    var score = 5
    score = 10
    println(score)

    val age = 21
//    age = 23  --> val can't be reassigned
    println(age)

    var no: Int = 21
    var temp: Double = 89.2
    var isRaining: Boolean = true
    var alphabet: Char = 'A'
    var message: String = "Kotlin Basics"


}