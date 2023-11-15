package Assignment4

open class Person (val name: String, val age: Int){
}

class Student (val name: String, val age: Int, val school: String) {
}

fun main(){

    val person1 = Person("Andrea Okeena", 22)
    val student1 = Student("Diandra Natali", 18, "Good Shepherd Convent")

    println(person1.age)
    println(person1.name)
    println(student1.name)
    println(student1.age)
    println(student1.school)
}