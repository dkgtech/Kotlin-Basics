package com.dkgtech.kotlinbasics

fun main() {

    /*
    Polymorphism --> Parent can hold a reference to its child
                     Parent can call methods of child classes (which are common)

                     helps to write maintainable & extensible code
                     helps in interacting with objects via common interface
    * */


    val objCircle: Shape = Circle(2.0)
    val objSquare: Shape = Square(4.0)
    println(objCircle.area())
    println(objSquare.area())

    val shapes = arrayOf(Circle(2.0), Square(4.0), Triangle(2.0, 2.0))
    calculateArea(shapes)

}

fun calculateArea(shapes: Array<Shape>) {
    for (shape in shapes) {
        println(shape.area())
    }
}

open class Shape {
    open fun area(): Double {
        return 0.0
    }
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Square(val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}

class Triangle(val base: Double, val height: Double) : Shape() {
    override fun area(): Double {
        return 0.5 * base * height
    }
}