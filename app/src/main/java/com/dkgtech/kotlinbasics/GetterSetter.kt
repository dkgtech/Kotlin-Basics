package com.dkgtech.kotlinbasics

fun main() {

    val ob = Calculator()
    println(ob.add(2, 2))
    println(ob.multiply(2, 3))

    val p1 = Persons("dipesh", 21)
    println(p1.age)
    p1.age = -12
    println(p1.name)


}

class Calculator {
    fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun multiply(num1: Int, num2: Int): Int {
        return num1 * num2
    }
}

// setter

class Persons(nameParam: String, ageParam: Int) {
    var name: String = nameParam

        //    getter
        get() {
            return field.uppercase()
        }
    var age: Int = ageParam
        //        setter
        set(value) {
            if (value > 0) {
                field = value
            } else {
                println("Age can't be negative")
            }
        }
}