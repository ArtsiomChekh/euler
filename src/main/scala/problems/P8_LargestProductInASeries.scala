package problems

/*
 * Largest Product in a Series
 * https://projecteuler.net/problem=8
 */
object P8_LargestProductInASeries:
  def largestProductInASeries(str: String, n: Int): Long =
    var largest: Long = 0
    for i <- 0 to str.length - n do
      var product: Long = 1
      for j <- 0 until n do
        product *= str.charAt(i + j).asDigit
      if largest < product then
        largest = product
    largest
end P8_LargestProductInASeries
