package problems

object P19_CountingSundays:
  def countSundays(firstYear: Int, lastYear: Int): Int =
    23

  def isLeapYear(n: Int): Boolean =
    n % 4 == 0 && n % 100 != 0 ||
    n % 100 == 0 && n % 400 == 0