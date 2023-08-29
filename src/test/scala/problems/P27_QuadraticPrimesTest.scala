package problems

import munit.FunSuite

class P27_QuadraticPrimesTest extends FunSuite:

  import P27_QuadraticPrimes._

  test("primesCounter 40 primes"):
    assertEquals(primesCounter(1, 41), 40)

  test("quadraticForm"):
    assertEquals(quadraticForm(3, 1, 5), 17)