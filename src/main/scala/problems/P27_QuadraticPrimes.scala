package problems

/*
 * Quadratic Primes
 * https://projecteuler.net/problem=27
 */
object P27_QuadraticPrimes:
  def primesCounter(a: Int, b: Int): Int =
    val result = (0 to Int.MaxValue).takeWhile(n => isPrime(quadraticForm(n, a, b)))
    result.length

  def quadraticForm(n: Int, a: Int, b: Int): Int =
    n * n + a * n + b
  







