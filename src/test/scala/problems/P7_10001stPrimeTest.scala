package problems

import munit.FunSuite

class P7_10001stPrimeTest extends FunSuite:

  import P7_10001stPrime.*

  test("isPrime"):
    assert(isPrime(2))
    assert(isPrime(5))
    assert(isPrime(113))

//  test("test1"):
//    assertEquals(nthPrimeNumber(1), 2)
//    assertEquals(nthPrimeNumber(2), 3)
//    assertEquals(nthPrimeNumber(3), 5)

