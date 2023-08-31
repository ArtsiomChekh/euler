package problems

import scala.annotation.tailrec
/*
 *  Number Spiral Diagonals
 *  https://projecteuler.net/problem=28
 */
object P28_NumberSpiralDiagonals:
  def sumOfDiagonalsNumbs(n: Int): Int =
    @tailrec
    def loop(acc: Int, n: Int): Int =
      if n == 1 then
        acc
      else
        loop(acc + 4 * n * n - 6 * n + 6, n - 2)

    loop(1, n)
end P28_NumberSpiralDiagonals



