package strings

fun main() {
    RomanToInt()
        .romanToInt("LVIII")
        .let {
            print("$it")
        }
}

class RomanToInt {
    fun romanToInt(s: String): Int {
        val romans = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )
        val length = s.length
        var result = 0
        for (i in 0..<length) {
            result += romans[s[i]] ?: 0
        }
        return result
    }
}