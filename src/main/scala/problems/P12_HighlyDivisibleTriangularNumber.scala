package problems

import problems.P12_HighlyDivisibleTriangularNumber.findFactorsOfNumber

/*
 * Highly Divisible Triangular Number
 * https://projecteuler.net/problem=12
 */
object P12_HighlyDivisibleTriangularNumber:
  def divisibleTriangularNumber(n: Int): Int =
    if n == 1 then
      n
    else
      var i = 1
      var triangleNumber = 0
      while findFactorsOfNumber(triangleNumber).length <= n do
        triangleNumber = generatorTriangleNumber(i)
        i = i + 1
      triangleNumber

  def generatorTriangleNumber(n: Int): Int =
    var currentTriangle = 0
    for (count <- 1 to n)
      currentTriangle = currentTriangle + count
    currentTriangle

  import scala.math

  def findFactorsOfNumber(n: Int): List[Int] =
    var factors: List[Int] = List()
    for i <- 1 to math.sqrt(n).toInt do
      if n % i == 0 then
        factors = factors :+ i
        if i != n / i then
          factors = factors :+ (n / i)
    factors.sorted
end P12_HighlyDivisibleTriangularNumber












