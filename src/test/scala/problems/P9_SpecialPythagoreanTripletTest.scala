package problems

import munit.FunSuite

class P9_SpecialPythagoreanTripletTest extends FunSuite:

  import P9_SpecialPythagoreanTriplet.*

  test("test 12"):
    assertEquals(productSpecialTriplet(12), 60)

  test("test 24"):
      assertEquals(productSpecialTriplet(24), 480)

  test("test 1000"):
    assertEquals(productSpecialTriplet(1000), 31875000)

  test("isPythagoreanTriple"):
    assert(isPythagoreanTriple(3, 4, 5))
    assert(isPythagoreanTriple(9, 12, 15))
    assert(isPythagoreanTriple(12, 16, 20))

    assert(!isPythagoreanTriple(3, 4, 6))
    assert(!isPythagoreanTriple(5, 8, 9))
    assert(!isPythagoreanTriple(12, 20, 16))





