package Assignment10

import java.lang.StringBuilder


fun main() {

    var greeting = "hi, how are you"

    greeting = greeting.let {
        it.capitalize()
    }
    println("$greeting")

    run {
        println(greeting.length)
    }

    with(greeting) {
        greeting = replace("HI", "HELLO")
    }
    println(greeting)

    greeting = StringBuilder(greeting).apply {
        append(" Hope you are doing well")
    }.toString()
    println(greeting)

    greeting.also{
        println(it)
    }


}

