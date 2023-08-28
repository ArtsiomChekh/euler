package problems

import scala.annotation.tailrec

/*
 * Reciprocal Cycles
 * https://projecteuler.net/problem=26
 */
object P26_ReciprocalCycles:
  def cycleLength(n: Int): Int =
    var num = n
    while num % 2 == 0 do
      num /= 2
    while num % 5 == 0 do
      num /= 5
    if num == 1 then
      return 0
    var k = 10 % num
    var length = 1
    while k != 1 do
      k = 10 * k % num
      length += 1
    length

  def denominatorWithLongestRecurringCycle(limit: Int): Int =
    var longest = 0
    var valueD = 0
    for d <- 1 until limit do
      val temp = cycleLength(d)
      if longest < temp then
        longest = temp
        valueD = d
    valueD






