package problems

import munit.FunSuite

class P19_CountingSundaysTest extends FunSuite:

  import P19_CountingSundays._

  test("countSundays"):
    assertEquals(countSundays(1901, 1902), 23)

  test("isLeapYear 2000"):
    assert(isLeapYear(2000))

  test("isLeapYear 2024"):
    assert(isLeapYear(2024))

  test("isLeapYear 1900"):
    assert(!isLeapYear(1900))

  test("isLeapYear 1901"):
    assert(!isLeapYear(1901))