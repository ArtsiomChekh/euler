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
    assertEquals(factorial(0), 1)
    assertEquals(factorial(1), 1)
    assertEquals(factorial(2), 2)
    assertEquals(factorial(4), 24)
    assertEquals(factorial(10), 3628800)
