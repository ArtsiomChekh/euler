package problems

import munit.FunSuite

class P32_PandigitalProductsTest extends FunSuite:

  import P32_PandigitalProducts._

  test("isPandigital"):
    assert(isPandigital(39, 186, 7254))
    assert(!isPandigital(39, 186, 1111))


