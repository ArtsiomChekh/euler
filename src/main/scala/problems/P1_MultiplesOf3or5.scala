package problems

import scala.annotation.tailrec

/*
 * Multiples of 3 or 5
 * https://projecteuler.net/problem=1
 */
object P1_MultiplesOf3or5:
  def sumOfMultiplesBelow(n: Int): Int =
    var res = 0
    for (i <- n - 1 until 0 by -1)
      if (i % 3 == 0 || i % 5 == 0)
        res += i
    res

  // recursion
  def sumOfMultiplesBelowByRecursion(n: Int): Int =
    @tailrec
    def loop(k: Int, sum: Int): Int =
      if k <= 0 then
        sum
      else if k % 3 == 0 || k % 5 == 0 then
        loop(k - 1, sum + k)
      else
        loop(k - 1, sum)

    loop(n - 1, 0)

  def sumOfMultiplesOf3or5BelowByFormula(n: Int): Int =
    sumOfMultiplesBelow(3, n) + sumOfMultiplesBelow(5, n) - sumOfMultiplesBelow(15, n)

  def sumOfMultiplesBelow(x: Int, n: Int): Int =
    sumOfArithmeticProgression((n - 1) / x) * x
end P1_MultiplesOf3or5



