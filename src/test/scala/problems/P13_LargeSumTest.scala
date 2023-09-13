package problems

import munit.FunSuite

class P13_LargeSumTest extends FunSuite:

  val filePath = "src/main/resources/db/P13"
  val stringNumber: String = readFile(filePath)
  val numbers: Array[String] = stringNumber.split("\n")

  val numbersTest: Array[String] = Array(
    "123456789123456789123456789232",
    "123456789123456789123456789213",
    "123456789123456789123456789232")

  import P13_LargeSum.*

  test("firstNDigits for numbersTest (1 digits)"):
    assertEquals(firstNDigits(numbersTest, 1), "3")

  test("firstNDigits for numbersTest (3 digits)"):
    assertEquals(firstNDigits(numbersTest, 3), "370")

  test("firstNDigits for numbersTest (10 digits)"):
    assertEquals(firstNDigits(numbersTest, 10), "3703703673")

  test("firstNDigits for numbers[100][50] (10 digits)"):
    assertEquals(firstNDigits(numbers, 10), "5537376230")

  test("sumBigNumbers for numbersTest"):
    assertEquals(sumBigNumbers(numbersTest), BigInt("370370367370370367370370367677"))

  test("transform"):
    assertEquals(transform(numbersTest),
      Seq(BigInt("123456789123456789123456789232"), BigInt("123456789123456789123456789213"),
      BigInt("123456789123456789123456789232")))




