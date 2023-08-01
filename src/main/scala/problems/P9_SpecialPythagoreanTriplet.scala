package problems

/*
 * Special Pythagorean Triplet
 * https://projecteuler.net/problem=9
 */
object P9_SpecialPythagoreanTriplet:
  def productSpecialTriplet(sum: Int): Int =
    product(findTripletBySum(sum))

  def findTripletBySum(sum: Int): List[Int] =
    var triplet = List[Int]()
    for (a <- 1 to sum; b <- a to sum)
      val c = sum - a - b
      if isPythagoreanTriplet(a, b, c) then
        triplet = triplet ++ List(a, b, c)
    triplet

  def product(triplet: List[Int]): Int = triplet.product

  def isPythagoreanTriplet(a: Int, b: Int, c: Int): Boolean =
    square(a) + square(b) == square(c)
end P9_SpecialPythagoreanTriplet
