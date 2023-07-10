package problems

import munit.FunSuite
import problems.P6_SumSquareDifference.{squareOfTheSum, squareOfTheSumByFormula, sumOfTheSquares, sumOfTheSquaresByFormula, sumSquareDifference, sumSquareDifferenceByFormula}

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
    assertEquals(sumSquareDifference(10), 2640)
    assertEquals(sumSquareDifference(50), 1582700)
    assertEquals(sumSquareDifference(100), 25164150)

  test("sumSquareDifferenceByFormula"):
    assertEquals(sumSquareDifferenceByFormula(10), 2640)
    assertEquals(sumSquareDifferenceByFormula(50), 1582700)
    assertEquals(sumSquareDifferenceByFormula(100), 25164150)

  test("squareOfTheSumByFormula"):
    assertEquals(squareOfTheSumByFormula(1), 1)
    assertEquals(squareOfTheSumByFormula(3), 36)
    assertEquals(squareOfTheSumByFormula(5), 225)

  test("sumOfTheSquaresByFormula"):
    assertEquals(sumOfTheSquaresByFormula(1), 1)
    assertEquals(sumOfTheSquaresByFormula(3), 14)
    assertEquals(sumOfTheSquaresByFormula(5), 55)
