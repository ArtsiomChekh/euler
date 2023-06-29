package problems

/*
 * Largest Palindrome Product
 * https://projecteuler.net/problem=4
 */

object P4_LargestPalindromeProduct:
  def isPalindrome(n: Int): Boolean =
    var num = n
    var rev = 0
    while num > 0 do
      val last = num % 10
      rev = rev * 10 + last
      num = num / 10
    n == rev

  def largestPalindromeProduct(): Int =
    var largestPalindrome = 0
    for x: Int <- 100 until 999 by +1 do
      for y: Int <- 999 until 100 by -1 do
        val prePalindrome = x * y
        if isPalindrome(prePalindrome) then
          if largestPalindrome < prePalindrome then
            largestPalindrome = prePalindrome
    largestPalindrome
end P4_LargestPalindromeProduct

