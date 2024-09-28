package strings
//https://leetcode.com/problems/reverse-vowels-of-a-string/?envType=problem-list-v2&envId=string&difficulty=EASY

class ReverseVowelOnly {
    fun reverseVowels(s: String): String {

        var arr = s.toCharArray()
        var start = 0
        var end = arr.size - 1

        while (start < end) {
            val charAtStartIndex = arr[start]
            val charAtEndIndex = arr[end]
            if (isVowel(charAtStartIndex)) {
                if (isVowel(charAtEndIndex)) {
                    arr[start] = arr[end]
                    arr[end] = charAtStartIndex
                    start++
                    end--
                } else {
                    end--
                }
            } else {
                start++
            }
        }
        return String(arr)
    }

    private fun isVowel(char: Char): Boolean {
        return (char == 'A' || char == 'E' || char == 'I' || char == 'O' || char == 'U' ||
                char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u')
    }

    //From LeetCode.. Top answer
    fun reverseVowels2(s: String): String {
        val vowel = listOf('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U')
        val result = StringBuilder(s)
        var endPtr = s.length - 1
        var startPtr = 0
        while(startPtr < s.length && endPtr >= 0) {
            if(vowel.contains(s[startPtr]) && vowel.contains(s[endPtr])) {
                result.setCharAt(endPtr, s[startPtr])
                result.setCharAt(startPtr, s[endPtr])
                endPtr--
                startPtr++
            } else if(vowel.contains(s[endPtr]) && !vowel.contains(s[startPtr])) {
                startPtr++
            } else if (vowel.contains(s[startPtr]) && !vowel.contains(s[endPtr])) {
                endPtr--
            } else {
                startPtr++
                endPtr--
            }
        }
        return result.toString()
    }
}