package problems

import java.util.stream.Collectors

/*
 * 1000-digit Fibonacci Number
 * https://projecteuler.net/problem=25
 */
object P25_1000DigitFibonacciNumber:
  def indexOfNthDigitFibonacciNumber(n: Int): Int =
    var list = List(BigInt(1), BigInt(1))
    var index = 1
    while list(index).toString.length < n do
      val nextFibonacci = list(index) + list(index - 1)
      list = list :+ nextFibonacci
      index += 1

    index + 1
end P25_1000DigitFibonacciNumber

