package problems

import scala.annotation.tailrec

/*
 * Reciprocal Cycles
 * https://projecteuler.net/problem=26
 */
object P26_ReciprocalCycles:
  def cycleLength(denom: Int): Int =
    var digit: Option[Int] = None
    var decimals: List[Int] = Nil
    var num = 1

    while !decimals.contains(digit.getOrElse(-1)) do
      decimals = decimals :+ digit.getOrElse(-1)
      digit = Some(num * 10 / denom)
      val remainder = num * 10 - digit.getOrElse(0) * denom
      num = remainder

    decimals.length - decimals.indexOf(digit.getOrElse(-1))

  cycleLength(3)


