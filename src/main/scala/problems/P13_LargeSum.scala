package problems

/*
 * Large Sum
 * https://projecteuler.net/problem=13
 */
object P13_LargeSum:
  def firstNDigits(numbers: Array[String], n: Int): String =
    sumBigNumbers(numbers).toString.take(n)

  def sumBigNumbers(numbers: Array[String]): BigInt =
    numbers.foldLeft(BigInt(0))((sum, num) =>
      sum + BigInt(num))
end P13_LargeSum



