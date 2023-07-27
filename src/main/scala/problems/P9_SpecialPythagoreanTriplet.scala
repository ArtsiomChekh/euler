package problems

/*
 * Special Pythagorean Triplet
 * https://projecteuler.net/problem=9
 */
object P9_SpecialPythagoreanTriplet:
  def productSpecialTriplet(n: Int): Int =
    var res = 0
    for a <- 1 to n do
      for b <- a to n do
        val c = n - a - b
        if isPythagoreanTriple(a, b, c) then
          res = a * b * c
    res

  def isPythagoreanTriple(a: Int, b: Int, c: Int): Boolean =
    square(a) + square(b) == square(c)
end P9_SpecialPythagoreanTriplet
