package com.dkgtech.kotlinbasics

fun main() {

    var i = 13
    val j = 2

//    Arithmetic Operators

    println(i + j)
    println(i - j)
    println(i * j)
    println(i / j)
    println(i.toFloat() / j)
    println(i % j) // modulus

//    Relational Operators

    println(i < j)
    println(i > j)
    println(i <= j)
    println(i >= j)
    println(i == j)
    println(i != j)

//    Pre/Post Increment Operators

    i++
    println(i)

    i--
    println(i)

}