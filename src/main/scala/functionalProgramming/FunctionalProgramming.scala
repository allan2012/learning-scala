package functionalProgramming

object FunctionalProgramming extends App {

//  val concatenator = new Function2[String, String, String] {
//    override def apply(a: String, b: String): String = s"${a} ${b}"
//  }

  // Same as
  val concatenator: (String, String) => String = new Function2[String, String, String] {
    override def apply(a: String, b: String): String = s"${a} ${b}"
  }

  println(concatenator("Hello", "World"))

//  val val2 = new Function1[Int, Function1[Int, Int]] {
//    override def apply(a: Int, b: Function1): Function1 = s"${a} ${b}"
//  }
}
