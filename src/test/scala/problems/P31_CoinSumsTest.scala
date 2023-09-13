package problems

import munit.FunSuite

class P31_CoinSumsTest extends FunSuite:

  import P31_CoinSums.*

  val coins: Array[Int] = Array(1 , 2 , 5)

  test("test"):
    assertEquals(waysToMakeCoin(5, 2, coins), 4)
//    assertEquals(waysToMakeCoin(10), 9)
