package problems

import munit.FunSuite
import problems.P7_10001stPrime.{isPrime, nthPrimeNumber}


class P7_10001stPrimeTest extends FunSuite:
  test("isPrime"):
    assert(isPrime(2))
    assert(isPrime(5))
    assert(isPrime(113))

  test("test1"):
    assertEquals(nthPrimeNumber(2), 3);

