package problems

import scala.main

/*
 *  Even Fibonacci Numbers
 */

object Problem2 {

  @main def run(): Unit = {
    println(sumOfEvenValued(4000000))
  }

  def sumOfEvenValued(x: Int): Int = {
    var sum = 0
    var e = 1

    def fibonacci(n: Int): Int = {
      if n <= 1 then
        n
      else
        fibonacci(n - 1) + fibonacci(n - 2)
    }

    while fibonacci(e) <= x do
      if fibonacci(e) % 2 == 0 then
        sum += fibonacci(e)
      e = e + 1
    sum
  }

}
