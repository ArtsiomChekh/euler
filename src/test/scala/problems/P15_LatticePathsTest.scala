package problems

import munit.FunSuite

class P15_LatticePathsTest extends FunSuite:

  import P15_LatticePaths.*

  val grid2X2: Seq[Seq[Int]] = Seq.fill(2, 2)(0)
  val grid4X4: Seq[Seq[Int]] = Seq.fill(4, 4)(0)
  val grid20X20: Seq[Seq[Int]] = Seq.fill(20, 20)(0)

  test("routesCount 2X2"):
    assertEquals(routesCount(grid2X2.size), BigInt(6))

  test("routesCount grid4X4"):
    assertEquals(routesCount(grid4X4.size), BigInt(70))

  test("routesCount grid20X20"):
    assertEquals(routesCount(grid20X20.size), BigInt("137846528820"))