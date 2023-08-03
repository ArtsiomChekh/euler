package problems

/*
 * Special Pythagorean Triplet
 * https://projecteuler.net/problem=9
 */
object P9_SpecialPythagoreanTriplet:
  def productSpecialTriplet(sum: Int): Int =
    val triplets = findTripletsBySum(sum)
    assert(triplets.size == 1, "must be only one triplet")
    triplets.head.product

  def findTripletsBySum(sum: Int): Seq[List[Int]] =
    for
      a <- 1 to sum
      b <- a to sum
      c = sum - a - b
      if isPythagoreanTriplet(a, b, c)
    yield
      List(a, b, c)

  def isPythagoreanTriplet(a: Int, b: Int, c: Int): Boolean =
    square(a) + square(b) == square(c)
end P9_SpecialPythagoreanTriplet

