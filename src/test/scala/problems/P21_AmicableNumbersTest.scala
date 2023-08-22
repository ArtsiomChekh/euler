package problems

import munit.FunSuite

class P21_AmicableNumbersTest extends FunSuite:

  import P21_AmicableNumbers._

  test("sumOfAmicableNumbers"):
    assertEquals(sumOfAmicableNumbers(300), 504)

  test("sumOfNumberDivisorsBelow 4"):
    assertEquals(sumOfNumberDivisorsBelow(4), 3)

  test("sumOfNumberDivisorsBelow 220"):
    assertEquals(sumOfNumberDivisorsBelow(220), 284)

  test("sumOfNumberDivisorsBelow 284"):
    assertEquals(sumOfNumberDivisorsBelow(284), 220)

