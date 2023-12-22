package com.dkgtech.kotlinbasics

fun main(){

    val phone = BasicPhone()
    phone.getScreenInfo()
    phone.makeCall()


}

open class Phone() {
    val name: String = ""
    val type: String = ""
    val volume: Int = 10

    fun makeCall() {
        println("Making Call")
    }
    fun display() {
        println("Showing Display")
    }
    fun powerOff() {
        println("Powering Off")
    }
    fun getDeviceInfo() {}
}


open class BasicPhone() : Phone() {
    fun getScreenInfo() {}
}

class SmartPhone() : Phone() {

    fun playVideo() {}
    fun takePicture() {}
    fun getLocation() {}

}
