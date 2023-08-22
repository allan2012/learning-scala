package syntaticSugar

import scala.language.postfixOps

object SyntaticSugar extends App {

  val person = new Person("John", "Prometheus")
  println(person.likes("Prometheus"))

  // Infix notation
  println(person likes "Prometheus")

  println(person.+("Sam"))

  // Calling the prefix notation
  println(!person)
  println(person.unary_!)

  //calling a postfix notation
  println(person.isAlive)
  println(person isAlive)

  //Calling the apply
  println(person.apply())
  println(person())

  println(person.+.name)

  println((+person).age)
}

class Person(val name: String, movie: String, val age: Int = 12 ) {
  def likes(favouriteMovie: String): Boolean = favouriteMovie == this.movie
  def +(friend: String): String = s"${this.name} plus ${friend}"

  def + :Person = new Person("Mary the rockstar", "The Grey")

  // defining the prefix notation
  def unary_! : String = s"learning prefix notation..."

  // defining the postfix notation
  // nb: methods without parameters are treated as postfix notations
  // nb: This is rarely used because of readability issues
  def isAlive : Boolean = true

  def apply() :String = "Testing the apply method.."

  def unary_+ :Person = new Person(name, movie, age + 1)
}
