package problems

import java.util
import scala.annotation.tailrec

/*
 * Summation of Primes
 * https://projecteuler.net/problem=10
 */
object P10_SummationOfPrimes:
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

  def summationOfPrimesBelow(n: Int): Long =
    sumOfList(getAllPrimesBelow(n))

  def sumOfList(list: List[Int]): Long =
    list.sum

  def getAllPrimesBelow(n: Int): List[Int] =
    val sieve = Array.fill(n)(true)
    sieve(0) = false
    sieve(1) = false

    for i <- 2 to math.sqrt(n).toInt do
      if sieve(i) then
        for j <- i * i until n by i do
          sieve(j) = false

    val primes = (2 until sieve.length).foldLeft(List.empty[Int])((acc, i) =>
      if sieve(i) && i < n then
        i :: acc
      else
        acc
    ).reverse

    primes
end P10_SummationOfPrimes









