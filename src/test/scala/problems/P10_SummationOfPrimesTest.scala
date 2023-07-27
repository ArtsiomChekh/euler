package problems

import munit.FunSuite

class P10_SummationOfPrimesTest extends FunSuite:

  import P10_SummationOfPrimes.*

  test("below 2"):
    assertEquals(sumOfPrimesBelow(3), 2L)

  test("below 4"):
    assertEquals(sumOfPrimesBelow(4), 2 + 3L)

  test("below 10"):
    assertEquals(sumOfPrimesBelow(10), 2 + 3 + 5 + 7L)

  test("below 100"):
    assertEquals(sumOfPrimesBelow(100), 1060L)

  test("below 1 thousand"):
    assertEquals(sumOfPrimesBelow(1000), 76127L)

  test("below 2 mln"):
    assertEquals(sumOfPrimesBelow(2000000), 142913828922L)