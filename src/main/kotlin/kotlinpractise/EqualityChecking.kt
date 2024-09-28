package kotlinpractise


fun main(args: Array<String>){
    val john = Person("John", 22)
    val bob = Person("Bob", 24)
    val john1 = Person("John", 22)
    val result = (john == john1)
    val result2 = (john === john1)
    println("== $result\n === $result2")
    val sam = Person()
}


data class Person(
    val name:String = "",
    val age:Int = 0,

)

class EqualityChecking {


}