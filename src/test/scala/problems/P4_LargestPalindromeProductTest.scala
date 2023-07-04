package problems

import munit.FunSuite
import org.junit.Assert.{assertFalse, assertTrue}
import problems.P4_LargestPalindromeProduct.{isPalindrome, largestPalindromeProduct, reverse}

class P4_LargestPalindromeProductTest extends FunSuite:
  test("121"):
    assertNotEquals(largestPalindromeProduct(), 123)

  test("9009"):
    assertNotEquals(largestPalindromeProduct(), 9009)

  test("largest Palindrome 906609"):
    assertEquals(largestPalindromeProduct(), 906609)

  //isPalindrome
  test("0"):
    assertTrue(isPalindrome(0))

  test("1"):
    assertTrue(isPalindrome(1))

  test("12"):
    assertFalse(isPalindrome(12))

  test("121221"):
    assertFalse(isPalindrome(121221))

  test("906609"):
    assertTrue(isPalindrome(906609))

  test("reverse"):
    assertEquals(reverse(123), 321)
    assertEquals(reverse(123512), 215321)
    assertEquals(reverse(906609), 906609)

