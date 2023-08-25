package problems

class MathTest extends munit.FunSuite:

  test("sumOfArithmeticProgression"):
    assertEquals(sumOfArithmeticProgression(1), 1)
    assertEquals(sumOfArithmeticProgression(3), 6)
    assertEquals(sumOfArithmeticProgression(5), 15)

  test("square"):
    assertEquals(square(2), 4)
    assertEquals(square(9), 81)
    assertEquals(square(15), 225)

  test("isPrime"):
    assert(isPrime(2))
    assert(isPrime(3))
    assert(isPrime(5))
    assert(isPrime(89))
    assert(isPrime(113))
    assert(isPrime(271))
    assert(isPrime(7211537))

  test("factorial"):
    assertEquals(factorialLong(0), 1L)
    assertEquals(factorialLong(1), 1L)
    assertEquals(factorialLong(2), 2L)
    assertEquals(factorialLong(4), 24L)
    assertEquals(factorialLong(10), 3628800L)
    assertEquals(factorialLong(20), 2432902008176640000L)

  test("bigFactorial"):
    assertEquals(bigFactorial(0), BigInt(1))
    assertEquals(bigFactorial(10), BigInt(3628800))
    assertEquals(bigFactorial(20), BigInt("2432902008176640000"))
    assertEquals(bigFactorial(40), BigInt("815915283247897734345611269596115894272000000000"))

  test("sumOfNumberDivisorsBelow"):
    assertEquals(sumOfNumberDivisorsBelow(4), 3)
    assertEquals(sumOfNumberDivisorsBelow(28), 28)
    assertEquals(sumOfNumberDivisorsBelow(12), 16)
    assertEquals(sumOfNumberDivisorsBelow(220), 284)
    assertEquals(sumOfNumberDivisorsBelow(284), 220)
