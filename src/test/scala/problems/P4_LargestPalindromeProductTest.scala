package problems

import munit.FunSuite
import problems.P4_LargestPalindromeProduct.largestPalindromeProduct

class P4_LargestPalindromeProductTest extends FunSuite:
  test("121"):
    assertNotEquals(largestPalindromeProduct(), 123)

  test("9009"):
    assertNotEquals(largestPalindromeProduct(), 9009)

  test("largest Palindrome 906609"):
    assertEquals(largestPalindromeProduct(), 906609)

