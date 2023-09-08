package problems

/*
 * Largest Product in a Grid
 * https://projecteuler.net/problem=11
 */
object P11_LargestProductInAGrid:
  def descendingDiagonal(grid: Array[Array[Int]], r: Int, c: Int, n: Int): Int =
    (0 until n).foldLeft(1)((product, i) =>
      val cell = if (r + i < grid.length && c + i < grid(r + i).length) grid(r + i)(c + i) else 0
      product * cell
    )

  def ascendingDiagonal(grid: Array[Array[Int]], r: Int, c: Int, n: Int): Int =
    (0 until n).foldLeft(1)((product, i) =>
      val cell = if (r - i >= 0 && c + i < grid(r - i).length) grid(r - i)(c + i) else 0
      product * cell
    )

  def vertical(grid: Array[Array[Int]], r: Int, c: Int, n: Int): Int =
    (0 until n).foldLeft(1)((product, i) =>
      val cell = grid(r + i)(c)
      product * cell
    )

  def horizontal(grid: Array[Array[Int]], r: Int, c: Int, n: Int): Int =
    (0 until n).foldLeft(1)((product, i) =>
      val cell = grid(r)(c + i)
      product * cell
    )

  def maxProduct(grid: Array[Array[Int]], n: Int): Int =
    var max_found = 0
    for r <- 0 to grid.length - n
        c <- 0 to grid(0).length - n do
      val new_max = List(horizontal(grid, r, c, n), vertical(grid, r, c, n),
        descendingDiagonal(grid, r, c, n), ascendingDiagonal(grid, r, c, n)).max
      if new_max > max_found then
        max_found = new_max
    max_found
end P11_LargestProductInAGrid

