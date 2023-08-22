package functions

import scala.annotation.tailrec

object Function extends App {

    def exampleFunc(s: String, i: Int): String = s + " " + i

    println(exampleFunc("Alison",4))

    // Scala can establish the return type of a function even if it is yet to be defined
    def sayHelloFunc() = "Hello Allan"

    println(sayHelloFunc())

    def printNameFunc(name: String): Unit = println("My name is: " + name)
    printNameFunc("Lebron James")


    // Scala can establish the return type of a nested function
    def nestedFunc(i: Int) = {
      def sqr(n: Int): Int = n * n
      sqr(i)
    }


    def factorial(n: Int): Int = {
        // Using tail recursion
        @tailrec def factorialAcc(acc: Int, n: Int): Int = {
            if (n <= 1)
                acc
            else
                factorialAcc(n * acc, n - 1)
        }
        factorialAcc(1, n)
    }

    def stringConcatinator(aString: String, count: Int): String = {
        @tailrec def stringAccumulator(stringBuilder: String, aString: String, n: Int) : String = {
            if (n <= 1)
                stringBuilder
            else
                stringAccumulator(stringBuilder + " " + aString, aString, n - 1)
        }
        stringAccumulator(aString, aString, count)
    }

    print(stringConcatinator("ALLAN", 5))

}
