package problems

/*
 * Largest Palindrome Product
 * https://projecteuler.net/problem=4
 */
object P4_LargestPalindromeProduct:
  def reverse(n: Int): Int =
    var num = n
    var rev = 0
    while num > 0 do
      val lastDigit = num % 10
      rev = rev * 10 + lastDigit
      num = num / 10
    rev

  def isPalindrome(n: Int): Boolean =
    n == reverse(n)

  def largestPalindromeProduct(): Int =
    var largest = 0
    for x: Int <- 100 to 999 by +1 do
      for y: Int <- 999 to 100 by -1 do
        val pre = x * y
        if isPalindrome(pre) then
          if largest < pre then
            largest = pre
    largest
end P4_LargestPalindromeProduct

