package problems

import munit.FunSuite

class P28_NumberSpiralDiagonalsTest extends FunSuite:

  import P28_NumberSpiralDiagonals._

  test("sumOfDiagonalsNumbs 3"):
    assertEquals(sumOfDiagonalsNumbs(3), 25)

  test("sumOfDiagonalsNumbs 5"):
    assertEquals(sumOfDiagonalsNumbs(5), 101)

  test("sumOfDiagonalsNumbs 1001"):
    assertEquals(sumOfDiagonalsNumbs(1001), 669171001)