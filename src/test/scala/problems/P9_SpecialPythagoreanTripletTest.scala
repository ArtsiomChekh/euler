package problems

import munit.FunSuite

class P9_SpecialPythagoreanTripletTest extends FunSuite:

  import P9_SpecialPythagoreanTriplet.*

  test("productSpecialTriplet 12"):
    assertEquals(productSpecialTriplet(12), 60)

  test("productSpecialTriplet 24"):
      assertEquals(productSpecialTriplet(24), 480)

  test("productSpecialTriplet 1000"):
    assertEquals(productSpecialTriplet(1000), 31875000)

  test("isPythagoreanTriplet"):
    assert(isPythagoreanTriplet(3, 4, 5))
    assert(isPythagoreanTriplet(9, 12, 15))
    assert(isPythagoreanTriplet(12, 16, 20))

    assert(!isPythagoreanTriplet(3, 4, 6))
    assert(!isPythagoreanTriplet(5, 8, 9))
    assert(!isPythagoreanTriplet(12, 20, 16))

  test("findTripletBySum"):
    assertEquals(findTripletBySum(12), List(3, 4, 5))
    assertEquals(findTripletBySum(48), List(12, 16, 20))
    assertEquals(findTripletBySum(1000), List(200, 375, 425))

  test("product"):
    assertEquals(product(List(200, 375, 425)), 31875000)





