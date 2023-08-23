package problems

/*
 * Names Scores
 * https://projecteuler.net/problem=22
 */
object P22_NamesScores:
  def sumOfNamesScore(array: Array[String]): Int =
    array.indices.foldLeft(0)((acc, s) => acc + ((s + 1) * nameCharSum(array(s))))

  def nameCharSum(name: String): Int =
    name.toCharArray.foldLeft(0)((acc, c) => acc + (c - ('A' - 1)))



