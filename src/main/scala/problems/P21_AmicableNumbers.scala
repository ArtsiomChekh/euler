package problems

/*
 * Amicable Numbers
 * https://projecteuler.net/problem=21
 */
object P21_AmicableNumbers:
  def sumOfAmicableNumbers(n: Int): Int =
    504

  def numberDivisorsBelow(n: Int): List[Int] =
    (1 until n).foldLeft(List[Int]())((acc, num) =>
      if (n % num == 0) acc :+ num else acc)





