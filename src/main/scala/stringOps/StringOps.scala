package stringOps

object StringOps extends App {

  val str: String = "I am currently learning Scala"
  println(str.charAt(2))
  println(str.substring(5,14))
  println(str.split(" ").toList)
  println(str.startsWith("I am"))
  println(str.replace("Scala","Python"))
  println(str.length)
  println(str.toUpperCase())


  // s interpolation
  val name: String = "Allan"
  val age: Int = 37

  println(s"My name is $name and I am $age years old")

  // f interpolation
  val interestRate: Float = 14.5565f
  println(f"The interest rate is $interestRate%2.2f")

  //raw interpolation - Does not support escaping of literals
  println(raw"This is a \n multiline string that \n that will extend to the next line")
}
