package problems

import scala.io.Source

def readFile(filePath: String): String =
  val source = Source.fromFile(filePath)
  val content = source.mkString
  source.close()
  content

def convertStringToArray(input: String): Array[Int] =
  input.filter(_.isDigit).split("").map(_.toInt)

def convertStringWithSpacesToArray(input: String): Array[Int] =
  input.split("\\s+").map(_.toInt)