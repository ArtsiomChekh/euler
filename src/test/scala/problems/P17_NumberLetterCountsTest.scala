package problems

import munit.FunSuite

class P17_NumberLetterCountsTest extends FunSuite:

  import P17_NumberLetterCounts.*

  test("numberLetterCounts to 1"):
    assertEquals(numberLetterCounts(1), 3)

  test("numberLetterCounts to 2"):
    assertEquals(numberLetterCounts(2), 6)

  test("numberLetterCounts to 5"):
    assertEquals(numberLetterCounts(5), 19)

  test("numberLetterCounts to 100"):
    assertEquals(numberLetterCounts(100), 864)

  test("numberLetterCounts to 1000"):
    assertEquals(numberLetterCounts(1000), 21124)

