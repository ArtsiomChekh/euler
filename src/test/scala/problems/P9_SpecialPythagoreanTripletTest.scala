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

  test("must be only one triplet"):
    intercept[AssertionError] {
      productSpecialTriplet(60)
    }

  test("isPythagoreanTriplet"):
    assert(isPythagoreanTriplet(3, 4, 5))
    assert(isPythagoreanTriplet(9, 12, 15))
    assert(isPythagoreanTriplet(12, 16, 20))

    assert(!isPythagoreanTriplet(3, 4, 6))
    assert(!isPythagoreanTriplet(5, 8, 9))
    assert(!isPythagoreanTriplet(12, 20, 16))

  test("findTripletBySum 12, 48, 1000"):
    assertEquals(findTripletsBySum(12), Seq(List(3, 4, 5)))
    assertEquals(findTripletsBySum(48), Seq(List(12, 16, 20)))
    assertEquals(findTripletsBySum(1000), Seq(List(200, 375, 425)))

  test("findTripletBySum 0, 60, 120, 720"):
    assertEquals(findTripletsBySum(0), Nil)
    assertEquals(findTripletsBySum(60), Seq(List(10, 24, 26), List(15, 20, 25)))
    assertEquals(findTripletsBySum(60), Seq(List(10, 24, 26), List(15, 20, 25)))
    assertEquals(findTripletsBySum(720), Seq(List(45, 336, 339), List(72, 320, 328), List(80, 315, 325),
      List(120, 288, 312), List(144, 270, 306), List(180, 240, 300)))








