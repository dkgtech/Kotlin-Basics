package com.dkgtech.kotlinbasics

fun main() {

    var arr = arrayOf("One", "Two", "Three")

    var arr1 = arrayOf(1, 2, 3)
    var arr2 = arrayOf<Int>(4, 5, 6)

    for (i in arr) {
        println(i)
    }

//    print with Index

    for ((i, e) in arr.withIndex()) {
        println("$i - $e")
    }

    arr[0] = "Zero"
    println(arr[0])
    println(arr.size)

}