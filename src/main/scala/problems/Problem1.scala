package problems

/*
 *  Multiples of 3 or 5
 */
object Problem1 {
  def sumOfMultiples(x: Int): Int =
    var res = 0
    for (i <- x - 1 until 0 by -1)
      if (i % 3 == 0 || i % 5 == 0)
        res += i
    res

  // recursion

  def sumOfMultiplesByRecursion(x: Int): Int =
    var sum = 0
    val i = x - 1
    if x <= 0 then
      sum = 0
    else if i % 3 == 0 || i % 5 == 0 then
      sum += i + sumOfMultiplesByRecursion(x - 1)
    else
      sum += sumOfMultiplesByRecursion(x - 1)
    sum
}
