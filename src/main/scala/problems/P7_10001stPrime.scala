package problems

import scala.annotation.tailrec

/*
 * 10001st Prime
 * https://projecteuler.net/problem=7
 */
object P7_10001stPrime:
  def nthPrimeNumber(n: Int): Int =
    var primeTemp = 2
    def loop(p: Int, place: Int): Int =
      if place >= n then
        primeTemp
      else if isPrime(p, 2)  then
          loop(p + 1, place + 1)
      else
          loop(p, place)

    loop(2, 1)


  @tailrec
  def isPrime(n: Int, i: Int = 2): Boolean =
    if n == 0 || n == 1 then
      false
    else if n == i then
      true
    else if n % i == 0 then
      false
    else isPrime(n, i + 1)
