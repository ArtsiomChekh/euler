package problems

/*
 * Number Letter Counts
 * https://projecteuler.net/problem=17
 */
object P17_NumberLetterCounts:
  private val units = Map("units" -> Array("", "one", "two", "three", "four", "five", "six", "seven",
    "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
    "seventeen", "eighteen", "nineteen"))
  private val tens = Map("tens" -> Array("", "ten", "twenty", "thirty", "forty", "fifty", "sixty",
    "seventy", "eighty", "ninety"))

  def numberLetterCounts(n: Int): Int =
    var stringNumb = ""
    for i <- 1 to n do
      println(stringNumb)
      var currentNumb = i

      if currentNumb / 1000 > 0 then
        stringNumb += units("units")(currentNumb / 1000) + "thousand"
        currentNumb = currentNumb % 1000

      if currentNumb / 100 > 0 then
        stringNumb += units("units")(currentNumb / 100) + "hundred"
        currentNumb = currentNumb % 100
        if currentNumb > 0 then
          stringNumb += "and"

      if currentNumb < 20 then
        stringNumb += units("units")(currentNumb)
      else
        stringNumb += tens("tens")(currentNumb / 10)
        currentNumb = currentNumb % 10
        if currentNumb > 0 then
          stringNumb += units("units")(currentNumb)

    stringNumb.length
end P17_NumberLetterCounts





