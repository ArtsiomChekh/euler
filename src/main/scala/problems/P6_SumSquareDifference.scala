package problems

/*
 * Sum Square Difference
 * https://projecteuler.net/problem=6
 */
object P6_SumSquareDifference:
  def sumSquareDifference(n: Int): Int =
    square(sumOfNaturalNumbers(n)) - sumOfTheSquares(n)

  def sumOfNaturalNumbers(n: Int): Int =
    var sum = 0
    for i <- 1 to n do
      sum += i
    sum

  def sumOfTheSquares(n: Int): Int =
    var sum = 0
    for i <- 1 to n do
      sum += square(i)
    sum

  def sumSquareDifferenceByFormula(n: Int): Int =
    square(sumOfArithmeticProgression(n)) - sumOfTheSquaresByFormula(n)

  def sumOfTheSquaresByFormula(n: Int): Int =
    (n * (n + 1) * (2 * n + 1)) / 6
  
end P6_SumSquareDifference




