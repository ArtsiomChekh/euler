package problems

import scala.annotation.tailrec

/*
 * Summation of Primes
 * https://projecteuler.net/problem=10
 */
object P10_SummationOfPrimes:
  def sumOfPrimesBelow(n: Int): Long =
    var sum: Long = 0
    for i <- 2 until n do
      if isPrime(i) && i < n then
        sum += i
    sum

  def sumOfPrimesBelowByRecursive(n: Int): Long =
    @tailrec
    def loop(candidate: Int, sum: Long): Long =
      if candidate >= n then
        sum
      else if isPrime(candidate) then
        loop(candidate + 1, sum + candidate)
      else
        loop(candidate + 1, sum)

    loop(2, 0)
end P10_SummationOfPrimes