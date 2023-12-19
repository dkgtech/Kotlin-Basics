package com.dkgtech.kotlinbasics

fun main() {

    val isRaining = true
    if (isRaining)
        println("Take Umbrella")
    else
        println("No need to take Umbrella")

    val isEmployeeCC = "Joint"
    if (isEmployeeCC == "UK")
        println("Submit your assets in Prism")
    else if (isEmployeeCC == "TPG")
        println("Submit your assets in PD")
    else
        println("Submit your assets in Spectrum")

    val number = 11
    val result = if (number % 2 == 0) "Even" else "Odd"
    println(result)

}