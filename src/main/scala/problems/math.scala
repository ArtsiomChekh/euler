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

def factorial(n: Int): Long =
  @tailrec
  def loop(acc: Long, k: Int): Long =
    if k <= 0 then
      acc
    else
      loop(acc * k, k - 1)
  loop(1, n)

