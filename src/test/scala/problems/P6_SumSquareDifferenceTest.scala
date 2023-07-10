package problems

import munit.FunSuite
import problems.P6_SumSquareDifference.{squareOfTheSum, sumOfTheSquares, sumSquareDifference}

class P6_SumSquareDifferenceTest extends FunSuite:
  test("squareOfTheSum"):
    assertEquals(squareOfTheSum(1), 1)
    assertEquals(squareOfTheSum(3), 36)
    assertEquals(squareOfTheSum(5), 225)
    assertEquals(squareOfTheSum(10), 3025)
    assertEquals(squareOfTheSum(100), 25502500)

  test("sumOfTheSquares"):
    assertEquals(sumOfTheSquares(1), 1)
    assertEquals(sumOfTheSquares(3), 14)
    assertEquals(sumOfTheSquares(5), 55)
    assertEquals(sumOfTheSquares(10), 385)
    assertEquals(sumOfTheSquares(100), 338350)

  test("sumSquareDifference"):
    assertEquals(sumSquareDifference(squareOfTheSum(10), sumOfTheSquares(10)), 2640)
    assertEquals(sumSquareDifference(squareOfTheSum(100), sumOfTheSquares(100)), 25164150)

