package oopBasics

object OopBasics extends App {

  val person = new Person("James", 44)
  //println(person.age)
  //person.greet("Allan")
  //person.greet()

  val person2 = new Person("Elvis")
  //println(person2.age)

//  val author = new Writer("Mark", "Walsh", 1987)
//  val novel = new Novel("The Prey", author, 2000)
//
//  println(novel.authorAge)
//  println(novel.isWrittenBy.fullName)
//
//  val novel2 = novel.copy(2034)
//  println(novel2.yearOfRelease)

  val counter = new Counter(100)
  println(counter.increment(33).x)
}


class Person(name: String, val age: Int) { // val here converts the class param age to accessible field
  println("This is an expression that will be evaluated when the class is instantiated")
  def greet(name: String): Unit = println(s"Hello ${this.name} says Hi to $name")
  def greet(): Unit = println(s"Hello $name")
  // constructor overloading
  def this(name: String) = this(name, 22) // 22 can be solved by specifying age with a default value
}

class Writer(firstName: String, surname: String, val yearOfBirth: Int) {
  def fullName: String = s"${this.firstName} ${this.surname}"
}

class Novel(name: String, author: Writer, val yearOfRelease: Int) {
  def authorAge: Int = author.yearOfBirth
  def isWrittenBy: Writer = author

  def copy(newYearOfRelease: Int): Novel = {
    new Novel(name, author, newYearOfRelease)
  }
}

class Counter(val x: Int) {
  def increment = new Counter(x + 1) // Scala only supports immutability
  def increment(amount: Int): Counter = new Counter(x + amount)
  def decrement: Counter = new Counter(x - 1)
  def decrement(amount: Int): Counter = new Counter(x - amount)
}
