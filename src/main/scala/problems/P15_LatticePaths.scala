package problems

/*
 * Lattice Paths
 * https://projecteuler.net/problem=15
 */
object P15_LatticePaths:
  def routesCount(gridSize: Int): BigInt =
    val n = gridSize * 2
    val k = gridSize

    bigFactorial(n) / (bigFactorial(k) * bigFactorial(n - k))
end P15_LatticePaths
