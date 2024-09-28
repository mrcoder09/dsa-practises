package twoPointerTechnique


fun main(args: Array<String>) {

    val result = StringPalindrome().isStringPalindrome("racecar")
    print(result)
}


/**
 * https://www.geeksforgeeks.org/c-program-check-given-string-palindrome/
 *
 * @author Satnam Singh
 */
class StringPalindrome {

    fun isStringPalindrome(
        input: String
    ): Boolean {
        var left = 0
        var right = input.length -1

        while (left < right) {

            if (input[left] != input[right])
                return false

            left += 1
            right -= 1
        }
        return true
    }
}
