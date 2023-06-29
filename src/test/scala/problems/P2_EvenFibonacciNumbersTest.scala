package problems

import munit.FunSuite

class P2_EvenFibonacciNumbersTest extends FunSuite:
  test("0"):
    assertEquals(P2_EvenFibonacciNumbers.sumOfEvenValued(0), 0)

  test("2"):
    assertEquals(P2_EvenFibonacciNumbers.sumOfEvenValued(2), 2)

  test("8 (2, 8)"):
    assertEquals(P2_EvenFibonacciNumbers.sumOfEvenValued(8), 10)

  test("89 (2, 8, 34)"):
    assertEquals(P2_EvenFibonacciNumbers.sumOfEvenValued(89), 44)

  test("4000000"):
    assertEquals(P2_EvenFibonacciNumbers.sumOfEvenValued(4000000), 4613732)




