package exceptions

object Exceptions extends App {

  // val array = Array.ofDim(Int.MaxValue)

  def infinite: Int = 1 + infinite
  // Trigger a  StackOverflow exception
  // val nolimit = infinite

  class InvalidIndependenceYearException extends Exception

  class IndependenceYear {
    def check(year: Int): Unit = {
      if (year != 1986) {
        throw new InvalidIndependenceYearException
      } else {
        println("Correct year provided")
      }
    }
  }

  try {
    val independence = new IndependenceYear
    independence.check(1123)
  } catch {
    case e: InvalidIndependenceYearException => println("Incorrect year of independence")
  } finally {
    println("Finally!")
  }
}