package problems

/*
 * Multiples of 3 or 5
 * https://projecteuler.net/problem=1
 */
object P1_MultiplesOf3Or5:
  def sumOfMultiplesBelow(x: Int): Int =
    var res = 0
    for (i <- x - 1 until 0 by -1)
      if (i % 3 == 0 || i % 5 == 0)
        res += i
    res

  // recursion
  def sumOfMultiplesBelowByRecursion(n: Int): Int =
    def loop(k: Int, sum: Int): Int =
      if k <= 0 then
        sum
      else if k % 3 == 0 || k % 5 == 0 then
        loop(k - 1, sum + k)
      else
        loop(k - 1, sum)

    loop(n - 1, 0)

  def sumOfMultiplesBelowWithoutLoopAndRecursion(n: Int): Int = ???
end P1_MultiplesOf3Or5


