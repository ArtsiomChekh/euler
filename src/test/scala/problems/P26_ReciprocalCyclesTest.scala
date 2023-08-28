package problems

import munit.FunSuite

class P26_ReciprocalCyclesTest extends FunSuite:
  import  P26_ReciprocalCycles._

  test("test 1/2 -> 0.5"):
    assertEquals(cycleLength(2), 0)

  test("test 1/3 -> 0.(3)"):
    assertEquals(cycleLength(3), 1)

  test("test 1/6 -> 0.1(6)"):
    assertEquals(cycleLength(6), 1)

  test("test 1/7 -> 0.(142857)"):
    assertEquals(cycleLength(7), 6)

  test("denominatorWithLongestRecurringCycle 10"):
    assertEquals(denominatorWithLongestRecurringCycle(10), 7)

  test("denominatorWithLongestRecurringCycle 100"):
    assertEquals(denominatorWithLongestRecurringCycle(100), 97)

  test("denominatorWithLongestRecurringCycle 1000"):
    assertEquals(denominatorWithLongestRecurringCycle(1000), 983)

