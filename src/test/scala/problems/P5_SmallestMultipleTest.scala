package problems

import munit.FunSuite
import problems.P5_SmallestMultiple.{gcd, lcm, smallestMultiple}

class P5_SmallestMultipleTest extends FunSuite:

  test("gcd"):
    assertEquals(gcd(1, 2), 1)
    assertEquals(gcd(4, 6), 2)
    assertEquals(gcd(5, 7), 1)
    assertEquals(gcd(9, 12), 3)

  test("lcm"):
    assertEquals(lcm(1, 2), 2)
    assertEquals(lcm(3, 5), 15)
    assertEquals(lcm(5, 7), 35)
    assertEquals(lcm(9, 12), 36)

  test("smallestMultiple"):
    assertEquals(smallestMultiple(1, 2), 2)
    assertEquals(smallestMultiple(1, 5), 60)
    assertEquals(smallestMultiple(10, 12), 660)
    assertEquals(smallestMultiple(1, 10), 2520)
    assertEquals(smallestMultiple(1, 20), 232792560)


