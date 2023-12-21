package com.dkgtech.kotlinbasics

fun main() {
//    for (i in 1..10) {
//        println(i)
//        println("Step")
//    }
//
//    for (i in 1..10 step 2) {
//        println(i)
//    }
//
//    println("Down To")
//    for (i in 10 downTo 1) {
//        println(i)
//    }

    println("Enter any number to Print its table")
    val number = readln().toInt()
    for (i in 1..10) {
        println("$number * $i = ${number * i}")
    }
}