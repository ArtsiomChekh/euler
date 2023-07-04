package problems

import scala.annotation.tailrec

/*
 * Even Fibonacci Numbers
 * https://projecteuler.net/problem=2
 */
object P2_EvenFibonacciNumbers:
  def sumOfEvenFibonacciNumbers(x: Int): Int =
    var sum = 0
    var a = 0
    var b = 1
    var c = a + b
    while c <= x do
      if c % 2 == 0 then
        sum += c
      a = b
      b = c
      c = a + b
    sum

  // @tailrec
  def sumOfEvenFibonacciNumbersByTailRec(x: Int): Int =
    @tailrec
    def loop(c: Int, p: Int, sum: Int): Int =
      if c > x then
        sum
      else if c % 2 == 0 then
        loop(c + p, c, sum + c)
      else
        loop(c + p, c, sum)

    loop(1, 0, 0)






