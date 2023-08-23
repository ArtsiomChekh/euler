package problems

import munit.FunSuite

import scala.io.{BufferedSource, Source}

class P22_NamesScoresTest extends FunSuite:
  val filePath = "src/main/resources/db/P22_names.txt"
  val source: BufferedSource = Source.fromFile(filePath)
  val names: Array[String] = source.getLines().flatMap(_.replaceAll("\"", "").split(",")).toSeq.sorted.toArray

  val testNames: Array[String] = Array("ABC", "DAD", "AD")

  import P22_NamesScores._

  test("sumOfNamesScore testNames"):
    assertEquals(sumOfNamesScore(testNames), 39)

  test("sumOfNamesScore names"):
    assertEquals(sumOfNamesScore(names), 871198282)

  test("nameCharSum ABC"):
    assertEquals(nameCharSum("ABC"), 1 + 2 + 3)

  test("nameCharSum MARY"):
    assertEquals(nameCharSum("MARY"), 57)

  test("nameCharSum COLIN"):
    assertEquals(nameCharSum("COLIN"), 53)

  test("nameCharSum BARBARA"):
    assertEquals(nameCharSum("BARBARA"), 43)