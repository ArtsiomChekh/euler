package problems

/*
 * Largest Product in a Grid
 * https://projecteuler.net/problem=11
 */
object P11_LargestProductInAGrid:
  def descendingDiagonal(grid: Array[Array[Int]], r: Int, c: Int, n: Int): Seq[Int] =
    (0 until n).map(i => if r + i < grid.length && c + i < grid(r + i).length then grid(r + i)(c + i) else 0)

  def ascendingDiagonal(grid: Array[Array[Int]], r: Int, c: Int, n: Int): Seq[Int] =
    (0 until n).map(i => if r - i >= 0 && c + i < grid(r - i).length then grid(r - i)(c + i) else 0)

  def vertical(grid: Array[Array[Int]], r: Int, c: Int, n: Int): Seq[Int] =
    (0 until n).map(i => grid(r + i)(c))

  def horizontal(grid: Array[Array[Int]], r: Int, c: Int, n: Int): Seq[Int] =
    (0 until n).map(i => grid(r)(c + i))

  def maxProduct(grid: Array[Array[Int]], n: Int): Int =
    var listOfMax = Seq[Int]()
    for r <- 0 to grid.length - n
        c <- 0 to grid(0).length - n do
      listOfMax = listOfMax ++ List(horizontal(grid, r, c, n), vertical(grid, r, c, n),
        descendingDiagonal(grid, r, c, n), ascendingDiagonal(grid, r, c, n)
      ).map(_.product)
    listOfMax.max
end P11_LargestProductInAGrid