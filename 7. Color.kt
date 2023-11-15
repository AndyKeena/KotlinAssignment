package Assignment7

enum class Color {
    PINK, RED, GREEN, BLUE, PURPLE
}

sealed class Result {
    class Success(val message: String) : Result()
    class Error(val message: String) : Result()
}

fun main() {

    val color1 = Color.BLUE
    val color2 = Color.PURPLE
    val result_success = Result.Success("Success")
    val result_error = Result.Error("Error")

    println(color1)
    println(color2)

    when (result_success){
        is Result.Success -> println(result_success.message)
        else -> println(result_error.message)
    }


}