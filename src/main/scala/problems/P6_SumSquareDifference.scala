package problems

/*
 * Sum Square Difference
 * https://projecteuler.net/problem=6
 */
object P6_SumSquareDifference:
  def sumSquareDifference(n: Int): Int =
    squareOfTheSum(n) - sumOfTheSquares(n)

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

  def sumSquareDifferenceByFormula(n: Int): Int =
    squareOfTheSumByFormula(n) - sumOfTheSquaresByFormula(n)

  // math.pow(n, 4) + 2 * math.pow(n, 3) + math.pow(n, 2)
  def squareOfTheSumByFormula(n: Int): Int =
    n * (n + 1) / 2 * n * (n + 1) / 2

  def sumOfTheSquaresByFormula(n: Int): Int =
    (n * (n + 1) * (2 * n + 1)) / 6
end P6_SumSquareDifference




