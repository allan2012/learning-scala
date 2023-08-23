package caseClasses

object CaseClasses extends App {

  case class Person(name: String, age: Int)

  // parameters are automatically promoted to fields
  val sam = new Person("Sammy Sang", 14)
  println(sam.name)

  // they have automatic companion object
  val sally = Person("Sally", 22)
  println(sally.age)

  val anne = sally.copy(age = 45)
  println(anne.name)
  println(anne.age)

  // Scala supports case objects
  case object Vehicle {
    val make: String = "Toyota"
  }

  val toyota = Vehicle
  println(toyota.make)

  /**
   * 1. They have extractor patterns and so they can be used in pattern Matching
   * 2. They are serializable hence useful for Akka and distributed system
   */

}
