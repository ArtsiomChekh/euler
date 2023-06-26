package problems

import problems.Problem1.*


class Problem1Test extends munit.FunSuite {

  test("0, 1, 2, 3") {
    assertEquals(sumOfMultiples(0), 0)
    assertEquals(sumOfMultiples(1), 0)
    assertEquals(sumOfMultiples(2), 0)
    assertEquals(sumOfMultiples(3), 0)
  }

  test("4,") {
    assertEquals(sumOfMultiples(4), 3)
    assertEquals(sumOfMultiples(5), 3)
  }

  test("6") {
    assertEquals(sumOfMultiples(6), 8)
  }

  test("10") {
    assertEquals(sumOfMultiples(10), 23)
  }

  test("1000") {
    assertEquals(sumOfMultiples(1000), 233168)
  }

  //  Recursion
  test("0, 1, 2, 3") {
    assertEquals(sumOfMultiplesByRecursion(0), 0)
    assertEquals(sumOfMultiplesByRecursion(1), 0)
    assertEquals(sumOfMultiplesByRecursion(2), 0)
    assertEquals(sumOfMultiplesByRecursion(3), 0)
  }

  test("4") {
    assertEquals(sumOfMultiplesByRecursion(4), 3)
  }

  test("5") {
    assertEquals(sumOfMultiplesByRecursion(5), 3)
  }

  test("6") {
    assertEquals(sumOfMultiplesByRecursion(6), 8)
  }

  test("10") {
    assertEquals(sumOfMultiplesByRecursion(10), 23)
  }

  test("1000") {
    assertEquals(sumOfMultiplesByRecursion(1000), 233168)
  }

}
