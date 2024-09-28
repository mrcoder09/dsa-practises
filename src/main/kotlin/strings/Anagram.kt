package strings

import java.util.Arrays

fun main(arg: Array<String>){
    print(Anagram().isAnagram())
}

class Anagram {
    fun isAnagram(str:String = "Care",
                  str1 :String= "Race"): Boolean {

        val str = str.lowercase()
        val str1 = str1.lowercase()

        if (str.length != str1.length)
            return false


        val charArray = str.toCharArray()
        val charArray1 = str1.toCharArray()

        Arrays.sort(charArray)
        Arrays.sort(charArray1)
        return charArray.contentEquals(charArray1)
    }
}

