package problems

import java.math.BigInteger

/*
 * Large Sum
 * https://projecteuler.net/problem=13
 */
object P13_LargeSum:
  def firstNDigits(numbers: Array[String], n: Int): Long =
    var sum = BigInteger.ZERO
    for num <- numbers do
      sum = sum.add(BigInteger(num))
    sum.toString.substring(0, n).toLong
end P13_LargeSum



