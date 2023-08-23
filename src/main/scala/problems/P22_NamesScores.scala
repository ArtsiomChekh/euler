package problems

/*
 * Names Scores
 * https://projecteuler.net/problem=22
 */
object P22_NamesScores:
  def sumOfNamesScore() =
    true

  def nameCharSum(name: String): Int =
    name.toCharArray.foldLeft(0)((acc, c) => acc + (c - ('A' - 1)))



