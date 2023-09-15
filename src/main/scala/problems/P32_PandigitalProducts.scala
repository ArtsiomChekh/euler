package problems

/*
 * Pandigital Products
 * https://projecteuler.net/problem=32
 */
object P32_PandigitalProducts:
  private val setOfDigit: Seq[Char] = Seq('1', '2', '3', '4', '5', '6', '7', '8', '9')

  def isPandigital(a: Int, b: Int, c: Int): Boolean =
    val digits = (a.toString + b.toString + c.toString).toSeq
    digits.size == 9 && digits.sorted == setOfDigit.sorted




