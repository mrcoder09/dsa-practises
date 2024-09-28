package strings

fun main(vararg args:String){
    ReverseString()
        .reverseWords("The quick brown fox jumps over  lazy dog     ")
}

class ReverseString {
    fun reverseWords(s: String): List<String> {
        var arr = s.split(" ").toMutableList()
        var startCounter = 0
        var endCounter = arr.size - 1

        while(startCounter < endCounter){
            val temp = arr[startCounter].trim()
            if (temp == "") {
                continue
            }
                arr[startCounter] = arr[endCounter].trim()
                arr[endCounter] = temp.trim()

            startCounter++
            endCounter--
        }
        return arr
    }
}