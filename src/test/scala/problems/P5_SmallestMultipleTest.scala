package problems

import munit.FunSuite
import problems.P5_SmallestMultiple.smallestMultiple

class P5_SmallestMultipleTest extends FunSuite:
  test("test 1"):
    assertEquals(smallestMultiple(1, 2), 2)


