package com.dkgtech.kotlinbasics

fun main() {

    val oneplus = Oneplus()
    oneplus.makeCall()
    println(oneplus.name)
    println(oneplus.size)

}

open class Mobile() {
    open val name: String = ""
    open val size: Float = 5.5f
    fun makeCall() {
        println("Making Call")
    }

    fun powerOff() {
        println("Switching Off")
    }
}

class Oneplus : Mobile() {
    override val name: String
        get() = "One Plus"

    override val size: Float
        get() = 6.6f
}