package problems

import munit.FunSuite

class P19_CountingSundaysTest extends FunSuite:

  import P19_CountingSundays._

  test("countSundays"):
    assertEquals(countSundays(1901, 1902), 23)