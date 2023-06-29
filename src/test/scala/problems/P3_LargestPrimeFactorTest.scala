package problems

import munit.FunSuite
import problems.P3_LargestPrimeFactor.largestPrimeFactor

class P3_LargestPrimeFactorTest extends FunSuite:
  test("0"): 
    assertEquals(largestPrimeFactor(0), 0)
  
  test("10"): 
    assertEquals(largestPrimeFactor(10), 5)

  test("13195"): 
    assertEquals(largestPrimeFactor(13195), 29)
  
  test("600851475143"): 
    assertEquals(largestPrimeFactor(600851475143L), 6857)

