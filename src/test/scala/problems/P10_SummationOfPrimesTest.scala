package problems

import munit.FunSuite

class P10_SummationOfPrimesTest extends FunSuite:

  import P10_SummationOfPrimes.*

  test("sumOfPrimesBelowByRecursive 3"):
    assertEquals(sumOfPrimesBelowByRecursive(3), 2L)

  test("sumOfPrimesBelowByRecursive 10"):
    assertEquals(sumOfPrimesBelowByRecursive(10), 17L)

  test("sumOfPrimesBelowByRecursive 100"):
    assertEquals(sumOfPrimesBelowByRecursive(100), 1060L)

  test("sumOfPrimesBelowByRecursive 100 000 "):
    assertEquals(sumOfPrimesBelowByRecursive(10000), 5736396L)

  test("sumOfPrimesBelowByRecursive 2 mln"):
    assertEquals(sumOfPrimesBelowByRecursive(2000000), 142913828922L)

  test("getAllPrimesBelow"):
    assertEquals(getAllPrimesBelow(5), List(2, 3))

  test("getAllPrimesBelow"):
    assertEquals(getAllPrimesBelow(20), List(2, 3, 5, 7, 11, 13, 17, 19))

  test("sumOfList"):
    assertEquals(sumOfList(List(2, 3, 4)), 9L)

  test("summationOfPrimesBelow 5, 10, 100"):
    assertEquals(summationOfPrimesBelow(5), 5L)
    assertEquals(summationOfPrimesBelow(10), 17L)
    assertEquals(summationOfPrimesBelow(100), 1060L)

  test("summationOfPrimesBelow 1000"):
    assertEquals(summationOfPrimesBelow(1000), 76127L)

  test("summationOfPrimesBelow 10 000"):
    assertEquals(summationOfPrimesBelow(10000), 5736396L)

  test("summationOfPrimesBelow 100 000"):
    assertEquals(summationOfPrimesBelow(100000), 454396537L)

  test("summationOfPrimesBelow 2 mln"):
    assertEquals(summationOfPrimesBelow(2000000), 1179908154L)
