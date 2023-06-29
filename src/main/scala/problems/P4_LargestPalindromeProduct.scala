package problems

/*
 * Largest Palindrome Product
 * https://projecteuler.net/problem=4
 */

object P4_LargestPalindromeProduct:
  def largestPalindromeProduct(): Int =
    var largestPalindrome = 0
    for x: Int <- 100 until 999 by +1 do
      for y: Int <- 999 until 100 by -1 do
        val prePal = x * y
        if prePal % 10 == prePal % 1000000 / 100000
          && prePal % 100 / 10 == prePal % 100000 / 10000
          && prePal % 1000 / 100 == prePal % 10000 / 1000 then
          if largestPalindrome < prePal then
            largestPalindrome = prePal
    largestPalindrome
end P4_LargestPalindromeProduct

