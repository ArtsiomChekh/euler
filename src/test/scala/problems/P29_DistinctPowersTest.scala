package problems

import munit.FunSuite

class P29_DistinctPowersTest extends FunSuite:

  import P29_DistinctPowers._

  test("distinctPowers 1 2"):
    assertEquals(distinctPowers(1, 2), 3)

  test("distinctPowers 2 5"):
    assertEquals(distinctPowers(2, 5), 15)

  test("distinctPowers 2 100"):
    assertEquals(distinctPowers(2, 100), 9183)

