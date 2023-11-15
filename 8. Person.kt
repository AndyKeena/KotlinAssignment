package Assignment8

data class Person(val name: String, val age : Int)

fun Person.birthYearCalculation( year : Int): Int{
    return year - age
}

fun main(){

    val persons = listOf(Person("Andrea", 22), Person("Okeena", 18), Person("Isindu", 21))
    val year = 2023

    for (person in persons){
        val birthYear = person.birthYearCalculation(year)
        println(" ${person.name} was born in $birthYear")
    }
}