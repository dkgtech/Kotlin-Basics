package com.dkgtech.kotlinbasics

fun main() {
    val result = add(4, 5)
    println(result)

    isEvenOdd(13)
    isEvenOdd(12)
    printMessage(2)
    printMessage2()
    printTable(4)
}

fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun isEvenOdd(num1: Int) {
    val result = if (num1 % 2 == 0) "Even" else "Odd"
    println(result)
}

fun printMessage(count: Int) {
    for (i in 1..count) {
        println("Hello $i")
    }

}

fun printMessage2(count: Int = 3) {
    for (i in 1..count) {
        println("Hello $i")
    }
}

fun printTable(number: Int) {
    for (i in 1..10) {
        println("$number * $i = ${number * i}")
    }
}