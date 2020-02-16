fun main(args: Array<String>) {
    println("Hello World!!!")
    var person = Person()
    person.FirstName = "Alan"
    person.LastName = "Walker"
    person.displayName()
    var person1 = PersonWithConstructor("Jason", "", "Statham")
    person1.display()
}

class PersonWithConstructor(var FirstName: String, var MiddleName: String, var LastName: String) {
    fun display() {
        println("Name is ${FirstName} ${MiddleName} ${LastName}")
    }
}