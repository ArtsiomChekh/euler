package problems

/*
 * Largest Product in a Grid
 * https://projecteuler.net/problem=11
 */
object P11_LargestProductInAGrid:
  def largestProductInAGrid(grid: String, n: Int): Int =
    val largestLR = largestLeftRightDirection(grid, n)
    val largestUD = largestUpDownDirection(grid, n)
    val largestDAD = largestDescendingAscendingDiagonalDirection(grid, n)

    List(largestLR, largestUD, largestDAD).max

  def largestLeftRightDirection(grid: String, n: Int): Int =
    val matrix = arrayToMatrix20X20(grid)
    var largestProduct = 0

    for row <- matrix.indices do
      for column <- matrix(0).indices do
        val cell = matrix(row)(column)
        var product = cell
        for i <- 1 until n do
          if column + i < matrix(0).length then
            product = product * matrix(row)(column + i)
        if product > largestProduct then
          largestProduct = product

    largestProduct

  def largestUpDownDirection(grid: String, n: Int): Int =
    val matrix = arrayToMatrix20X20(grid)
    var largestProduct = 0

    for row <- matrix.indices do
      for column <- matrix(0).indices do
        val cell = matrix(row)(column)
        var product = cell
        for i <- 1 until n do
          if row + i < matrix.length then
            product = product * matrix(row + i)(column)
        if product > largestProduct then
          largestProduct = product

    largestProduct

  def largestDescendingAscendingDiagonalDirection(grid: String, n: Int): Int =
    val matrix = arrayToMatrix20X20(grid)
    var largestProduct = 0

    for row <- matrix.indices do
      for column <- matrix(0).indices do
        val cell = matrix(row)(column)
        var product = cell
        for i <- 1 until n do
          if row + i < matrix.length && column + i < matrix(0).length then
            product = product * matrix(row + i)(column + i)
        if product > largestProduct then
          largestProduct = product

        product = cell
        for i <- 1 until n do
          if row - i < matrix.length && row - i >= 0 && column + i < matrix(0).length then
            product = product * matrix(row - i)(column + i)
        if product > largestProduct then
          largestProduct = product

    largestProduct

  def stringToArray(str: String): Array[Int] =
    str.split(" ").map(_.toInt)

  def arrayToMatrix20X20(str: String): Array[Array[Int]] =
    stringToArray(str).grouped(20).toArray
end P11_LargestProductInAGrid


