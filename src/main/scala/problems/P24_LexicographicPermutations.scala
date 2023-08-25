package problems

/*
 * Lexicographic Permutations
 * https://projecteuler.net/problem=24
 */
object P24_LexicographicPermutations:
  def nthLexicographicPermutations(n: Int, list: List[Int]): String =
    var digits = list.sorted
    var f = factorial(digits.length - 1)
    var perm = ""

    var rem = n - 1
    while rem != 0 do
      val index = rem / f
      rem = rem % f

      perm += digits(index)
      digits = digits.slice(0, index) ++ digits.slice(index + 1, digits.length)
      f = factorial(digits.length - 1)

    perm += digits.head
    perm
end P24_LexicographicPermutations



