package problems

import munit.FunSuite

class P14_LongestCollatzSequenceTest extends FunSuite:

  import P14_LongestCollatzSequence.*

  test("test produceChain"):
    assertEquals(produceChain(1), 1)
//    assertEquals(produceChain(10), 7)

