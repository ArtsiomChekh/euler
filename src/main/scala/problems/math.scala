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