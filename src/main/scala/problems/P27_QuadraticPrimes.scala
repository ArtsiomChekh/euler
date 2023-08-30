package problems

/*
 * Quadratic Primes
 * https://projecteuler.net/problem=27
 */
object P27_QuadraticPrimes:
  def productOfTheCoefficients(limit: Int): Int =
    var max = 0
    var maxA = 0
    var maxB = 0
    for a <- -limit until limit do
      for b <- -limit to limit do
        val count = primesCounter(a, b)
        if count > max then
          max = count
          maxA = a
          maxB = b
    maxA * maxB

  def primesCounter(a: Int, b: Int): Int =
    var i = 0
    while true do
      val n = i * i + i * a + b
      if n < 0 || !isPrime(n) then
        return i
      i += 1
    0
end P27_QuadraticPrimes






