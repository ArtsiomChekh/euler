package problems

import munit.FunSuite

class P20_FactorialDigitSumTest extends FunSuite:

  import P20_FactorialDigitSum._

  test("factorialDigitSum 2"):
    assertEquals(factorialDigitSum(2), 2)

  test("factorialDigitSum 10"):
    assertEquals(factorialDigitSum(10), 27)

  test("factorialDigitSum 100"):
    assertEquals(factorialDigitSum(100), 648)