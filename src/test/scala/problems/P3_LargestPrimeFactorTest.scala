package problems

import munit.FunSuite

class P3_LargestPrimeFactorTest extends FunSuite:

  import P3_LargestPrimeFactor.*

  test("2"):
    assertEquals(largestPrimeFactor(2), 2)

  test("10"):
    assertEquals(largestPrimeFactor(10), 5)

  test("13195"):
    assertEquals(largestPrimeFactor(13195), 29)

  test("600851475143"):
    assertEquals(largestPrimeFactor(600851475143L), 6857)

