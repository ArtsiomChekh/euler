package problems

/*
 * Factorial Digit Sum
 * https://projecteuler.net/problem=20
 */
object P20_FactorialDigitSum:
  def factorialDigitSum(n: Int): Int =
    bigFactorial(n).toString.map(_.asDigit).sum
end P20_FactorialDigitSum