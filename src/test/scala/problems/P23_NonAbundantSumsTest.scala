package problems

import munit.FunSuite

class P23_NonAbundantSumsTest extends FunSuite:

  import P23_NonAbundantSums._

  test("abundantNumbersBelow 13"):
    assertEquals(abundantNumbersBelow(13), List(12))

  test("abundantNumbersBelow 25"):
    assertEquals(abundantNumbersBelow(25), List(12, 18, 20, 24))

  test("isAbundant 1"):
    assert(!isAbundant(1))

  test("isAbundant 2"):
    assert(!isAbundant(2))

  test("isAbundant 12"):
    assert(isAbundant(12))

  test("isAbundant 24"):
    assert(isAbundant(24))

  test("nonAbundantSums"):
    assertEquals(nonAbundantSums(28123), 4179871)




