package expressions

object Expressions extends App {


  // Side effects are expressions returning unit values i.e ()
  var i = 0
  val aWeirdValue = while (i < 10) {
    i += 1
  }

  println(aWeirdValue)

  // Value of a block is the value of the last expression
  val aCodeBlock = {
    // Values created within code blocks are limited to block scope
    val y = 2
    if (y == 2) "two" else "...not two"
  }

}
