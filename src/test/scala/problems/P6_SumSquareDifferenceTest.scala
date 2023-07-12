package problems

import munit.FunSuite

class P6_SumSquareDifferenceTest extends FunSuite:

  import P6_SumSquareDifference.*

  test("sumSquareDifference"):
    assertEquals(sumSquareDifference(10), 2640)
    assertEquals(sumSquareDifference(50), 1582700)
    assertEquals(sumSquareDifference(100), 25164150)

  test("sumOfNaturalNumbers"):
    assertEquals(sumOfNaturalNumbers(1), 1)
    assertEquals(sumOfNaturalNumbers(3), 6)
    assertEquals(sumOfNaturalNumbers(5), 15)
    assertEquals(sumOfNaturalNumbers(10), 55)
    assertEquals(sumOfNaturalNumbers(100), 5050)

  test("sumOfTheSquares"):
    assertEquals(sumOfTheSquares(1), 1)
    assertEquals(sumOfTheSquares(3), 14)
    assertEquals(sumOfTheSquares(5), 55)
    assertEquals(sumOfTheSquares(10), 385)
    assertEquals(sumOfTheSquares(100), 338350)

  test("sumSquareDifferenceByFormula"):
    assertEquals(sumSquareDifferenceByFormula(10), 2640)
    assertEquals(sumSquareDifferenceByFormula(50), 1582700)
    assertEquals(sumSquareDifferenceByFormula(100), 25164150)

  test("sumOfTheSquaresByFormula"):
    assertEquals(sumOfTheSquaresByFormula(1), 1)
    assertEquals(sumOfTheSquaresByFormula(3), 14)
    assertEquals(sumOfTheSquaresByFormula(5), 55)

  test("sumOfArithmeticProgression"):
    assertEquals(sumOfArithmeticProgression(1), 1)
    assertEquals(sumOfArithmeticProgression(3), 6)
    assertEquals(sumOfArithmeticProgression(5), 15)

  test("square"):
    assertEquals(square(2), 4)
    assertEquals(square(9), 81)
    assertEquals(square(15), 225)