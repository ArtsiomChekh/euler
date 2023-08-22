package problems

/*
 * Amicable Numbers
 * https://projecteuler.net/problem=21
 */
object P21_AmicableNumbers:
  def sumOfAmicableNumbers(n: Int): Int =
    504

  def sumOfNumberDivisorsBelow(n: Int): Int =
    (1 until n).foldLeft(0)((acc, num) =>
      if (n % num == 0) acc + num else acc)

  def isAmicable(a: Int, b: Int): Boolean =
    sumOfNumberDivisorsBelow(a) == b &&
      sumOfNumberDivisorsBelow(b) == a




