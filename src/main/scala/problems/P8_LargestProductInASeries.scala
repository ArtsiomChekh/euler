package problems

/*
 * Largest Product in a Series
 * https://projecteuler.net/problem=8
 */

object P8_LargestProductInASeries:
  def largestProductInASeries(str: String, n: Int): Int =
    var largest = 0
    for i <- 0 to str.length - n do
      var product = 1
      for j <- 0 until n do
        product *= str.charAt(i + j).asDigit
      if largest < product then
        largest = product
        println(largest)
    largest
