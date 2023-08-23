package anonymousFunctions

object AnonymousFunctions extends App {

  val doubler = (x: Int) => x * 2
  println(doubler(800))

  val adder = (x: Int, y: Int) => x + y
  println(adder(44, 56))

  val getThree = () => 3
  println(getThree())

  val stringToInt = { (str: String) =>
    str.toInt
  }

  println(stringToInt("44"))

  // var variable: ParamType => OutputType = (Expression...)
  val incrementer: Int  => Int = _ + 1
  println(incrementer(-1))

  // Multiple
  // var variable: (Param1Type, Param2Type) => OutputType = (Expression...)
  val adder2:  (Int, Int) => Int =  _ + _
  println(adder2(34,66))

  // Adder using curries, Here We call the first function with paramter x and
  // apply to second function which adds to its parameter y
  val adder3 = (x: Int) => (y: Int) => x + y
  println(adder3(3)(7))
}
