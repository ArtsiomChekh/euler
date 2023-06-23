package problems

import problems.Problem1.sumOfMultiples


class Problem1Suite extends munit.FunSuite {

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


}
