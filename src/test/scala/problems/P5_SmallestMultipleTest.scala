package problems

import munit.FunSuite

class P5_SmallestMultipleTest extends FunSuite:

  import P5_SmallestMultiple.*

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
    assertEquals(lcm(12252240, 19), 232792560)
    assertEquals(lcm(232792560, 20), 232792560)


  test("smallestMultiple"):
    assertEquals(smallestMultiple(1, 2), 2)
    assertEquals(smallestMultiple(1, 5), 60)
    assertEquals(smallestMultiple(10, 12), 660)
    assertEquals(smallestMultiple(1, 10), 2520)
    assertEquals(smallestMultiple(1, 20), 232792560)


