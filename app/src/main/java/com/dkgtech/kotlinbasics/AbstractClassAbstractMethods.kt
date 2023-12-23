package com.dkgtech.kotlinbasics

fun main() {

    /*
    abstract classes are those classes which are not defined yet but will be defined by their subclasses

    instances can't be create of abstract classes
    * */

//    val a = A() --> Cannot create an instance of an abstract class

    val b = B()
    b.data()


}


abstract class A() {
    fun data() {
        println("data is printing")
    }
}

class B() : A() {

}