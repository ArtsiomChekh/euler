package problems

/*
 * Sum Square Difference
 * https://projecteuler.net/problem=6
 */
object P6_SumSquareDifference:
  // x,y or a,b ???
  def sumSquareDifference(a: Int, b: Int): Int =
    math.abs(a - b)

  def squareOfTheSum(n: Int): Int =
    var sum = 0
    for i <- 1 to n do
      sum += i
    sum * sum

  def sumOfTheSquares(n: Int): Int =
    var sum = 0
    for i <- 1 to n do
      sum += i * i
    sum
end P6_SumSquareDifference

