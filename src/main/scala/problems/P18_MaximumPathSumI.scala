package problems

/*
 * Maximum Path Sum I
 * https://projecteuler.net/problem=18
 */
object P18_MaximumPathSumI:
  def maxPathSum(triangle: Array[Array[Int]]): Int =
    for row <- triangle.length - 2 to 0 by -1 do
      for col <- triangle(row).indices do
        triangle(row)(col) += Math.max(triangle(row + 1)(col), triangle(row + 1)(col + 1))
    triangle(0).head
end P18_MaximumPathSumI
