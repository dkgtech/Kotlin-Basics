package com.dkgtech.kotlinbasics


fun main() {

//    using primary constructor
    val car = AutoMobile("Car", 4, 6, "Petrol")


//    using secondary constructor
    val car2 = AutoMobile("Mustang", "Petrol")



    val person = Person("A", 20)
    println(person.name)
    println(person.age)

    val person2 = Person("B", 17)
    println(person2.name)
    println(person2.age)


}

class AutoMobile(val name: String, val tyres: Int, val maxSitting: Int, val engine: String) {

//    secondary constructor
    constructor(nameParam: String, engineParam: String) : this(nameParam, 4, 6, engineParam)
}

// class without constructor
class Empty {}

class Person(nameParam: String, ageParam: Int) {

    var name: String = nameParam
    var age: Int = ageParam
    val canVote: Boolean = ageParam > 18

}

