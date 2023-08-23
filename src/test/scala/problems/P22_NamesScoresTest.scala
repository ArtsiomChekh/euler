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
    assert(sumOfNamesScore())

  test("nameCharSum ABC"):
    assertEquals(nameCharSum("ABC"), 1+2+3)

  test("nameCharSum MARY"):
    assertEquals(nameCharSum("MARY"), 57)

  test("nameCharSum COLIN"):
    assertEquals(nameCharSum("COLIN"), 53)