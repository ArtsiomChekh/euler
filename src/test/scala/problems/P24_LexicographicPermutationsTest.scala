package problems

import munit.FunSuite

class P24_LexicographicPermutationsTest extends FunSuite:

  var digitsTest = List(0, 1, 2)
  var digits = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

  import P24_LexicographicPermutations._

  test("nthLexicographicPermutations 6"):
    assertEquals(nthLexicographicPermutations(6, digitsTest), "210")

  test("nthLexicographicPermutations 10000"):
    assertEquals(nthLexicographicPermutations(10000, digits), "0139846572")

  test("nthLexicographicPermutations 1 000 000"):
    assertEquals(nthLexicographicPermutations(1000000, digits), "2783915460")
