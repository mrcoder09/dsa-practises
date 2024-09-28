package strings

fun main(vararg args: String){
    UniqueLetters()
        .doSomething()
}

class UniqueLetters {

    val input = "Vivek"
    val charArr = input.toCharArray()

    fun doSomething(){
        val hashset = HashSet<Char>()
        for (char in charArr){
            if (!hashset.contains(char)){
                hashset.add(char)
            }

        }
        print(hashset.toString())
    }
}