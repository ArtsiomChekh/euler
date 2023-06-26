package problems

import munit.FunSuite

class Problem2Test extends FunSuite {

  test("0") {
    assertEquals(Problem2.sumOfEvenValued(0), 0)
  }

  test("2") {
    assertEquals(Problem2.sumOfEvenValued(2), 2)
  }

  test("8 (2, 8)") {
    assertEquals(Problem2.sumOfEvenValued(8), 10)
  }

  test("89 (2, 8, 34)") {
    assertEquals(Problem2.sumOfEvenValued(89), 44)
  }

  test("4000000") {
    assertEquals(Problem2.sumOfEvenValued(4000000), 4613732)
  }


}
