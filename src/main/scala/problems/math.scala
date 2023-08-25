package problems

import scala.annotation.tailrec

def sumOfArithmeticProgression(n: Int): Int =
  n * (n + 1) / 2

def square(n: Int): Int =
  n * n

def isPrime(n: Int): Boolean =
  @tailrec
  def loop(i: Int): Boolean =
    n == 2 || i * i > n || n % i != 0 && loop(i + 1)

  loop(2)

def factorial(n: Int): Int =
  @tailrec
  def loop(acc: Int, k: Int): Int =
    if k <= 0 then
      acc
    else
      loop(acc * k, k - 1)
  loop(1, n)
  
def factorialLong(n: Int): Long =
  @tailrec
  def loop(acc: Long, k: Int): Long =
    if k <= 0 then
      acc
    else
      loop(acc * k, k - 1)
  loop(1, n)

def bigFactorial(n: Int): BigInt =
  @tailrec
  def loop(acc: BigInt, k: Int): BigInt =
    if k <= 0 then
      acc
    else
      loop(acc * k, k - 1)
  loop(BigInt(1), n)

def sumOfNumberDivisorsBelow(n: Int): Int =
  (1 until n).foldLeft(0)((acc, num) =>
    if (n % num == 0) acc + num else acc)
