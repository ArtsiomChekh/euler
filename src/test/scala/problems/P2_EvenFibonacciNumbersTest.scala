package problems

import munit.FunSuite

class P2_EvenFibonacciNumbersTest extends FunSuite:

  import P2_EvenFibonacciNumbers.*

  test("0"):
    assertEquals(sumOfEvenFibonacciNumbers(0), 0)

  test("2"):
    assertEquals(sumOfEvenFibonacciNumbers(2), 2)

  test("8 (2, 8)"):
    assertEquals(sumOfEvenFibonacciNumbers(8), 10)

  test("89 (2, 8, 34)"):
    assertEquals(sumOfEvenFibonacciNumbers(89), 44)

  test("4000000"):
    assertEquals(sumOfEvenFibonacciNumbers(4000000), 4613732)

  test("tail recursion"):
    assertEquals(sumOfEvenFibonacciNumbersByTailRec(0), 0)
    assertEquals(sumOfEvenFibonacciNumbersByTailRec(2), 2)
    assertEquals(sumOfEvenFibonacciNumbersByTailRec(8), 10)
    assertEquals(sumOfEvenFibonacciNumbersByTailRec(89), 44)
    assertEquals(sumOfEvenFibonacciNumbersByTailRec(4000000), 4613732)





