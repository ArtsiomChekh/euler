package problems

/*
 * Large Sum
 * https://projecteuler.net/problem=13
 */
object P13_LargeSum:
  def firstNDigits(numbers: Array[String], n: Int): String =
    numbers.map(BigInt(_)).sum.toString.take(n)