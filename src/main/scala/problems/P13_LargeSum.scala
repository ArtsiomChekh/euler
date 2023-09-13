package problems

/*
 * Large Sum
 * https://projecteuler.net/problem=13
 */
object P13_LargeSum:
  def firstNDigits(numbers: Array[String], n: Int): String =
    sumBigNumbers(numbers).toString.take(n)

  def sumBigNumbers(numbers: Array[String]): BigInt =
    transform(numbers).sum

  def transform(numbers: Array[String]): Seq[BigInt] =
    numbers.map(num => BigInt(num))
end P13_LargeSum



