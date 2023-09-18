package problems

import munit.FunSuite

class P14_LongestCollatzSequenceTest extends FunSuite:

  import P14_LongestCollatzSequence.*

  test("numberWithLongestChain"):
    assertEquals(numberWithLongestChain(10), 9)
    assertEquals(numberWithLongestChain(100000), 77031)
    assertEquals(numberWithLongestChain(1000000), 837799)

  test("step"):
    assertEquals(step(13L), 40L)
    assertEquals(step(20L), 10L)
    assertEquals(step(2L), 1L)

  test("numberOfSteps"):
    assertEquals(numberOfSteps(1), 1)
    assertEquals(numberOfSteps(2), 2)
    assertEquals(numberOfSteps(13), 10)




