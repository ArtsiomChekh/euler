package problems

/*
 * Largest Product in a Grid
 * https://projecteuler.net/problem=11
 */
object P11_LargestProductInAGrid:
  def largestProductInAGrid(grid: Array[Array[Int]], n: Int): Int =
    val largestLR = largestLeftRightDirection(grid, n)
    val largestUD = largestUpDownDirection(grid, n)
    val largestDAD = largestDescendingAscendingDiagonalDirection(grid, n)

    List(largestLR, largestUD, largestDAD).max

  def largestLeftRightDirection(grid: Array[Array[Int]], n: Int): Int =
    var largestProduct = 0

    for row <- grid.indices do
      for column <- grid(0).indices do
        val cell = grid(row)(column)
        var product = cell
        for i <- 1 until n do
          if column + i < grid(0).length then
            product = product * grid(row)(column + i)
        if product > largestProduct then
          largestProduct = product

    largestProduct

  def largestUpDownDirection(grid: Array[Array[Int]], n: Int): Int =
    var largestProduct = 0

    for row <- grid.indices do
      for column <- grid(0).indices do
        val cell = grid(row)(column)
        var product = cell
        for i <- 1 until n do
          if row + i < grid.length then
            product = product * grid(row + i)(column)
        if product > largestProduct then
          largestProduct = product

    largestProduct

  def largestDescendingAscendingDiagonalDirection(grid: Array[Array[Int]], n: Int): Int =
    var largestProduct = 0

    for row <- grid.indices do
      for column <- grid(0).indices do
        val cell = grid(row)(column)
        var product = cell
        for i <- 1 until n do
          if row + i < grid.length && column + i < grid(0).length then
            product = product * grid(row + i)(column + i)
        if product > largestProduct then
          largestProduct = product

        product = cell
        for i <- 1 until n do
          if row - i < grid.length && row - i >= 0 && column + i < grid(0).length then
            product = product * grid(row - i)(column + i)
        if product > largestProduct then
          largestProduct = product

    largestProduct
end P11_LargestProductInAGrid


