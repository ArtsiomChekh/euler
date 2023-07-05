package problems

import problems.P1_MultiplesOf3or5.*

class P1_MultiplesOf3or5Test extends munit.FunSuite:
  test("0, 1, 2, 3"):
    assertEquals(sumOfMultiplesBelow(0), 0)
    assertEquals(sumOfMultiplesBelow(1), 0)
    assertEquals(sumOfMultiplesBelow(2), 0)
    assertEquals(sumOfMultiplesBelow(3), 0)

  test("4,"):
    assertEquals(sumOfMultiplesBelow(4), 3)
    assertEquals(sumOfMultiplesBelow(5), 3)

  test("6"):
    assertEquals(sumOfMultiplesBelow(6), 8)

  test("10"):
    assertEquals(sumOfMultiplesBelow(10), 23)

  test("1000"):
    assertEquals(sumOfMultiplesBelow(1000), 233168)

  //  Recursion
  test("0, 1, 2, 3"):
    assertEquals(sumOfMultiplesBelowByRecursion(0), 0)
    assertEquals(sumOfMultiplesBelowByRecursion(1), 0)
    assertEquals(sumOfMultiplesBelowByRecursion(2), 0)
    assertEquals(sumOfMultiplesBelowByRecursion(3), 0)

  test("4"):
    assertEquals(sumOfMultiplesBelowByRecursion(4), 3)

  test("5"):
    assertEquals(sumOfMultiplesBelowByRecursion(5), 3)

  test("6"):
    assertEquals(sumOfMultiplesBelowByRecursion(6), 8)

  test("10"):
    assertEquals(sumOfMultiplesBelowByRecursion(10), 23)

  test("1000"):
    assertEquals(sumOfMultiplesBelowByRecursion(1000), 233168)

  test("sumOfMultiplesOf3or5BelowByFormula"):
    assertEquals(sumOfMultiplesOf3or5BelowByFormula(1), 0)
    assertEquals(sumOfMultiplesOf3or5BelowByFormula(2), 0)
    assertEquals(sumOfMultiplesOf3or5BelowByFormula(3), 0)
    assertEquals(sumOfMultiplesOf3or5BelowByFormula(5), 3)
    assertEquals(sumOfMultiplesOf3or5BelowByFormula(6), 8)
    assertEquals(sumOfMultiplesOf3or5BelowByFormula(10), 23)
    assertEquals(sumOfMultiplesOf3or5BelowByFormula(1000), 233168)

  test("sumOfMultiplesBelow"):
    assertEquals(sumOfMultiplesBelow(3, 10), 18)
    assertEquals(sumOfMultiplesBelow(5, 15), 15)
    assertEquals(sumOfMultiplesBelow(15, 60), 90)





