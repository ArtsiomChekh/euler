package problems

import munit.FunSuite

class P31_CoinSumsTest extends FunSuite:

  import P31_CoinSums.*

  val coins: Array[Int] = Array(1 , 2 , 5, 10, 20, 50, 100, 200)

  test("test 5"):
    assertEquals(countChange(5, coins), 4)

  test("test 10"):
    assertEquals(countChange(10, coins), 11)

  test("test 200"):
    assertEquals(countChange(200, coins), 73682)

