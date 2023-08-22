package problems

import munit.FunSuite

class P21_AmicableNumbersTest extends FunSuite:

  import P21_AmicableNumbers._

  test("sumOfAmicableNumbers"):
    assertEquals(sumOfAmicableNumbers(300), 504)

  test("numberDivisorsBelow 4"):
    assertEquals(numberDivisorsBelow(4), List(1, 2))

  test("numberDivisorsBelow 220"):
    assertEquals(numberDivisorsBelow(220), List(1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110))

  test("numberDivisorsBelow 284"):
    assertEquals(numberDivisorsBelow(284), List(1, 2, 4, 71, 142))

