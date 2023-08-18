package problems

import scala.annotation.tailrec

/*
 * Power Digit Sum
 * https://projecteuler.net/problem=16
 */
object P16_PowerDigitSum:
  def powerDigitSum(n: Int, power: Int): Int =
    @tailrec
    def loop(acc: BigInt, remainingPower: Int, digitSum: Int): Int =
      if remainingPower < 1 then
        acc.toString.map(_.asDigit).sum
      else
        loop(acc * BigInt(n), remainingPower - 1, digitSum)

    loop(BigInt(n), power - 1, 0)
end P16_PowerDigitSum





