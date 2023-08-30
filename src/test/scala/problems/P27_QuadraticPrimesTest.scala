package problems

import munit.FunSuite

class P27_QuadraticPrimesTest extends FunSuite:

  import P27_QuadraticPrimes._

  test("primesCounter 40 primes"):
    assertEquals(primesCounter(1, 41), 40)

  test("primesCounter 80 primes"):
    assertEquals(primesCounter(-79, 1601), 80)

  test("productOfTheCoefficients"):
    assertEquals(productOfTheCoefficients(1000), -59231)