package kotlinpractise

//https://stackoverflow.com/questions/44298702/what-is-out-keyword-in-kotlin
class TypeVarriance {
}


open class Weapon
open class Rifle: Weapon()
class SniperRife: Rifle()


//out produces T and preserves subtyping
//When you declare a generic type with an out modifier, it's called covariant.
//A covariant is a producer of T, that means functions can return T but they can't take T as arguments:

class MyCase<out T>{
    private val content = mutableListOf<T>()
    fun produce(): T = content.last()
//    fun consume() = content.add(item)
}

class MyCase2<out T>{
    private val content = mutableListOf<T>()
    fun produce(): T = content.last()
//    fun consume(item:T) = content.add(item)
}