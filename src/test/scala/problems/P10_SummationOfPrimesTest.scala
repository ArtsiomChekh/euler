package problems

import munit.FunSuite

class P10_SummationOfPrimesTest extends FunSuite:

  import P10_SummationOfPrimes.*

  test("sumOfPrimesBelowByRecursive 3"):
    assertEquals(sumOfPrimesBelowByRecursive(3), 2L)

  test("sumOfPrimesBelowByRecursive 10"):
    assertEquals(sumOfPrimesBelowByRecursive(10), 2 + 3 + 5 + 7L)

  test("sumOfPrimesBelowByRecursive 100"):
    assertEquals(sumOfPrimesBelowByRecursive(100), 1060L)

  test("sumOfPrimesBelowByRecursive 2 mln"):
    assertEquals(sumOfPrimesBelowByRecursive(2000000), 142913828922L)

  test("getAllPrimesBelow"):
    assertEquals(getAllPrimesBelow(5), List(2, 3))

  test("getAllPrimesBelow"):
    assertEquals(getAllPrimesBelow(20), List(2, 3, 5, 7, 11, 13, 17, 19))

  test("sumOfList"):
    assertEquals(sumOfList(List(2, 3, 4)), 9)

  test("summationOfPrimesBelow"):
    assertEquals(summationOfPrimesBelow(5), 5)

//  test("summationOfPrimesBelow"):
//    assertEquals(sumOfList(getAllPrimesBelow(2000000)), 17)
