package problems

import munit.FunSuite
import problems.Problem4.largestPalindromeProduct

class Problem4Test extends FunSuite {

  test("121") {
    assertNotEquals(largestPalindromeProduct(), 123)
  }

  test("9009") {
    assertNotEquals(largestPalindromeProduct(), 9009)
  }

  test("largest Palindrome 906609") {
    assertEquals(largestPalindromeProduct(), 906609)
  }

}
