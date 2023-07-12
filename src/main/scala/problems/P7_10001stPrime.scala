package problems

import scala.annotation.tailrec

/*
 * 10001st Prime
 * https://projecteuler.net/problem=7
 */
object P7_10001stPrime:
  def nthPrimeNumber(n: Int): Int =
      var count = 1
      var tPr = 2
      var res = 0
      while count <= n do
        if isPrime(tPr) then
          res = tPr
          count += 1
        tPr += 1
      res


  @tailrec
  def isPrime(n: Int, i: Int = 2): Boolean =
    if n == 0 || n == 1 then
      false
    else if n == i then
      true
    else if n % i == 0 then
      false
    else isPrime(n, i + 1)
