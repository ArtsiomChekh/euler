package problems

import munit.FunSuite

class ReadFileTest extends FunSuite:

  val filePath = "src/test/resources/db/testFile"

  test("readFile"):
    assertEquals(readFile(filePath), "12345")

  test("convertStringToArray"):
    val fileContent: String = readFile(filePath)
    assertEquals(convertStringToArray(fileContent).length, 5)


