package problems

import scala.Array.ofDim

/*
 * Coin Sums
 * https://projecteuler.net/problem=31
 */
object P31_CoinSums:
  def waysToMakeCoin(n: Int, size: Int, coins: Array[Int]): Int =
    var table = ofDim[Int](n + 1,size)

    for x <- coins.indices do
      table (0)(x) = 1

    for i <- 1 until  n + 1 do
      for j <- 0 until size do

        var temp1 = 0
        if i >= coins(j) then
          temp1 = table(i - coins(j))(j)

        var temp2 = 0
        if j > 0 then
          temp2 = table(i)(j - 1)
        table(i)(j) = temp1 + temp2
    table(n)(size - 1)




