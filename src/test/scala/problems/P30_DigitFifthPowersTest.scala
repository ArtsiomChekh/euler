package problems

import munit.FunSuite

class P30_DigitFifthPowersTest extends FunSuite:

  import P30_DigitFifthPowers._

  test("sumPowerDigits power 2"):
    assertEquals(sumPowerDigits(22, 2), 8)

  test("sumPowerDigits power 3"):
    assertEquals(sumPowerDigits(22, 3), 16)

  test("digitNthPowers 4"):
    assertEquals(digitNthPowers(26244, 4), 19316)

  test("digitNthPowers 5"):
    assertEquals(digitNthPowers(295245, 5), 443839)

