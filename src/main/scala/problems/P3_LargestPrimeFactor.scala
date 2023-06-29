package problems

/*
 * Largest Prime Factor
 * https://projecteuler.net/problem=3
 */

object P3_LargestPrimeFactor:
  def largestPrimeFactor(n: Long): Int =
    var largest = 0
    var divider = 2
    var num = n
    while (num > 1)
      if num % divider == 0 then
        if largest < divider then
          largest = divider
        num /= divider
      else
        divider += 1
    largest
end P3_LargestPrimeFactor

