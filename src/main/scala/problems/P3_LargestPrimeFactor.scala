package problems

/*
 * Largest Prime Factor
 * https://projecteuler.net/problem=3
 */
object P3_LargestPrimeFactor:
  def largestPrimeFactor(n: Long): Int =
    require(n > 1, "Prime factors are those numbers with only two factors:" +
      " 1 and themselves, and because of this, the numbers 0 and 1 cannot be prime numbers." +
      " Think about it!")
    var divider = 2
    var num = n
    while (num > 1)
      if num % divider == 0 then
        num /= divider
      else
        divider += 1
    divider
end P3_LargestPrimeFactor

