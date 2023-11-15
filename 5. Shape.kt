package Assignment5

import Assignment4.Person
import kotlin.math.PI

interface Shape {
    fun area(): Double
}

class  Circle (val radius: Double): Shape{
    override fun area(): Double{
        return PI * radius * radius
    }
}

class  Rectangle (val width: Double, val height: Double) : Shape{
    override fun area(): Double{
        return  width * height
    }
}

fun main(){
    val circle1 = Circle(7.00)
    val rectangle1 = Rectangle(10.5, 4.5)

    println(circle1.area())
    println(rectangle1.area())
}