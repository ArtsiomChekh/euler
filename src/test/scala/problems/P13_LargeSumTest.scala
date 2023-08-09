package problems

import munit.FunSuite
import problems.P13_LargeSum.firstTenDigits

class P13_LargeSumTest extends FunSuite:

  val filePath = "src/main/resources/db/P13"
  val fileContent: String = readFile(filePath)
  val testString: String = "12345"

  import P13_LargeSum.*

  test("firstTenDigits dataForTest 1"):
    assertEquals(firstTenDigits(testString), 123)



