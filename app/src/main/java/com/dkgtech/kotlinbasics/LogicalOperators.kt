package com.dkgtech.kotlinbasics

fun main() {

    val above70 = false
    val knowsProgramming = true

//    && AND

    var calledForInterview = above70 && knowsProgramming
    println(calledForInterview)

//    || OR

    calledForInterview = above70 || knowsProgramming
    println(calledForInterview)


//    ! NOT Operator

    val answer = false
    val result = !answer
    println(result)
}