package problems

/*
* Largest Prime Factor
*/

object Problem3 {

  def largestPrimeFactor(n: Long): Int =
    var largest = 0
    var divider = 2
    var num = n
    while (num > 1)
      if num % divider == 0 then
        if largest < divider then
          largest = divider
        num /= divider
      else
        divider += 1
    largest

}
