package com.dkgtech.kotlinbasics

class ObjectClass {
}

fun main() {
    val mustang = Car("mustang", "Petrol", 200)
    val beetle = Car("beetle", "diesel", 300)

    println(mustang.name)
    println(mustang.type)
    println(beetle.kmRan)

    mustang.driveCar()
}

class Car(val name: String, val type: String, var kmRan: Int) {

    fun driveCar() {
        println("Car is driving")
    }

    fun applyBrakes() {
        println("Brakes Applied")
    }
}