package problems

import munit.FunSuite

class P14_LongestCollatzSequenceTest extends FunSuite:

  import P14_LongestCollatzSequence.*

  test("test produceChain"):
    assertEquals(produceChain(1), List(1L))
    assertEquals(produceChain(10), List(10L, 5L, 16L, 8L, 4L, 2L, 1L))
    assertEquals(produceChain(13), List(13L, 40L, 20L, 10L, 5L, 16L, 8L, 4L, 2L, 1L))

  test("test numberWithLongestChain 1, 2 , 9"):
    assertEquals(numberWithLongestChain(1), 1)
    assertEquals(numberWithLongestChain(2), 2)
    assertEquals(numberWithLongestChain(10), 9)

  test("test numberWithLongestChain 100 - 1 mln"):
    assertEquals(numberWithLongestChain(100), 97)
    assertEquals(numberWithLongestChain(1000), 871)
    assertEquals(numberWithLongestChain(100000), 77031)
    assertEquals(numberWithLongestChain(1000000), 837799)



