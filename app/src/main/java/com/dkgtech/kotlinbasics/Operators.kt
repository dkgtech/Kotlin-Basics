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

    var num = 2
//    println(num++)
//    println(num)

    println(num++ + ++num)  // 2 + 4 = 6

    var num1 = 3
    println(num1--)
    println(num1)

    println(num1-- + --num1)


}