package problems

import scala.annotation.tailrec

/*
 * Digit Fifth Powers
 * https://projecteuler.net/problem=30
 */
object P30_DigitFifthPowers:
  def sumPowerDigits(value: Int, power: Int): Int =
    @tailrec
    def loop(acc: Int, remainder: Int): Int =
      if remainder == 0 then
        acc
      else
        loop(acc + Math.pow(remainder % 10, power).toInt, remainder / 10)

    loop(0, value)

  def digitNthPowers(end: Int, power: Int): Int =
    var solution = 0
    for numb <- 2 to end do
      val temp = sumPowerDigits(numb, power)
      if temp == numb then
        solution += numb
    solution
end P30_DigitFifthPowers



