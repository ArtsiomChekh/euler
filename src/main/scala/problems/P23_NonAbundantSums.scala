package problems

/*
 * Non-Abundant Sums
 * https://projecteuler.net/problem=23
 */
object P23_NonAbundantSums:
  def nonAbundantSums(n: Int): Int =
    val abundant = abundantNumbersBelow(n)
    val abundantSet = abundant.toSet

    def isSumOfTwoAbundant(num: Int): Boolean =
      abundant.exists(ab => abundantSet.contains(num - ab))

    (1 to n).filterNot(isSumOfTwoAbundant).sum

  def abundantNumbersBelow(n: Int): List[Int] =
    (1 to n).foldLeft(List[Int]())((acc, numb) =>
      if (isAbundant(numb)) acc :+ numb else acc)

  def isAbundant(n: Int): Boolean =
    sumOfNumberDivisorsBelow(n) > n
end P23_NonAbundantSums




