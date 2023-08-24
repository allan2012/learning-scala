package mapsAndFlatMaps

object MapsAndFlatMaps extends App {

  val list = List(1,2,3,4)

  println(list.head)
  println(list.tail)

  println(list.map(_ + 1))
  println(list.map(_ + " is a number"))

  val toPair = (x: Int) => List(x, x + 1)
  println(list.flatMap(toPair))

  list.foreach(println)

  val firstName = List("Mary", "Ivy", "Brian")
  val surnames = List("Chemutai", "Chebet", "Kipkorir")

  // for comprehension
  val nameCombinations = for {
    f <- firstName
    s <- surnames
  } yield (f + " " + s)

  println(nameCombinations)

  val nameCombinations2 = for {
    f <- firstName if f != "Mary" && f != "Ivy"
    s <- surnames
  } yield (f + " " + s)

  println(nameCombinations2)

}
