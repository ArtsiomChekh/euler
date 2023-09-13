package problems

import scala.annotation.tailrec

/*
 * Longest Collatz Sequence
 * https://projecteuler.net/problem=14
 */
object P14_LongestCollatzSequence:
  def numberWithLongestChain(n: Int): Int =
    var number: Int = 1
    var maxSteps: Int = 0
    var currentSteps: Int = 0
    for i <- 1 to n do
      currentSteps = numberOfSteps(i)
      if currentSteps > maxSteps then
        maxSteps = currentSteps
        number = i
    number

  def numberOfSteps(n: Int): Int =
    @tailrec
    def loop(count: Int, currentNumber: Int): Int =
      if currentNumber == 1 then
        count
      else
        loop(count + 1, step(currentNumber))

    loop(1, n)

  def step(n: Int): Int =
    if (n % 2 == 0) n / 2 else n * 3 + 1
end P14_LongestCollatzSequence
    










