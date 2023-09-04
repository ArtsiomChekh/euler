package problems

import munit.FunSuite

class P30_DigitFifthPowersTest extends FunSuite:

  import P30_DigitFifthPowers._

  test("test 1"):
    assertEquals(sumOfDigitNthPowers(4), 19316)

