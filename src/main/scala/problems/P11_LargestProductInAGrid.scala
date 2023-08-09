package problems

/*
 * Largest Product in a Grid
 * https://projecteuler.net/problem=11
 */
object P11_LargestProductInAGrid:
  def descendingDiagonal(grid: Array[Array[Int]], r: Int, c: Int): Int = {
    val cell1 = grid(r)(c)
    val cell2 = grid(r + 1)(c + 1)
    val cell3 = grid(r + 2)(c + 2)
    val cell4 = grid(r + 3)(c + 3)
    cell1 * cell2 * cell3 * cell4
  }

  def ascendingDiagonal(grid: Array[Array[Int]], r: Int, c: Int): Int = {
    val cell1 = grid(r)(c)
    val cell2 = grid(grid.length - r - 1)(c + 1)
    val cell3 = grid(grid.length - r - 2)(c + 2)
    val cell4 = grid(grid.length - r - 3)(c + 3)
    cell1 * cell2 * cell3 * cell4
  }

  def vertical(grid: Array[Array[Int]], r: Int, c: Int): Int = {
    val cell1 = grid(r)(c)
    val cell2 = grid(r + 1)(c)
    val cell3 = grid(r + 2)(c)
    val cell4 = grid(r + 3)(c)
    cell1 * cell2 * cell3 * cell4
  }

  def horizontal(grid: Array[Array[Int]], r: Int, c: Int): Int = {
    val cell1 = grid(r)(c)
    val cell2 = grid(r)(c + 1)
    val cell3 = grid(r)(c + 2)
    val cell4 = grid(r)(c + 3)
    cell1 * cell2 * cell3 * cell4
  }

  def maxProduct(grid: Array[Array[Int]]): Int =
    var max_found = 0
    for (r <- 0 to grid.length - 4) {
      for (c <- 0 to grid(0).length - 4) {
        val new_max = List(horizontal(grid, r, c), vertical(grid, r, c),
          descendingDiagonal(grid, r, c), ascendingDiagonal(grid, r, c)).max
        if (new_max > max_found) {
          max_found = new_max
        }
      }
    }
    max_found

