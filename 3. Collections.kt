package Assignment3

fun main(){
    val numbers =  arrayOf(5, 10, 15, 20, 25, 30, 35, 40)   // 1

    val sum = numbers.sum()  // 2
    println(sum)
    println()

    for (x in numbers) {   // 3
       println(x)
    }
    println()

    val max_value = numbers.maxOrNull()  // 4
    println(max_value)
    println()

    val min_value = numbers.minOrNull()  // 5
    println(min_value)
    println()

    val new_array = numbers.filter {it % 2 == 0 }
    println(new_array)
    println()

    val squared_array = numbers.map {it * it }
    println(squared_array)
    println()

    val divisibleBy5 = numbers.any {it % 5 == 0 }
    if (divisibleBy5){
        println("Yes")
    }
    else{
        println("No")
    }
    println()

    val sorted_array = numbers.sorted()
    println(sorted_array)
    println()

    val reversed_array = numbers.reversed()
    println(reversed_array)
    println()

    val numOfElements = numbers.count()
    println(numOfElements)
}
