package problems

import scala.annotation.tailrec

/*
 * 10001st Prime
 * https://projecteuler.net/problem=7
 */
object P7_10001stPrime:
  def nthPrimeNumber(n: Int): Int =
    var counter = 1
    var currPrime = 2
    var res = 0
    while counter <= n do
      if isPrime(currPrime) then
        res = currPrime
        counter += 1
      currPrime += 1
    res

  def nthPrimeNumberByRecursion(n: Int): Int =
    @tailrec
    def loop(a: Int, b: Int, primeCount: Int): Int =
      if primeCount > n then
        a
      else if isPrime(b) then
        loop(a = b, b + 1, primeCount + 1)
      else
        loop(a, b + 1, primeCount)

    loop(2, 2, 1)

  @tailrec
  def isPrime(n: Int, i: Int = 2): Boolean =
    if n == 0 || n == 1 then
      false
    else if n == i then
      true
    else if n % i == 0 then
      false
    else isPrime(n, i + 1)
