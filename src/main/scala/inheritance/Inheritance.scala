package inheritance

object Inheritance extends App {

  class Animal {
    val NO_OF_EYES = 2
    def isAnAnimal: Boolean = true
    def makeSound: Unit = println("some sound...")
    final def isLiving: Boolean = true
  }

  class Cat extends Animal {
    // Overriding parent method
    override def makeSound: Unit = println("purrrr...")

    // This wont work because parent method is final
    // def isLiving: Boolean = false
  }

  //  val catty = new Cat
  //  catty.makeSound

  class Car(make: String, model: String, color:String) {
    def this(make: String, model: String) = this(make, model, "White") // Using constructor with default params
    def printColor: Unit = println(color)
  }

  class MyCar(make: String, model: String) extends Car(make, model) {
    def printModel: Unit = println(model)
  }

  val t = new MyCar("Toyota", "Allion")
  t.printModel

  // Type substitution
  val t2: Car = new MyCar("Mercedes", "CLS")

  t2.printColor

  final class Employee

  // You cannot extend a final class
  // class Programmer extends Employee
}
