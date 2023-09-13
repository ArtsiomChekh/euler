package problems

import scala.Array.ofDim

/*
 * Coin Sums
 * https://projecteuler.net/problem=31
 */
object P31_CoinSums:
  def countChange(money: Int, coins: Array[Int]): Int =
    if money == 0 then
      1
    else if money < 0 || coins.isEmpty then
      0
    else
      countChange(money - coins.head, coins) + countChange(money, coins.tail)
end P31_CoinSums



