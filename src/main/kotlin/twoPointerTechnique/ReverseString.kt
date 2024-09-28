package twoPointerTechnique


fun main(arg: Array<String>) {
    val input = "ABC"

    println(input)
    val result = ReverseString().reverseString(input)
    println(result)
}

class ReverseString {

    fun reverseString(str: String): String {
        var left = 0
        var right = str.length -1

        var result = StringBuilder()
        while (left < right) {
            val temp = str[right]
            result.append(temp)
            right -= 1
        }
        return "$result"

    }
}