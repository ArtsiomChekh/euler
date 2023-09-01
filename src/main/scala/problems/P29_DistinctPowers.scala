package problems

/*
 * Distinct Powers
 * https://projecteuler.net/problem=29
 */
object P29_DistinctPowers:
  def distinctPowers(start: Int, end: Int): Int =
    var set = Set[Double]()
    for a <- start to end do
      for b <- start to end do
        var term = math.pow(a, b)
        set += term
    set.size
end P29_DistinctPowers

