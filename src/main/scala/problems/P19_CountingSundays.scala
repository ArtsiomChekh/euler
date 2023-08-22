package problems

import java.time.{LocalDate, Year}

/*
 * Counting Sundays
 * https://projecteuler.net/problem=19
 */
object P19_CountingSundays:
  private val ordinaryYear = Array(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
  private val leapYear = Array(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

  def countSundays(firstYear: Int, lastYear: Int): Int =
    var sundaysCount = 0

    for i <- firstYear to lastYear do
      if isLeapYear(i) then
        val daysInYear = leapYear
      else
        val daysInYear = ordinaryYear

      for month <- 0 until 12 do
        val firstDayOfMonth = LocalDate.of(i, month + 1, 1).getDayOfWeek.getValue
        if firstDayOfMonth == 7 then
          sundaysCount += 1

    sundaysCount

  def isLeapYear(n: Int): Boolean =
    n % 4 == 0 && n % 100 != 0 ||
      n % 100 == 0 && n % 400 == 0
end P19_CountingSundays
