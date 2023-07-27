package problems

/*
 * Summation of Primes
 * https://projecteuler.net/problem=10
 */
object P10_SummationOfPrimes:
  def sumOfPrimesBelow(n: Int): Long =
    var sum: Long = 0
    for i <- 2 until n do
      if isPrime(i) && i < n then
        sum += i
    sum
end P10_SummationOfPrimes