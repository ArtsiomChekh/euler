package problems

import munit.FunSuite

class P12_HighlyDivisibleTriangularNumberTest extends FunSuite:

  import P12_HighlyDivisibleTriangularNumber.*

  test("divisibleTriangularNumber 1"):
    assertEquals(divisibleTriangularNumber(1), 1)

  test("divisibleTriangularNumber 3"):
    assertEquals(divisibleTriangularNumber(3), 6)

  test("divisibleTriangularNumber 5"):
    assertEquals(divisibleTriangularNumber(5), 28)

  test("divisibleTriangularNumber 100"):
    assertEquals(divisibleTriangularNumber(100), 73920)

  test("divisibleTriangularNumber 500"):
    assertEquals(divisibleTriangularNumber(500), 76576500)

  test("generatorTriangleNumbers 1th"):
    assertEquals(generatorTriangleNumber(1), 1)

  test("generatorTriangleNumbers 2th"):
    assertEquals(generatorTriangleNumber(2), 3)

  test("generatorTriangleNumbers 3th"):
    assertEquals(generatorTriangleNumber(3), 6)

  test("generatorTriangleNumbers 7th"):
    assertEquals(generatorTriangleNumber(7), 28)

  test("findFactorsOfNumber 1"):
    assertEquals(findFactorsOfNumber(1), List(1))

  test("findFactorsOfNumber 2"):
    assertEquals(findFactorsOfNumber(2), List(1, 2))

  test("findFactorsOfNumber 3"):
    assertEquals(findFactorsOfNumber(3), List(1, 3))

  test("findFactorsOfNumber 6"):
    assertEquals(findFactorsOfNumber(6), List(1, 2, 3, 6))

  test("findFactorsOfNumber 28"):
    assertEquals(findFactorsOfNumber(28), List(1, 2, 4, 7, 14, 28))


