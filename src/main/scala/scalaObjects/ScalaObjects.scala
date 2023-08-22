package scalaObjects

object ScalaObjects extends App {

  object Person {
    val HEIGHT = 1.4
    def greetings:Unit = println("Hello Allan")

    def apply(name: String): Person = new Person(name) // Factory
  }

  // Companion
  class Person(name: String) {
    val AGE = 77

    def printName: Unit = print(name)
  }

  val mary = Person
  val peter = Person

  println(mary == peter)

  mary.greetings
  println(peter.HEIGHT)

  val p = Person("Samuel L. Jackson")
  p.printName
}
