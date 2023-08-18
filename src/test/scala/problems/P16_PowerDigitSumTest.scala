package problems

import munit.FunSuite

class P16_PowerDigitSumTest extends FunSuite:

  import P16_PowerDigitSum.*

  test("powerDigitSum power to 15"):
    assertEquals(powerDigitSum(1, 1), 1)
    assertEquals(powerDigitSum(2, 1), 2)
    assertEquals(powerDigitSum(3, 2), 9)
    assertEquals(powerDigitSum(3, 3), 9)
    assertEquals(powerDigitSum(2, 15), 26)

  test("powerDigitSum power 100"):
    assertEquals(powerDigitSum(2, 100), 115)

  test("powerDigitSum power 1000"):
    assertEquals(powerDigitSum(2, 1000), 1366)








