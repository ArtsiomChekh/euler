package problems

import munit.FunSuite

class P25_1000DigitFibonacciNumberTest extends FunSuite:

  import P25_1000DigitFibonacciNumber._
  test("indexOfNthDigitFibonacciNumber"):
    assertEquals(indexOfNthDigitFibonacciNumber(2), 7)
    assertEquals(indexOfNthDigitFibonacciNumber(3), 12)

  test("indexOfNthDigitFibonacciNumber 1000 digits"):
    assertEquals(indexOfNthDigitFibonacciNumber(1000), 4782)