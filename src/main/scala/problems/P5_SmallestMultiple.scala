package problems

/*
 * Smallest Multiple
 * https://projecteuler.net/problem=5
 */
object P5_SmallestMultiple:
  def gcd(a: Int, b: Int): Int =
    if b == 0 then
      a
    else
      gcd(b, a % b)

  def lcm(a: Int, b: Int): Int =
    b / gcd(a, b) * a

  def smallestMultiple(a: Int, b: Int): Int =
    var res = a
    for i <- a to b do
      res = lcm(res, i)
    res
end P5_SmallestMultiple

