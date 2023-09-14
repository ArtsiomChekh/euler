package problems

import scala.annotation.tailrec

/*
 * Longest Collatz Sequence
 * https://projecteuler.net/problem=14
 */
object P14_LongestCollatzSequence:
  def numberWithLongestChain(n: Int): Int =
    val numbers = (1 until n).toList
    val numberWithMaxSteps = numbers.maxBy(numberOfSteps)
    numberWithMaxSteps

  def numberOfSteps(n: Int): Int =
    @tailrec
    def loop(acc: Int, n: Int): Int =
      if n == 1 then
        acc
      else
        loop(acc + 1, step(n))

    loop(1, n)

  def step(n: Int): Int =
    if (n % 2) == 0 then
      n >>> 1
    else
      3 * n + 1
end P14_LongestCollatzSequence











