package Assignment6

interface Book {
    val title: String
    val author: String
}

val book1: Book = object : Book {
    override val title: String = "Percy Jackson"
    override val author: String = "Rick Riordan"
}

object mathUtility {
    fun factorial(num: Int): Long {
        return if (num == 0 || num == 1) {
            1
        } else {
            num * factorial(num - 1)
        }
    }
}

fun main() {
    println("Title is ${book1.title}")
    println("Author is ${book1.author}")

    val number = 4
    val value = mathUtility.factorial(number)
    println("Factorial of $number: $value")
}
