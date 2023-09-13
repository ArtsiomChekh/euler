package problems

import munit.FunSuite

class P11_LargestProductInAGridTest extends FunSuite:

  import P11_LargestProductInAGrid.*

  val stringData: String = readFile("src/main/resources/db/P11")
  val arrayGrid: Array[Int] = convertStringWithSpacesToArray(stringData)
  val matrixGrid: Array[Array[Int]] = arrayGrid.grouped(20).toArray

  var testGrid: Array[Array[Int]] =
    ("05 02 03 04 05 03 04 05 01 02 01 02 03 04 05 03 04 05 01 02 " +
      "05 02 03 04 05 03 04 05 01 02 01 02 03 04 05 03 04 05 01 02 " +
      "05 02 03 04 05 03 04 05 01 02 01 02 03 04 05 03 04 05 01 02 " +
      "05 02 03 04 05 03 04 05 01 02 01 02 03 04 05 03 04 05 01 02 " +
      "05 02 03 04 05 03 04 05 01 02 01 02 03 04 05 03 04 05 01 02 " +
      "05 02 03 04 05 03 04 05 01 02 01 02 03 04 05 03 04 05 01 02 " +
      "05 02 03 04 05 03 04 05 01 02 01 02 03 04 05 03 04 05 01 02 ").
      split(" ").map(_.toInt).grouped(20).toArray

  test("descendingDiagonal for testGrid"):
    assertEquals(descendingDiagonal(testGrid, 2, 2, 4), Seq(3, 4, 5, 3))
    assertEquals(descendingDiagonal(testGrid, 2, 2, 4).product, 180)
    assertEquals(descendingDiagonal(testGrid, 3, 4, 4).product, 300)

  test("ascendingDiagonal for testGrid"):
    assertEquals(ascendingDiagonal(testGrid, 3, 2, 4), Seq(3, 4, 5, 3))
    assertEquals(ascendingDiagonal(testGrid, 3, 2, 4).product, 180)
    assertEquals(ascendingDiagonal(testGrid, 3, 3, 4).product, 240)

  test("vertical for testGrid"):
    assertEquals(vertical(testGrid, 1, 5, 4), Seq(3, 3, 3, 3))
    assertEquals(vertical(testGrid, 1, 5, 4).product, 81)
    assertEquals(vertical(testGrid, 0, 6, 4).product, 256)

  test("horizontal for testGrid"):
    assertEquals(horizontal(testGrid, 2, 3, 4), Seq(4, 5, 3, 4))
    assertEquals(horizontal(testGrid, 2, 3, 4).product, 240)
    assertEquals(horizontal(testGrid, 4, 2, 4).product, 180)

  test("maxProduct for testGrid"):
    assertEquals(maxProduct(testGrid, 4), 625)

  test("descendingDiagonal for matrixGrid"):
    assertEquals(descendingDiagonal(matrixGrid, 6, 8, 4).product, 1788696)

  test("maxProduct for matrixGrid"):
    assertEquals(maxProduct(matrixGrid, 4), 70600674)












