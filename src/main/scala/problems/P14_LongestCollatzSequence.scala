package problems

import scala.annotation.tailrec

/*
 * Longest Collatz Sequence
 * https://projecteuler.net/problem=14
 */
object P14_LongestCollatzSequence:
  def produceChain(n: Int): List[Long] =
    @tailrec
    def loop(current: Long, chain: List[Long]): List[Long] = current match
      case 1 => current +: chain
      case x if x % 2 == 0 => loop(current / 2, x +: chain)
      case _ => loop(current * 3 + 1, current +: chain)

    loop(n, Nil).reverse

  def numberWithLongestChain(n: Int): Int =
    var maxLength = 0
    var numberWithMaxLength = 0

    for i <- n to 1 by -1 do
      val chainLength = produceChain(i).length
      if chainLength > maxLength then
        maxLength = chainLength
        numberWithMaxLength = i

    numberWithMaxLength
end P14_LongestCollatzSequence
    










