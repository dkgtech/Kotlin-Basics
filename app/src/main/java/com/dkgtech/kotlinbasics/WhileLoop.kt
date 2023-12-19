package com.dkgtech.kotlinbasics

import java.util.Scanner

fun main() {

    println("Enter any number for its table")
    val count = readln().toInt()
    var index = 1

    while (index <= 10) {
//        println(count * index)
        println("$count * $index = ${count * index}")
        index++
    }

    /*//    while loop

        while (count <= 5) {
            println("Hello")
            count++
        }

    //    do while

        do {
            println("Happy")
            count++
        } while (count <= 5)*/


}