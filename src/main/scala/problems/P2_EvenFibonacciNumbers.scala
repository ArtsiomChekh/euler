package problems

import scala.annotation.tailrec

/*
 * Even Fibonacci Numbers
 * https://projecteuler.net/problem=2
 */
object P2_EvenFibonacciNumbers:
  def sumOfEvenFibonacciNumbers(n: Int): Int =
    var sum = 0
    var a = 0
    var b = 1
    var c = a + b
    while c <= n do
      if c % 2 == 0 then
        sum += c
      a = b
      b = c
      c = a + b
    sum

  // @tailrec
  def sumOfEvenFibonacciNumbersByTailRec(n: Int): Int =
    @tailrec
    def loop(a: Int, b: Int, sum: Int): Int =
      if b > n then
        sum
      else if b % 2 == 0 then
        loop(b, a + b, sum + b)
      else
        loop(b, a + b, sum)

    loop(0, 1, 0)
end P2_EvenFibonacciNumbers







