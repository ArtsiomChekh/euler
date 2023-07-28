package problems

import munit.FunSuite

class P11_LargestProductInAGridTest extends FunSuite:

  import P11_LargestProductInAGrid.*

  test("String to matrix20X20"):
    assertEquals(stringToMatrix20X20(grid).length, 20)



