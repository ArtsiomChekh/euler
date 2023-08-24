package problems

import munit.FunSuite

class P21_AmicableNumbersTest extends FunSuite:

  import P21_AmicableNumbers._
  
  test("isAmicable 220, 284"):
    assert(isAmicable(220, 284))

  test("isAmicable 1184, 1210"):
    assert(isAmicable(1184, 1210))

  test("isAmicable 1000, 2000 (false)"):
    assert(!isAmicable(1000, 2000))

  test("sumOfAmicableNumbers under 300"):
    assertEquals(sumOfAmicableNumbers(300), 504)

  test("sumOfAmicableNumbers under 1500"):
    assertEquals(sumOfAmicableNumbers(1500), 2898)

  test("sumOfAmicableNumbers under 10000"):
    assertEquals(sumOfAmicableNumbers(10000), 31626)

