package problems

import munit.FunSuite

class P16_PowerDigitSumTest extends FunSuite:

  import P16_PowerDigitSum.*

  test("powerDigitSum"):
    assertEquals(powerDigitSum(0), 0)
