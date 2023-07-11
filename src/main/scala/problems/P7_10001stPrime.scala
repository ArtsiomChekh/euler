package problems

import scala.annotation.tailrec

/*
 * 10001st Prime
 * https://projecteuler.net/problem=7
 */
object P7_10001stPrime:
  def nthPrimeNumber(n: Int): Int =
    n

  @tailrec
  def isPrime(n: Int, i: Int = 2): Boolean =
    if n == 0 || n == 1 then
      false
    else if n == i then
      true
    else if n % i == 0 then
      false
    else isPrime(n, i + 1)
