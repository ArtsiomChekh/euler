package problems

import munit.FunSuite

class P19_CountingSundaysTest extends FunSuite:

  import P19_CountingSundays._

  test("countSundays 1901-1902"):
    assertEquals(countSundays(1901, 1902), 3)

  test("countSundays 1902"):
    assertEquals(countSundays(1902, 1902), 1)

  test("countSundays 1901-2000"):
    assertEquals(countSundays(1901, 2000), 171)

  test("isLeapYear 2000"):
    assert(isLeapYear(2000))

  test("isLeapYear 2024"):
    assert(isLeapYear(2024))

  test("isLeapYear 1900"):
    assert(!isLeapYear(1900))

  test("isLeapYear 1901"):
    assert(!isLeapYear(1901))