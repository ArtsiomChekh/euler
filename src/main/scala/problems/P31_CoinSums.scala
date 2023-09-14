package problems

import scala.Array.ofDim

/*
 * Coin Sums
 * https://projecteuler.net/problem=31
 */
object P31_CoinSums:
  def countChange(money: Int, coins: Array[Int]): Int =
    val ways = Array.fill(money + 1)(0)
    ways(0) = 1
    for i <- coins do
      for k <- i to money do
        ways(k) += ways(k - i)
    ways(money)
end P31_CoinSums



