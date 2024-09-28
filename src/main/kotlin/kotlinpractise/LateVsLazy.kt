package kotlinpractise

class LateVsLazy {

    lateinit var myname:String
    val myName2 by lazy {
        "Satnam Singh"
    }
}