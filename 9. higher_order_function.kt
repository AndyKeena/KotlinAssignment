package Assignment9

import java.lang.management.OperatingSystemMXBean

fun function(a: Double, b : Double, operation: (Double, Double)-> Double): Double {
    return operation(a, b)
}

fun main(){

    val num1 = 4.5
    val num2 = 2.1

    val addition = function(num1, num2){ a, b -> a + b}
    val subtraction = function(num1, num2){ a, b -> a - b}
    val muptiplication = function(num1, num2){ a, b -> a * b}
    val division = function(num1, num2){ a, b -> a / b}

    println("Addition is $addition")
    println("Subtraction is $subtraction")
    println("Multiplication is $muptiplication")
    println("Division is $division")

}