package problems

import scala.annotation.tailrec

/*
 * 10001st Prime
 * https://projecteuler.net/problem=7
 */
object P7_10001stPrime:
  def nthPrimeNumber(n: Int): Int =
    var counter = 1
    var candidate = 2
    var prime = 0
    while counter <= n do
      if isPrime(candidate) then
        prime = candidate
        counter += 1
      candidate += 1
    prime

  def nthPrimeNumberByRecursion(n: Int): Int =
    @tailrec
    def loop(candidate: Int, primeCount: Int): Int =
      if primeCount > n then
        candidate - 1
      else if isPrime(candidate) then
        loop(candidate + 1, primeCount + 1)
      else
        loop(candidate + 1, primeCount)

    loop(2, 1)

  def isPrime(n: Int): Boolean =
    @tailrec
    def loop(i: Int): Boolean =
      n == 2 || i * i > n || !(n % i == 0) && loop(i + 1)

    loop(2)

  def isPrimeNumber(n: Int): Boolean =
    (2 until n).forall(n % _ != 0)
end P7_10001stPrime
