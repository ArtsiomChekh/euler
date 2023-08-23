package problems

import munit.FunSuite

import scala.io.{BufferedSource, Source}

class P22_NamesScoresTest extends FunSuite:

  val filePath = "src/main/resources/db/P22_names.txt"
  val source: BufferedSource = Source.fromFile(filePath)
  val names: Array[String] = source.getLines.mkString.split(',').sorted
  source.close

  import P22_NamesScores._
  test("sumOfNames"):
    assert(sumOfNames())