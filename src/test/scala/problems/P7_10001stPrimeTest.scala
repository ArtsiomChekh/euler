package problems

import munit.FunSuite

class P7_10001stPrimeTest extends FunSuite:

  import P7_10001stPrime.*

  test("isPrime"):
    assert(isPrime(2))
    assert(isPrime(3))
    assert(isPrime(5))
    assert(isPrime(89))
    assert(isPrime(113))
    assert(isPrime(271))
    assert(isPrime(7211537))

  test("isPrimeNumber"):
    assert(isPrimeNumber(2))
    assert(isPrimeNumber(3))
    assert(isPrimeNumber(5))
    assert(isPrimeNumber(89))
    assert(isPrimeNumber(113))
    assert(isPrimeNumber(271))
    assert(isPrimeNumber(7211537))

  test("nthPrimeNumber"):
    assertEquals(nthPrimeNumber(1), 2)
    assertEquals(nthPrimeNumber(2), 3)
    assertEquals(nthPrimeNumber(3), 5)
    assertEquals(nthPrimeNumber(6), 13)
    assertEquals(nthPrimeNumber(10001), 104743)

  test("nthPrimeNumberByRecursion"):
    assertEquals(nthPrimeNumberByRecursion(1), 2)
    assertEquals(nthPrimeNumberByRecursion(2), 3)
    assertEquals(nthPrimeNumberByRecursion(3), 5)
    assertEquals(nthPrimeNumberByRecursion(6), 13)
    assertEquals(nthPrimeNumberByRecursion(10001), 104743)

