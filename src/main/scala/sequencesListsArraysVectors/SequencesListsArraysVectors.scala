package sequencesListsArraysVectors

object SequencesListsArraysVectors extends App {

  val aSequence = Seq(1,2,3,4,5)
  println(aSequence)
  println(aSequence.reverse)
  println(aSequence(2))

  println(aSequence ++ Seq(6,7,8,9,10))
  val aRange: Seq[Int] = 1 until 10
  aRange.foreach(
    println
  )

  (1 to 5).foreach(println)

  val aList = List(1,2,3)
  val prepend = 0 :: aList // Prepend also +: aList
  println(prepend)

  val append = prepend :+   4
  println(append)

  val apples = List.fill(3)("apple")
  println(aList.mkString("|"))

  val numbersArray = Array(1,2,3)
  numbersArray.foreach(println)

  val threeElements = Array.ofDim[Int](3)
  threeElements(0) = 1
  threeElements.foreach(println)

}
