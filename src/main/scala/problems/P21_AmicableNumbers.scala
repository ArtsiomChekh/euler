package problems

/*
 * Amicable Numbers
 * https://projecteuler.net/problem=21
 */
object P21_AmicableNumbers:
  def sumOfAmicableNumbers(n: Int): Int =
    var sum = 0
    for a <- 0 until n do
      val b = sumOfNumberDivisorsBelow(a)
      if a < b && isAmicable(a, b) then
        sum += a + b
    sum

  def isAmicable(a: Int, b: Int): Boolean =
    sumOfNumberDivisorsBelow(a) == b &&
      sumOfNumberDivisorsBelow(b) == a &&
      a != b
end P21_AmicableNumbers

    






